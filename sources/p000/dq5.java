package p000;

import java.math.BigInteger;

/* renamed from: dq5 */
public class dq5 {

    /* renamed from: a */
    public static final long[] f37374a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    /* renamed from: a */
    public static void m57022a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    /* renamed from: b */
    public static void m57023b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    /* renamed from: c */
    public static void m57024c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* renamed from: d */
    public static void m57025d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    /* renamed from: e */
    public static long[] m57026e(BigInteger bigInteger) {
        return p34.m70894r(163, bigInteger);
    }

    /* renamed from: f */
    public static void m57027f(long[] jArr, long[] jArr2) {
        long[] k = h34.m58436k();
        h34.m58432g(jArr, jArr2);
        for (int i = 1; i < 163; i += 2) {
            m57031j(jArr2, k);
            m57035n(k, jArr2);
            m57031j(jArr2, k);
            m57035n(k, jArr2);
            m57025d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m57028g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    /* renamed from: h */
    public static void m57029h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j7 << 9) ^ (j6 >>> 55)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        long[] jArr5 = jArr3;
        long[] jArr6 = jArr4;
        m57030i(jArr5, j5, j10, jArr6, 0);
        m57030i(jArr5, j3, j8, jArr6, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        m57030i(jArr3, j11, j12, jArr6, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        long[] jArr7 = jArr3;
        m57030i(jArr7, j5 ^ j13, j10 ^ j14, jArr6, 6);
        m57030i(jArr7, j11 ^ j13, j12 ^ j14, jArr6, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = jArr4[9] ^ j17;
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j18) ^ (j28 >>> 55);
        long j30 = j28 & 36028797018963967L;
        long j31 = ((j26 & 36028797018963967L) >>> 1) ^ ((j30 & 1) << 54);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 36028797018963967L;
        long j38 = ((j30 >>> 1) ^ ((j29 & 1) << 54)) ^ (j37 >>> 54);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 36028797018963967L;
        long j45 = (j29 >>> 1) ^ (j44 >>> 54);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j21;
        jArr3[1] = (j23 ^ j37) ^ j25;
        jArr3[2] = (j37 ^ (j24 ^ j44)) ^ j27;
        jArr3[3] = j51 ^ j44;
        jArr3[4] = jArr4[2] ^ j51;
        jArr3[5] = jArr4[3];
        m57028g(jArr3);
    }

    /* renamed from: i */
    public static void m57030i(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        long j8 = jArr[((int) j3) & 3];
        long j9 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j3 >>> i2);
            long j10 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 36028797018963967L & j8;
        jArr2[i + 1] = (j8 >>> 55) ^ (j9 << 9);
    }

    /* renamed from: j */
    public static void m57031j(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 3, jArr2, 0);
    }

    /* renamed from: k */
    public static void m57032k(long[] jArr, long[] jArr2) {
        if (!h34.m58447v(jArr)) {
            long[] i = h34.m58434i();
            long[] i2 = h34.m58434i();
            m57037p(jArr, i);
            m57039r(i, 1, i2);
            m57033l(i, i2, i);
            m57039r(i2, 1, i2);
            m57033l(i, i2, i);
            m57039r(i, 3, i2);
            m57033l(i, i2, i);
            m57039r(i2, 3, i2);
            m57033l(i, i2, i);
            m57039r(i, 9, i2);
            m57033l(i, i2, i);
            m57039r(i2, 9, i2);
            m57033l(i, i2, i);
            m57039r(i, 27, i2);
            m57033l(i, i2, i);
            m57039r(i2, 27, i2);
            m57033l(i, i2, i);
            m57039r(i, 81, i2);
            m57033l(i, i2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public static void m57033l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m57029h(jArr, jArr2, jArr4);
        m57035n(jArr4, jArr3);
    }

    /* renamed from: m */
    public static void m57034m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m57029h(jArr, jArr2, jArr4);
        m57023b(jArr3, jArr4, jArr3);
    }

    /* renamed from: n */
    public static void m57035n(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36));
        long j9 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j10 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j11 = j8 ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = 34359738367L & j9;
    }

    /* renamed from: o */
    public static void m57036o(long[] jArr, long[] jArr2) {
        long[] i = h34.m58434i();
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        i[0] = (f >>> 32) | (f2 & -4294967296L);
        long f3 = jx2.m59605f(jArr[2]);
        long j = f3 & 4294967295L;
        i[1] = f3 >>> 32;
        m57033l(i, f37374a, jArr2);
        jArr2[0] = jArr2[0] ^ ((f & 4294967295L) | (f2 << 32));
        jArr2[1] = jArr2[1] ^ j;
    }

    /* renamed from: p */
    public static void m57037p(long[] jArr, long[] jArr2) {
        long[] k = h34.m58436k();
        m57031j(jArr, k);
        m57035n(k, jArr2);
    }

    /* renamed from: q */
    public static void m57038q(long[] jArr, long[] jArr2) {
        long[] k = h34.m58436k();
        m57031j(jArr, k);
        m57023b(jArr2, k, jArr2);
    }

    /* renamed from: r */
    public static void m57039r(long[] jArr, int i, long[] jArr2) {
        long[] k = h34.m58436k();
        m57031j(jArr, k);
        while (true) {
            m57035n(k, jArr2);
            i--;
            if (i > 0) {
                m57031j(jArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public static int m57040s(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
