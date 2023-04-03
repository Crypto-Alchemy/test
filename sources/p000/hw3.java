package p000;

import java.util.Random;

/* renamed from: hw3 */
public abstract class hw3 {
    /* renamed from: a */
    public static int m58707a(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + iArr[i4] + iArr2[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 + iArr[i2] + iArr2[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    /* renamed from: b */
    public static void m58708b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (m58717k(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    /* renamed from: c */
    public static void m58709c(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 + ((iArr[i5] ^ i2) - i2);
            iArr[i5] = 1073741823 & i6;
            i4 = i6 >> 30;
        }
        iArr[i3] = i4 + ((iArr[i3] ^ i2) - i2);
    }

    /* renamed from: d */
    public static void m58710d(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i - 1;
        int i4 = iArr[i3] >> 31;
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i5 + (((iArr[i6] + (iArr2[i6] & i4)) ^ i2) - i2);
            iArr[i6] = 1073741823 & i7;
            i5 = i7 >> 30;
        }
        int i8 = i5 + (((iArr[i3] + (i4 & iArr2[i3])) ^ i2) - i2);
        iArr[i3] = i8;
        int i9 = i8 >> 31;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            int i12 = i10 + iArr[i11] + (iArr2[i11] & i9);
            iArr[i11] = i12 & 1073741823;
            i10 = i12 >> 30;
        }
        iArr[i3] = i10 + iArr[i3] + (i9 & iArr2[i3]);
    }

    /* renamed from: e */
    public static void m58711e(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            while (i4 < Math.min(32, i)) {
                j |= ((long) iArr[i2]) << i4;
                i4 += 30;
                i2++;
            }
            iArr2[i3] = (int) j;
            j >>>= 32;
            i4 -= 32;
            i -= 32;
            i3++;
        }
    }

    /* renamed from: f */
    public static int m58712f(int i, int i2, int i3, int[] iArr) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        for (int i8 = 0; i8 < 30; i8++) {
            int i9 = i >> 31;
            int i10 = -(i3 & 1);
            int i11 = i3 + (((i2 ^ i9) - i9) & i10);
            i5 += ((i6 ^ i9) - i9) & i10;
            i7 += ((i4 ^ i9) - i9) & i10;
            int i12 = i9 & i10;
            i = (i ^ i12) - (i12 + 1);
            i2 += i11 & i12;
            i3 = i11 >> 1;
            i6 = (i6 + (i5 & i12)) << 1;
            i4 = (i4 + (i12 & i7)) << 1;
        }
        iArr[0] = i6;
        iArr[1] = i4;
        iArr[2] = i5;
        iArr[3] = i7;
        return i;
    }

    /* renamed from: g */
    public static int m58713g(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        int i10 = 1;
        int i11 = 30;
        int i12 = i;
        while (true) {
            int b = gx2.m58282b((-1 << i11) | i6);
            int i13 = i6 >> b;
            i9 <<= b;
            i7 <<= b;
            i12 -= b;
            i11 -= b;
            if (i11 <= 0) {
                iArr[0] = i9;
                iArr[1] = i7;
                iArr[2] = i8;
                iArr[3] = i10;
                return i12;
            }
            if (i12 < 0) {
                i12 = -i12;
                int i14 = -i5;
                int i15 = -i9;
                int i16 = -i7;
                int i17 = i12 + 1;
                if (i17 > i11) {
                    i17 = i11;
                }
                i4 = (-1 >>> (32 - i17)) & 63 & (i13 * i14 * ((i13 * i13) - 2));
                int i18 = i13;
                i13 = i14;
                i5 = i18;
                int i19 = i8;
                i8 = i15;
                i9 = i19;
                int i20 = i10;
                i10 = i16;
                i7 = i20;
            } else {
                int i21 = i12 + 1;
                if (i21 > i11) {
                    i21 = i11;
                }
                i4 = (-1 >>> (32 - i21)) & 15 & ((-((((i5 + 1) & 4) << 1) + i5)) * i13);
            }
            i6 = i13 + (i5 * i4);
            i8 += i9 * i4;
            i10 += i4 * i7;
        }
    }

