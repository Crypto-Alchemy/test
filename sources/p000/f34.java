package p000;

import java.math.BigInteger;

/* renamed from: f34 */
public abstract class f34 {
    /* renamed from: a */
    public static int m57562a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    /* renamed from: b */
    public static int m57563b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    /* renamed from: c */
    public static void m57564c(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2 + 0] = iArr[i + 0];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
    }

    /* renamed from: d */
    public static void m57565d(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2 + 0] = jArr[i + 0];
        jArr2[i2 + 1] = jArr[i + 1];
    }

    /* renamed from: e */
    public static void m57566e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    /* renamed from: f */
    public static int[] m57567f() {
        return new int[4];
    }

    /* renamed from: g */
    public static long[] m57568g() {
        return new long[2];
    }

    /* renamed from: h */
    public static int[] m57569h() {
        return new int[8];
    }

    /* renamed from: i */
    public static long[] m57570i() {
        return new long[4];
    }

    /* renamed from: j */
    public static boolean m57571j(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m57572k(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static int[] m57573l(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] f = m57567f();
        for (int i = 0; i < 4; i++) {
            f[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return f;
    }

    /* renamed from: m */
    public static int m57574m(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: n */
    public static boolean m57575n(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m57576o(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m57577p(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m57578q(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m57579r(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public static void m57580s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr[0]) & 4294967295L;
        long j6 = (j5 * j) + 0;
        iArr3[0] = (int) j6;
        char c = ' ';
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            int i4 = i;
            long j11 = (j10 * j) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j11;
            int i5 = i4 + 1;
            long j12 = j;
            long j13 = (j11 >>> c) + (j10 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j13;
            int i6 = i4 + 2;
            int i7 = i5;
            long j14 = (j13 >>> 32) + (j10 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j14;
            c = ' ';
            int i8 = i4 + 3;
            long j15 = (j14 >>> 32) + (j10 * j4) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j15;
            iArr3[i4 + 4] = (int) (j15 >>> 32);
            i = i7;
            j = j12;
            j2 = j2;
        }
    }

    /* renamed from: t */
    public static int m57581t(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = 0;
        while (i < 4) {
            long j7 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j8 = (j7 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j8;
            int i3 = i + 1;
            long j9 = (j8 >>> 32) + (j7 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j9;
            int i4 = i + 2;
            int i5 = i3;
            long j10 = (j9 >>> 32) + (j7 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j10;
            int i6 = i + 3;
            long j11 = (j10 >>> 32) + (j7 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j11;
            int i7 = i + 4;
            long j12 = j6 + (j11 >>> 32) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j12;
            j6 = j12 >>> 32;
            i = i5;
            j = 4294967295L;
            j2 = j2;
            j3 = j3;
        }
        return (int) j6;
    }

    /* renamed from: u */
    public static void m57582u(int[] iArr, int[] iArr2) {
        long j = 4294967295L;
        long j2 = ((long) iArr[0]) & 4294967295L;
        char c = 3;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j3 = ((long) iArr[i3]) & j;
            long j4 = j3 * j3;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j4 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j4 >>> 1);
            int i6 = (int) j4;
            if (i4 <= 0) {
                long j5 = j2 * j2;
                long j6 = (((long) (i6 << 31)) & j) | (j5 >>> 33);
                iArr2[0] = (int) j5;
                long j7 = ((long) iArr[1]) & j;
                long j8 = j6 + (j7 * j2);
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | (((int) (j5 >>> 32)) & 1);
                long j9 = (((long) iArr2[2]) & j) + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & j;
                long j11 = ((long) iArr2[c]) & j;
                long j12 = ((long) iArr2[4]) & j;
                long j13 = j9 + (j10 * j2);
                int i8 = (int) j13;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j14 = j11 + (j13 >>> 32) + (j10 * j7);
                long j15 = j12 + (j14 >>> 32);
                long j16 = ((long) iArr[3]) & 4294967295L;
                long j17 = j10;
                long j18 = (((long) iArr2[5]) & 4294967295L) + (j15 >>> 32);
                long j19 = (j14 & 4294967295L) + (j2 * j16);
                int i9 = (int) j19;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j7 * j16);
                long j21 = (j18 & 4294967295L) + (j20 >>> 32) + (j16 * j17);
                long j22 = (((long) iArr2[6]) & 4294967295L) + (j18 >>> 32) + (j21 >>> 32);
                int i10 = (int) j20;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = (int) (4294967295L & j21);
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                int i13 = (int) j22;
                iArr2[6] = i12 | (i13 << 1);
                iArr2[7] = (i13 >>> 31) | ((iArr2[7] + ((int) (j22 >>> 32))) << 1);
                return;
            }
            long j23 = j;
            long j24 = j23;
            i3 = i4;
            i2 = i6;
            c = c;
            j = j23;
        }
    }

    /* renamed from: v */
    public static int m57583v(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    /* renamed from: w */
    public static int m57584w(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3])));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    /* renamed from: x */
    public static BigInteger m57585x(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                ek4.m57383c(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: y */
    public static BigInteger m57586y(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                ek4.m57392l(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
