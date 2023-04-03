package p000;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: tv7 */
public final class tv7 {

    /* renamed from: b */
    public static final Pattern f34393b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    public final ot7 f34394a;

    public tv7(ot7 ot7) throws IOException {
        this.f34394a = ot7;
    }

    /* renamed from: d */
    public static /* synthetic */ Set m52524d(tv7 tv7, Set set, qw7 qw7, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        tv7.mo48237f(qw7, set, new gv7(hashSet, qw7, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1 A[SYNTHETIC, Splitter:B:31:0x00e1] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m52525e(p000.qw7 r12, p000.jv7 r13) throws java.io.IOException {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00dd }
            java.io.File r1 = r12.mo47286a()     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r12 = r12.mo47287b()     // Catch:{ IOException -> 0x00db }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r1.<init>()     // Catch:{ IOException -> 0x00db }
            java.util.Enumeration r2 = r0.entries()     // Catch:{ IOException -> 0x00db }
        L_0x0016:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00db }
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00db }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r3.getName()     // Catch:{ IOException -> 0x00db }
            java.util.regex.Pattern r8 = f34393b     // Catch:{ IOException -> 0x00db }
            java.util.regex.Matcher r7 = r8.matcher(r7)     // Catch:{ IOException -> 0x00db }
            boolean r8 = r7.matches()     // Catch:{ IOException -> 0x00db }
            if (r8 == 0) goto L_0x0016
            java.lang.String r8 = r7.group(r6)     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r7.group(r4)     // Catch:{ IOException -> 0x00db }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r12     // Catch:{ IOException -> 0x00db }
            r9[r6] = r7     // Catch:{ IOException -> 0x00db }
            r9[r4] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String.format(r4, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r4 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00db }
            if (r4 != 0) goto L_0x005b
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            r4.<init>()     // Catch:{ IOException -> 0x00db }
            r1.put(r8, r4)     // Catch:{ IOException -> 0x00db }
        L_0x005b:
            qv7 r5 = new qv7     // Catch:{ IOException -> 0x00db }
            r5.<init>(r3, r7)     // Catch:{ IOException -> 0x00db }
            r4.add(r5)     // Catch:{ IOException -> 0x00db }
            goto L_0x0016
        L_0x0064:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r12.<init>()     // Catch:{ IOException -> 0x00db }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00db }
            int r3 = r2.length     // Catch:{ IOException -> 0x00db }
            r7 = r5
        L_0x006d:
            if (r7 >= r3) goto L_0x00cb
            r8 = r2[r7]     // Catch:{ IOException -> 0x00db }
            boolean r9 = r1.containsKey(r8)     // Catch:{ IOException -> 0x00db }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String.format(r10, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r9 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ IOException -> 0x00db }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00db }
        L_0x008a:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x00db }
            if (r10 == 0) goto L_0x00c8
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x00db }
            qv7 r10 = (p000.qv7) r10     // Catch:{ IOException -> 0x00db }
            java.lang.String r11 = r10.f33276a     // Catch:{ IOException -> 0x00db }
            boolean r11 = r12.containsKey(r11)     // Catch:{ IOException -> 0x00db }
            if (r11 == 0) goto L_0x00ac
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f33276a     // Catch:{ IOException -> 0x00db }
            r11[r5] = r10     // Catch:{ IOException -> 0x00db }
            r11[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00ac:
            java.lang.String r11 = r10.f33276a     // Catch:{ IOException -> 0x00db }
            r12.put(r11, r10)     // Catch:{ IOException -> 0x00db }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f33276a     // Catch:{ IOException -> 0x00db }
            r11[r5] = r10     // Catch:{ IOException -> 0x00db }
            r11[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00bf:
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r8 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String.format(r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00c8:
            int r7 = r7 + 1
            goto L_0x006d
        L_0x00cb:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            java.util.Collection r12 = r12.values()     // Catch:{ IOException -> 0x00db }
            r1.<init>(r12)     // Catch:{ IOException -> 0x00db }
            r13.mo29793a(r0, r1)     // Catch:{ IOException -> 0x00db }
            r0.close()     // Catch:{ IOException -> 0x00db }
            return
        L_0x00db:
            r12 = move-exception
            goto L_0x00df
        L_0x00dd:
            r12 = move-exception
            r0 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x00e9
            r0.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r13 = move-exception
            p000.mt7.m48481a(r12, r13)
        L_0x00e9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tv7.m52525e(qw7, jv7):void");
    }

    /* renamed from: a */
    public final Set<File> mo48235a() throws IOException {
        Set<qw7> i = this.f34394a.mo46526i();
        for (String next : this.f34394a.mo46527j()) {
            Iterator<qw7> it = i.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo47287b().equals(next)) {
                        break;
                    }
                } else {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{next});
                    this.f34394a.mo46528k(next);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (qw7 next2 : i) {
            HashSet hashSet2 = new HashSet();
            m52525e(next2, new bv7(this, hashSet2, next2));
            for (File next3 : this.f34394a.mo46530m(next2.mo47287b())) {
                if (!hashSet2.contains(next3)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{next3.getAbsolutePath(), next2.mo47287b(), next2.mo47286a().getAbsolutePath()});
                    this.f34394a.mo46529l(next3);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* renamed from: b */
    public final Set<File> mo48236b(qw7 qw7) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m52525e(qw7, new xu7(this, qw7, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo48237f(qw7 qw7, Set<qv7> set, mv7 mv7) throws IOException {
        for (qv7 next : set) {
            File e = this.f34394a.mo46522e(qw7.mo47287b(), next.f33276a);
            boolean z = false;
            if (e.exists() && e.length() == next.f33277b.getSize()) {
                z = true;
            }
            mv7.mo43012a(next, e, z);
        }
    }
}
