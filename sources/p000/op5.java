package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: op5 */
public class op5 {

    /* renamed from: a */
    public static final int[] f43755a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    /* renamed from: a */
    public static void m70434a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a = p34.m70877a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a > 511 || (a == 511 && p34.m70890n(16, iArr3, f43755a))) {
            a = (a + p34.m70897u(16, iArr3)) & 511;
        }
        iArr3[16] = a;
    }

    /* renamed from: b */
    public static void m70435b(int[] iArr, int[] iArr2) {
        int v = p34.m70898v(16, iArr, iArr2) + iArr[16];
        if (v > 511 || (v == 511 && p34.m70890n(16, iArr2, f43755a))) {
            v = (v + p34.m70897u(16, iArr2)) & 511;
        }
        iArr2[16] = v;
    }

    /* renamed from: c */
    public static int[] m70436c(BigInteger bigInteger) {
        int[] q = p34.m70893q(521, bigInteger);
        if (p34.m70890n(17, q, f43755a)) {
            p34.m70875S(17, q);
        }
        return q;
    }

    /* renamed from: d */
    public static void m70437d(int[] iArr, int[] iArr2, int[] iArr3) {
        n34.m64511a(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = p34.m70858B(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    /* renamed from: e */
    public static void m70438e(int[] iArr, int[] iArr2) {
        n34.m64512b(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = p34.m70859C(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    /* renamed from: f */
    public static void m70439f(int[] iArr, int[] iArr2) {
        hw3.m58708b(f43755a, iArr, iArr2);
    }

    /* renamed from: g */
    public static int m70440g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: h */
    public static void m70441h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j = p34.m70886j(33);
        m70437d(iArr, iArr2, j);
        m70445l(j, iArr3);
    }

    /* renamed from: i */
    public static void m70442i(int[] iArr, int[] iArr2) {
        if (m70440g(iArr) != 0) {
            int[] iArr3 = f43755a;
            p34.m70869M(17, iArr3, iArr3, iArr2);
            return;
        }
        p34.m70869M(17, f43755a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m70443j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & 511;
        } while (p34.m70857A(17, iArr, f43755a) == 0);
    }

    /* renamed from: k */
    public static void m70444k(SecureRandom secureRandom, int[] iArr) {
        do {
            m70443j(secureRandom, iArr);
        } while (m70440g(iArr) != 0);
    }

    /* renamed from: l */
    public static void m70445l(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int E = (p34.m70861E(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + p34.m70881e(16, iArr, iArr2);
        if (E > 511 || (E == 511 && p34.m70890n(16, iArr2, f43755a))) {
            E = (E + p34.m70897u(16, iArr2)) & 511;
        }
        iArr2[16] = E;
    }

    /* renamed from: m */
    public static void m70446m(int[] iArr) {
        int i = iArr[16];
        int g = p34.m70883g(16, i >>> 9, iArr) + (i & 511);
        if (g > 511 || (g == 511 && p34.m70890n(16, iArr, f43755a))) {
            g = (g + p34.m70897u(16, iArr)) & 511;
        }
        iArr[16] = g;
    }

    /* renamed from: n */
    public static void m70447n(int[] iArr, int[] iArr2) {
        int[] j = p34.m70886j(33);
        m70438e(iArr, j);
        m70445l(j, iArr2);
    }

    /* renamed from: o */
    public static void m70448o(int[] iArr, int i, int[] iArr2) {
        int[] j = p34.m70886j(33);
        m70438e(iArr, j);
        while (true) {
            m70445l(j, iArr2);
            i--;
            if (i > 0) {
                m70438e(iArr2, j);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m70449p(int[] iArr, int[] iArr2, int[] iArr3) {
        int M = (p34.m70869M(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (M < 0) {
            M = (M + p34.m70888l(16, iArr3)) & 511;
        }
        iArr3[16] = M;
    }

    /* renamed from: q */
    public static void m70450q(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (p34.m70863G(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }
}
