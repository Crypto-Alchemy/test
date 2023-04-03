package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: ij5 */
public class ij5 {

    /* renamed from: a */
    public static final int[] f38392a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: b */
    public static final int[] f38393b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    /* renamed from: a */
    public static void m58973a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59216a(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && j34.m59234s(iArr3, f38392a))) {
            m58975c(iArr3);
        }
    }

    /* renamed from: b */
    public static void m58974b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && j34.m59234s(iArr2, f38392a))) {
            m58975c(iArr2);
        }
    }

    /* renamed from: c */
    public static void m58975c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((((long) iArr[2]) & 4294967295L) - 1);
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + (4294967295L & ((long) iArr[7])) + 1);
    }

    /* renamed from: d */
    public static int[] m58976d(BigInteger bigInteger) {
        int[] p = j34.m59231p(bigInteger);
        if ((p[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = f38392a;
            if (j34.m59234s(p, iArr)) {
                j34.m59213I(iArr, p);
            }
        }
        return p;
    }

    /* renamed from: e */
    public static void m58977e(int[] iArr, int[] iArr2) {
        hw3.m58708b(f38392a, iArr, iArr2);
    }

    /* renamed from: f */
    public static int m58978f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: g */
    public static void m58979g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] k = j34.m59226k();
        j34.m59240y(iArr, iArr2, k);
        m58984l(k, iArr3);
    }

    /* renamed from: h */
    public static void m58980h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59207C(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && p34.m70896t(16, iArr3, f38393b))) {
            p34.m70872P(16, f38393b, iArr3);
        }
    }

    /* renamed from: i */
    public static void m58981i(int[] iArr, int[] iArr2) {
        if (m58978f(iArr) != 0) {
            int[] iArr3 = f38392a;
            j34.m59212H(iArr3, iArr3, iArr2);
            return;
        }
        j34.m59212H(f38392a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m58982j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 8);
        } while (p34.m70857A(8, iArr, f38392a) == 0);
    }

    /* renamed from: k */
    public static void m58983k(SecureRandom secureRandom, int[] iArr) {
        do {
            m58982j(secureRandom, iArr);
        } while (m58978f(iArr) != 0);
    }

    /* renamed from: l */
    public static void m58984l(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = j5;
        long j15 = (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8 + 0;
        iArr3[0] = (int) j15;
        long j16 = j4;
        long j17 = (j15 >> 32) + (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8;
        iArr3[1] = (int) j17;
        long j18 = (j17 >> 32) + ((((long) iArr[2]) & 4294967295L) - j12);
        iArr3[2] = (int) j18;
        long j19 = (j18 >> 32) + ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6;
        iArr3[3] = (int) j19;
        long j20 = (j19 >> 32) + ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7;
        iArr3[4] = (int) j20;
        long j21 = (j20 >> 32) + (((long) iArr[5]) & 4294967295L) + j11 + j3;
        iArr3[5] = (int) j21;
        long j22 = (j21 >> 32) + (((long) iArr[6]) & 4294967295L) + j16 + j7 + j8;
        iArr3[6] = (int) j22;
        long j23 = (j22 >> 32) + (4294967295L & ((long) iArr[7])) + j13 + j11 + j14;
        iArr3[7] = (int) j23;
        m58985m((int) (j23 >> 32), iArr3);
    }

    /* renamed from: m */
    public static void m58985m(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + ((((long) iArr[2]) & 4294967295L) - j2);
            iArr[2] = (int) j6;
            long j7 = (j6 >> 32) + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = j8 + (4294967295L & ((long) iArr[7])) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && j34.m59234s(iArr, f38392a))) {
            m58975c(iArr);
        }
    }

    /* renamed from: n */
    public static void m58986n(int[] iArr, int[] iArr2) {
        int[] k = j34.m59226k();
        j34.m59210F(iArr, k);
        m58984l(k, iArr2);
    }

    /* renamed from: o */
    public static void m58987o(int[] iArr, int i, int[] iArr2) {
        int[] k = j34.m59226k();
        j34.m59210F(iArr, k);
        while (true) {
            m58984l(k, iArr2);
            i--;
            if (i > 0) {
                j34.m59210F(iArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m58988p(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (((long) iArr[2]) & 4294967295L) + 1;
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + ((4294967295L & ((long) iArr[7])) - 1));
    }

    /* renamed from: q */
    public static void m58989q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (j34.m59212H(iArr, iArr2, iArr3) != 0) {
            m58988p(iArr3);
        }
    }

    /* renamed from: r */
    public static void m58990r(int[] iArr, int[] iArr2) {
        if (p34.m70863G(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && j34.m59234s(iArr2, f38392a))) {
            m58975c(iArr2);
        }
    }
}
