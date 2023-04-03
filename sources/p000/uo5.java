package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: uo5 */
public class uo5 {

    /* renamed from: a */
    public static final int[] f45149a = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f45150b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f45151c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* renamed from: a */
    public static void m72930a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (i34.m58825a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && i34.m58834j(iArr3, f45149a))) {
            p34.m70878b(7, 6803, iArr3);
        }
    }

    /* renamed from: b */
    public static void m72931b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && i34.m58834j(iArr2, f45149a))) {
            p34.m70878b(7, 6803, iArr2);
        }
    }

    /* renamed from: c */
    public static int[] m72932c(BigInteger bigInteger) {
        int[] h = i34.m58832h(bigInteger);
        if (h[6] == -1 && i34.m58834j(h, f45149a)) {
            p34.m70878b(7, 6803, h);
        }
        return h;
    }

    /* renamed from: d */
    public static void m72933d(int[] iArr, int[] iArr2) {
        hw3.m58708b(f45149a, iArr, iArr2);
    }

    /* renamed from: e */
    public static int m72934e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: f */
    public static void m72935f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f = i34.m58830f();
        i34.m58837m(iArr, iArr2, f);
        m72940k(f, iArr3);
    }

    /* renamed from: g */
    public static void m72936g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (i34.m58841q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && p34.m70896t(14, iArr3, f45150b))) {
            int[] iArr4 = f45151c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(14, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: h */
    public static void m72937h(int[] iArr, int[] iArr2) {
        if (m72934e(iArr) != 0) {
            int[] iArr3 = f45149a;
            i34.m58843s(iArr3, iArr3, iArr2);
            return;
        }
        i34.m58843s(f45149a, iArr, iArr2);
    }

    /* renamed from: i */
    public static void m72938i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 7);
        } while (p34.m70857A(7, iArr, f45149a) == 0);
    }

    /* renamed from: j */
    public static void m72939j(SecureRandom secureRandom, int[] iArr) {
        do {
            m72938i(secureRandom, iArr);
        } while (m72934e(iArr) != 0);
    }

    /* renamed from: k */
    public static void m72940k(int[] iArr, int[] iArr2) {
        if (i34.m58839o(6803, i34.m58838n(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && i34.m58834j(iArr2, f45149a))) {
            p34.m70878b(7, 6803, iArr2);
        }
    }

    /* renamed from: l */
    public static void m72941l(int i, int[] iArr) {
        if ((i != 0 && i34.m58840p(6803, i, iArr, 0) != 0) || (iArr[6] == -1 && i34.m58834j(iArr, f45149a))) {
            p34.m70878b(7, 6803, iArr);
        }
    }

    /* renamed from: m */
    public static void m72942m(int[] iArr, int[] iArr2) {
        int[] f = i34.m58830f();
        i34.m58842r(iArr, f);
        m72940k(f, iArr2);
    }

    /* renamed from: n */
    public static void m72943n(int[] iArr, int i, int[] iArr2) {
        int[] f = i34.m58830f();
        i34.m58842r(iArr, f);
        while (true) {
            m72940k(f, iArr2);
            i--;
            if (i > 0) {
                i34.m58842r(iArr2, f);
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m72944o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (i34.m58843s(iArr, iArr2, iArr3) != 0) {
            p34.m70870N(7, 6803, iArr3);
        }
    }

    /* renamed from: p */
    public static void m72945p(int[] iArr, int[] iArr2) {
        if (p34.m70863G(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && i34.m58834j(iArr2, f45149a))) {
            p34.m70878b(7, 6803, iArr2);
        }
    }
}
