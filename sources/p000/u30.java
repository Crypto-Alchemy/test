package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: u30 */
/* compiled from: BottomAppBarTopEdgeTreatment */
public class u30 extends mn1 implements Cloneable {

    /* renamed from: a */
    public float f34448a;

    /* renamed from: d */
    public float f34449d;

    /* renamed from: e */
    public float f34450e;

    /* renamed from: g */
    public float f34451g;

    /* renamed from: k */
    public float f34452k;

    /* renamed from: r */
    public float f34453r = -1.0f;

    public u30(float f, float f2, float f3) {
        this.f34449d = f;
        this.f34448a = f2;
        mo48295l(f3);
        this.f34452k = Utils.FLOAT_EPSILON;
    }

    /* renamed from: b */
    public void mo42935b(float f, float f2, float f3, uz5 uz5) {
        boolean z;
        float f4;
        float f5;
        float f6 = f;
        uz5 uz52 = uz5;
        float f7 = this.f34450e;
        if (f7 == Utils.FLOAT_EPSILON) {
            uz52.mo48565m(f6, Utils.FLOAT_EPSILON);
            return;
        }
        float f8 = ((this.f34449d * 2.0f) + f7) / 2.0f;
        float f9 = f3 * this.f34448a;
        float f10 = f2 + this.f34452k;
        float f11 = (this.f34451g * f3) + ((1.0f - f3) * f8);
        if (f11 / f8 >= 1.0f) {
            uz52.mo48565m(f6, Utils.FLOAT_EPSILON);
            return;
        }
        float f12 = this.f34453r;
        float f13 = f12 * f3;
        if (f12 == -1.0f || Math.abs((f12 * 2.0f) - f7) < 0.1f) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        if (!z2) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f11;
            f5 = 0.0f;
        }
        float f14 = f8 + f9;
        float f15 = f4 + f9;
        float sqrt = (float) Math.sqrt((double) ((f14 * f14) - (f15 * f15)));
        float f16 = f10 - sqrt;
        float f17 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = (90.0f - degrees) + f5;
        uz52.mo48565m(f16, Utils.FLOAT_EPSILON);
        float f19 = f9 * 2.0f;
        float f20 = degrees;
        uz5.mo48553a(f16 - f9, Utils.FLOAT_EPSILON, f16 + f9, f19, 270.0f, degrees);
        if (z2) {
            uz5.mo48553a(f10 - f8, (-f8) - f4, f10 + f8, f8 - f4, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f34449d;
            float f22 = f13 * 2.0f;
            float f23 = f10 - f8;
            uz5.mo48553a(f23, -(f13 + f21), f23 + f21 + f22, f21 + f13, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f10 + f8;
            float f25 = this.f34449d;
            uz52.mo48565m(f24 - ((f25 / 2.0f) + f13), f25 + f13);
            float f26 = this.f34449d;
            uz5.mo48553a(f24 - (f22 + f26), -(f13 + f26), f24, f26 + f13, 90.0f, f18 - 0.049804688f);
        }
        uz5.mo48553a(f17 - f9, Utils.FLOAT_EPSILON, f17 + f9, f19, 270.0f - f20, f20);
        uz52.mo48565m(f6, Utils.FLOAT_EPSILON);
    }

    /* renamed from: d */
    public float mo48289d() {
        return this.f34451g;
    }

    /* renamed from: f */
    public float mo48290f() {
        return this.f34453r;
    }

    /* renamed from: g */
    public float mo48291g() {
        return this.f34449d;
    }

    /* renamed from: h */
    public float mo48292h() {
        return this.f34448a;
    }

    /* renamed from: i */
    public float mo48293i() {
        return this.f34450e;
    }

    /* renamed from: j */
    public float mo48294j() {
        return this.f34452k;
    }

    /* renamed from: l */
    public void mo48295l(float f) {
        if (f >= Utils.FLOAT_EPSILON) {
            this.f34451g = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: m */
    public void mo48296m(float f) {
        this.f34453r = f;
    }

    /* renamed from: o */
    public void mo48297o(float f) {
        this.f34449d = f;
    }

    /* renamed from: p */
    public void mo48298p(float f) {
        this.f34448a = f;
    }

    /* renamed from: r */
    public void mo48299r(float f) {
        this.f34450e = f;
    }

    /* renamed from: t */
    public void mo48300t(float f) {
        this.f34452k = f;
    }
}
