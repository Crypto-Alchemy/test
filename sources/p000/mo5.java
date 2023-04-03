package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: mo5 */
public class mo5 {

    /* renamed from: a */
    public static final int[] f40983a = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f40984b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f40985c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    /* renamed from: a */
    public static void m64368a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h34.m58426a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && h34.m58443r(iArr3, f40983a))) {
            p34.m70878b(6, 4553, iArr3);
        }
    }

    /* renamed from: b */
    public static void m64369b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && h34.m58443r(iArr2, f40983a))) {
            p34.m70878b(6, 4553, iArr2);
        }
    }

    /* renamed from: c */
    public static int[] m64370c(BigInteger bigInteger) {
        int[] o = h34.m58440o(bigInteger);
        if (o[5] == -1) {
            int[] iArr = f40983a;
            if (h34.m58443r(o, iArr)) {
                h34.m58423G(iArr, o);
            }
        }
        return o;
    }

    /* renamed from: d */
    public static void m64371d(int[] iArr, int[] iArr2) {
        hw3.m58708b(f40983a, iArr, iArr2);
    }

    /* renamed from: e */
    public static int m64372e(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: f */
    public static void m64373f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j = h34.m58435j();
        h34.m58449x(iArr, iArr2, j);
        m64378k(j, iArr3);
    }

    /* renamed from: g */
    public static void m64374g(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h34.m58418B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && p34.m70896t(12, iArr3, f40984b))) {
            int[] iArr4 = f40985c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(12, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: h */
    public static void m64375h(int[] iArr, int[] iArr2) {
        if (m64372e(iArr) != 0) {
            int[] iArr3 = f40983a;
            h34.m58422F(iArr3, iArr3, iArr2);
            return;
        }
        h34.m58422F(f40983a, iArr, iArr2);
    }

    /* renamed from: i */
    public static void m64376i(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 6);
        } while (p34.m70857A(6, iArr, f40983a) == 0);
    }

    /* renamed from: j */
    public static void m64377j(SecureRandom secureRandom, int[] iArr) {
        do {
            m64376i(secureRandom, iArr);
        } while (m64372e(iArr) != 0);
    }

    /* renamed from: k */
    public static void m64378k(int[] iArr, int[] iArr2) {
        if (h34.m58451z(4553, h34.m58450y(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && h34.m58443r(iArr2, f40983a))) {
            p34.m70878b(6, 4553, iArr2);
        }
    }

    /* renamed from: l */
    public static void m64379l(int i, int[] iArr) {
        if ((i != 0 && h34.m58417A(4553, i, iArr, 0) != 0) || (iArr[5] == -1 && h34.m58443r(iArr, f40983a))) {
            p34.m70878b(6, 4553, iArr);
        }
    }

    /* renamed from: m */
    public static void m64380m(int[] iArr, int[] iArr2) {
        int[] j = h34.m58435j();
        h34.m58420D(iArr, j);
        m64378k(j, iArr2);
    }

    /* renamed from: n */
    public static void m64381n(int[] iArr, int i, int[] iArr2) {
        int[] j = h34.m58435j();
        h34.m58420D(iArr, j);
        while (true) {
            m64378k(j, iArr2);
            i--;
            if (i > 0) {
                h34.m58420D(iArr2, j);
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    public static void m64382o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h34.m58422F(iArr, iArr2, iArr3) != 0) {
            p34.m70870N(6, 4553, iArr3);
        }
    }

    /* renamed from: p */
    public static void m64383p(int[] iArr, int[] iArr2) {
        if (p34.m70863G(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && h34.m58443r(iArr2, f40983a))) {
            p34.m70878b(6, 4553, iArr2);
        }
    }
}
