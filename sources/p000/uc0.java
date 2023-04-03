package p000;

/* renamed from: uc0 */
public class uc0 extends uk5 {
    /* renamed from: n */
    public static void m72694n(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i2 = 16;
        if (iArr3.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr4.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            char c = 0;
            int i3 = iArr3[0];
            int i4 = iArr3[1];
            int i5 = iArr3[2];
            int i6 = iArr3[3];
            int i7 = iArr3[4];
            int i8 = iArr3[5];
            int i9 = iArr3[6];
            int i10 = 7;
            int i11 = iArr3[7];
            int i12 = 8;
            int i13 = iArr3[8];
            int i14 = iArr3[9];
            int i15 = iArr3[10];
            int i16 = iArr3[11];
            int i17 = 12;
            int i18 = iArr3[12];
            int i19 = iArr3[13];
            int i20 = iArr3[14];
            int i21 = iArr3[15];
            int i22 = i20;
            int i23 = i19;
            int i24 = i18;
            int i25 = i16;
            int i26 = i15;
            int i27 = i14;
            int i28 = i13;
            int i29 = i11;
            int i30 = i9;
            int i31 = i8;
            int i32 = i7;
            int i33 = i6;
            int i34 = i5;
            int i35 = i4;
            int i36 = i3;
            int i37 = i;
            while (i37 > 0) {
                int i38 = i36 + i32;
                int c2 = gx2.m58283c(i24 ^ i38, i2);
                int i39 = i28 + c2;
                int c3 = gx2.m58283c(i32 ^ i39, i17);
                int i40 = i38 + c3;
                int c4 = gx2.m58283c(c2 ^ i40, i12);
                int i41 = i39 + c4;
                int c5 = gx2.m58283c(c3 ^ i41, i10);
                int i42 = i35 + i31;
                int c6 = gx2.m58283c(i23 ^ i42, i2);
                int i43 = i27 + c6;
                int c7 = gx2.m58283c(i31 ^ i43, i17);
                int i44 = i42 + c7;
                int c8 = gx2.m58283c(c6 ^ i44, i12);
                int i45 = i43 + c8;
                int c9 = gx2.m58283c(c7 ^ i45, i10);
                int i46 = i34 + i30;
                int c10 = gx2.m58283c(i22 ^ i46, i2);
                int i47 = i26 + c10;
                int c11 = gx2.m58283c(i30 ^ i47, i17);
                int i48 = i46 + c11;
                int c12 = gx2.m58283c(c10 ^ i48, i12);
                int i49 = i47 + c12;
                int c13 = gx2.m58283c(c11 ^ i49, i10);
                int i50 = i33 + i29;
                int c14 = gx2.m58283c(i21 ^ i50, 16);
                int i51 = i25 + c14;
                int c15 = gx2.m58283c(i29 ^ i51, i17);
                int i52 = i50 + c15;
                int c16 = gx2.m58283c(c14 ^ i52, 8);
                int i53 = i51 + c16;
                int c17 = gx2.m58283c(c15 ^ i53, 7);
                int i54 = i40 + c9;
                int c18 = gx2.m58283c(c16 ^ i54, 16);
                int i55 = i49 + c18;
                int c19 = gx2.m58283c(c9 ^ i55, 12);
                i36 = i54 + c19;
                i21 = gx2.m58283c(c18 ^ i36, 8);
                i26 = i55 + i21;
                i31 = gx2.m58283c(c19 ^ i26, 7);
                int i56 = i44 + c13;
                int c20 = gx2.m58283c(c4 ^ i56, 16);
                int i57 = i53 + c20;
                int c21 = gx2.m58283c(c13 ^ i57, 12);
                i35 = i56 + c21;
                i24 = gx2.m58283c(c20 ^ i35, 8);
                i25 = i57 + i24;
                i30 = gx2.m58283c(c21 ^ i25, 7);
                int i58 = i48 + c17;
                int c22 = gx2.m58283c(c8 ^ i58, 16);
                int i59 = i41 + c22;
                int c23 = gx2.m58283c(c17 ^ i59, 12);
                i34 = i58 + c23;
                i23 = gx2.m58283c(c22 ^ i34, 8);
                i28 = i59 + i23;
                i29 = gx2.m58283c(c23 ^ i28, 7);
                int i60 = i52 + c5;
                i2 = 16;
                int c24 = gx2.m58283c(c12 ^ i60, 16);
                int i61 = i45 + c24;
                int c25 = gx2.m58283c(c5 ^ i61, 12);
                i33 = i60 + c25;
                i22 = gx2.m58283c(c24 ^ i33, 8);
                i27 = i61 + i22;
                i32 = gx2.m58283c(c25 ^ i27, 7);
                i37 -= 2;
                c = 0;
                i17 = 12;
                i12 = 8;
                i10 = 7;
            }
            iArr4[c] = i36 + iArr3[c];
            iArr4[1] = i35 + iArr3[1];
            iArr4[2] = i34 + iArr3[2];
            iArr4[3] = i33 + iArr3[3];
            iArr4[4] = i32 + iArr3[4];
            iArr4[5] = i31 + iArr3[5];
            iArr4[6] = i30 + iArr3[6];
            iArr4[7] = i29 + iArr3[7];
            iArr4[8] = i28 + iArr3[8];
            iArr4[9] = i27 + iArr3[9];
            iArr4[10] = i26 + iArr3[10];
            iArr4[11] = i25 + iArr3[11];
            iArr4[12] = i24 + iArr3[12];
            iArr4[13] = i23 + iArr3[13];
            iArr4[14] = i22 + iArr3[14];
            iArr4[15] = i21 + iArr3[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }
}
