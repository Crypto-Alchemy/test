package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: z90 */
/* compiled from: CamColor */
public class z90 {

    /* renamed from: a */
    public final float f20501a;

    /* renamed from: b */
    public final float f20502b;

    /* renamed from: c */
    public final float f20503c;

    /* renamed from: d */
    public final float f20504d;

    /* renamed from: e */
    public final float f20505e;

    /* renamed from: f */
    public final float f20506f;

    /* renamed from: g */
    public final float f20507g;

    /* renamed from: h */
    public final float f20508h;

    /* renamed from: i */
    public final float f20509i;

    public z90(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f20501a = f;
        this.f20502b = f2;
        this.f20503c = f3;
        this.f20504d = f4;
        this.f20505e = f5;
        this.f20506f = f6;
        this.f20507g = f7;
        this.f20508h = f8;
        this.f20509i = f9;
    }

    /* renamed from: b */
    public static z90 m31069b(float f, float f2, float f3) {
        float f4 = 1000.0f;
        float f5 = 0.0f;
        z90 z90 = null;
        float f6 = 100.0f;
        float f7 = 1000.0f;
        while (Math.abs(f5 - f6) > 0.01f) {
            float f8 = ((f6 - f5) / 2.0f) + f5;
            int p = m31072e(f8, f2, f).mo28393p();
            float b = aa0.m159b(p);
            float abs = Math.abs(f3 - b);
            if (abs < 0.2f) {
                z90 c = m31070c(p);
                float a = c.mo28385a(m31072e(c.mo28390k(), c.mo28388i(), f));
                if (a <= 1.0f) {
                    z90 = c;
                    f4 = abs;
                    f7 = a;
                }
            }
            if (f4 == Utils.FLOAT_EPSILON && f7 == Utils.FLOAT_EPSILON) {
                break;
            } else if (b < f3) {
                f5 = f8;
            } else {
                f6 = f8;
            }
        }
        return z90;
    }

    /* renamed from: c */
    public static z90 m31070c(int i) {
        return m31071d(i, ff7.f11814k);
    }

