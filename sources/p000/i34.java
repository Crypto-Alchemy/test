package p000;

import java.math.BigInteger;

/* renamed from: i34 */
public abstract class i34 {
    /* renamed from: a */
    public static int m58825a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    /* renamed from: b */
    public static int m58826b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    /* renamed from: c */
    public static void m58827c(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2 + 0] = iArr[i + 0];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
    }

    /* renamed from: d */
    public static void m58828d(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    /* renamed from: e */
    public static int[] m58829e() {
        return new int[7];
    }

    /* renamed from: f */
    public static int[] m58830f() {
        return new int[14];
    }

    /* renamed from: g */
    public static boolean m58831g(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static int[] m58832h(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] e = m58829e();
        for (int i = 0; i < 7; i++) {
            e[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return e;
    }

    /* renamed from: i */
    public static int m58833i(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: j */
    public static boolean m58834j(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    /* renamed from: k */
    public static boolean m58835k(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m58836l(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static void m58837m(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = (j8 * j) + 0;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j5);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j3);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j4);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j17 = (j16 * j) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j17;
            int i4 = i + 1;
            long j18 = j2;
            long j19 = (j17 >>> 32) + (j16 * j2) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j19;
            int i5 = i + 2;
            long j20 = j6;
            long j21 = (j19 >>> 32) + (j16 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j21;
            int i6 = i + 3;
            long j22 = (j21 >>> 32) + (j16 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j22;
            int i7 = i + 4;
            long j23 = (j22 >>> 32) + (j16 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j23;
            int i8 = i + 5;
            long j24 = (j23 >>> 32) + (j16 * j20) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j24;
            int i9 = i + 6;
            long j25 = (j24 >>> 32) + (j16 * j7) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j25;
            iArr3[i + 7] = (int) (j25 >>> 32);
            i = i4;
            j = j;
            j2 = j18;
            j6 = j20;
        }
    }

    /* renamed from: n */
    public static long m58838n(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2 + 0]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr2[i3 + 0]) & 4294967295L) + 0;
        iArr3[i4 + 0] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j14;
        long j15 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (4294967295L & ((long) iArr2[i3 + 6]));
        iArr3[i4 + 6] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    /* renamed from: o */
    public static int m58839o(int i, long j, int[] iArr, int i2) {
        int[] iArr2 = iArr;
        int i3 = i2;
        long j2 = ((long) i) & 4294967295L;
        long j3 = j & 4294967295L;
        int i4 = i3 + 0;
        long j4 = (j2 * j3) + (((long) iArr2[i4]) & 4294967295L) + 0;
        iArr2[i4] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i5 = i3 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j7;
        int i6 = i3 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j8;
        int i7 = i3 + 3;
        long j9 = (j8 >>> 32) + (4294967295L & ((long) iArr2[i7]));
        iArr2[i7] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return p34.m70900x(7, iArr2, i3, 4);
    }

    /* renamed from: p */
    public static int m58840p(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i2) & 4294967295L;
        int i4 = i3 + 0;
        long j2 = ((((long) i) & 4294967295L) * j) + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + j + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j3;
        long j4 = j3 >>> 32;
        int i6 = i3 + 2;
        long j5 = j4 + (((long) iArr[i6]) & 4294967295L);
        iArr[i6] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return p34.m70900x(7, iArr, i3, 3);
    }

    /* renamed from: q */
    public static int m58841q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[1]) & 4294967295L;
        long j2 = ((long) iArr2[2]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[5]) & 4294967295L;
        long j6 = ((long) iArr2[0]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & 4294967295L;
            int i2 = i + 0;
            long j11 = j5;
            long j12 = (j10 * j6) + (((long) iArr3[i2]) & 4294967295L) + 0;
            iArr3[i2] = (int) j12;
            int i3 = i + 1;
            long j13 = j;
            long j14 = (j12 >>> 32) + (j10 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j14;
            int i4 = i + 2;
            long j15 = (j14 >>> 32) + (j10 * j2) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j15;
            int i5 = i + 3;
            long j16 = (j15 >>> 32) + (j10 * j3) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j16;
            int i6 = i + 4;
            long j17 = (j16 >>> 32) + (j10 * j4) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j17;
            int i7 = i + 5;
            long j18 = (j17 >>> 32) + (j10 * j11) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j18;
            int i8 = i + 6;
            long j19 = (j18 >>> 32) + (j10 * j9) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j19;
            int i9 = i + 7;
            long j20 = (j19 >>> 32) + (((long) iArr3[i9]) & 4294967295L) + j8;
            iArr3[i9] = (int) j20;
            j8 = j20 >>> 32;
            i = i3;
            j7 = j9;
            j5 = j11;
            j = j13;
        }
        return (int) j8;
    }

    /* renamed from: r */
    public static void m58842r(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i6 << 31)) & 4294967295L) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = j5 + (j6 * j);
                int i7 = (int) j7;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = (((long) iArr2[2]) & 4294967295L) + (j7 >>> 32);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = j8 + (j9 * j);
                int i8 = (int) j10;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j11 = (((long) iArr2[3]) & 4294967295L) + (j10 >>> 32) + (j9 * j6);
                long j12 = (((long) iArr2[4]) & 4294967295L) + (j11 >>> 32);
                long j13 = ((long) iArr[3]) & 4294967295L;
                long j14 = j9;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j12 >>> 32);
                long j16 = j12 & 4294967295L;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = (j11 & 4294967295L) + (j13 * j);
                int i9 = (int) j18;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long j19 = j16 + (j18 >>> 32) + (j13 * j6);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j13 * j14);
                long j21 = j17 + (j20 >>> 32);
                long j22 = j13;
                long j23 = ((long) iArr[4]) & 4294967295L;
                long j24 = j20 & 4294967295L;
                long j25 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j26 = j21 & 4294967295L;
                long j27 = (((long) iArr2[8]) & 4294967295L) + (j25 >>> 32);
                long j28 = (j19 & 4294967295L) + (j23 * j);
                int i10 = (int) j28;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                long j29 = j24 + (j28 >>> 32) + (j23 * j6);
                long j30 = j26 + (j29 >>> 32) + (j23 * j14);
                long j31 = (j25 & 4294967295L) + (j30 >>> 32) + (j23 * j22);
                long j32 = j27 + (j31 >>> 32);
                long j33 = j23;
                long j34 = ((long) iArr[5]) & 4294967295L;
                long j35 = (((long) iArr2[9]) & 4294967295L) + (j32 >>> 32);
                long j36 = j32 & 4294967295L;
                long j37 = (((long) iArr2[10]) & 4294967295L) + (j35 >>> 32);
                long j38 = (j29 & 4294967295L) + (j34 * j);
                int i11 = (int) j38;
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                long j39 = (j30 & 4294967295L) + (j38 >>> 32) + (j34 * j6);
                long j40 = (j31 & 4294967295L) + (j39 >>> 32) + (j34 * j14);
                long j41 = j36 + (j40 >>> 32) + (j34 * j22);
                long j42 = (j35 & 4294967295L) + (j41 >>> 32) + (j34 * j33);
                long j43 = j37 + (j42 >>> 32);
                long j44 = j34;
                long j45 = ((long) iArr[6]) & 4294967295L;
                long j46 = j42 & 4294967295L;
                long j47 = (((long) iArr2[11]) & 4294967295L) + (j43 >>> 32);
                long j48 = (j39 & 4294967295L) + (j * j45);
                int i12 = (int) j48;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long j49 = (j40 & 4294967295L) + (j48 >>> 32) + (j6 * j45);
                long j50 = (j41 & 4294967295L) + (j49 >>> 32) + (j45 * j14);
                long j51 = j46 + (j50 >>> 32) + (j45 * j22);
                long j52 = (j43 & 4294967295L) + (j51 >>> 32) + (j45 * j33);
                long j53 = (j47 & 4294967295L) + (j52 >>> 32) + (j45 * j44);
                long j54 = (((long) iArr2[12]) & 4294967295L) + (j47 >>> 32) + (j53 >>> 32);
                int i14 = (int) j49;
                iArr2[7] = i13 | (i14 << 1);
                int i15 = (int) j50;
                iArr2[8] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j51;
                iArr2[9] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) j52;
                iArr2[10] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j53;
                iArr2[11] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j54;
                iArr2[12] = i22 | (i23 << 1);
                iArr2[13] = (i23 >>> 31) | ((iArr2[13] + ((int) (j54 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    /* renamed from: s */
    public static int m58843s(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    /* renamed from: t */
    public static int m58844t(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6])));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    /* renamed from: u */
    public static BigInteger m58845u(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                ek4.m57383c(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
