package p000;

import java.lang.reflect.Array;

/* renamed from: me2 */
public class me2 extends gp3 {

    /* renamed from: c */
    public int[][] f40902c;

    /* renamed from: d */
    public int f40903d;

    public me2(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length == ((i + 31) >> 5)) {
            this.f38054b = i;
            this.f38053a = iArr.length;
            this.f40903d = iArr2.length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.f38053a; i4++) {
                int[] iArr3 = iArr[i4];
                int i5 = this.f40903d - 1;
                iArr3[i5] = iArr3[i5] & i3;
            }
            this.f40902c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public me2(me2 me2) {
        this.f38054b = me2.mo51967a();
        this.f38053a = me2.mo51968b();
        this.f40903d = me2.f40903d;
        this.f40902c = new int[me2.f40902c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f40902c;
            if (i < iArr.length) {
                iArr[i] = zw2.m75241a(me2.f40902c[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public me2(byte[] bArr) {
        if (bArr.length >= 9) {
            this.f38053a = oi3.m70291e(bArr, 0);
            int e = oi3.m70291e(bArr, 4);
            this.f38054b = e;
            int i = this.f38053a;
            int i2 = ((e + 7) >>> 3) * i;
            if (i > 0) {
                int i3 = 8;
                if (i2 == bArr.length - 8) {
                    int i4 = (e + 31) >>> 5;
                    this.f40903d = i4;
                    int[] iArr = new int[2];
                    iArr[1] = i4;
                    iArr[0] = i;
                    this.f40902c = (int[][]) Array.newInstance(Integer.TYPE, iArr);
                    int i5 = this.f38054b;
                    int i6 = i5 >> 5;
                    int i7 = i5 & 31;
                    for (int i8 = 0; i8 < this.f38053a; i8++) {
                        int i9 = 0;
                        while (i9 < i6) {
                            this.f40902c[i8][i9] = oi3.m70291e(bArr, i3);
                            i9++;
                            i3 += 4;
                        }
                        int i10 = 0;
                        while (i10 < i7) {
                            int[] iArr2 = this.f40902c[i8];
                            iArr2[i6] = ((bArr[i3] & 255) << i10) ^ iArr2[i6];
                            i10 += 8;
                            i3++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    /* renamed from: c */
    public byte[] mo56242c() {
        int i = this.f38053a;
        int i2 = 8;
        byte[] bArr = new byte[((((this.f38054b + 7) >>> 3) * i) + 8)];
        oi3.m70287a(i, bArr, 0);
        oi3.m70287a(this.f38054b, bArr, 4);
        int i3 = this.f38054b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < this.f38053a; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                oi3.m70287a(this.f40902c[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.f40902c[i6][i4] >>> i8) & 255);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof me2)) {
            return false;
        }
        me2 me2 = (me2) obj;
        if (this.f38053a != me2.f38053a || this.f38054b != me2.f38054b || this.f40903d != me2.f40903d) {
            return false;
        }
        for (int i = 0; i < this.f38053a; i++) {
            if (!zw2.m75242b(this.f40902c[i], me2.f40902c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.f38053a * 31) + this.f38054b) * 31) + this.f40903d;
        for (int i2 = 0; i2 < this.f38053a; i2++) {
            i = (i * 31) + C9367tq.m72440x(this.f40902c[i2]);
        }
        return i;
    }

    public String toString() {
        int i = this.f38054b & 31;
        int i2 = this.f40903d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.f38053a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.f40902c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.f40902c[i3][this.f40903d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }
}
