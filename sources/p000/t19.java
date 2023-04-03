package p000;

import com.google.android.gms.internal.vision.C4123i0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: t19 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class t19 {

    /* renamed from: a */
    public static final Charset f34083a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f34084b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f34085c;

    /* renamed from: d */
    public static final ByteBuffer f34086d;

    /* renamed from: e */
    public static final yy8 f34087e;

    static {
        byte[] bArr = new byte[0];
        f34085c = bArr;
        f34086d = ByteBuffer.wrap(bArr);
        f34087e = yy8.m54917b(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static int m52044a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static int m52045b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static int m52046c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static <T> T m52047d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    public static Object m52048e(Object obj, Object obj2) {
        return ((k59) obj).mo31170d().mo47993Q((k59) obj2).mo31182c();
    }

    /* renamed from: f */
    public static <T> T m52049f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: g */
    public static boolean m52050g(k59 k59) {
        if (!(k59 instanceof ew8)) {
            return false;
        }
        ew8 ew8 = (ew8) k59;
        return false;
    }

    /* renamed from: h */
    public static boolean m52051h(byte[] bArr) {
        return C4123i0.m34289f(bArr);
    }

    /* renamed from: i */
    public static String m52052i(byte[] bArr) {
        return new String(bArr, f34083a);
    }

    /* renamed from: j */
    public static int m52053j(byte[] bArr) {
        int length = bArr.length;
        int a = m52044a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
