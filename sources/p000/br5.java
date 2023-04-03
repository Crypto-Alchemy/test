package p000;

import java.math.BigInteger;

/* renamed from: br5 */
public class br5 {

    /* renamed from: a */
    public static final long[] f36945a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    /* renamed from: a */
    public static void m56144a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    /* renamed from: b */
    public static void m56145b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    /* renamed from: c */
    public static void m56146c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    /* renamed from: d */
    public static void m56147d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    /* renamed from: e */
    public static long[] m56148e(BigInteger bigInteger) {
        return p34.m70894r(283, bigInteger);
    }

    /* renamed from: f */
    public static void m56149f(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(9);
        k34.m59676b(jArr, jArr2);
        for (int i = 1; i < 283; i += 2) {
            m56154k(jArr2, k);
            m56158o(k, jArr2);
            m56154k(jArr2, k);
            m56158o(k, jArr2);
            m56147d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m56150g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        jArr[0] = j ^ (j2 << 57);
        jArr[1] = (j2 >>> 7) ^ (j3 << 50);
        jArr[2] = (j3 >>> 14) ^ (j4 << 43);
        jArr[3] = (j4 >>> 21) ^ (j5 << 36);
        jArr[4] = (j5 >>> 28) ^ (j6 << 29);
        jArr[5] = (j6 >>> 35) ^ (j7 << 22);
        jArr[6] = (j7 >>> 42) ^ (j8 << 15);
        jArr[7] = (j8 >>> 49) ^ (j9 << 8);
        jArr[8] = (j9 >>> 56) ^ (j10 << 1);
        jArr[9] = j10 >>> 63;
    }

    /* renamed from: h */
    public static void m56151h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    /* renamed from: i */
    public static void m56152i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        m56151h(jArr, jArr4);
        m56151h(jArr2, jArr5);
        long[] jArr6 = new long[26];
        long[] jArr7 = jArr3;
        long[] jArr8 = jArr6;
        m56153j(jArr7, jArr4[0], jArr5[0], jArr8, 0);
        m56153j(jArr7, jArr4[1], jArr5[1], jArr8, 2);
        m56153j(jArr7, jArr4[2], jArr5[2], jArr8, 4);
        m56153j(jArr7, jArr4[3], jArr5[3], jArr8, 6);
        m56153j(jArr7, jArr4[4], jArr5[4], jArr8, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        long[] jArr9 = jArr6;
        m56153j(jArr3, j6 ^ j13, j8 ^ j15, jArr9, 18);
        long[] jArr10 = jArr3;
        m56153j(jArr10, j10 ^ jArr4[1], j12 ^ jArr5[1], jArr9, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        long j19 = j17 ^ jArr4[2];
        long j20 = j18 ^ jArr5[2];
        long[] jArr11 = jArr6;
        m56153j(jArr10, j17, j18, jArr11, 22);
        m56153j(jArr10, j19, j20, jArr11, 24);
        m56153j(jArr10, j2, j4, jArr11, 10);
        m56153j(jArr10, j6, j8, jArr11, 12);
        m56153j(jArr10, j10, j12, jArr11, 14);
        m56153j(jArr10, j14, j16, jArr11, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j21 = jArr6[0];
        long j22 = jArr6[1] ^ j21;
        long j23 = jArr6[2] ^ j22;
        long j24 = jArr6[10] ^ j23;
        jArr3[1] = j24;
        long j25 = jArr6[3] ^ jArr6[4];
        long j26 = j23 ^ (j25 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j26;
        long j27 = j22 ^ j25;
        long j28 = jArr6[5] ^ jArr6[6];
        long j29 = jArr6[8];
        long j30 = (j27 ^ j28) ^ j29;
        long j31 = jArr6[13] ^ jArr6[14];
        long j32 = jArr6[18];
        long j33 = jArr6[22];
        long j34 = jArr6[24];
        jArr3[3] = (j30 ^ j31) ^ ((j32 ^ j33) ^ j34);
        long j35 = jArr6[7] ^ j29;
        long j36 = jArr6[9];
        long j37 = j35 ^ j36;
        long j38 = j37 ^ jArr6[17];
        jArr3[8] = j38;
        long j39 = (j37 ^ j28) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j39;
        long j40 = j24 ^ j39;
        long j41 = jArr6[19] ^ jArr6[20];
        long j42 = jArr6[25];
        long j43 = jArr6[23];
        long j44 = j41 ^ (j42 ^ j34);
        jArr3[4] = (j44 ^ (j32 ^ j43)) ^ j40;
        long j45 = jArr6[21];
        jArr3[5] = ((j26 ^ j38) ^ j44) ^ (j45 ^ j33);
        jArr3[6] = (((((j30 ^ j21) ^ j36) ^ j31) ^ j45) ^ j43) ^ j42;
        m56150g(jArr3);
    }

    /* renamed from: j */
    public static void m56153j(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        long j8 = jArr[((int) j3) & 7];
        long j9 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j3 >>> i2);
            long j10 = (jArr[i3 & 7] ^ (jArr[(i3 >>> 3) & 7] << 3)) ^ (jArr[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr2[i] = 144115188075855871L & j8;
        jArr2[i + 1] = (((((j3 & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
    }

    /* renamed from: k */
    public static void m56154k(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 4, jArr2, 0);
        jArr2[8] = jx2.m59600a((int) jArr[4]);
    }

    /* renamed from: l */
    public static void m56155l(long[] jArr, long[] jArr2) {
        if (!k34.m59681g(jArr)) {
            long[] c = k34.m59677c();
            long[] c2 = k34.m59677c();
            m56160q(jArr, c);
            m56156m(c, jArr, c);
            m56162s(c, 2, c2);
            m56156m(c2, c, c2);
            m56162s(c2, 4, c);
            m56156m(c, c2, c);
            m56162s(c, 8, c2);
            m56156m(c2, c, c2);
            m56160q(c2, c2);
            m56156m(c2, jArr, c2);
            m56162s(c2, 17, c);
            m56156m(c, c2, c);
            m56160q(c, c);
            m56156m(c, jArr, c);
            m56162s(c, 35, c2);
            m56156m(c2, c, c2);
            m56162s(c2, 70, c);
            m56156m(c, c2, c);
            m56160q(c, c);
            m56156m(c, jArr, c);
            m56162s(c, 141, c2);
            m56156m(c2, c, c2);
            m56160q(c2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public static void m56156m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = k34.m59678d();
        m56152i(jArr, jArr2, d);
        m56158o(d, jArr3);
    }

    /* renamed from: n */
    public static void m56157n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = k34.m59678d();
        m56152i(jArr, jArr2, d);
        m56145b(jArr3, d, jArr3);
    }

    /* renamed from: o */
    public static void m56158o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    /* renamed from: p */
    public static void m56159p(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr2;
        long[] c = k34.m59677c();
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        c[0] = (f >>> 32) | (f2 & -4294967296L);
        long f3 = jx2.m59605f(jArr[2]);
        long f4 = jx2.m59605f(jArr[3]);
        c[1] = (f3 >>> 32) | (-4294967296L & f4);
        long f5 = jx2.m59605f(jArr[4]);
        c[2] = f5 >>> 32;
        m56156m(c, f36945a, jArr3);
        jArr3[0] = jArr3[0] ^ j;
        jArr3[1] = jArr3[1] ^ ((f3 & 4294967295L) | (f4 << 32));
        jArr3[2] = jArr3[2] ^ (4294967295L & f5);
    }

    /* renamed from: q */
    public static void m56160q(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(9);
        m56154k(jArr, k);
        m56158o(k, jArr2);
    }

    /* renamed from: r */
    public static void m56161r(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(9);
        m56154k(jArr, k);
        m56145b(jArr2, k, jArr2);
    }

    /* renamed from: s */
    public static void m56162s(long[] jArr, int i, long[] jArr2) {
        long[] k = p34.m70887k(9);
        m56154k(jArr, k);
        while (true) {
            m56158o(k, jArr2);
            i--;
            if (i > 0) {
                m56154k(jArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public static int m56163t(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
