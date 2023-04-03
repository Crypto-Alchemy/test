package p000;

import java.math.BigInteger;

/* renamed from: nr5 */
public class nr5 {

    /* renamed from: a */
    public static final long[] f43555a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    /* renamed from: a */
    public static void m70046a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i3 + i4] = jArr[i + i4] ^ jArr2[i2 + i4];
        }
    }

    /* renamed from: b */
    public static void m70047b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: c */
    public static void m70048c(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    /* renamed from: d */
    public static void m70049d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    /* renamed from: e */
    public static void m70050e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: f */
    public static void m70051f(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    /* renamed from: g */
    public static void m70052g(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            jArr2[i] = jArr2[i] ^ jArr[i];
        }
    }

    /* renamed from: h */
    public static long[] m70053h(BigInteger bigInteger) {
        return p34.m70894r(571, bigInteger);
    }

    /* renamed from: i */
    public static void m70054i(long[] jArr, long[] jArr2) {
        long[] d = o34.m70128d();
        o34.m70126b(jArr, jArr2);
        for (int i = 1; i < 571; i += 2) {
            m70058m(jArr2, d);
            m70065t(d, jArr2);
            m70058m(jArr2, d);
            m70065t(d, jArr2);
            m70052g(jArr, jArr2);
        }
    }

    /* renamed from: j */
    public static void m70055j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i = 0; i < 9; i++) {
            m70057l(jArr4, jArr[i], jArr2[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = j17 ^ jArr3[13];
        long j21 = j18 ^ jArr3[14];
        long j22 = j21 ^ j20;
        jArr3[7] = j22;
        long j23 = j20 ^ jArr3[15];
        long j24 = j21 ^ jArr3[16];
        long j25 = j24 ^ j23;
        jArr3[8] = j25;
        long j26 = (j23 ^ jArr3[17]) ^ j24;
        jArr3[9] = j ^ j26;
        jArr3[10] = j4 ^ j26;
        jArr3[11] = j7 ^ j26;
        jArr3[12] = j10 ^ j26;
        jArr3[13] = j13 ^ j26;
        jArr3[14] = j16 ^ j26;
        jArr3[15] = j19 ^ j26;
        jArr3[16] = j22 ^ j26;
        jArr3[17] = j25 ^ j26;
        m70057l(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        m70057l(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        m70057l(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        m70057l(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        m70057l(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        m70057l(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        m70057l(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        m70057l(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        m70057l(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        m70057l(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        m70057l(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        m70057l(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        m70057l(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        m70057l(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        m70057l(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        m70057l(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        m70057l(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        m70057l(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        m70057l(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        m70057l(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        m70057l(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        m70057l(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        m70057l(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        m70057l(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        m70057l(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        m70057l(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        m70057l(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        m70057l(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        m70057l(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        m70057l(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        m70057l(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        m70057l(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        m70057l(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        m70057l(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        m70057l(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        m70057l(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    /* renamed from: k */
    public static void m70056k(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                m70048c(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            p34.m70867K(16, jArr3, 0, 8, 0);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                int i7 = (((i6 >>> 4) & 15) + 16) * 9;
                m70048c(jArr2, (i6 & 15) * 9, jArr2, i7, jArr3, i5);
            }
            if (i4 > 0) {
                p34.m70867K(18, jArr3, 0, 8, 0);
            }
        }
    }

    /* renamed from: l */
    public static void m70057l(long[] jArr, long j, long j2, long[] jArr2, int i) {
        long j3 = j;
        jArr[1] = j2;
        for (int i2 = 2; i2 < 16; i2 += 2) {
            long j4 = jArr[i2 >>> 1] << 1;
            jArr[i2] = j4;
            jArr[i2 + 1] = j4 ^ j2;
        }
        int i3 = (int) j3;
        long j5 = 0;
        long j6 = jArr[i3 & 15] ^ (jArr[(i3 >>> 4) & 15] << 4);
        int i4 = 56;
        do {
            int i5 = (int) (j3 >>> i4);
            long j7 = jArr[i5 & 15] ^ (jArr[(i5 >>> 4) & 15] << 4);
            j6 ^= j7 << i4;
            j5 ^= j7 >>> (-i4);
            i4 -= 8;
        } while (i4 > 0);
        for (int i6 = 0; i6 < 7; i6++) {
            j3 = (j3 & -72340172838076674L) >>> 1;
            j5 ^= ((j2 << i6) >> 63) & j3;
        }
        jArr2[i] = jArr2[i] ^ j6;
        int i7 = i + 1;
        jArr2[i7] = jArr2[i7] ^ j5;
    }

    /* renamed from: m */
    public static void m70058m(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 9, jArr2, 0);
    }

    /* renamed from: n */
    public static void m70059n(long[] jArr, long[] jArr2) {
        if (!o34.m70131g(jArr)) {
            long[] c = o34.m70127c();
            long[] c2 = o34.m70127c();
            long[] c3 = o34.m70127c();
            m70068w(jArr, c3);
            m70068w(c3, c);
            m70068w(c, c2);
            m70060o(c, c2, c);
            m70070y(c, 2, c2);
            m70060o(c, c2, c);
            m70060o(c, c3, c);
            m70070y(c, 5, c2);
            m70060o(c, c2, c);
            m70070y(c2, 5, c2);
            m70060o(c, c2, c);
            m70070y(c, 15, c2);
            m70060o(c, c2, c3);
            m70070y(c3, 30, c);
            m70070y(c, 30, c2);
            m70060o(c, c2, c);
            m70070y(c, 60, c2);
            m70060o(c, c2, c);
            m70070y(c2, 60, c2);
            m70060o(c, c2, c);
            m70070y(c, 180, c2);
            m70060o(c, c2, c);
            m70070y(c2, 180, c2);
            m70060o(c, c2, c);
            m70060o(c, c3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public static void m70060o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = o34.m70128d();
        m70055j(jArr, jArr2, d);
        m70065t(d, jArr3);
    }

    /* renamed from: p */
    public static void m70061p(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = o34.m70128d();
        m70055j(jArr, jArr2, d);
        m70050e(jArr3, d, jArr3);
    }

    /* renamed from: q */
    public static void m70062q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = o34.m70128d();
        m70056k(jArr, jArr2, d);
        m70065t(d, jArr3);
    }

    /* renamed from: r */
    public static void m70063r(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = o34.m70128d();
        m70056k(jArr, jArr2, d);
        m70050e(jArr3, d, jArr3);
    }

    /* renamed from: s */
    public static long[] m70064s(long[] jArr) {
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        while (i2 > 0) {
            int i3 = i + 18;
            p34.m70864H(9, jArr2, i3 >>> 1, 0, jArr2, i3);
            m70066u(jArr2, i3);
            m70046a(jArr2, 9, jArr2, i3, jArr2, i3 + 9);
            i2--;
            i = i3;
        }
        p34.m70868L(144, jArr2, 0, 4, 0, jArr2, 144);
        return jArr2;
    }

    /* renamed from: t */
    public static void m70065t(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    /* renamed from: u */
    public static void m70066u(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    /* renamed from: v */
    public static void m70067v(long[] jArr, long[] jArr2) {
        long[] c = o34.m70127c();
        long[] c2 = o34.m70127c();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long f = jx2.m59605f(jArr[i]);
            i = i3 + 1;
            long f2 = jx2.m59605f(jArr[i3]);
            c[i2] = (4294967295L & f) | (f2 << 32);
            c2[i2] = (f >>> 32) | (-4294967296L & f2);
        }
        long f3 = jx2.m59605f(jArr[i]);
        c[4] = 4294967295L & f3;
        c2[4] = f3 >>> 32;
        m70060o(c2, f43555a, jArr2);
        m70047b(jArr2, c, jArr2);
    }

    /* renamed from: w */
    public static void m70068w(long[] jArr, long[] jArr2) {
        long[] d = o34.m70128d();
        m70058m(jArr, d);
        m70065t(d, jArr2);
    }

    /* renamed from: x */
    public static void m70069x(long[] jArr, long[] jArr2) {
        long[] d = o34.m70128d();
        m70058m(jArr, d);
        m70050e(jArr2, d, jArr2);
    }

    /* renamed from: y */
    public static void m70070y(long[] jArr, int i, long[] jArr2) {
        long[] d = o34.m70128d();
        m70058m(jArr, d);
        while (true) {
            m70065t(d, jArr2);
            i--;
            if (i > 0) {
                m70058m(jArr2, d);
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    public static int m70071z(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[8];
        return ((int) ((j ^ (j2 >>> 49)) ^ (j2 >>> 57))) & 1;
    }
}
