package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: cp5 */
public class cp5 {

    /* renamed from: a */
    public static final int[] f37179a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f37180b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f37181c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    /* renamed from: a */
    public static void m56489a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59216a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && j34.m59234s(iArr3, f37179a))) {
            p34.m70878b(8, 977, iArr3);
        }
    }

    /* renamed from: b */
    public static void m56490b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && j34.m59234s(iArr2, f37179a))) {
            p34.m70878b(8, 977, iArr2);
        }
    }

    /* renamed from: c */
    public static int[] m56491c(BigInteger bigInteger) {
        int[] p = j34.m59231p(bigInteger);
        if (p[7] == -1) {
            int[] iArr = f37179a;
            if (j34.m59234s(p, iArr)) {
                j34.m59213I(iArr, p);
            }
        }
        return p;
    }

    /* renamed from: d */
    public static void m56492d(int[] iArr, int[] iArr2) {
        hw3.m58708b(f37179a, iArr, iArr2);
    }

    /* renamed from: e */
    public static int m56493e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: f */
    public static void m56494f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = j34.m59226k();
        j34.m59240y(iArr, iArr2, k);
        m56499k(k, iArr3);
    }

    /* renamed from: g */
    public static void m56495g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59207C(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && p34.m70896t(16, iArr3, f37180b))) {
            int[] iArr4 = f37181c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(16, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: h */
    public static void m56496h(int[] iArr, int[] iArr2) {
        if (m56493e(iArr) != 0) {
            int[] iArr3 = f37179a;
            j34.m59212H(iArr3, iArr3, iArr2);
            return;
        }
        j34.m59212H(f37179a, iArr, iArr2);
    }

    /* renamed from: i */
    public static void m56497i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 8);
        } while (p34.m70857A(8, iArr, f37179a) == 0);
    }

    /* renamed from: j */
    public static void m56498j(SecureRandom secureRandom, int[] iArr) {
        do {
            m56497i(secureRandom, iArr);
        } while (m56493e(iArr) != 0);
    }

    /* renamed from: k */
    public static void m56499k(int[] iArr, int[] iArr2) {
        if (j34.m59205A(977, j34.m59241z(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && j34.m59234s(iArr2, f37179a))) {
            p34.m70878b(8, 977, iArr2);
        }
    }

    /* renamed from: l */
    public static void m56500l(int i, int[] iArr) {
        if ((i != 0 && j34.m59206B(977, i, iArr, 0) != 0) || (iArr[7] == -1 && j34.m59234s(iArr, f37179a))) {
            p34.m70878b(8, 977, iArr);
        }
    }

    /* renamed from: m */
    public static void m56501m(int[] iArr, int[] iArr2) {
        int[] k = j34.m59226k();
        j34.m59210F(iArr, k);
        m56499k(k, iArr2);
    }

    /* renamed from: n */
    public static void m56502n(int[] iArr, int i, int[] iArr2) {
        int[] k = j34.m59226k();
        j34.m59210F(iArr, k);
        while (true) {
            m56499k(k, iArr2);
            i--;
            if (i > 0) {
                j34.m59210F(iArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m56503o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59212H(iArr, iArr2, iArr3) != 0) {
            p34.m70870N(8, 977, iArr3);
        }
    }

    /* renamed from: p */
    public static void m56504p(int[] iArr, int[] iArr2) {
        if (p34.m70863G(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && j34.m59234s(iArr2, f37179a))) {
            p34.m70878b(8, 977, iArr2);
        }
    }
}
