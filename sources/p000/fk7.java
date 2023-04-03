package p000;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* renamed from: fk7 */
/* compiled from: WebpSupportStatus */
public class fk7 {

    /* renamed from: a */
    public static final boolean f11898a = false;

    /* renamed from: b */
    public static final boolean f11899b = true;

    /* renamed from: c */
    public static final boolean f11900c = m17055e();

    /* renamed from: d */
    public static ek7 f11901d = null;

    /* renamed from: e */
    public static boolean f11902e = false;

    /* renamed from: f */
    public static final byte[] f11903f = m17051a("RIFF");

    /* renamed from: g */
    public static final byte[] f11904g = m17051a("WEBP");

    /* renamed from: h */
    public static final byte[] f11905h = m17051a("VP8 ");

    /* renamed from: i */
    public static final byte[] f11906i = m17051a("VP8L");

    /* renamed from: j */
    public static final byte[] f11907j = m17051a("VP8X");

    /* renamed from: a */
    public static byte[] m17051a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m17052b(byte[] bArr, int i) {
        boolean z;
        boolean j = m17060j(bArr, i + 12, f11907j);
        if ((bArr[i + 20] & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!j || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m17053c(byte[] bArr, int i, int i2) {
        if (i2 < 21 || !m17060j(bArr, i + 12, f11907j)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m17054d(byte[] bArr, int i) {
        boolean z;
        boolean j = m17060j(bArr, i + 12, f11907j);
        if ((bArr[i + 20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (!j || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m17055e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m17056f(byte[] bArr, int i) {
        return m17060j(bArr, i + 12, f11906i);
    }

    /* renamed from: g */
    public static boolean m17057g(byte[] bArr, int i) {
        return m17060j(bArr, i + 12, f11905h);
    }

    /* renamed from: h */
    public static boolean m17058h(byte[] bArr, int i, int i2) {
        if (i2 < 20 || !m17060j(bArr, i, f11903f) || !m17060j(bArr, i + 8, f11904g)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static ek7 m17059i() {
        if (f11902e) {
            return f11901d;
        }
        ek7 ek7 = null;
        Class<WebpBitmapFactoryImpl> cls = WebpBitmapFactoryImpl.class;
        try {
            boolean z = WebpBitmapFactoryImpl.f9785a;
            ek7 = cls.newInstance();
        } catch (Throwable unused) {
        }
        f11902e = true;
        return ek7;
    }

    /* renamed from: j */
    public static boolean m17060j(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