    /* renamed from: h */
    public static void m58714h(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4 = 0;
        long j = 0;
        while (i > 0) {
            if (i4 < Math.min(30, i)) {
                j |= (((long) iArr[i2]) & 4294967295L) << i4;
                i4 += 32;
                i2++;
            }
            iArr2[i3] = ((int) j) & 1073741823;
            j >>>= 30;
            i4 -= 30;
            i -= 30;
            i3++;
        }
    }

    /* renamed from: i */
    public static int m58715i(int i) {
        return ((i * 49) + (i < 46 ? 80 : 47)) / 17;
    }

    /* renamed from: j */
    public static int m58716j(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    /* renamed from: k */
    public static int m58717k(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        int length = iArr4.length;
        int a = (length << 5) - gx2.m58281a(iArr4[length - 1]);
        int i = (a + 29) / 30;
        int[] iArr5 = new int[4];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        int[] iArr10 = new int[i];
        int i2 = 0;
        iArr7[0] = 1;
        m58714h(a, iArr2, 0, iArr9, 0);
        m58714h(a, iArr4, 0, iArr10, 0);
        System.arraycopy(iArr10, 0, iArr8, 0, i);
        int j = m58716j(iArr10[0]);
        int i3 = -1;
        int i4 = 0;
        for (int i5 = m58715i(a); i4 < i5; i5 = i5) {
            int f = m58712f(i3, iArr8[i2], iArr9[i2], iArr5);
            m58721o(i, iArr6, iArr7, iArr5, j, iArr10);
            m58722p(i, iArr8, iArr9, iArr5);
            i4 += 30;
            i2 = i2;
            i3 = f;
        }
        int i6 = i2;
        int i7 = iArr8[i - 1] >> 31;
        m58709c(i, i7, iArr8);
        m58710d(i, i7, iArr6, iArr10);
        m58711e(a, iArr6, i6, iArr3, i6);
        return p34.m70891o(i, iArr8, 1) & p34.m70892p(i, iArr9);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* renamed from: l */
    public static boolean m58718l(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        int length = iArr4.length;
        int a = (length << 5) - gx2.m58281a(iArr4[length - 1]);
        int i = (a + 29) / 30;
        int[] iArr5 = new int[4];
        int[] iArr6 = new int[i];
        int[] iArr7 = new int[i];
        int[] iArr8 = new int[i];
        int[] iArr9 = new int[i];
        int[] iArr10 = new int[i];
        ? r9 = 0;
        iArr7[0] = 1;
        m58714h(a, iArr2, 0, iArr9, 0);
        m58714h(a, iArr4, 0, iArr10, 0);
        System.arraycopy(iArr10, 0, iArr8, 0, i);
        int i2 = i - 1;
        int a2 = -1 - (gx2.m58281a(iArr9[i2] | 1) - (((i * 30) + 2) - a));
        int j = m58716j(iArr10[0]);
        int i3 = m58715i(a);
        int i4 = i;
        int i5 = 0;
        while (!p34.m70902z(i4, iArr9)) {
            if (i5 >= i3) {
                return r9;
            }
            int i6 = i5 + 30;
            int g = m58713g(a2, iArr8[r9], iArr9[r9], iArr5);
            int i7 = i4;
            int i8 = i3;
            int[] iArr11 = iArr7;
            boolean z = r9;
            m58721o(i, iArr6, iArr7, iArr5, j, iArr10);
            m58722p(i7, iArr8, iArr9, iArr5);
            int i9 = i7 - 1;
            int i10 = iArr8[i9];
            int i11 = iArr9[i9];
            int i12 = i7 - 2;
            if (((i12 >> 31) | ((i10 >> 31) ^ i10) | ((i11 >> 31) ^ i11)) == 0) {
                iArr8[i12] = (i10 << 30) | iArr8[i12];
                iArr9[i12] = iArr9[i12] | (i11 << 30);
                i4 = i7 - 1;
            } else {
                i4 = i7;
            }
            r9 = z;
            i5 = i6;
            a2 = g;
            i3 = i8;
            iArr7 = iArr11;
        }
        int i13 = i4;
        boolean z2 = r9;
        int i14 = iArr8[i13 - 1] >> 31;
        int i15 = iArr6[i2] >> 31;
        if (i15 < 0) {
            i15 = m58707a(i, iArr6, iArr10);
        }
        if (i14 < 0) {
            i15 = m58719m(i, iArr6);
            m58719m(i13, iArr8);
        }
        if (!p34.m70901y(i13, iArr8)) {
            return z2;
        }
        if (i15 < 0) {
            m58707a(i, iArr6, iArr10);
        }
        m58711e(a, iArr6, z2 ? 1 : 0, iArr3, z2);
        return true;
    }

    /* renamed from: m */
    public static int m58719m(int i, int[] iArr) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    /* renamed from: n */
    public static int[] m58720n(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] j = p34.m70886j(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                j[i8] = random.nextInt();
            }
            j[i] = j[i] & i7;
        } while (p34.m70896t(length, j, iArr));
        return j;
    }

