package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: kh3 */
/* compiled from: LinearCurveFit */
public class kh3 extends ux0 {

    /* renamed from: a */
    public double[] f14077a;

    /* renamed from: b */
    public double[][] f14078b;

    /* renamed from: c */
    public double f14079c = Double.NaN;

    /* renamed from: d */
    public boolean f14080d = true;

    /* renamed from: e */
    public double[] f14081e;

    public kh3(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f14081e = new double[length2];
        this.f14077a = dArr;
        this.f14078b = dArr2;
        if (length2 > 2) {
            int i = 0;
            double d = 0.0d;
            while (true) {
                double d2 = d;
                if (i < dArr.length) {
                    double d3 = dArr2[i][0];
                    if (i > 0) {
                        Math.hypot(d3 - d, d3 - d2);
                    }
                    i++;
                    d = d3;
                } else {
                    this.f14079c = Utils.DOUBLE_EPSILON;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public double mo22300c(double d, int i) {
        double d2;
        double d3;
        double f;
        double[] dArr = this.f14077a;
        int length = dArr.length;
        int i2 = 0;
        if (this.f14080d) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f14078b[0][i];
                d3 = d - d4;
                f = mo22303f(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.f14078b[i3][i];
                    d3 = d - d5;
                    f = mo22303f(d5, i);
                }
            }
            return d2 + (d3 * f);
        } else if (d <= dArr[0]) {
            return this.f14078b[0][i];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.f14078b[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f14077a;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.f14078b[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.f14078b;
                return (dArr3[i2][i] * (1.0d - d8)) + (dArr3[i5][i] * d8);
            }
            i2 = i5;
        }
        return Utils.DOUBLE_EPSILON;
    }

    /* renamed from: d */
    public void mo22301d(double d, double[] dArr) {
        double[] dArr2 = this.f14077a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f14078b[0].length;
        if (this.f14080d) {
            double d2 = dArr2[0];
            if (d <= d2) {
                mo22304g(d2, this.f14081e);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f14078b[0][i2] + ((d - this.f14077a[0]) * this.f14081e[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                mo22304g(d3, this.f14081e);
                while (i < length2) {
                    dArr[i] = this.f14078b[i3][i] + ((d - this.f14077a[i3]) * this.f14081e[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f14078b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f14078b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f14077a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f14078b[i6][i7];
                }
            }
            double[] dArr3 = this.f14077a;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.f14078b;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: e */
    public void mo22302e(double d, float[] fArr) {
        double[] dArr = this.f14077a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f14078b[0].length;
        if (this.f14080d) {
            double d2 = dArr[0];
            if (d <= d2) {
                mo22304g(d2, this.f14081e);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f14078b[0][i2] + ((d - this.f14077a[0]) * this.f14081e[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                mo22304g(d3, this.f14081e);
                while (i < length2) {
                    fArr[i] = (float) (this.f14078b[i3][i] + ((d - this.f14077a[i3]) * this.f14081e[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f14078b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f14078b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f14077a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f14078b[i6][i7];
                }
            }
            double[] dArr2 = this.f14077a;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.f14078b;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r8 >= r3) goto L_0x000a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo22303f(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f14077a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x000c
        L_0x000a:
            r8 = r3
            goto L_0x0015
        L_0x000c:
            int r3 = r1 + -1
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            int r0 = r1 + -1
            if (r2 >= r0) goto L_0x0035
            double[] r0 = r7.f14077a
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0033
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f14078b
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L_0x0033:
            r2 = r3
            goto L_0x0015
        L_0x0035:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kh3.mo22303f(double, int):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r13 >= r4) goto L_0x000f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22304g(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f14077a
            int r1 = r0.length
            double[][] r2 = r12.f14078b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
        L_0x000f:
            r13 = r4
            goto L_0x001a
        L_0x0011:
            int r4 = r1 + -1
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r0 = r3
        L_0x001b:
            int r4 = r1 + -1
            if (r0 >= r4) goto L_0x0041
            double[] r4 = r12.f14077a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003f
            r13 = r4[r0]
            double r6 = r6 - r13
        L_0x002c:
            if (r3 >= r2) goto L_0x0041
            double[][] r13 = r12.f14078b
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L_0x002c
        L_0x003f:
            r0 = r5
            goto L_0x001b
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kh3.mo22304g(double, double[]):void");
    }

    /* renamed from: h */
    public double[] mo22305h() {
        return this.f14077a;
    }
}
