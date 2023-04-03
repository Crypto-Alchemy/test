package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: ux0 */
/* compiled from: CurveFit */
public abstract class ux0 {

    /* renamed from: ux0$a */
    /* compiled from: CurveFit */
    public static class C3437a extends ux0 {

        /* renamed from: a */
        public double f18592a;

        /* renamed from: b */
        public double[] f18593b;

        public C3437a(double d, double[] dArr) {
            this.f18592a = d;
            this.f18593b = dArr;
        }

        /* renamed from: c */
        public double mo22300c(double d, int i) {
            return this.f18593b[i];
        }

        /* renamed from: d */
        public void mo22301d(double d, double[] dArr) {
            double[] dArr2 = this.f18593b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: e */
        public void mo22302e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f18593b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public double mo22303f(double d, int i) {
            return Utils.DOUBLE_EPSILON;
        }

        /* renamed from: g */
        public void mo22304g(double d, double[] dArr) {
            for (int i = 0; i < this.f18593b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: h */
        public double[] mo22305h() {
            return new double[]{this.f18592a};
        }
    }

    /* renamed from: a */
    public static ux0 m28444a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new wx3(dArr, dArr2);
        }
        if (i != 2) {
            return new kh3(dArr, dArr2);
        }
        return new C3437a(dArr[0], dArr2[0]);
    }

    /* renamed from: b */
    public static ux0 m28445b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C3558wp(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo22300c(double d, int i);

    /* renamed from: d */
    public abstract void mo22301d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo22302e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo22303f(double d, int i);

    /* renamed from: g */
    public abstract void mo22304g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo22305h();
}