    /* renamed from: o */
    public static void m58721o(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = (long) i4;
        long j2 = (long) iArr[0];
        long j3 = (long) i5;
        long j4 = (long) iArr2[0];
        long j5 = j3;
        long j6 = (j * j2) + (j3 * j4);
        long j7 = j;
        long j8 = (long) i6;
        long j9 = (long) i7;
        long j10 = (j2 * j8) + (j4 * j9);
        long j11 = (long) i13;
        long j12 = (long) (i11 - (((((int) j6) * i2) + i11) & 1073741823));
        int i14 = i8;
        long j13 = (long) (i12 - (((((int) j10) * i2) + i12) & 1073741823));
        long j14 = (j10 + (j11 * j13)) >> 30;
        long j15 = (j6 + (j11 * j12)) >> 30;
        int i15 = 1;
        while (i15 < i3) {
            int i16 = iArr4[i15];
            long j16 = j14;
            long j17 = (long) iArr[i15];
            int i17 = i15;
            long j18 = (long) iArr2[i15];
            long j19 = j13;
            long j20 = (long) i16;
            long j21 = j15 + (j7 * j17) + (j5 * j18) + (j20 * j12);
            long j22 = j16 + (j17 * j8) + (j18 * j9) + (j20 * j19);
            int i18 = i17 - 1;
            iArr[i18] = ((int) j21) & 1073741823;
            j15 = j21 >> 30;
            iArr2[i18] = ((int) j22) & 1073741823;
            j14 = j22 >> 30;
            i15 = i17 + 1;
            i3 = i;
            i14 = i14;
            j13 = j19;
        }
        int i19 = i14;
        long j23 = j14;
        iArr[i19] = (int) j15;
        iArr2[i19] = (int) j14;
    }

    /* renamed from: p */
    public static void m58722p(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = i;
        int i3 = iArr3[0];
        int i4 = 1;
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        long j = (long) i3;
        long j2 = (long) iArr[0];
        long j3 = (long) i5;
        long j4 = (long) iArr2[0];
        long j5 = (long) i6;
        long j6 = (long) i7;
        long j7 = ((j * j2) + (j3 * j4)) >> 30;
        long j8 = ((j2 * j5) + (j4 * j6)) >> 30;
        int i8 = 1;
        while (i8 < i2) {
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            int i11 = i8;
            long j9 = (long) i9;
            long j10 = j * j9;
            long j11 = j;
            long j12 = (long) i10;
            long j13 = j7 + j10 + (j3 * j12);
            long j14 = j8 + (j9 * j5) + (j12 * j6);
            int i12 = i11 - 1;
            iArr[i12] = ((int) j13) & 1073741823;
            j7 = j13 >> 30;
            iArr2[i12] = 1073741823 & ((int) j14);
            j8 = j14 >> 30;
            i8 = i11 + 1;
            j = j11;
            i4 = 1;
        }
        int i13 = i2 - i4;
        iArr[i13] = (int) j7;
        iArr2[i13] = (int) j8;
    }
}
