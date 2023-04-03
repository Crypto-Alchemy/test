package p000;

import com.google.android.gms.internal.measurement.C4089f;
import com.google.android.gms.internal.measurement.zzkn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: p59 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class p59 {

    /* renamed from: a */
    public static final Charset f32581a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f32582b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f32583c;

    /* renamed from: d */
    public static final ByteBuffer f32584d;

    /* renamed from: e */
    public static final y19 f32585e;

    static {
        byte[] bArr = new byte[0];
        f32583c = bArr;
        f32584d = ByteBuffer.wrap(bArr);
        v19 v19 = new v19(bArr, 0, 0, false, (s19) null);
        try {
            v19.mo48630c(0);
            f32585e = v19;
        } catch (zzkn e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static <T> T m49796a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <T> T m49797b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static boolean m49798c(byte[] bArr) {
        return C4089f.m34182a(bArr);
    }

    /* renamed from: d */
    public static String m49799d(byte[] bArr) {
        return new String(bArr, f32581a);
    }

    /* renamed from: e */
    public static int m49800e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static int m49801f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static int m49802g(byte[] bArr) {
        int length = bArr.length;
        int h = m49803h(length, bArr, 0, length);
        if (h == 0) {
            return 1;
        }
        return h;
    }

    /* renamed from: h */
    public static int m49803h(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: i */
    public static Object m49804i(Object obj, Object obj2) {
        return ((r79) obj).mo47345b().mo46664W((r79) obj2).mo46665q();
    }
}
