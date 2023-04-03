package p000;

import android.graphics.Color;

/* renamed from: aa0 */
/* compiled from: CamUtils */
public final class aa0 {

    /* renamed from: a */
    public static final float[][] f78a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f79b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f80c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f81d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static int m158a(float f) {
        boolean z;
        float f2;
        boolean z2;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f80c;
        return gl0.m18161b((double) (f3 * fArr[0]), (double) (f2 * fArr[1]), (double) (f5 * fArr[2]));
    }

    /* renamed from: b */
    public static float m159b(int i) {
        return m160c(m164g(i));
    }

    /* renamed from: c */
    public static float m160c(float f) {
        float f2 = f / 100.0f;
        if (f2 <= 0.008856452f) {
            return f2 * 903.2963f;
        }
        return (((float) Math.cbrt((double) f2)) * 116.0f) - 16.0f;
    }

    /* renamed from: d */
    public static float m161d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: e */
    public static float m162e(int i) {
        float pow;
        float f = ((float) i) / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* renamed from: f */
    public static float[] m163f(int i) {
        float e = m162e(Color.red(i));
        float e2 = m162e(Color.green(i));
        float e3 = m162e(Color.blue(i));
        float[][] fArr = f81d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * e) + (fArr2[1] * e2) + (fArr2[2] * e3);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * e) + (fArr3[1] * e2) + (fArr3[2] * e3);
        float[] fArr4 = fArr[2];
        return new float[]{f, f2, (e * fArr4[0]) + (e2 * fArr4[1]) + (e3 * fArr4[2])};
    }

    /* renamed from: g */
    public static float m164g(int i) {
        float e = m162e(Color.red(i));
        float e2 = m162e(Color.green(i));
        float e3 = m162e(Color.blue(i));
        float[] fArr = f81d[1];
        return (e * fArr[0]) + (e2 * fArr[1]) + (e3 * fArr[2]);
    }

    /* renamed from: h */
    public static float m165h(float f) {
        float f2;
        if (f > 8.0f) {
            f2 = (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d);
        } else {
            f2 = f / 903.2963f;
        }
        return f2 * 100.0f;
    }
}
