package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: io5 */
public class io5 {

    /* renamed from: a */
    public static final int[] f38428a = {-21389, -2, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f38429b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f38430c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    /* renamed from: a */
    public static void m59033a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g34.m58017a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && g34.m58025i(iArr3, f38428a))) {
            p34.m70878b(5, 21389, iArr3);
        }
    }

    /* renamed from: b */
    public static void m59034b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && g34.m58025i(iArr2, f38428a))) {
            p34.m70878b(5, 21389, iArr2);
        }
    }

    /* renamed from: c */
    public static int[] m59035c(BigInteger bigInteger) {
        int[] g = g34.m58023g(bigInteger);
        if (g[4] == -1) {
            int[] iArr = f38428a;
            if (g34.m58025i(g, iArr)) {
                g34.m58036t(iArr, g);
            }
        }
        return g;
    }

    /* renamed from: d */
    public static void m59036d(int[] iArr, int[] iArr2) {
        hw3.m58708b(f38428a, iArr, iArr2);
    }

    /* renamed from: e */
    public static int m59037e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: f */
    public static void m59038f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] e = g34.m58021e();
        g34.m58028l(iArr, iArr2, e);
        m59043k(e, iArr3);
    }

    /* renamed from: g */
    public static void m59039g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g34.m58032p(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && p34.m70896t(10, iArr3, f38429b))) {
            int[] iArr4 = f38430c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(10, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: h */
    public static void m59040h(int[] iArr, int[] iArr2) {
        if (m59037e(iArr) != 0) {
            int[] iArr3 = f38428a;
            g34.m58035s(iArr3, iArr3, iArr2);
            return;
        }
        g34.m58035s(f38428a, iArr, iArr2);
    }

    /* renamed from: i */
    public static void m59041i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 5);
        } while (p34.m70857A(5, iArr, f38428a) == 0);
    }

    /* renamed from: j */
    public static void m59042j(SecureRandom secureRandom, int[] iArr) {
        do {
            m59041i(secureRandom, iArr);
        } while (m59037e(iArr) != 0);
    }

    /* renamed from: k */
    public static void m59043k(int[] iArr, int[] iArr2) {
        if (g34.m58030n(21389, g34.m58029m(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && g34.m58025i(iArr2, f38428a))) {
            p34.m70878b(5, 21389, iArr2);
        }
    }

    /* renamed from: l */
    public static void m59044l(int i, int[] iArr) {
        if ((i != 0 && g34.m58031o(21389, i, iArr, 0) != 0) || (iArr[4] == -1 && g34.m58025i(iArr, f38428a))) {
            p34.m70878b(5, 21389, iArr);
        }
    }

    /* renamed from: m */
    public static void m59045m(int[] iArr, int[] iArr2) {
        int[] e = g34.m58021e();
        g34.m58034r(iArr, e);
        m59043k(e, iArr2);
    }

    /* renamed from: n */
    public static void m59046n(int[] iArr, int i, int[] iArr2) {
        int[] e = g34.m58021e();
        g34.m58034r(iArr, e);
        while (true) {
            m59043k(e, iArr2);
            i--;
            if (i > 0) {
                g34.m58034r(iArr2, e);
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m59047o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g34.m58035s(iArr, iArr2, iArr3) != 0) {
            p34.m70870N(5, 21389, iArr3);
        }
    }

    /* renamed from: p */
    public static void m59048p(int[] iArr, int[] iArr2) {
        if (p34.m70863G(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && g34.m58025i(iArr2, f38428a))) {
            p34.m70878b(5, 21389, iArr2);
        }
    }
}
