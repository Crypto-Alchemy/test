package p000;

import java.math.BigInteger;

/* renamed from: hr5 */
public class hr5 {
    /* renamed from: a */
    public static void m58665a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    /* renamed from: b */
    public static void m58666b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: c */
    public static void m58667c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    /* renamed from: d */
    public static void m58668d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    /* renamed from: e */
    public static long[] m58669e(BigInteger bigInteger) {
        return p34.m70894r(409, bigInteger);
    }

    /* renamed from: f */
    public static void m58670f(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(13);
        m34.m64061b(jArr, jArr2);
        for (int i = 1; i < 409; i += 2) {
            m58675k(jArr2, k);
            m58679o(k, jArr2);
            m58675k(jArr2, k);
            m58679o(k, jArr2);
            m58668d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m58671g(long[] jArr) {
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
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = (j8 >>> 35) ^ (j9 << 24);
        jArr[8] = (j9 >>> 40) ^ (j10 << 19);
        jArr[9] = (j10 >>> 45) ^ (j11 << 14);
        jArr[10] = (j11 >>> 50) ^ (j12 << 9);
        jArr[11] = ((j12 >>> 55) ^ (j13 << 4)) ^ (j14 << 63);
        jArr[12] = j14 >>> 1;
    }

    /* renamed from: h */
    public static void m58672h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    /* renamed from: i */
    public static void m58673i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        m58672h(jArr, jArr4);
        m58672h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i = 0; i < 7; i++) {
            m58674j(jArr6, jArr4[i], jArr5[i], jArr3, i << 1);
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
        long j20 = (j17 ^ jArr3[13]) ^ j18;
        jArr3[7] = j ^ j20;
        jArr3[8] = j4 ^ j20;
        jArr3[9] = j7 ^ j20;
        jArr3[10] = j10 ^ j20;
        jArr3[11] = j13 ^ j20;
        jArr3[12] = j16 ^ j20;
        jArr3[13] = j19 ^ j20;
        m58674j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m58674j(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        m58674j(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        m58674j(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        m58674j(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        m58674j(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        m58674j(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        m58674j(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        m58674j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        m58674j(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        m58674j(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        m58674j(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        m58674j(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        m58674j(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        m58674j(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        m58674j(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        m58674j(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        m58674j(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        m58674j(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        m58674j(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        m58674j(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
        m58671g(jArr3);
    }

    /* renamed from: j */
    public static void m58674j(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        int i3 = 54;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (576460752303423487L & j8);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j8 >>> 59) ^ (j9 << 5));
    }

    /* renamed from: k */
    public static void m58675k(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 6, jArr2, 0);
        jArr2[12] = jx2.m59600a((int) jArr[6]);
    }

    /* renamed from: l */
    public static void m58676l(long[] jArr, long[] jArr2) {
        if (!m34.m64066g(jArr)) {
            long[] c = m34.m64062c();
            long[] c2 = m34.m64062c();
            long[] c3 = m34.m64062c();
            m58681q(jArr, c);
            m58683s(c, 1, c2);
            m58677m(c, c2, c);
            m58683s(c2, 1, c2);
            m58677m(c, c2, c);
            m58683s(c, 3, c2);
            m58677m(c, c2, c);
            m58683s(c, 6, c2);
            m58677m(c, c2, c);
            m58683s(c, 12, c2);
            m58677m(c, c2, c3);
            m58683s(c3, 24, c);
            m58683s(c, 24, c2);
            m58677m(c, c2, c);
            m58683s(c, 48, c2);
            m58677m(c, c2, c);
            m58683s(c, 96, c2);
            m58677m(c, c2, c);
            m58683s(c, 192, c2);
            m58677m(c, c2, c);
            m58677m(c, c3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public static void m58677m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = m34.m64063d();
        m58673i(jArr, jArr2, d);
        m58679o(d, jArr3);
    }

    /* renamed from: n */
    public static void m58678n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = m34.m64063d();
        m58673i(jArr, jArr2, d);
        m58666b(jArr3, d, jArr3);
    }

    /* renamed from: o */
    public static void m58679o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j11 = j8 ^ (j9 >>> 2);
        long j12 = jArr[11];
        long j13 = j5 ^ (j12 << 39);
        long j14 = (j6 ^ (j9 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j15 = j10 ^ (j12 >>> 2);
        long j16 = jArr[10];
        long j17 = j4 ^ (j16 << 39);
        long j18 = j13 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j14 ^ (j16 >>> 2);
        long j20 = jArr[9];
        long j21 = j3 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[8];
        long j25 = j ^ (j11 << 39);
        long j26 = (j21 ^ ((j24 >>> 25) ^ (j24 << 62))) ^ (j11 >>> 2);
        long j27 = j15 >>> 25;
        jArr2[0] = j25 ^ j27;
        long j28 = j27 << 23;
        jArr2[1] = j28 ^ ((j2 ^ (j24 << 39)) ^ ((j11 >>> 25) ^ (j11 << 62)));
        jArr2[2] = j26;
        jArr2[3] = j22 ^ (j24 >>> 2);
        jArr2[4] = j23;
        jArr2[5] = j19;
        jArr2[6] = j15 & 33554431;
    }

    /* renamed from: p */
    public static void m58680p(long[] jArr, long[] jArr2) {
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        long j2 = (f >>> 32) | (f2 & -4294967296L);
        long f3 = jx2.m59605f(jArr[2]);
        long f4 = jx2.m59605f(jArr[3]);
        long j3 = (f3 & 4294967295L) | (f4 << 32);
        long j4 = (f3 >>> 32) | (f4 & -4294967296L);
        long f5 = jx2.m59605f(jArr[4]);
        long f6 = jx2.m59605f(jArr[5]);
        long j5 = (f5 >>> 32) | (f6 & -4294967296L);
        long f7 = jx2.m59605f(jArr[6]);
        long j6 = f7 & 4294967295L;
        long j7 = f7 >>> 32;
        jArr2[0] = j ^ (j2 << 44);
        jArr2[1] = (j3 ^ (j4 << 44)) ^ (j2 >>> 20);
        jArr2[2] = (((f5 & 4294967295L) | (f6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20);
        jArr2[3] = (((j7 << 44) ^ j6) ^ (j5 >>> 20)) ^ (j2 << 13);
        jArr2[4] = (j2 >>> 51) ^ ((j7 >>> 20) ^ (j4 << 13));
        jArr2[5] = (j5 << 13) ^ (j4 >>> 51);
        jArr2[6] = (j7 << 13) ^ (j5 >>> 51);
    }

    /* renamed from: q */
    public static void m58681q(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(13);
        m58675k(jArr, k);
        m58679o(k, jArr2);
    }

    /* renamed from: r */
    public static void m58682r(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(13);
        m58675k(jArr, k);
        m58666b(jArr2, k, jArr2);
    }

    /* renamed from: s */
    public static void m58683s(long[] jArr, int i, long[] jArr2) {
        long[] k = p34.m70887k(13);
        m58675k(jArr, k);
        while (true) {
            m58679o(k, jArr2);
            i--;
            if (i > 0) {
                m58675k(jArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public static int m58684t(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
