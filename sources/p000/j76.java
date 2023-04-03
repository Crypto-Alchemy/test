package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: j76 */
/* compiled from: SpringStopEngine */
public class j76 implements w96 {

    /* renamed from: a */
    public double f13555a = 0.5d;

    /* renamed from: b */
    public boolean f13556b = false;

    /* renamed from: c */
    public double f13557c;

    /* renamed from: d */
    public double f13558d;

    /* renamed from: e */
    public double f13559e;

    /* renamed from: f */
    public float f13560f;

    /* renamed from: g */
    public float f13561g;

    /* renamed from: h */
    public float f13562h;

    /* renamed from: i */
    public float f13563i;

    /* renamed from: j */
    public float f13564j;

    /* renamed from: k */
    public int f13565k = 0;

    /* renamed from: a */
    public float mo21788a() {
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: b */
    public boolean mo21789b() {
        double d = ((double) this.f13561g) - this.f13558d;
        double d2 = this.f13557c;
        double d3 = (double) this.f13562h;
        if (Math.sqrt((((d3 * d3) * ((double) this.f13563i)) + ((d2 * d) * d)) / d2) <= ((double) this.f13564j)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo21790c(double d) {
        double d2 = this.f13557c;
        double d3 = this.f13555a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f13563i)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) sqrt);
        int i = 0;
        while (i < sqrt) {
            float f = this.f13561g;
            double d5 = this.f13558d;
            float f2 = this.f13562h;
            double d6 = d2;
            float f3 = this.f13563i;
            double d7 = d3;
            double d8 = ((double) f2) + ((((((-d2) * (((double) f) - d5)) - (((double) f2) * d3)) / ((double) f3)) * d4) / 2.0d);
            double d9 = ((((-((((double) f) + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / ((double) f3)) * d4;
            float f4 = (float) (((double) f2) + d9);
            this.f13562h = f4;
            float f5 = (float) (((double) f) + ((((double) f2) + (d9 / 2.0d)) * d4));
            this.f13561g = f5;
            int i2 = this.f13565k;
            if (i2 > 0) {
                if (f5 < Utils.FLOAT_EPSILON && (i2 & 1) == 1) {
                    this.f13561g = -f5;
                    this.f13562h = -f4;
                }
                float f6 = this.f13561g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f13561g = 2.0f - f6;
                    this.f13562h = -this.f13562h;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    /* renamed from: d */
    public void mo21791d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f13558d = (double) f2;
        this.f13555a = (double) f6;
        this.f13556b = false;
        this.f13561g = f;
        this.f13559e = (double) f3;
        this.f13557c = (double) f5;
        this.f13563i = f4;
        this.f13564j = f7;
        this.f13565k = i;
        this.f13560f = Utils.FLOAT_EPSILON;
    }

    public float getInterpolation(float f) {
        mo21790c((double) (f - this.f13560f));
        this.f13560f = f;
        return this.f13561g;
    }
}
