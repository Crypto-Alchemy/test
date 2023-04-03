package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: kp5 */
public class kp5 {

    /* renamed from: a */
    public static final int[] f40509a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f40510b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f40511c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    /* renamed from: a */
    public static void m63562a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p34.m70877a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && p34.m70896t(12, iArr3, f40509a))) {
            m63565d(iArr3);
        }
    }

    /* renamed from: b */
    public static void m63563b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p34.m70877a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && p34.m70896t(24, iArr3, f40510b))) {
            int[] iArr4 = f40511c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(24, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: c */
    public static void m63564c(int[] iArr, int[] iArr2) {
        if (p34.m70898v(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && p34.m70896t(12, iArr2, f40509a))) {
            m63565d(iArr2);
        }
    }

    /* renamed from: d */
    public static void m63565d(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (4294967295L & ((long) iArr[4])) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            p34.m70899w(12, iArr, 5);
        }
    }

    /* renamed from: e */
    public static int[] m63566e(BigInteger bigInteger) {
        int[] q = p34.m70893q(384, bigInteger);
        if (q[11] == -1) {
            int[] iArr = f40509a;
            if (p34.m70896t(12, q, iArr)) {
                p34.m70872P(12, iArr, q);
            }
        }
        return q;
    }

    /* renamed from: f */
    public static void m63567f(int[] iArr, int[] iArr2) {
        hw3.m58708b(f40509a, iArr, iArr2);
    }

    /* renamed from: g */
    public static int m63568g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 12; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: h */
    public static void m63569h(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j = p34.m70886j(24);
        l34.m63687a(iArr, iArr2, j);
        m63573l(j, iArr3);
    }

    /* renamed from: i */
    public static void m63570i(int[] iArr, int[] iArr2) {
        if (m63568g(iArr) != 0) {
            int[] iArr3 = f40509a;
            p34.m70869M(12, iArr3, iArr3, iArr2);
            return;
        }
        p34.m70869M(12, f40509a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m63571j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 12);
        } while (p34.m70857A(12, iArr, f40509a) == 0);
    }

    /* renamed from: k */
    public static void m63572k(SecureRandom secureRandom, int[] iArr) {
        do {
            m63571j(secureRandom, iArr);
        } while (m63568g(iArr) != 0);
    }

    /* renamed from: l */
    public static void m63573l(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[17]) & 4294967295L;
        long j2 = ((long) iArr[20]) & 4294967295L;
        long j3 = ((long) iArr[21]) & 4294967295L;
        long j4 = ((long) iArr[19]) & 4294967295L;
        long j5 = ((long) iArr[22]) & 4294967295L;
        long j6 = ((long) iArr[18]) & 4294967295L;
        long j7 = ((long) iArr[23]) & 4294967295L;
        long j8 = ((long) iArr[16]) & 4294967295L;
        long j9 = ((((long) iArr[12]) & 4294967295L) + j2) - 1;
        long j10 = j2;
        long j11 = (((long) iArr[13]) & 4294967295L) + j5;
        long j12 = (((long) iArr[14]) & 4294967295L) + j5 + j7;
        long j13 = (((long) iArr[15]) & 4294967295L) + j7;
        long j14 = j + j3;
        long j15 = j3 - j7;
        long j16 = j9 + j15;
        long j17 = j5 - j7;
        long j18 = (((long) iArr[0]) & 4294967295L) + j16 + 0;
        iArr3[0] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[1]) & 4294967295L) + j7) - j9) + j11;
        iArr3[1] = (int) j19;
        long j20 = (j19 >> 32) + (((((long) iArr[2]) & 4294967295L) - j3) - j11) + j12;
        iArr3[2] = (int) j20;
        long j21 = (j20 >> 32) + ((((long) iArr[3]) & 4294967295L) - j12) + j13 + j16;
        iArr3[3] = (int) j21;
        long j22 = (j21 >> 32) + (((((((long) iArr[4]) & 4294967295L) + j8) + j3) + j11) - j13) + j16;
        iArr3[4] = (int) j22;
        long j23 = (j22 >> 32) + ((((long) iArr[5]) & 4294967295L) - j8) + j11 + j12 + j14;
        iArr3[5] = (int) j23;
        long j24 = (j23 >> 32) + (((((long) iArr[6]) & 4294967295L) + j6) - j) + j12 + j13;
        iArr3[6] = (int) j24;
        long j25 = (j24 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j8) + j4) - j6) + j13;
        iArr3[7] = (int) j25;
        long j26 = (j25 >> 32) + (((((((long) iArr[8]) & 4294967295L) + j8) + j) + j10) - j4);
        iArr3[8] = (int) j26;
        long j27 = (j26 >> 32) + (((((long) iArr[9]) & 4294967295L) + j6) - j10) + j14;
        iArr3[9] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j6) + j4) - j15) + j17;
        iArr3[10] = (int) j28;
        long j29 = (j28 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j4) + j10) - j17);
        iArr3[11] = (int) j29;
        m63574m((int) ((j29 >> 32) + 1), iArr3);
    }

    /* renamed from: m */
    public static void m63574m(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArr[1]) & 4294967295L) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + (4294967295L & ((long) iArr[4])) + j2;
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && p34.m70899w(12, iArr, 5) != 0) || (iArr[11] == -1 && p34.m70896t(12, iArr, f40509a))) {
            m63565d(iArr);
        }
    }

    /* renamed from: n */
    public static void m63575n(int[] iArr, int[] iArr2) {
        int[] j = p34.m70886j(24);
        l34.m63688b(iArr, j);
        m63573l(j, iArr2);
    }

    /* renamed from: o */
    public static void m63576o(int[] iArr, int i, int[] iArr2) {
        int[] j = p34.m70886j(24);
        l34.m63688b(iArr, j);
        while (true) {
            m63573l(j, iArr2);
            i--;
            if (i > 0) {
                l34.m63688b(iArr2, j);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m63577p(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + (((long) iArr[1]) & 4294967295L) + 1;
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + ((4294967295L & ((long) iArr[4])) - 1);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            p34.m70889m(12, iArr, 5);
        }
    }

    /* renamed from: q */
    public static void m63578q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (p34.m70869M(12, iArr, iArr2, iArr3) != 0) {
            m63577p(iArr3);
        }
    }

    /* renamed from: r */
    public static void m63579r(int[] iArr, int[] iArr2) {
        if (p34.m70863G(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && p34.m70896t(12, iArr2, f40509a))) {
            m63565d(iArr2);
        }
    }
}
