package p000;

import java.lang.reflect.Array;

/* renamed from: oi2 */
public final class oi2 {
    /* renamed from: a */
    public static me2 m70286a(oe2 oe2, fs4 fs4) {
        oe2 oe22 = oe2;
        fs4 fs42 = fs4;
        int d = oe2.mo62888d();
        int i = 1 << d;
        int g = fs4.mo51784g();
        int[] iArr = new int[2];
        iArr[1] = i;
        int i2 = 0;
        iArr[0] = g;
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[] iArr3 = new int[2];
        iArr3[1] = i;
        iArr3[0] = g;
        int[][] iArr4 = (int[][]) Array.newInstance(cls, iArr3);
        for (int i3 = 0; i3 < i; i3++) {
            iArr4[0][i3] = oe22.mo62891f(fs42.mo51781e(i3));
        }
        for (int i4 = 1; i4 < g; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                iArr4[i4][i5] = oe22.mo62893h(iArr4[i4 - 1][i5], i5);
            }
        }
        int i6 = 0;
        while (i6 < g) {
            int i7 = i2;
            while (i7 < i) {
                for (int i8 = i2; i8 <= i6; i8++) {
                    int[] iArr5 = iArr2[i6];
                    iArr5[i7] = oe22.mo62885a(iArr5[i7], oe22.mo62893h(iArr4[i8][i7], fs42.mo51783f((g + i8) - i6)));
                }
                i7++;
                i2 = 0;
            }
            i6++;
            i2 = 0;
        }
        int[] iArr6 = new int[2];
        iArr6[1] = (i + 31) >>> 5;
        iArr6[0] = g * d;
        int[][] iArr7 = (int[][]) Array.newInstance(Integer.TYPE, iArr6);
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = i9 >>> 5;
            int i11 = 1 << (i9 & 31);
            for (int i12 = 0; i12 < g; i12++) {
                int i13 = iArr2[i12][i9];
                for (int i14 = 0; i14 < d; i14++) {
                    if (((i13 >>> i14) & 1) != 0) {
                        int[] iArr8 = iArr7[(((i12 + 1) * d) - i14) - 1];
                        iArr8[i10] = iArr8[i10] ^ i11;
                    }
                }
            }
        }
        return new me2(i, iArr7);
    }
}
