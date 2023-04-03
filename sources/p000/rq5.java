package p000;

import java.math.BigInteger;

/* renamed from: rq5 */
public class rq5 {
    /* renamed from: a */
    public static void m71639a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: b */
    public static void m71640b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    /* renamed from: c */
    public static void m71641c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: d */
    public static void m71642d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: e */
    public static long[] m71643e(BigInteger bigInteger) {
        return p34.m70894r(233, bigInteger);
    }

    /* renamed from: f */
    public static void m71644f(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        j34.m59223h(jArr, jArr2);
        for (int i = 1; i < 233; i += 2) {
            m71649k(jArr2, l);
            m71653o(l, jArr2);
            m71649k(jArr2, l);
            m71653o(l, jArr2);
            m71642d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m71645g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = j8 >>> 35;
    }

    /* renamed from: h */
    public static void m71646h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    /* renamed from: i */
    public static void m71647i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m71646h(jArr, jArr4);
        m71646h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        long[] jArr7 = jArr6;
        long[] jArr8 = jArr3;
        m71648j(jArr7, jArr4[0], jArr5[0], jArr8, 0);
        m71648j(jArr7, jArr4[1], jArr5[1], jArr8, 1);
        m71648j(jArr7, jArr4[2], jArr5[2], jArr8, 2);
        m71648j(jArr7, jArr4[3], jArr5[3], jArr8, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m71648j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m71648j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m71648j(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr9 = new long[3];
        long[] jArr10 = jArr6;
        long[] jArr11 = jArr9;
        m71648j(jArr6, j, j3, jArr11, 0);
        m71648j(jArr10, j2, j4, jArr11, 1);
        long j5 = jArr9[0];
        long j6 = jArr9[1];
        long j7 = jArr9[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        m71645g(jArr3);
    }

    /* renamed from: j */
    public static void m71648j(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
    public static void m71649k(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 4, jArr2, 0);
    }

    /* renamed from: l */
    public static void m71650l(long[] jArr, long[] jArr2) {
        if (!j34.m59238w(jArr)) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            m71655q(jArr, j);
            m71651m(j, jArr, j);
            m71655q(j, j);
            m71651m(j, jArr, j);
            m71657s(j, 3, j2);
            m71651m(j2, j, j2);
            m71655q(j2, j2);
            m71651m(j2, jArr, j2);
            m71657s(j2, 7, j);
            m71651m(j, j2, j);
            m71657s(j, 14, j2);
            m71651m(j2, j, j2);
            m71655q(j2, j2);
            m71651m(j2, jArr, j2);
            m71657s(j2, 29, j);
            m71651m(j, j2, j);
            m71657s(j, 58, j2);
            m71651m(j2, j, j2);
            m71657s(j2, 116, j);
            m71651m(j, j2, j);
            m71655q(j, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public static void m71651m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = j34.m59227l();
        m71647i(jArr, jArr2, l);
        m71653o(l, jArr3);
    }

    /* renamed from: n */
    public static void m71652n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = j34.m59227l();
        m71647i(jArr, jArr2, l);
        m71640b(jArr3, l, jArr3);
    }

    /* renamed from: o */
    public static void m71653o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j14 = j11 >>> 41;
        jArr2[0] = j12 ^ j14;
        long j15 = j14 << 10;
        jArr2[1] = j15 ^ ((j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33)));
        jArr2[2] = j13;
        jArr2[3] = 2199023255551L & j11;
    }

    /* renamed from: p */
    public static void m71654p(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr2;
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        long j2 = (f >>> 32) | (f2 & -4294967296L);
        long f3 = jx2.m59605f(jArr[2]);
        long f4 = jx2.m59605f(jArr[3]);
        long j3 = (4294967295L & f3) | (f4 << 32);
        long j4 = (f3 >>> 32) | (f4 & -4294967296L);
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] l = j34.m59227l();
        int[] iArr = {32, 117, 191};
        int i = 0;
        for (int i2 = 3; i < i2; i2 = 3) {
            int i3 = iArr[i];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            l[i4] = l[i4] ^ (j7 << i5);
            int i6 = i4 + 1;
            int i7 = -i5;
            l[i6] = l[i6] ^ ((j6 << i5) | (j7 >>> i7));
            int i8 = i4 + 2;
            l[i8] = l[i8] ^ ((j5 << i5) | (j6 >>> i7));
            int i9 = i4 + 3;
            l[i9] = l[i9] ^ (j5 >>> i7);
            i++;
        }
        m71653o(l, jArr3);
        jArr3[0] = jArr3[0] ^ j;
        jArr3[1] = jArr3[1] ^ j3;
    }

    /* renamed from: q */
    public static void m71655q(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        m71649k(jArr, l);
        m71653o(l, jArr2);
    }

    /* renamed from: r */
    public static void m71656r(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        m71649k(jArr, l);
        m71640b(jArr2, l, jArr2);
    }

    /* renamed from: s */
    public static void m71657s(long[] jArr, int i, long[] jArr2) {
        long[] l = j34.m59227l();
        m71649k(jArr, l);
        while (true) {
            m71653o(l, jArr2);
            i--;
            if (i > 0) {
                m71649k(jArr2, l);
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public static int m71658t(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
