package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: yo5 */
public class yo5 {

    /* renamed from: a */
    public static final int[] f46234a = {1, 0, 0, -1, -1, -1, -1};

    /* renamed from: b */
    public static final int[] f46235b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* renamed from: c */
    public static final int[] f46236c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    /* renamed from: a */
    public static void m74532a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (i34.m58825a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && i34.m58834j(iArr3, f46234a))) {
            m74534c(iArr3);
        }
    }

    /* renamed from: b */
    public static void m74533b(int[] iArr, int[] iArr2) {
        if (p34.m70898v(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && i34.m58834j(iArr2, f46234a))) {
            m74534c(iArr2);
        }
    }

    /* renamed from: c */
    public static void m74534c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (4294967295L & ((long) iArr[3])) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            p34.m70899w(7, iArr, 4);
        }
    }

    /* renamed from: d */
    public static int[] m74535d(BigInteger bigInteger) {
        int[] h = i34.m58832h(bigInteger);
        if (h[6] == -1) {
            int[] iArr = f46234a;
            if (i34.m58834j(h, iArr)) {
                i34.m58844t(iArr, h);
            }
        }
        return h;
    }

    /* renamed from: e */
    public static void m74536e(int[] iArr, int[] iArr2) {
        hw3.m58708b(f46234a, iArr, iArr2);
    }

    /* renamed from: f */
    public static int m74537f(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: g */
    public static void m74538g(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] f = i34.m58830f();
        i34.m58837m(iArr, iArr2, f);
        m74543l(f, iArr3);
    }

    /* renamed from: h */
    public static void m74539h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (i34.m58841q(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && p34.m70896t(14, iArr3, f46235b))) {
            int[] iArr4 = f46236c;
            if (p34.m70881e(iArr4.length, iArr4, iArr3) != 0) {
                p34.m70899w(14, iArr3, iArr4.length);
            }
        }
    }

    /* renamed from: i */
    public static void m74540i(int[] iArr, int[] iArr2) {
        if (m74537f(iArr) != 0) {
            int[] iArr3 = f46234a;
            i34.m58843s(iArr3, iArr3, iArr2);
            return;
        }
        i34.m58843s(f46234a, iArr, iArr2);
    }

    /* renamed from: j */
    public static void m74541j(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            ek4.m57388h(bArr, 0, iArr, 0, 7);
        } while (p34.m70857A(7, iArr, f46234a) == 0);
    }

    /* renamed from: k */
    public static void m74542k(SecureRandom secureRandom, int[] iArr) {
        do {
            m74541j(secureRandom, iArr);
        } while (m74537f(iArr) != 0);
    }

    /* renamed from: l */
    public static void m74543l(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = j3;
        long j8 = (((long) iArr[9]) & 4294967295L) + j4;
        long j9 = j4;
        long j10 = ((((long) iArr[0]) & 4294967295L) - j5) + 0;
        long j11 = j10 & 4294967295L;
        long j12 = j2;
        long j13 = (j10 >> 32) + ((((long) iArr[1]) & 4294967295L) - j6);
        int i = (int) j13;
        iArr3[1] = i;
        long j14 = (j13 >> 32) + ((((long) iArr[2]) & 4294967295L) - j8);
        int i2 = (int) j14;
        iArr3[2] = i2;
        long j15 = (j14 >> 32) + (((((long) iArr[3]) & 4294967295L) + j5) - j);
        long j16 = j15 & 4294967295L;
        long j17 = (j15 >> 32) + (((((long) iArr[4]) & 4294967295L) + j6) - j12);
        iArr3[4] = (int) j17;
        long j18 = (j17 >> 32) + (((((long) iArr[5]) & 4294967295L) + j8) - j7);
        iArr3[5] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[6]) & 4294967295L) + j) - j9);
        iArr3[6] = (int) j19;
        long j20 = (j19 >> 32) + 1;
        long j21 = j16 + j20;
        long j22 = j11 - j20;
        iArr3[0] = (int) j22;
        long j23 = j22 >> 32;
        if (j23 != 0) {
            long j24 = j23 + (((long) i) & 4294967295L);
            iArr3[1] = (int) j24;
            long j25 = (j24 >> 32) + (4294967295L & ((long) i2));
            iArr3[2] = (int) j25;
            j21 += j25 >> 32;
        }
        iArr3[3] = (int) j21;
        if (((j21 >> 32) != 0 && p34.m70899w(7, iArr3, 4) != 0) || (iArr3[6] == -1 && i34.m58834j(iArr3, f46234a))) {
            m74534c(iArr2);
        }
    }

    /* renamed from: m */
    public static void m74544m(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (4294967295L & ((long) iArr[3])) + j2;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && p34.m70899w(7, iArr, 4) != 0) || (iArr[6] == -1 && i34.m58834j(iArr, f46234a))) {
            m74534c(iArr);
        }
    }

    /* renamed from: n */
    public static void m74545n(int[] iArr, int[] iArr2) {
        int[] f = i34.m58830f();
        i34.m58842r(iArr, f);
        m74543l(f, iArr2);
    }

    /* renamed from: o */
    public static void m74546o(int[] iArr, int i, int[] iArr2) {
        int[] f = i34.m58830f();
        i34.m58842r(iArr, f);
        while (true) {
            m74543l(f, iArr2);
            i--;
            if (i > 0) {
                i34.m58842r(iArr2, f);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public static void m74547p(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((4294967295L & ((long) iArr[3])) - 1);
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            p34.m70889m(7, iArr, 4);
        }
    }

    /* renamed from: q */
    public static void m74548q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (i34.m58843s(iArr, iArr2, iArr3) != 0) {
            m74547p(iArr3);
        }
    }

    /* renamed from: r */
    public static void m74549r(int[] iArr, int[] iArr2) {
        if (p34.m70863G(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && i34.m58834j(iArr2, f46234a))) {
            m74534c(iArr2);
        }
    }
}