    /* renamed from: d */
    public static z90 m31071d(int i, ff7 ff7) {
        float f;
        float[] f2 = aa0.m163f(i);
        float[][] fArr = aa0.f78a;
        float f3 = f2[0];
        float[] fArr2 = fArr[0];
        float f4 = f2[1];
        float f5 = f2[2];
        float f6 = (fArr2[0] * f3) + (fArr2[1] * f4) + (fArr2[2] * f5);
        float[] fArr3 = fArr[1];
        float f7 = (fArr3[0] * f3) + (fArr3[1] * f4) + (fArr3[2] * f5);
        float[] fArr4 = fArr[2];
        float f8 = (f3 * fArr4[0]) + (f4 * fArr4[1]) + (f5 * fArr4[2]);
        float f9 = ff7.mo19904i()[0] * f6;
        float f10 = ff7.mo19904i()[1] * f7;
        float f11 = ff7.mo19904i()[2] * f8;
        float pow = (float) Math.pow(((double) (ff7.mo19898c() * Math.abs(f9))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (ff7.mo19898c() * Math.abs(f10))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (ff7.mo19898c() * Math.abs(f11))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f12 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d)) / 11.0f;
        float f13 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = (((signum * 20.0f) + f14) + (21.0f * signum3)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f13, (double) f12)) * 180.0f) / 3.1415927f;
        if (atan2 < Utils.FLOAT_EPSILON) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = atan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f16 * ff7.mo19901f()) / ff7.mo19896a()), (double) (ff7.mo19897b() * ff7.mo19905j()))) * 100.0f;
        float d2 = ff7.mo19899d() * (4.0f / ff7.mo19897b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (ff7.mo19896a() + 4.0f);
        if (((double) f17) < 20.14d) {
            f = 360.0f + f17;
        } else {
            f = f17;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) ff7.mo19900e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ff7.mo19902g()) * ff7.mo19903h()) * ((float) Math.sqrt((double) ((f12 * f12) + (f13 * f13))))) / (f15 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float d3 = sqrt * ff7.mo19899d();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * ff7.mo19897b()) / (ff7.mo19896a() + 4.0f)))) * 50.0f;
        float f19 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d3) + 1.0f))) * 43.85965f;
        double d4 = (double) f18;
        return new z90(f17, sqrt, pow4, d2, d3, sqrt2, f19, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* renamed from: e */
    public static z90 m31072e(float f, float f2, float f3) {
        return m31073f(f, f2, f3, ff7.f11814k);
    }

    /* renamed from: f */
    public static z90 m31073f(float f, float f2, float f3, ff7 ff7) {
        float f4 = f;
        double d = ((double) f4) / 100.0d;
        float b = (4.0f / ff7.mo19897b()) * ((float) Math.sqrt(d)) * (ff7.mo19896a() + 4.0f) * ff7.mo19899d();
        float d2 = f2 * ff7.mo19899d();
        float sqrt = ((float) Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * ff7.mo19897b()) / (ff7.mo19896a() + 4.0f)))) * 50.0f;
        float f5 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((((double) d2) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f3) / 180.0f);
        return new z90(f3, f2, f4, b, d2, sqrt, f5, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: m */
    public static int m31074m(float f, float f2, float f3) {
        return m31075n(f, f2, f3, ff7.f11814k);
    }

    /* renamed from: n */
    public static int m31075n(float f, float f2, float f3, ff7 ff7) {
        float f4;
        if (((double) f2) < 1.0d || ((double) Math.round(f3)) <= Utils.DOUBLE_EPSILON || ((double) Math.round(f3)) >= 100.0d) {
            return aa0.m158a(f3);
        }
        if (f < Utils.FLOAT_EPSILON) {
            f4 = 0.0f;
        } else {
            f4 = Math.min(360.0f, f);
        }
        z90 z90 = null;
        boolean z = true;
        float f5 = 0.0f;
        float f6 = f2;
        while (Math.abs(f5 - f2) >= 0.4f) {
            z90 b = m31069b(f4, f6, f3);
            if (z) {
                if (b != null) {
                    return b.mo28392o(ff7);
                }
                z = false;
            } else if (b == null) {
                f2 = f6;
            } else {
                f5 = f6;
                z90 = b;
            }
            f6 = ((f2 - f5) / 2.0f) + f5;
        }
        if (z90 == null) {
            return aa0.m158a(f3);
        }
        return z90.mo28392o(ff7);
    }

    /* renamed from: a */
    public float mo28385a(z90 z90) {
        float l = mo28391l() - z90.mo28391l();
        float g = mo28386g() - z90.mo28386g();
        float h = mo28387h() - z90.mo28387h();
        return (float) (Math.pow(Math.sqrt((double) ((l * l) + (g * g) + (h * h))), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float mo28386g() {
        return this.f20508h;
    }

    /* renamed from: h */
    public float mo28387h() {
        return this.f20509i;
    }

    /* renamed from: i */
    public float mo28388i() {
        return this.f20502b;
    }

    /* renamed from: j */
    public float mo28389j() {
        return this.f20501a;
    }

    /* renamed from: k */
    public float mo28390k() {
        return this.f20503c;
    }

    /* renamed from: l */
    public float mo28391l() {
        return this.f20507g;
    }

    /* renamed from: o */
    public int mo28392o(ff7 ff7) {
        float f;
        if (((double) mo28388i()) == Utils.DOUBLE_EPSILON || ((double) mo28390k()) == Utils.DOUBLE_EPSILON) {
            f = Utils.FLOAT_EPSILON;
        } else {
            f = mo28388i() / ((float) Math.sqrt(((double) mo28390k()) / 100.0d));
        }
        float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) ff7.mo19900e()), 0.73d), 1.1111111111111112d);
        double j = (double) ((mo28389j() * 3.1415927f) / 180.0f);
        float a = ff7.mo19896a() * ((float) Math.pow(((double) mo28390k()) / 100.0d, (1.0d / ((double) ff7.mo19897b())) / ((double) ff7.mo19905j())));
        float cos = ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f * ff7.mo19902g() * ff7.mo19903h();
        float f2 = a / ff7.mo19901f();
        float sin = (float) Math.sin(j);
        float cos2 = (float) Math.cos(j);
        float f3 = (((0.305f + f2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = f2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float f9 = ((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / ff7.mo19898c()) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / ff7.mo19898c()) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float signum3 = Math.signum(f9) * (100.0f / ff7.mo19898c()) * ((float) Math.pow((double) ((float) Math.max(Utils.DOUBLE_EPSILON, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))))), 2.380952380952381d));
        float f10 = signum / ff7.mo19904i()[0];
        float f11 = signum2 / ff7.mo19904i()[1];
        float f12 = signum3 / ff7.mo19904i()[2];
        float[][] fArr = aa0.f79b;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return gl0.m18161b((double) f13, (double) ((fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12)), (double) ((f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2])));
    }

    /* renamed from: p */
    public int mo28393p() {
        return mo28392o(ff7.f11814k);
    }
}
