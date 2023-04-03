package p000;

import java.math.BigInteger;

/* renamed from: xp5 */
public class xp5 {

    /* renamed from: a */
    public static final long[] f46006a = {2791191049453778211L, 2791191049453778402L, 6};

    /* renamed from: a */
    public static void m74062a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    /* renamed from: b */
    public static void m74063b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    /* renamed from: c */
    public static void m74064c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* renamed from: d */
    public static void m74065d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    /* renamed from: e */
    public static long[] m74066e(BigInteger bigInteger) {
        return p34.m70894r(131, bigInteger);
    }

    /* renamed from: f */
    public static void m74067f(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(5);
        h34.m58432g(jArr, jArr2);
        for (int i = 1; i < 131; i += 2) {
            m74071j(jArr2, k);
            m74075n(k, jArr2);
            m74071j(jArr2, k);
            m74075n(k, jArr2);
            m74065d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m74068g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 44);
        jArr[1] = (j2 >>> 20) ^ (j3 << 24);
        jArr[2] = ((j3 >>> 40) ^ (j4 << 4)) ^ (j5 << 48);
        jArr[3] = ((j4 >>> 60) ^ (j6 << 28)) ^ (j5 >>> 16);
        jArr[4] = j6 >>> 36;
        jArr[5] = 0;
    }

    /* renamed from: h */
    public static void m74069h(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j7 << 20) ^ (j6 >>> 44)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        long[] jArr5 = jArr3;
        long[] jArr6 = jArr4;
        m74070i(jArr5, j5, j10, jArr6, 0);
        m74070i(jArr5, j3, j8, jArr6, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        m74070i(jArr3, j11, j12, jArr6, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        long[] jArr7 = jArr3;
        m74070i(jArr7, j5 ^ j13, j10 ^ j14, jArr6, 6);
        m74070i(jArr7, j11 ^ j13, j12 ^ j14, jArr6, 8);
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
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 44);
        long j29 = (j24 ^ j18) ^ (j28 >>> 44);
        long j30 = j28 & 17592186044415L;
        long j31 = ((j26 & 17592186044415L) >>> 1) ^ ((j30 & 1) << 43);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 17592186044415L;
        long j38 = ((j30 >>> 1) ^ ((j29 & 1) << 43)) ^ (j37 >>> 43);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 17592186044415L;
        long j45 = (j44 >>> 43) ^ (j29 >>> 1);
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
        m74068g(jArr3);
    }

    /* renamed from: i */
    public static void m74070i(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        long j8 = (((jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3)) ^ (jArr[(i2 >>> 6) & 7] << 6)) ^ (jArr[(i2 >>> 9) & 7] << 9)) ^ (jArr[(i2 >>> 12) & 7] << 12);
        long j9 = 0;
        int i3 = 30;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = (((jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3)) ^ (jArr[(i4 >>> 6) & 7] << 6)) ^ (jArr[(i4 >>> 9) & 7] << 9)) ^ (jArr[(i4 >>> 12) & 7] << 12);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr2[i] = 17592186044415L & j8;
        jArr2[i + 1] = (j8 >>> 44) ^ (j9 << 20);
    }

    /* renamed from: j */
    public static void m74071j(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 2, jArr2, 0);
        jArr2[4] = ((long) jx2.m59603d((int) jArr[2])) & 4294967295L;
    }

    /* renamed from: k */
    public static void m74072k(long[] jArr, long[] jArr2) {
        if (!h34.m58447v(jArr)) {
            long[] i = h34.m58434i();
            long[] i2 = h34.m58434i();
            m74077p(jArr, i);
            m74073l(i, jArr, i);
            m74079r(i, 2, i2);
            m74073l(i2, i, i2);
            m74079r(i2, 4, i);
            m74073l(i, i2, i);
            m74079r(i, 8, i2);
            m74073l(i2, i, i2);
            m74079r(i2, 16, i);
            m74073l(i, i2, i);
            m74079r(i, 32, i2);
            m74073l(i2, i, i2);
            m74077p(i2, i2);
            m74073l(i2, jArr, i2);
            m74079r(i2, 65, i);
            m74073l(i, i2, i);
            m74077p(i, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: l */
    public static void m74073l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m74069h(jArr, jArr2, jArr4);
        m74075n(jArr4, jArr3);
    }

    /* renamed from: m */
    public static void m74074m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        m74069h(jArr, jArr2, jArr4);
        m74063b(jArr3, jArr4, jArr3);
    }

    /* renamed from: n */
    public static void m74075n(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j10 >>> 56) ^ j8;
        jArr2[2] = 7 & j9;
    }

    /* renamed from: o */
    public static void m74076o(long[] jArr, long[] jArr2) {
        long[] i = h34.m58434i();
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        i[0] = (f >>> 32) | (f2 & -4294967296L);
        long f3 = jx2.m59605f(jArr[2]);
        long j = f3 & 4294967295L;
        i[1] = f3 >>> 32;
        m74073l(i, f46006a, jArr2);
        jArr2[0] = jArr2[0] ^ ((f & 4294967295L) | (f2 << 32));
        jArr2[1] = jArr2[1] ^ j;
    }

    /* renamed from: p */
    public static void m74077p(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(5);
        m74071j(jArr, k);
        m74075n(k, jArr2);
    }

    /* renamed from: q */
    public static void m74078q(long[] jArr, long[] jArr2) {
        long[] k = p34.m70887k(5);
        m74071j(jArr, k);
        m74063b(jArr2, k, jArr2);
    }

    /* renamed from: r */
    public static void m74079r(long[] jArr, int i, long[] jArr2) {
        long[] k = p34.m70887k(5);
        m74071j(jArr, k);
        while (true) {
            m74075n(k, jArr2);
            i--;
            if (i > 0) {
                m74071j(jArr2, k);
            } else {
                return;
            }
        }
    }

    /* renamed from: s */
    public static int m74080s(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
