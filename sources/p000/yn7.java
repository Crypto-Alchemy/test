package p000;

/* renamed from: yn7 */
public abstract class yn7 {

    /* renamed from: a */
    public static final int[] f46228a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b */
    public static final int[] f46229b = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    /* renamed from: A */
    public static void m74498A(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    /* renamed from: B */
    public static void m74499B(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = ((long) (((i2 >> 24) + i) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + ((long) iArr[7]);
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + ((long) iArr[8]);
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    /* renamed from: C */
    public static void m74500C(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        long j = (long) i;
        long j2 = j * j;
        long j3 = (long) (i2 * 2);
        long j4 = j * j3;
        long j5 = (long) (i3 * 2);
        int i9 = iArr[8];
        int i10 = i2;
        int i11 = i8;
        long j6 = (long) i10;
        long j7 = (j * j5) + (j6 * j6);
        int i12 = iArr[9];
        int i13 = i7;
        long j8 = (long) (i4 * 2);
        long j9 = (j3 * j5) + (j * j8);
        int i14 = i10;
        int i15 = i5;
        long j10 = (long) (i5 * 2);
        long j11 = (((long) i3) * j5) + (j * j10) + (j6 * j8);
        long j12 = (j3 * j10) + (j8 * j5);
        long j13 = (long) i4;
        long j14 = (j5 * j10) + (j13 * j13);
        long j15 = ((long) i15) * j10;
        long j16 = j11;
        int i16 = i6;
        int i17 = i15;
        long j17 = (long) i16;
        long j18 = j17 * j17;
        int i18 = i16;
        long j19 = (long) (i13 * 2);
        long j20 = j17 * j19;
        long j21 = j15;
        long j22 = (long) (i11 * 2);
        long j23 = j13 * j10;
        long j24 = (long) i13;
        long j25 = (j17 * j22) + (j24 * j24);
        long j26 = (long) (i9 * 2);
        long j27 = (j19 * j22) + (j17 * j26);
        long j28 = j14;
        long j29 = (long) (i12 * 2);
        long j30 = (((long) i11) * j22) + (j17 * j29) + (j24 * j26);
        long j31 = (j19 * j29) + (j26 * j22);
        int i19 = i9;
        long j32 = (long) i19;
        int i20 = i12;
        long j33 = j2 - (j31 * 38);
        long j34 = j4 - (((j22 * j29) + (j32 * j32)) * 38);
        long j35 = j7 - ((j32 * j29) * 38);
        long j36 = j9 - ((((long) i20) * j29) * 38);
        long j37 = j12 - j18;
        long j38 = j21 - j27;
        int i21 = i + i18;
        int i22 = i14 + i13;
        int i23 = i3 + i11;
        int i24 = i4 + i19;
        int i25 = i17 + i20;
        long j39 = j23 - j25;
        long j40 = j28 - j20;
        long j41 = j37;
        long j42 = (long) i21;
        long j43 = j42 * j42;
        long j44 = j30;
        long j45 = (long) (i22 * 2);
        long j46 = j42 * j45;
        long j47 = (long) (i23 * 2);
        long j48 = (long) i22;
        long j49 = (j42 * j47) + (j48 * j48);
        long j50 = j38;
        long j51 = (long) (i24 * 2);
        int i26 = i24;
        long j52 = (long) (i25 * 2);
        long j53 = (j45 * j52) + (j51 * j47);
        long j54 = (long) i26;
        long j55 = (j47 * j52) + (j54 * j54);
        long j56 = j54 * j52;
        long j57 = ((long) i25) * j52;
        long j58 = j50 + (((j45 * j47) + (j42 * j51)) - j36);
        long j59 = (j58 >> 26) + (((((((long) i23) * j47) + (j42 * j52)) + (j48 * j51)) - j16) - j44);
        long j60 = j33 + ((((j59 >> 25) + j53) - j41) * 38);
        iArr2[0] = ((int) j60) & 67108863;
        long j61 = (j60 >> 26) + j34 + ((j55 - j40) * 38);
        iArr2[1] = ((int) j61) & 67108863;
        long j62 = (j61 >> 26) + j35 + ((j56 - j39) * 38);
        iArr2[2] = ((int) j62) & 33554431;
        long j63 = (j62 >> 25) + j36 + ((j57 - j50) * 38);
        iArr2[3] = ((int) j63) & 67108863;
        long j64 = (j63 >> 26) + j16 + (38 * j44);
        iArr2[4] = ((int) j64) & 33554431;
        long j65 = (j64 >> 25) + j41 + (j43 - j33);
        iArr2[5] = ((int) j65) & 67108863;
        long j66 = (j65 >> 26) + j40 + (j46 - j34);
        iArr2[6] = ((int) j66) & 67108863;
        long j67 = (j66 >> 26) + j39 + (j49 - j35);
        iArr2[7] = ((int) j67) & 33554431;
        long j68 = (j67 >> 25) + ((long) (((int) j58) & 67108863));
        iArr2[8] = ((int) j68) & 67108863;
        iArr2[9] = (((int) j59) & 33554431) + ((int) (j68 >> 26));
    }

    /* renamed from: D */
    public static void m74501D(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    /* renamed from: E */
    public static void m74502E(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    /* renamed from: a */
    public static void m74503a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    /* renamed from: b */
    public static void m74504b(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    /* renamed from: c */
    public static void m74505c(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    /* renamed from: d */
    public static void m74506d(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = i + ((i13 >> 25) * 38);
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
    }

    /* renamed from: e */
    public static void m74507e(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    /* renamed from: f */
    public static void m74508f(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    /* renamed from: g */
    public static void m74509g(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    /* renamed from: h */
    public static int[] m74510h() {
        return new int[10];
    }

    /* renamed from: i */
    public static int[] m74511i(int i) {
        return new int[(i * 10)];
    }

    /* renamed from: j */
    public static void m74512j(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    /* renamed from: k */
    public static void m74513k(byte[] bArr, int i, int[] iArr) {
        m74515m(bArr, i, iArr, 0);
        m74515m(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    /* renamed from: l */
    public static void m74514l(int[] iArr, int i, int[] iArr2) {
        m74516n(iArr, i, iArr2, 0);
        m74516n(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & 16777215;
    }

    /* renamed from: m */
    public static void m74515m(byte[] bArr, int i, int[] iArr, int i2) {
        int o = m74517o(bArr, i + 0);
        int o2 = m74517o(bArr, i + 4);
        int o3 = m74517o(bArr, i + 8);
        int o4 = m74517o(bArr, i + 12);
        iArr[i2 + 0] = o & 67108863;
        iArr[i2 + 1] = ((o >>> 26) | (o2 << 6)) & 67108863;
        iArr[i2 + 2] = ((o3 << 12) | (o2 >>> 20)) & 33554431;
        iArr[i2 + 3] = ((o4 << 19) | (o3 >>> 13)) & 67108863;
        iArr[i2 + 4] = o4 >>> 7;
    }

    /* renamed from: n */
    public static void m74516n(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2 + 0] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i5 << 12) | (i4 >>> 20)) & 33554431;
        iArr2[i2 + 3] = ((i6 << 19) | (i5 >>> 13)) & 67108863;
        iArr2[i2 + 4] = i6 >>> 7;
    }

    /* renamed from: o */
    public static int m74517o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: p */
    public static void m74518p(int[] iArr, byte[] bArr, int i) {
        m74520r(iArr, 0, bArr, i);
        m74520r(iArr, 5, bArr, i + 16);
    }

    /* renamed from: q */
    public static void m74519q(int[] iArr, int[] iArr2, int i) {
        m74521s(iArr, 0, iArr2, i);
        m74521s(iArr, 5, iArr2, i + 4);
    }

    /* renamed from: r */
    public static void m74520r(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        m74522t((i4 << 26) | i3, bArr, i2 + 0);
        m74522t((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        m74522t((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        m74522t((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    /* renamed from: s */
    public static void m74521s(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2 + 0] = i3 | (i4 << 26);
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    /* renamed from: t */
    public static void m74522t(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: u */
    public static void m74523u(int[] iArr, int[] iArr2) {
        int[] h = m74510h();
        int[] iArr3 = new int[8];
        m74509g(iArr, 0, h, 0);
        m74528z(h);
        m74519q(h, iArr3, 0);
        hw3.m58717k(f46228a, iArr3, iArr3);
        m74514l(iArr3, 0, iArr2);
    }

    /* renamed from: v */
    public static void m74524v(int[] iArr, int[] iArr2) {
        int[] h = m74510h();
        int[] iArr3 = new int[8];
        m74509g(iArr, 0, h, 0);
        m74528z(h);
        m74519q(h, iArr3, 0);
        hw3.m58718l(f46228a, iArr3, iArr3);
        m74514l(iArr3, 0, iArr2);
    }

    /* renamed from: w */
    public static int m74525w(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    /* renamed from: x */
    public static void m74526x(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        long j = (long) i;
        long j2 = ((long) i4) * j;
        long j3 = ((long) i6) * j;
        long j4 = ((long) i9) * j;
        long j5 = ((long) iArr[9]) * j;
        int i11 = ((int) j5) & 33554431;
        int i12 = ((int) j3) & 33554431;
        long j6 = ((j5 >> 25) * 38) + (((long) i2) * j);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = (j3 >> 25) + (((long) i7) * j);
        iArr2[5] = ((int) j7) & 67108863;
        long j8 = (j6 >> 26) + (((long) i3) * j);
        iArr2[1] = ((int) j8) & 67108863;
        long j9 = (j2 >> 25) + (((long) i5) * j);
        iArr2[3] = ((int) j9) & 67108863;
        long j10 = (j7 >> 26) + (((long) i8) * j);
        iArr2[6] = ((int) j10) & 67108863;
        long j11 = (j4 >> 25) + (((long) i10) * j);
        iArr2[8] = ((int) j11) & 67108863;
        iArr2[2] = (((int) j2) & 33554431) + ((int) (j8 >> 26));
        iArr2[4] = i12 + ((int) (j9 >> 26));
        iArr2[7] = (((int) j4) & 33554431) + ((int) (j10 >> 26));
        iArr2[9] = i11 + ((int) (j11 >> 26));
    }

    /* renamed from: y */
    public static void m74527y(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = i15;
        int i18 = iArr[8];
        int i19 = iArr2[8];
        int i20 = iArr[9];
        int i21 = i11;
        long j = (long) i;
        int i22 = iArr2[9];
        long j2 = (long) i2;
        long j3 = j * j2;
        int i23 = i2;
        int i24 = i16;
        long j4 = (long) i4;
        int i25 = i4;
        long j5 = (long) i3;
        long j6 = (j * j4) + (j5 * j2);
        int i26 = i10;
        int i27 = i13;
        long j7 = (long) i6;
        int i28 = i6;
        long j8 = (long) i5;
        long j9 = (j * j7) + (j5 * j4) + (j8 * j2);
        long j10 = j4;
        long j11 = (long) i8;
        long j12 = j * j11;
        long j13 = j11;
        long j14 = (long) i7;
        long j15 = (((j5 * j7) + (j8 * j4)) << 1) + j12 + (j14 * j2);
        int i29 = i8;
        long j16 = j7;
        long j17 = (long) i26;
        long j18 = (j * j17) + (j5 * j13) + (j14 * j10);
        long j19 = j14;
        int i30 = i9;
        long j20 = (long) i30;
        long j21 = ((j8 * j7) << 1) + j18 + (j2 * j20);
        long j22 = (((j8 * j17) + (j20 * j16)) << 1) + (j19 * j13);
        long j23 = (j19 * j17) + (j20 * j13);
        int i31 = i21;
        long j24 = (long) i31;
        int i32 = i7;
        int i33 = i12;
        long j25 = (long) i33;
        long j26 = j24 * j25;
        int i34 = i33;
        int i35 = i5;
        int i36 = i14;
        int i37 = i3;
        long j27 = (long) i36;
        int i38 = i36;
        int i39 = i31;
        long j28 = (long) i27;
        long j29 = (j24 * j27) + (j28 * j25);
        long j30 = j23;
        long j31 = (long) i24;
        long j32 = j22;
        long j33 = (long) i17;
        long j34 = (j24 * j31) + (j28 * j27) + (j33 * j25);
        long j35 = ((((j5 * j17) + (j8 * j13)) + (j19 * j16)) + (j20 * j10)) << 1;
        long j36 = (long) i19;
        long j37 = j27;
        int i40 = i39;
        long j38 = (long) i18;
        long j39 = (((j28 * j31) + (j33 * j27)) << 1) + (j24 * j36) + (j38 * j25);
        long j40 = j31;
        long j41 = (long) i22;
        long j42 = (j24 * j41) + (j28 * j36) + (j38 * j37);
        long j43 = j38;
        int i41 = i20;
        long j44 = (long) i41;
        long j45 = ((j33 * j31) << 1) + j42 + (j25 * j44);
        long j46 = (j28 * j41) + (j33 * j36) + (j43 * j40) + (j44 * j37);
        long j47 = j3 - (j46 * 76);
        long j48 = j6 - (((((j33 * j41) + (j44 * j40)) << 1) + (j43 * j36)) * 38);
        long j49 = j9 - (((j43 * j41) + (j36 * j44)) * 38);
        long j50 = j15 - ((j44 * j41) * 76);
        int i42 = i35 + i17;
        long j51 = j30 - j34;
        int i43 = i29 + i19;
        int i44 = i30 + i41;
        int i45 = i26 + i22;
        long j52 = (long) (i + i40);
        long j53 = j35 - j26;
        long j54 = (long) (i23 + i34);
        long j55 = j52 * j54;
        long j56 = ((j20 * j17) << 1) - j39;
        long j57 = (long) (i25 + i38);
        long j58 = (long) (i37 + i27);
        long j59 = (j52 * j57) + (j58 * j54);
        int i46 = i44;
        long j60 = (long) (i28 + i24);
        int i47 = i46;
        long j61 = (long) i42;
        long j62 = j57;
        long j63 = (long) i43;
        long j64 = j63;
        long j65 = (long) (i32 + i18);
        long j66 = (((j58 * j60) + (j61 * j57)) << 1) + (j52 * j63) + (j65 * j54);
        long j67 = j60;
        long j68 = (long) i45;
        long j69 = (long) i47;
        long j70 = (((j61 * j68) + (j69 * j67)) << 1) + (j65 * j64);
        long j71 = j56 + (j66 - j50);
        long j72 = (j71 >> 26) + (((((j61 * j60) << 1) + ((((j52 * j68) + (j58 * j64)) + (j65 * j62)) + (j54 * j69))) - j21) - j45);
        long j73 = j47 + ((((j72 >> 25) + (((((j58 * j68) + (j61 * j64)) + (j65 * j67)) + (j69 * j62)) << 1)) - j53) * 38);
        iArr3[0] = ((int) j73) & 67108863;
        long j74 = j32 - j29;
        long j75 = (j73 >> 26) + j48 + ((j70 - j74) * 38);
        iArr3[1] = ((int) j75) & 67108863;
        long j76 = (j75 >> 26) + j49 + ((((j65 * j68) + (j69 * j64)) - j51) * 38);
        iArr3[2] = ((int) j76) & 33554431;
        long j77 = (j76 >> 25) + j50 + ((((j69 * j68) << 1) - j56) * 38);
        iArr3[3] = ((int) j77) & 67108863;
        long j78 = (j77 >> 26) + j21 + (j45 * 38);
        iArr3[4] = ((int) j78) & 33554431;
        long j79 = (j78 >> 25) + j53 + (j55 - j47);
        iArr3[5] = ((int) j79) & 67108863;
        long j80 = (j79 >> 26) + j74 + (j59 - j48);
        iArr3[6] = ((int) j80) & 67108863;
        long j81 = (j80 >> 26) + j51 + ((((j52 * j60) + (j58 * j57)) + (j61 * j54)) - j49);
        iArr3[7] = ((int) j81) & 33554431;
        long j82 = (j81 >> 25) + ((long) (((int) j71) & 67108863));
        iArr3[8] = ((int) j82) & 67108863;
        iArr3[9] = (((int) j72) & 33554431) + ((int) (j82 >> 26));
    }

    /* renamed from: z */
    public static void m74528z(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        m74499B(iArr, i);
        m74499B(iArr, -i);
    }
}
