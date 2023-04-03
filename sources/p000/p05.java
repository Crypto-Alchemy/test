package p000;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p000.o05;

/* renamed from: p05 */
/* compiled from: QueueFileLogStore */
public class p05 implements u02 {

    /* renamed from: d */
    public static final Charset f32525d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f32526a;

    /* renamed from: b */
    public final int f32527b;

    /* renamed from: c */
    public o05 f32528c;

    /* renamed from: p05$a */
    /* compiled from: QueueFileLogStore */
    public class C6333a implements o05.C6302d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f32529a;

        /* renamed from: b */
        public final /* synthetic */ int[] f32530b;

        public C6333a(byte[] bArr, int[] iArr) {
            this.f32529a = bArr;
            this.f32530b = iArr;
        }

        /* renamed from: a */
        public void mo46287a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f32529a, this.f32530b[0], i);
                int[] iArr = this.f32530b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: p05$b */
    /* compiled from: QueueFileLogStore */
    public static class C6334b {

        /* renamed from: a */
        public final byte[] f32532a;

        /* renamed from: b */
        public final int f32533b;

        public C6334b(byte[] bArr, int i) {
            this.f32532a = bArr;
            this.f32533b = i;
        }
    }

    public p05(File file, int i) {
        this.f32526a = file;
        this.f32527b = i;
    }

    /* renamed from: a */
    public void mo44483a() {
        CommonUtils.m38402e(this.f32528c, "There was a problem closing the Crashlytics log file.");
        this.f32528c = null;
    }

    /* renamed from: b */
    public String mo44484b() {
        byte[] c = mo44485c();
        if (c != null) {
            return new String(c, f32525d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo44485c() {
        C6334b g = mo46584g();
        if (g == null) {
            return null;
        }
        int i = g.f32533b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f32532a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo44486d() {
        mo44483a();
        this.f32526a.delete();
    }

    /* renamed from: e */
    public void mo44487e(long j, String str) {
        mo46585h();
        mo46583f(j, str);
    }

    /* renamed from: f */
    public final void mo46583f(long j, String str) {
        if (this.f32528c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f32527b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f32528c.mo46273e(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f32525d));
                while (!this.f32528c.mo46278k() && this.f32528c.mo46269A() > this.f32527b) {
                    this.f32528c.mo46283v();
                }
            } catch (IOException e) {
                rk3.m51112f().mo47426e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    public final C6334b mo46584g() {
        if (!this.f32526a.exists()) {
            return null;
        }
        mo46585h();
        o05 o05 = this.f32528c;
        if (o05 == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[o05.mo46269A()];
        try {
            this.f32528c.mo46277i(new C6333a(bArr, iArr));
        } catch (IOException e) {
            rk3.m51112f().mo47426e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C6334b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void mo46585h() {
        if (this.f32528c == null) {
            try {
                this.f32528c = new o05(this.f32526a);
            } catch (IOException e) {
                rk3 f = rk3.m51112f();
                f.mo47426e("Could not open log file: " + this.f32526a, e);
            }
        }
    }
}
