package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: y96 */
/* compiled from: StopLogicEngine */
public class y96 implements w96 {

    /* renamed from: a */
    public float f20105a;

    /* renamed from: b */
    public float f20106b;

    /* renamed from: c */
    public float f20107c;

    /* renamed from: d */
    public float f20108d;

    /* renamed from: e */
    public float f20109e;

    /* renamed from: f */
    public float f20110f;

    /* renamed from: g */
    public float f20111g;

    /* renamed from: h */
    public float f20112h;

    /* renamed from: i */
    public float f20113i;

    /* renamed from: j */
    public int f20114j;

    /* renamed from: k */
    public String f20115k;

    /* renamed from: l */
    public boolean f20116l = false;

    /* renamed from: m */
    public float f20117m;

    /* renamed from: n */
    public float f20118n;

    /* renamed from: o */
    public boolean f20119o = false;

    /* renamed from: a */
    public float mo21788a() {
        if (this.f20116l) {
            return -mo28009e(this.f20118n);
        }
        return mo28009e(this.f20118n);
    }

    /* renamed from: b */
    public boolean mo21789b() {
        if (mo21788a() >= 1.0E-5f || Math.abs(this.f20113i - this.f20118n) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final float mo28007c(float f) {
        this.f20119o = false;
        float f2 = this.f20108d;
        if (f <= f2) {
            float f3 = this.f20105a;
            return (f3 * f) + ((((this.f20106b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f20114j;
        if (i == 1) {
            return this.f20111g;
        }
        float f4 = f - f2;
        float f5 = this.f20109e;
        if (f4 < f5) {
            float f6 = this.f20111g;
            float f7 = this.f20106b;
            return f6 + (f7 * f4) + ((((this.f20107c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f20112h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f20110f;
            if (f8 <= f9) {
                float f10 = this.f20112h;
                float f11 = this.f20107c;
                return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            this.f20119o = true;
            return this.f20113i;
        }
    }

    /* renamed from: d */
    public void mo28008d(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z = false;
        this.f20119o = false;
        this.f20117m = f;
        if (f > f2) {
            z = true;
        }
        this.f20116l = z;
        if (z) {
            mo28010f(-f3, f - f2, f5, f6, f4);
            return;
        }
        mo28010f(f3, f2 - f, f5, f6, f4);
    }

    /* renamed from: e */
    public float mo28009e(float f) {
        float f2 = this.f20108d;
        if (f <= f2) {
            float f3 = this.f20105a;
            return f3 + (((this.f20106b - f3) * f) / f2);
        }
        int i = this.f20114j;
        if (i == 1) {
            return Utils.FLOAT_EPSILON;
        }
        float f4 = f - f2;
        float f5 = this.f20109e;
        if (f4 < f5) {
            float f6 = this.f20106b;
            return f6 + (((this.f20107c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f20112h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f20110f;
            if (f7 >= f8) {
                return this.f20113i;
            }
            float f9 = this.f20107c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    /* renamed from: f */
    public final void mo28010f(float f, float f2, float f3, float f4, float f5) {
        this.f20119o = false;
        if (f == Utils.FLOAT_EPSILON) {
            f = 1.0E-4f;
        }
        this.f20105a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < Utils.FLOAT_EPSILON) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f20115k = "backward accelerate, decelerate";
                this.f20114j = 2;
                this.f20105a = f;
                this.f20106b = sqrt;
                this.f20107c = Utils.FLOAT_EPSILON;
                float f8 = (sqrt - f) / f3;
                this.f20108d = f8;
                this.f20109e = sqrt / f3;
                this.f20111g = ((f + sqrt) * f8) / 2.0f;
                this.f20112h = f2;
                this.f20113i = f2;
                return;
            }
            this.f20115k = "backward accelerate cruse decelerate";
            this.f20114j = 3;
            this.f20105a = f;
            this.f20106b = f4;
            this.f20107c = f4;
            float f9 = (f4 - f) / f3;
            this.f20108d = f9;
            float f10 = f4 / f3;
            this.f20110f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f20109e = ((f2 - f11) - f12) / f4;
            this.f20111g = f11;
            this.f20112h = f2 - f12;
            this.f20113i = f2;
        } else if (f7 >= f2) {
            this.f20115k = "hard stop";
            this.f20114j = 1;
            this.f20105a = f;
            this.f20106b = Utils.FLOAT_EPSILON;
            this.f20111g = f2;
            this.f20108d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f20115k = "cruse decelerate";
                this.f20114j = 2;
                this.f20105a = f;
                this.f20106b = f;
                this.f20107c = Utils.FLOAT_EPSILON;
                this.f20111g = f13;
                this.f20112h = f2;
                this.f20108d = f14;
                this.f20109e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.f20108d = f15;
            float f16 = sqrt2 / f3;
            this.f20109e = f16;
            if (sqrt2 < f4) {
                this.f20115k = "accelerate decelerate";
                this.f20114j = 2;
                this.f20105a = f;
                this.f20106b = sqrt2;
                this.f20107c = Utils.FLOAT_EPSILON;
                this.f20108d = f15;
                this.f20109e = f16;
                this.f20111g = ((f + sqrt2) * f15) / 2.0f;
                this.f20112h = f2;
                return;
            }
            this.f20115k = "accelerate cruse decelerate";
            this.f20114j = 3;
            this.f20105a = f;
            this.f20106b = f4;
            this.f20107c = f4;
            float f17 = (f4 - f) / f3;
            this.f20108d = f17;
            float f18 = f4 / f3;
            this.f20110f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f20109e = ((f2 - f19) - f20) / f4;
            this.f20111g = f19;
            this.f20112h = f2 - f20;
            this.f20113i = f2;
        }
    }

    public float getInterpolation(float f) {
        float c = mo28007c(f);
        this.f20118n = f;
        if (this.f20116l) {
            return this.f20117m - c;
        }
        return this.f20117m + c;
    }
}
