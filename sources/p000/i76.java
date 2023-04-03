package p000;

import com.github.mikephil.charting.utils.Utils;
import p000.kl1;

/* renamed from: i76 */
/* compiled from: SpringForce */
public final class i76 {

    /* renamed from: a */
    public double f13174a = Math.sqrt(1500.0d);

    /* renamed from: b */
    public double f13175b = 0.5d;

    /* renamed from: c */
    public boolean f13176c = false;

    /* renamed from: d */
    public double f13177d;

    /* renamed from: e */
    public double f13178e;

    /* renamed from: f */
    public double f13179f;

    /* renamed from: g */
    public double f13180g;

    /* renamed from: h */
    public double f13181h;

    /* renamed from: i */
    public double f13182i = Double.MAX_VALUE;

    /* renamed from: j */
    public final kl1.C2703o f13183j = new kl1.C2703o();

    public i76() {
    }

    /* renamed from: a */
    public float mo21474a() {
        return (float) this.f13182i;
    }

    /* renamed from: b */
    public final void mo21475b() {
        if (!this.f13176c) {
            if (this.f13182i != Double.MAX_VALUE) {
                double d = this.f13175b;
                if (d > 1.0d) {
                    double d2 = this.f13174a;
                    this.f13179f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f13175b;
                    double d4 = this.f13174a;
                    this.f13180g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= Utils.DOUBLE_EPSILON && d < 1.0d) {
                    this.f13181h = this.f13174a * Math.sqrt(1.0d - (d * d));
                }
                this.f13176c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: c */
    public boolean mo21476c(float f, float f2) {
        if (((double) Math.abs(f2)) >= this.f13178e || ((double) Math.abs(f - mo21474a())) >= this.f13177d) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public i76 mo21477d(float f) {
        if (f >= Utils.FLOAT_EPSILON) {
            this.f13175b = (double) f;
            this.f13176c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public i76 mo21478e(float f) {
        this.f13182i = (double) f;
        return this;
    }

    /* renamed from: f */
    public i76 mo21479f(float f) {
        if (f > Utils.FLOAT_EPSILON) {
            this.f13174a = Math.sqrt((double) f);
            this.f13176c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: g */
    public void mo21480g(double d) {
        double abs = Math.abs(d);
        this.f13177d = abs;
        this.f13178e = abs * 62.5d;
    }

    /* renamed from: h */
    public kl1.C2703o mo21481h(double d, double d2, long j) {
        double d3;
        double d4;
        mo21475b();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.f13182i;
        double d7 = this.f13175b;
        if (d7 > 1.0d) {
            double d8 = this.f13180g;
            double d9 = this.f13179f;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f13179f * d5) * d11);
            double d12 = this.f13180g;
            double pow = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f13179f;
            d3 = pow + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f13174a;
            double d15 = d2 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            d4 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow2 = d16 * Math.pow(2.718281828459045d, (-this.f13174a) * d5);
            double d17 = this.f13174a;
            d3 = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow2 * (-d17));
        } else {
            double d18 = 1.0d / this.f13181h;
            double d19 = this.f13174a;
            double d20 = d18 * ((d7 * d19 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f13181h * d5) * d6) + (Math.sin(this.f13181h * d5) * d20));
            double d21 = this.f13174a;
            double d22 = this.f13175b;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.f13181h;
            double d24 = pow3;
            double sin = (-d23) * d6 * Math.sin(d23 * d5);
            double d25 = this.f13181h;
            d3 = ((-d21) * pow3 * d22) + (pow4 * (sin + (d20 * d25 * Math.cos(d25 * d5))));
            d4 = d24;
        }
        kl1.C2703o oVar = this.f13183j;
        oVar.f14171a = (float) (d4 + this.f13182i);
        oVar.f14172b = (float) d3;
        return oVar;
    }

    public i76(float f) {
        this.f13182i = (double) f;
    }
}
