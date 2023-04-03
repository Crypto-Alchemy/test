package p000;

import com.google.android.gms.internal.clearcut.C4064h;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: vf8 */
public final class vf8 {

    /* renamed from: a */
    public static final Charset f34940a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f34941b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f34942c;

    /* renamed from: d */
    public static final ByteBuffer f34943d;

    /* renamed from: e */
    public static final hc8 f34944e;

    static {
        byte[] bArr = new byte[0];
        f34942c = bArr;
        f34943d = ByteBuffer.wrap(bArr);
        f34944e = hc8.m45123b(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static <T> T m53375a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static int m53376b(byte[] bArr) {
        int length = bArr.length;
        int c = m53377c(length, bArr, 0, length);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    /* renamed from: c */
    public static int m53377c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    public static Object m53378d(Object obj, Object obj2) {
        return ((tj8) obj).mo30771j().mo42170D0((tj8) obj2).mo30783s();
    }

    /* renamed from: e */
    public static <T> T m53379e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static int m53380f(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: g */
    public static boolean m53381g(byte[] bArr) {
        return C4064h.m33896h(bArr);
    }

    /* renamed from: h */
    public static String m53382h(byte[] bArr) {
        return new String(bArr, f34940a);
    }

    /* renamed from: i */
    public static boolean m53383i(tj8 tj8) {
        return false;
    }

    /* renamed from: j */
    public static int m53384j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
