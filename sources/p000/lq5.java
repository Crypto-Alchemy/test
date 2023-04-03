package p000;

import java.math.BigInteger;

/* renamed from: lq5 */
public class lq5 {
    /* renamed from: a */
    public static void m63950a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: b */
    public static void m63951b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    /* renamed from: c */
    public static void m63952c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: d */
    public static void m63953d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: e */
    public static long[] m63954e(BigInteger bigInteger) {
        return p34.m70894r(193, bigInteger);
    }

    /* renamed from: f */
    public static void m63955f(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        j34.m59223h(jArr, jArr2);
        for (int i = 1; i < 193; i += 2) {
            m63960k(jArr2, l);
            m63964o(l, jArr2);
            m63960k(jArr2, l);
            m63964o(l, jArr2);
            m63953d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m63956g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    /* renamed from: h */
    public static void m63957h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    /* renamed from: i */
    public static void m63958i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m63957h(jArr, jArr4);
        m63957h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        long[] jArr7 = jArr6;
        long[] jArr8 = jArr3;
        m63959j(jArr7, jArr4[0], jArr5[0], jArr8, 0);
        m63959j(jArr7, jArr4[1], jArr5[1], jArr8, 1);
        m63959j(jArr7, jArr4[2], jArr5[2], jArr8, 2);
        m63959j(jArr7, jArr4[3], jArr5[3], jArr8, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m63959j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m63959j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m63959j(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr9 = new long[3];
        long[] jArr10 = jArr6;
        long[] jArr11 = jArr9;
        m63959j(jArr6, j, j3, jArr11, 0);
        m63959j(jArr10, j2, j4, jArr11, 1);
        long j5 = jArr9[0];
        long j6 = jArr9[1];
        long j7 = jArr9[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        m63956g(jArr3);
    }

    /* renamed from: j */
    public static void m63959j(long[] jArr, long j, long j2, long[] jArr2, int i) {
        long j3 = j;
        jArr[1] = j2;
        long j4 = j2 << 1;
        jArr[2] = j4;
        long j5 = j4 ^ j2;
        jArr[3] = j5;
        long j6 = j4 << 1;
        jArr[4] = j6;
        jArr[5] = j6 ^ j2;
        long j7 = j5 << 1;
        jArr[6] = j7;
        jArr[7] = j7 ^ j2;
        int i2 = (int) j3;
        long j8 = (jArr[(i2 >>> 3) & 7] << 3) ^ jArr[i2 & 7];
        long j9 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (562949953421311L & j8);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j8 >>> 49) ^ (j9 << 15));
    }

    /* renamed from: k */
    public static void m63960k(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & 1;
    }

    /* renamed from: l */
    public static void m63961l(long[] jArr, long[] jArr2) {
        if (!j34.m59238w(jArr)) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            m63966q(jArr, j);
            m63968s(j, 1, j2);
            m63962m(j, j2, j);
            m63968s(j2, 1, j2);
            m63962m(j, j2, j);
            m63968s(j, 3, j2);
            m63962m(j, j2, j);
            m63968s(j, 6, j2);
            m63962m(j, j2, j);
            m63968s(j, 12, j2);
            m63962m(j, j2, j);
            m63968s(j, 24, j2);
            m63962m(j, j2, j);
            m63968s(j, 48, j2);
            m63962m(j, j2, j);
            m63968s(j, 96, j2);
            m63962m(j, j2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public static void m63962m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = j34.m59227l();
        m63958i(jArr, jArr2, l);
        m63964o(l, jArr3);
    }

    /* renamed from: n */
    public static void m63963n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = j34.m59227l();
        m63958i(jArr, jArr2, l);
        m63951b(jArr3, l, jArr3);
    }

    /* renamed from: o */
    public static void m63964o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j13 >>> 49) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    /* renamed from: p */
    public static void m63965p(long[] jArr, long[] jArr2) {
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        long j2 = (f >>> 32) | (f2 & -4294967296L);
        long f3 = jx2.m59605f(jArr[2]);
        long j3 = (f3 & 4294967295L) ^ (jArr[3] << 32);
        long j4 = f3 >>> 32;
        jArr2[0] = j ^ (j2 << 8);
        jArr2[1] = ((j3 ^ (j4 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33);
        jArr2[2] = (j2 >>> 31) ^ ((j4 >>> 56) ^ (j4 << 33));
        jArr2[3] = j4 >>> 31;
    }

    /* renamed from: q */
    public static void m63966q(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        m63960k(jArr, l);
        m63964o(l, jArr2);
    }

    /* renamed from: r */
    public static void m63967r(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        m63960k(jArr, l);
        m63951b(jArr2, l, jArr2);
    }

    /* renamed from: s */
    public static void m63968s(long[] jArr, int i, long[] jArr2) {
        long[] l = j34.m59227l();
        m63960k(jArr, l);
        while (true) {
            m63964o(l, jArr2);
            i--;
            if (i > 0) {
                m63960k(jArr2, l);
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public static int m63969t(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
