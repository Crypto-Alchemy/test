package p000;

import java.math.BigInteger;

/* renamed from: h34 */
public abstract class h34 {
    /* renamed from: A */
    public static int m58417A(int i, int i2, int[] iArr, int i3) {
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
        return p34.m70900x(6, iArr, i3, 3);
    }

    /* renamed from: B */
    public static int m58418B(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = 0;
        while (i < 6) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j11 = j2;
            long j12 = (j10 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j12;
            int i3 = i + 1;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j13;
            int i4 = i + 2;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j14;
            int i5 = i + 3;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j15;
            int i6 = i + 4;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j16;
            int i7 = i + 5;
            long j17 = (j16 >>> 32) + (j10 * j9) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j17;
            int i8 = i + 6;
            long j18 = (j17 >>> 32) + (((long) iArr3[i8]) & 4294967295L) + j8;
            iArr3[i8] = (int) j18;
            j8 = j18 >>> 32;
            i = i3;
            j = 4294967295L;
            j7 = j9;
            j2 = j11;
            j3 = j3;
            j4 = j4;
        }
        return (int) j8;
    }

    /* renamed from: C */
    public static void m58419C(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 0;
        int i4 = 12;
        int i5 = 5;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & 4294967295L;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2 + 0] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & 4294967295L;
                int i8 = i2 + 2;
                long j6 = ((((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i9 = (int) j6;
                iArr2[i2 + 1] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                int i10 = i9 >>> 31;
                long j7 = (((long) iArr2[i8]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[i + 2]) & 4294967295L;
                int i11 = i2 + 3;
                long j9 = j5;
                int i12 = i2 + 4;
                long j10 = ((long) iArr2[i11]) & 4294967295L;
                long j11 = j7 + (j8 * j);
                int i13 = (int) j11;
                iArr2[i8] = (i13 << 1) | i10;
                int i14 = i13 >>> 31;
                long j12 = j10 + (j11 >>> 32) + (j8 * j9);
                long j13 = (((long) iArr2[i12]) & 4294967295L) + (j12 >>> 32);
                long j14 = j8;
                long j15 = ((long) iArr[i + 3]) & 4294967295L;
                int i15 = i2 + 5;
                long j16 = (((long) iArr2[i15]) & 4294967295L) + (j13 >>> 32);
                int i16 = i2 + 6;
                int i17 = i15;
                long j17 = (((long) iArr2[i16]) & 4294967295L) + (j16 >>> 32);
                long j18 = (j12 & 4294967295L) + (j15 * j);
                int i18 = (int) j18;
                iArr2[i11] = (i18 << 1) | i14;
                long j19 = (j13 & 4294967295L) + (j18 >>> 32) + (j15 * j9);
                long j20 = (j16 & 4294967295L) + (j19 >>> 32) + (j15 * j14);
                long j21 = j17 + (j20 >>> 32);
                long j22 = j20 & 4294967295L;
                long j23 = ((long) iArr[i + 4]) & 4294967295L;
                int i19 = i2 + 7;
                long j24 = j15;
                long j25 = (((long) iArr2[i19]) & 4294967295L) + (j21 >>> 32);
                int i20 = i2 + 8;
                int i21 = i19;
                long j26 = j21 & 4294967295L;
                long j27 = (((long) iArr2[i20]) & 4294967295L) + (j25 >>> 32);
                long j28 = (j19 & 4294967295L) + (j23 * j);
                int i22 = (int) j28;
                iArr2[i12] = (i18 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long j29 = j22 + (j28 >>> 32) + (j23 * j9);
                long j30 = j26 + (j29 >>> 32) + (j23 * j14);
                long j31 = (j25 & 4294967295L) + (j30 >>> 32) + (j23 * j24);
                long j32 = j27 + (j31 >>> 32);
                long j33 = j23;
                long j34 = ((long) iArr[i + 5]) & 4294967295L;
                int i24 = i2 + 9;
                long j35 = j31 & 4294967295L;
                long j36 = (((long) iArr2[i24]) & 4294967295L) + (j32 >>> 32);
                int i25 = i2 + 10;
                int i26 = i24;
                long j37 = (j29 & 4294967295L) + (j * j34);
                int i27 = (int) j37;
                iArr2[i17] = (i27 << 1) | i23;
                long j38 = (j30 & 4294967295L) + (j37 >>> 32) + (j34 * j9);
                long j39 = j35 + (j38 >>> 32) + (j34 * j14);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j34 * j24);
                long j41 = (j36 & 4294967295L) + (j40 >>> 32) + (j34 * j33);
                long j42 = (((long) iArr2[i25]) & 4294967295L) + (j36 >>> 32) + (j41 >>> 32);
                int i28 = (int) j38;
                iArr2[i16] = (i27 >>> 31) | (i28 << 1);
                int i29 = (int) j39;
                iArr2[i21] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j40;
                iArr2[i20] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j41;
                iArr2[i26] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j42;
                iArr2[i25] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = i2 + 11;
                iArr2[i37] = i36 | ((iArr2[i37] + ((int) (j42 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    /* renamed from: D */
    public static void m58420D(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
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
                long j26 = (j19 & 4294967295L) + (j23 * j);
                int i10 = (int) j26;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                long j27 = j24 + (j26 >>> 32) + (j23 * j6);
                long j28 = (j21 & 4294967295L) + (j27 >>> 32) + (j23 * j14);
                long j29 = (j25 & 4294967295L) + (j28 >>> 32) + (j23 * j22);
                long j30 = (((long) iArr2[8]) & 4294967295L) + (j25 >>> 32) + (j29 >>> 32);
                long j31 = j23;
                long j32 = ((long) iArr[5]) & 4294967295L;
                long j33 = (((long) iArr2[9]) & 4294967295L) + (j30 >>> 32);
                long j34 = (j27 & 4294967295L) + (j * j32);
                int i11 = (int) j34;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j6 * j32);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j32 * j14);
                long j37 = (j30 & 4294967295L) + (j36 >>> 32) + (j32 * j22);
                long j38 = (j33 & 4294967295L) + (j37 >>> 32) + (j32 * j31);
                long j39 = (((long) iArr2[10]) & 4294967295L) + (j33 >>> 32) + (j38 >>> 32);
                int i13 = (int) j35;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = (int) j36;
                iArr2[7] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j37;
                iArr2[8] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j38;
                iArr2[9] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j39;
                iArr2[10] = i19 | (i20 << 1);
                iArr2[11] = (i20 >>> 31) | ((iArr2[11] + ((int) (j39 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    /* renamed from: E */
    public static int m58421E(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L)) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    /* renamed from: F */
    public static int m58422F(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >> 32);
    }

    /* renamed from: G */
    public static int m58423G(int[] iArr, int[] iArr2) {
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
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5])));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    /* renamed from: H */
    public static BigInteger m58424H(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                ek4.m57383c(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: I */
    public static BigInteger m58425I(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                ek4.m57392l(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static int m58426a(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    /* renamed from: b */
    public static int m58427b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    /* renamed from: c */
    public static int m58428c(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i9]));
        iArr2[i9] = (int) j6;
        return (int) (j6 >>> 32);
    }

    /* renamed from: d */
    public static int m58429d(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        long j = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + 0;
        int i5 = (int) j;
        iArr[i3] = i5;
        iArr2[i4] = i5;
        int i6 = i + 1;
        int i7 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i6]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        int i8 = (int) j2;
        iArr[i6] = i8;
        iArr2[i7] = i8;
        int i9 = i + 2;
        int i10 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i9]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        int i11 = (int) j3;
        iArr[i9] = i11;
        iArr2[i10] = i11;
        int i12 = i + 3;
        int i13 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i12]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L);
        int i14 = (int) j4;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i + 4;
        int i16 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        int i17 = (int) j5;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i + 5;
        int i19 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (4294967295L & ((long) iArr2[i19]));
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        return (int) (j6 >>> 32);
    }

    /* renamed from: e */
    public static void m58430e(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2 + 0] = iArr[i + 0];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
    }

    /* renamed from: f */
    public static void m58431f(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2 + 0] = jArr[i + 0];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
    }

    /* renamed from: g */
    public static void m58432g(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* renamed from: h */
    public static int[] m58433h() {
        return new int[6];
    }

    /* renamed from: i */
    public static long[] m58434i() {
        return new long[3];
    }

    /* renamed from: j */
    public static int[] m58435j() {
        return new int[12];
    }

    /* renamed from: k */
    public static long[] m58436k() {
        return new long[6];
    }

    /* renamed from: l */
    public static boolean m58437l(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean q = m58442q(iArr, i, iArr2, i2);
        if (q) {
            m58421E(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            m58421E(iArr2, i2, iArr, i, iArr3, i3);
        }
        return q;
    }

    /* renamed from: m */
    public static boolean m58438m(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m58439n(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static int[] m58440o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] h = m58433h();
        for (int i = 0; i < 6; i++) {
            h[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return h;
    }

    /* renamed from: p */
    public static int m58441p(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: q */
    public static boolean m58442q(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m58443r(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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

    /* renamed from: s */
    public static boolean m58444s(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m58445t(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m58446u(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m58447v(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public static void m58448w(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr[i + 0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        long j9 = j;
        iArr3[i3 + 0] = (int) j8;
        long j10 = (j8 >>> 32) + (j7 * j2);
        long j11 = j2;
        iArr3[i3 + 1] = (int) j10;
        long j12 = (j10 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j15;
        iArr3[i3 + 6] = (int) (j15 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 6) {
            i5 += i4;
            long j16 = ((long) iArr[i + i6]) & 4294967295L;
            int i7 = i5 + 0;
            long j17 = (j16 * j9) + (((long) iArr3[i7]) & 4294967295L) + 0;
            iArr3[i7] = (int) j17;
            int i8 = i5 + 1;
            long j18 = j6;
            long j19 = (j17 >>> 32) + (j16 * j11) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j19;
            int i9 = i5 + 2;
            long j20 = (j19 >>> 32) + (j16 * j3) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j20;
            int i10 = i5 + 3;
            long j21 = (j20 >>> 32) + (j16 * j4) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j21;
            int i11 = i5 + 4;
            long j22 = (j21 >>> 32) + (j16 * j5) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j22;
            int i12 = i5 + 5;
            long j23 = (j22 >>> 32) + (j16 * j18) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j23;
            iArr3[i5 + 6] = (int) (j23 >>> 32);
            i6++;
            j3 = j3;
            j6 = j18;
            i4 = 1;
        }
    }

    /* renamed from: x */
    public static void m58449x(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j5);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j3);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j4);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        iArr3[6] = (int) (j13 >>> 32);
        int i = 1;
        for (int i2 = 6; i < i2; i2 = 6) {
            long j14 = ((long) iArr[i]) & 4294967295L;
            int i3 = i + 0;
            long j15 = (j14 * j) + (((long) iArr3[i3]) & 4294967295L) + 0;
            iArr3[i3] = (int) j15;
            int i4 = i + 1;
            long j16 = j2;
            long j17 = (j15 >>> 32) + (j14 * j2) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j17;
            int i5 = i + 2;
            long j18 = j6;
            long j19 = (j17 >>> 32) + (j14 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j19;
            int i6 = i + 3;
            long j20 = (j19 >>> 32) + (j14 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j20;
            int i7 = i + 4;
            long j21 = (j20 >>> 32) + (j14 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j21;
            int i8 = i + 5;
            long j22 = (j21 >>> 32) + (j14 * j18) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j22;
            iArr3[i + 6] = (int) (j22 >>> 32);
            i = i4;
            j = j;
            j2 = j16;
            j6 = j18;
        }
    }

    /* renamed from: y */
    public static long m58450y(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
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
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (4294967295L & ((long) iArr2[i3 + 5]));
        iArr3[i4 + 5] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    /* renamed from: z */
    public static int m58451z(int i, long j, int[] iArr, int i2) {
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
        return p34.m70900x(6, iArr2, i3, 4);
    }
}
