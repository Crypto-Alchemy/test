package p000;

import android.content.Context;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.i47;

/* renamed from: gy1 */
/* compiled from: ExtractFromZipSoSource */
public class gy1 extends i47 {

    /* renamed from: g */
    public final File f12620g;

    /* renamed from: h */
    public final String f12621h;

    /* renamed from: gy1$b */
    /* compiled from: ExtractFromZipSoSource */
    public static final class C2429b extends i47.C2524b implements Comparable {

        /* renamed from: e */
        public final ZipEntry f12622e;

        /* renamed from: g */
        public final int f12623g;

        public C2429b(String str, ZipEntry zipEntry, int i) {
            super(str, m18451a(zipEntry));
            this.f12622e = zipEntry;
            this.f12623g = i;
        }

        /* renamed from: a */
        public static String m18451a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())});
        }

        public int compareTo(Object obj) {
            return this.f13163a.compareTo(((C2429b) obj).f13163a);
        }
    }

    /* renamed from: gy1$c */
    /* compiled from: ExtractFromZipSoSource */
    public class C2430c extends i47.C2528f {

        /* renamed from: a */
        public C2429b[] f12624a;

        /* renamed from: d */
        public final ZipFile f12625d;

        /* renamed from: e */
        public final i47 f12626e;

        /* renamed from: gy1$c$a */
        /* compiled from: ExtractFromZipSoSource */
        public final class C2431a extends i47.C2527e {

            /* renamed from: a */
            public int f12628a;

            public C2431a() {
            }

            /* renamed from: a */
            public boolean mo11926a() {
                C2430c.this.mo20863e();
                if (this.f12628a < C2430c.this.f12624a.length) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public i47.C2526d mo11927b() throws IOException {
                C2430c.this.mo20863e();
                C2429b[] c = C2430c.this.f12624a;
                int i = this.f12628a;
                this.f12628a = i + 1;
                C2429b bVar = c[i];
                InputStream inputStream = C2430c.this.f12625d.getInputStream(bVar.f12622e);
                try {
                    return new i47.C2526d(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public C2430c(i47 i47) throws IOException {
            this.f12625d = new ZipFile(gy1.this.f12620g);
            this.f12626e = i47;
        }

        /* renamed from: a */
        public final i47.C2525c mo11924a() throws IOException {
            return new i47.C2525c(mo20863e());
        }

        /* renamed from: b */
        public final i47.C2527e mo11925b() throws IOException {
            return new C2431a();
        }

        public void close() throws IOException {
            this.f12625d.close();
        }

        /* renamed from: e */
        public final C2429b[] mo20863e() {
            if (this.f12624a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(gy1.this.f12621h);
                String[] h = SysUtil.m13741h();
                Enumeration<? extends ZipEntry> entries = this.f12625d.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e = SysUtil.m13738e(h, group);
                        if (e >= 0) {
                            linkedHashSet.add(group);
                            C2429b bVar = (C2429b) hashMap.get(group2);
                            if (bVar == null || e < bVar.f12623g) {
                                hashMap.put(group2, new C2429b(group2, zipEntry, e));
                            }
                        }
                    }
                }
                this.f12626e.mo21462q((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                C2429b[] bVarArr = (C2429b[]) hashMap.values().toArray(new C2429b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i = 0;
                for (int i2 = 0; i2 < bVarArr.length; i2++) {
                    C2429b bVar2 = bVarArr[i2];
                    if (mo20864f(bVar2.f12622e, bVar2.f13163a)) {
                        i++;
                    } else {
                        bVarArr[i2] = null;
                    }
                }
                C2429b[] bVarArr2 = new C2429b[i];
                int i3 = 0;
                for (C2429b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i3] = bVar3;
                        i3++;
                    }
                }
                this.f12624a = bVarArr2;
            }
            return this.f12624a;
        }

        /* renamed from: f */
        public boolean mo20864f(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public gy1(Context context, String str, File file, String str2) {
        super(context, str);
        this.f12620g = file;
        this.f12621h = str2;
    }
}
