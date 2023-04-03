package p000;

import java.math.BigInteger;

/* renamed from: xq5 */
public class xq5 {
    /* renamed from: a */
    public static void m74081a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: b */
    public static void m74082b(long[] jArr, long[] jArr2, long[] jArr3) {
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
    public static void m74083c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: d */
    public static void m74084d(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: e */
    public static long[] m74085e(BigInteger bigInteger) {
        return p34.m70894r(239, bigInteger);
    }

    /* renamed from: f */
    public static void m74086f(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        j34.m59223h(jArr, jArr2);
        for (int i = 1; i < 239; i += 2) {
            m74091k(jArr2, l);
            m74095o(l, jArr2);
            m74091k(jArr2, l);
            m74095o(l, jArr2);
            m74084d(jArr, jArr2);
        }
    }

    /* renamed from: g */
    public static void m74087g(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 60);
        jArr[1] = (j2 >>> 4) ^ (j3 << 56);
        jArr[2] = (j3 >>> 8) ^ (j4 << 52);
        jArr[3] = (j4 >>> 12) ^ (j5 << 48);
        jArr[4] = (j5 >>> 16) ^ (j6 << 44);
        jArr[5] = (j6 >>> 20) ^ (j7 << 40);
        jArr[6] = (j7 >>> 24) ^ (j8 << 36);
        jArr[7] = j8 >>> 28;
    }

    /* renamed from: h */
    public static void m74088h(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    /* renamed from: i */
    public static void m74089i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m74088h(jArr, jArr4);
        m74088h(jArr2, jArr5);
        long[] jArr6 = new long[8];
        long[] jArr7 = jArr6;
        long[] jArr8 = jArr3;
        m74090j(jArr7, jArr4[0], jArr5[0], jArr8, 0);
        m74090j(jArr7, jArr4[1], jArr5[1], jArr8, 1);
        m74090j(jArr7, jArr4[2], jArr5[2], jArr8, 2);
        m74090j(jArr7, jArr4[3], jArr5[3], jArr8, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m74090j(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m74090j(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m74090j(jArr6, j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr9 = new long[3];
        long[] jArr10 = jArr6;
        long[] jArr11 = jArr9;
        m74090j(jArr6, j, j3, jArr11, 0);
        m74090j(jArr10, j2, j4, jArr11, 1);
        long j5 = jArr9[0];
        long j6 = jArr9[1];
        long j7 = jArr9[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        m74087g(jArr3);
    }

    /* renamed from: j */
    public static void m74090j(long[] jArr, long j, long j2, long[] jArr2, int i) {
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
        jArr2[i] = jArr2[i] ^ (1152921504606846975L & j8);
        int i5 = i + 1;
        jArr2[i5] = ((((((j3 & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j9) << 4) ^ (j8 >>> 60)) ^ jArr2[i5];
    }

    /* renamed from: k */
    public static void m74091k(long[] jArr, long[] jArr2) {
        jx2.m59602c(jArr, 0, 4, jArr2, 0);
    }

    /* renamed from: l */
    public static void m74092l(long[] jArr, long[] jArr2) {
        if (!j34.m59238w(jArr)) {
            long[] j = j34.m59225j();
            long[] j2 = j34.m59225j();
            m74097q(jArr, j);
            m74093m(j, jArr, j);
            m74097q(j, j);
            m74093m(j, jArr, j);
            m74099s(j, 3, j2);
            m74093m(j2, j, j2);
            m74097q(j2, j2);
            m74093m(j2, jArr, j2);
            m74099s(j2, 7, j);
            m74093m(j, j2, j);
            m74099s(j, 14, j2);
            m74093m(j2, j, j2);
            m74097q(j2, j2);
            m74093m(j2, jArr, j2);
            m74099s(j2, 29, j);
            m74093m(j, j2, j);
            m74097q(j, j);
            m74093m(j, jArr, j);
            m74099s(j, 59, j2);
            m74093m(j2, j, j2);
            m74097q(j2, j2);
            m74093m(j2, jArr, j2);
            m74099s(j2, 119, j);
            m74093m(j, j2, j);
            m74097q(j, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: m */
    public static void m74093m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = j34.m59227l();
        m74089i(jArr, jArr2, l);
        m74095o(l, jArr3);
    }

    /* renamed from: n */
    public static void m74094n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] l = j34.m59227l();
        m74089i(jArr, jArr2, l);
        m74082b(jArr3, l, jArr3);
    }

    /* renamed from: o */
    public static void m74095o(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j15 = j14 >>> 47;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13;
        long j16 = j15 << 30;
        jArr2[2] = j16 ^ (((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47));
        jArr2[3] = 140737488355327L & j14;
    }

    /* renamed from: p */
    public static void m74096p(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr2;
        int i = 0;
        long f = jx2.m59605f(jArr[0]);
        long f2 = jx2.m59605f(jArr[1]);
        long j = (f & 4294967295L) | (f2 << 32);
        long j2 = (f >>> 32) | (f2 & -4294967296L);
        int i2 = 2;
        long f3 = jx2.m59605f(jArr[2]);
        long f4 = jx2.m59605f(jArr[3]);
        long j3 = (f3 & 4294967295L) | (f4 << 32);
        long j4 = (f4 & -4294967296L) | (f3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] l = j34.m59227l();
        int[] iArr = {39, 120};
        while (i < i2) {
            int i3 = iArr[i];
            int i4 = i3 >>> 6;
            int i5 = i3 & 63;
            l[i4] = l[i4] ^ (j2 << i5);
            int i6 = i4 + 1;
            int[] iArr2 = iArr;
            int i7 = -i5;
            l[i6] = l[i6] ^ ((j7 << i5) | (j2 >>> i7));
            int i8 = i4 + 2;
            l[i8] = l[i8] ^ ((j6 << i5) | (j7 >>> i7));
            int i9 = i4 + 3;
            l[i9] = l[i9] ^ ((j5 << i5) | (j6 >>> i7));
            int i10 = i4 + 4;
            l[i10] = l[i10] ^ (j5 >>> i7);
            i++;
            i2 = 2;
            iArr = iArr2;
        }
        m74095o(l, jArr3);
        jArr3[0] = jArr3[0] ^ j;
        jArr3[1] = jArr3[1] ^ j3;
    }

    /* renamed from: q */
    public static void m74097q(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        m74091k(jArr, l);
        m74095o(l, jArr2);
    }

    /* renamed from: r */
    public static void m74098r(long[] jArr, long[] jArr2) {
        long[] l = j34.m59227l();
        m74091k(jArr, l);
        m74082b(jArr2, l, jArr2);
    }

    /* renamed from: s */
    public static void m74099s(long[] jArr, int i, long[] jArr2) {
        long[] l = j34.m59227l();
        m74091k(jArr, l);
        while (true) {
            m74095o(l, jArr2);
            i--;
            if (i > 0) {
                m74091k(jArr2, l);
            } else {
                return;
            }
        }
    }

    /* renamed from: t */
    public static int m74100t(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
