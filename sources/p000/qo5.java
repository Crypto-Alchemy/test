package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: qo5 */
public class qo5 {

    /* renamed from: a */
    public static final int[] f44220a = {-1, -1, -2, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f44221b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f44222c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    /* renamed from: a */
    public static void m71291a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h34.m58426a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && h34.m58443r(iArr3, f44220a))) {
            m71293c(iArr3);
        }
    }

    /* renamed from: b */
    public static void m71292b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && h34.m58443r(iArr2, f44220a))) {
            m71293c(iArr2);
        }
    }

    /* renamed from: c */
    public static void m71293c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            p34.m70899w(6, iArr, 3);
        }
    }

    /* renamed from: d */
    public static int[] m71294d(BigInteger bigInteger) {
        int[] o = h34.m58440o(bigInteger);
        if (o[5] == -1) {
            int[] iArr = f44220a;
            if (h34.m58443r(o, iArr)) {
                h34.m58423G(iArr, o);
            }
        }
        return o;
    }

    /* renamed from: e */
    public static void m71295e(int[] iArr, int[] iArr2) {
        hw3.m58708b(f44220a, iArr, iArr2);
    }

    /* renamed from: f */
    public static int m71296f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: g */
    public static void m71297g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] j = h34.m58435j();
        h34.m58449x(iArr, iArr2, j);
        m71302l(j, iArr3);
    }

    /* renamed from: h */
    public static void m71298h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h34.m58418B(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && p34.m70896t(12, iArr3, f44221b))) {
            int[] iArr4 = f44222c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(12, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: i */
    public static void m71299i(int[] iArr, int[] iArr2) {
        if (m71296f(iArr) != 0) {
            int[] iArr3 = f44220a;
            h34.m58422F(iArr3, iArr3, iArr2);
            return;
        }
        h34.m58422F(f44220a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m71300j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 6);
        } while (p34.m70857A(6, iArr, f44220a) == 0);
    }

    /* renamed from: k */
    public static void m71301k(SecureRandom secureRandom, int[] iArr) {
        do {
            m71300j(secureRandom, iArr);
        } while (m71296f(iArr) != 0);
    }

    /* renamed from: l */
    public static void m71302l(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = (((long) iArr[10]) & 4294967295L) + j;
        long j4 = (((long) iArr[11]) & 4294967295L) + j2;
        long j5 = j2;
        long j6 = (((long) iArr[0]) & 4294967295L) + j3 + 0;
        int i = (int) j6;
        long j7 = j;
        long j8 = (j6 >> 32) + (((long) iArr[1]) & 4294967295L) + j4;
        int i2 = (int) j8;
        iArr3[1] = i2;
        long j9 = j3 + (((long) iArr[8]) & 4294967295L);
        long j10 = j4 + (((long) iArr[9]) & 4294967295L);
        long j11 = (j8 >> 32) + (((long) iArr[2]) & 4294967295L) + j9;
        long j12 = j11 & 4294967295L;
        long j13 = (j11 >> 32) + (((long) iArr[3]) & 4294967295L) + j10;
        iArr3[3] = (int) j13;
        long j14 = j9 - j7;
        long j15 = j12;
        long j16 = (j13 >> 32) + (((long) iArr[4]) & 4294967295L) + j14;
        iArr3[4] = (int) j16;
        long j17 = (j16 >> 32) + (((long) iArr[5]) & 4294967295L) + (j10 - j5);
        iArr3[5] = (int) j17;
        long j18 = j17 >> 32;
        long j19 = j15 + j18;
        long j20 = j18 + (((long) i) & 4294967295L);
        iArr3[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (4294967295L & ((long) i2));
            iArr3[1] = (int) j22;
            j19 += j22 >> 32;
        }
        iArr3[2] = (int) j19;
        if (((j19 >> 32) != 0 && p34.m70899w(6, iArr3, 3) != 0) || (iArr3[5] == -1 && h34.m58443r(iArr3, f44220a))) {
            m71293c(iArr2);
        }
    }

    /* renamed from: m */
    public static void m71303m(int i, int[] iArr) {
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
            long j6 = j4 + (4294967295L & ((long) iArr[2])) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && p34.m70899w(6, iArr, 3) != 0) || (iArr[5] == -1 && h34.m58443r(iArr, f44220a))) {
            m71293c(iArr);
        }
    }

    /* renamed from: n */
    public static void m71304n(int[] iArr, int[] iArr2) {
        int[] j = h34.m58435j();
        h34.m58420D(iArr, j);
        m71302l(j, iArr2);
    }

    /* renamed from: o */
    public static void m71305o(int[] iArr, int i, int[] iArr2) {
        int[] j = h34.m58435j();
        h34.m58420D(iArr, j);
        while (true) {
            m71302l(j, iArr2);
            i--;
            if (i > 0) {
                h34.m58420D(iArr2, j);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m71306p(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((4294967295L & ((long) iArr[2])) - 1);
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            p34.m70889m(6, iArr, 3);
        }
    }

    /* renamed from: q */
    public static void m71307q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h34.m58422F(iArr, iArr2, iArr3) != 0) {
            m71306p(iArr3);
        }
    }

    /* renamed from: r */
    public static void m71308r(int[] iArr, int[] iArr2) {
        if (p34.m70863G(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && h34.m58443r(iArr2, f44220a))) {
            m71293c(iArr2);
        }
    }
}
