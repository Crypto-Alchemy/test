package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: ff7 */
/* compiled from: ViewingConditions */
public final class ff7 {

    /* renamed from: k */
    public static final ff7 f11814k = m16971k(aa0.f80c, (float) ((((double) aa0.m165h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f11815a;

    /* renamed from: b */
    public final float f11816b;

    /* renamed from: c */
    public final float f11817c;

    /* renamed from: d */
    public final float f11818d;

    /* renamed from: e */
    public final float f11819e;

    /* renamed from: f */
    public final float f11820f;

    /* renamed from: g */
    public final float[] f11821g;

    /* renamed from: h */
    public final float f11822h;

    /* renamed from: i */
    public final float f11823i;

    /* renamed from: j */
    public final float f11824j;

    public ff7(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f11820f = f;
        this.f11815a = f2;
        this.f11816b = f3;
        this.f11817c = f4;
        this.f11818d = f5;
        this.f11819e = f6;
        this.f11821g = fArr;
        this.f11822h = f7;
        this.f11823i = f8;
        this.f11824j = f9;
    }

    /* renamed from: k */
    public static ff7 m16971k(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float f6 = f;
        float[][] fArr2 = aa0.f78a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = (fArr3[0] * f7) + (fArr3[1] * f8) + (fArr3[2] * f9);
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[0] * f7) + (fArr4[1] * f8) + (fArr4[2] * f9);
        float[] fArr5 = fArr2[2];
        float f12 = (f7 * fArr5[0]) + (f8 * fArr5[1]) + (f9 * fArr5[2]);
        float f13 = (f3 / 10.0f) + 0.8f;
        if (((double) f13) >= 0.9d) {
            f4 = aa0.m161d(0.59f, 0.69f, (f13 - 0.9f) * 10.0f);
        } else {
            f4 = aa0.m161d(0.525f, 0.59f, (f13 - 0.8f) * 10.0f);
        }
        float f14 = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = (1.0f - (((float) Math.exp((double) (((-f6) - 42.0f) / 92.0f))) * 0.2777778f)) * f13;
        }
        double d = (double) f5;
        if (d > 1.0d) {
            f5 = 1.0f;
        } else if (d < Utils.DOUBLE_EPSILON) {
            f5 = Utils.FLOAT_EPSILON;
        }
        float[] fArr6 = {(((100.0f / f10) * f5) + 1.0f) - f5, (((100.0f / f11) * f5) + 1.0f) - f5, (((100.0f / f12) * f5) + 1.0f) - f5};
        float f15 = 1.0f / ((5.0f * f6) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float cbrt = (f16 * f6) + (0.1f * f17 * f17 * ((float) Math.cbrt(((double) f6) * 5.0d)));
        float h = aa0.m165h(f2) / fArr[1];
        double d2 = (double) h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((double) ((fArr6[2] * cbrt) * f12)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f11)) / 100.0d, 0.42d), pow2};
        float f18 = fArr7[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[1];
        return new ff7(h, ((f19 * 2.0f) + ((f20 * 400.0f) / (f20 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f14, f13, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float mo19896a() {
        return this.f11815a;
    }

    /* renamed from: b */
    public float mo19897b() {
        return this.f11818d;
    }

    /* renamed from: c */
    public float mo19898c() {
        return this.f11822h;
    }

    /* renamed from: d */
    public float mo19899d() {
        return this.f11823i;
    }

    /* renamed from: e */
    public float mo19900e() {
        return this.f11820f;
    }

    /* renamed from: f */
    public float mo19901f() {
        return this.f11816b;
    }

    /* renamed from: g */
    public float mo19902g() {
        return this.f11819e;
    }

    /* renamed from: h */
    public float mo19903h() {
        return this.f11817c;
    }

    /* renamed from: i */
    public float[] mo19904i() {
        return this.f11821g;
    }

    /* renamed from: j */
    public float mo19905j() {
        return this.f11824j;
    }
}
