package p000;

import java.math.BigInteger;

/* renamed from: rp5 */
public class rp5 {
    /* renamed from: a */
    public static void m71620a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    /* renamed from: b */
    public static void m71621b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: c */
    public static void m71622c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    /* renamed from: d */
    public static void m71623d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    /* renamed from: e */
    public static long[] m71624e(BigInteger bigInteger) {
        return p34.m70894r(113, bigInteger);
    }

    /* renamed from: f */
    public static void m71625f(long[] jArr, long[] jArr2) {
        long[] i = f34.m57570i();
        f34.m57566e(jArr, jArr2);
        for (int i2 = 1; i2 < 113; i2 += 2) {
            m71628i(jArr2, i);
            m71632m(i, jArr2);
            m71628i(jArr2, i);
            m71632m(i, jArr2);
            m71623d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m71626g(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        long[] jArr5 = jArr3;
        long[] jArr6 = jArr4;
        m71627h(jArr5, j3, j6, jArr4, 0);
        long[] jArr7 = jArr6;
        m71627h(jArr5, j2, j5, jArr7, 2);
        m71627h(jArr5, j3 ^ j2, j6 ^ j5, jArr7, 4);
        long j7 = jArr6[1] ^ jArr6[2];
        long j8 = jArr6[0];
        long j9 = jArr6[3];
        long j10 = (jArr6[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr6[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    /* renamed from: h */
    public static void m71627h(long[] jArr, long j, long j2, long[] jArr2, int i) {
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

    /* renamed from: i */
    public static void m71628i(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 2, jArr2, 0);
    }

    /* renamed from: j */
    public static void m71629j(long[] jArr, long[] jArr2) {
        if (!f34.m57579r(jArr)) {
            long[] g = f34.m57568g();
            long[] g2 = f34.m57568g();
            m71634o(jArr, g);
            m71630k(g, jArr, g);
            m71634o(g, g);
            m71630k(g, jArr, g);
            m71636q(g, 3, g2);
            m71630k(g2, g, g2);
            m71634o(g2, g2);
            m71630k(g2, jArr, g2);
            m71636q(g2, 7, g);
            m71630k(g, g2, g);
            m71636q(g, 14, g2);
            m71630k(g2, g, g2);
            m71636q(g2, 28, g);
            m71630k(g, g2, g);
            m71636q(g, 56, g2);
            m71630k(g2, g, g2);
            m71634o(g2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public static void m71630k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m71626g(jArr, jArr2, jArr4);
        m71632m(jArr4, jArr3);
    }

    /* renamed from: l */
    public static void m71631l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m71626g(jArr, jArr2, jArr4);
        m71621b(jArr3, jArr4, jArr3);
    }

    /* renamed from: m */
    public static void m71632m(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    /* renamed from: n */
    public static void m71633n(long[] jArr, long[] jArr2) {
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        long j = (f >>> 32) | (f2 & -4294967296L);
        jArr2[0] = ((j << 57) ^ ((4294967295L & f) | (f2 << 32))) ^ (j << 5);
        jArr2[1] = (j >>> 59) ^ (j >>> 7);
    }

    /* renamed from: o */
    public static void m71634o(long[] jArr, long[] jArr2) {
        long[] i = f34.m57570i();
        m71628i(jArr, i);
        m71632m(i, jArr2);
    }

    /* renamed from: p */
    public static void m71635p(long[] jArr, long[] jArr2) {
        long[] i = f34.m57570i();
        m71628i(jArr, i);
        m71621b(jArr2, i, jArr2);
    }

    /* renamed from: q */
    public static void m71636q(long[] jArr, int i, long[] jArr2) {
        long[] i2 = f34.m57570i();
        m71628i(jArr, i2);
        while (true) {
            m71632m(i2, jArr2);
            i--;
            if (i > 0) {
                m71628i(jArr2, i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public static int m71637r(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
