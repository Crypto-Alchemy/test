package p000;

import android.graphics.Color;

/* renamed from: gl0 */
/* compiled from: ColorUtils */
public final class gl0 {

    /* renamed from: a */
    public static final ThreadLocal<double[]> f12416a = new ThreadLocal<>();

    /* renamed from: a */
    public static void m18160a(int i, int i2, int i3, double[] dArr) {
        double d;
        double d2;
        double d3;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d4 = ((double) i) / 255.0d;
            if (d4 < 0.04045d) {
                d = d4 / 12.92d;
            } else {
                d = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = ((double) i2) / 255.0d;
            if (d5 < 0.04045d) {
                d2 = d5 / 12.92d;
            } else {
                d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = ((double) i3) / 255.0d;
            if (d6 < 0.04045d) {
                d3 = d6 / 12.92d;
            } else {
                d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * d) + (0.3576d * d2) + (0.1805d * d3)) * 100.0d;
            dArr2[1] = ((0.2126d * d) + (0.7152d * d2) + (0.0722d * d3)) * 100.0d;
            dArr2[2] = ((d * 0.0193d) + (d2 * 0.1192d) + (d3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: b */
    public static int m18161b(double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d8 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d9 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        if (d7 > 0.0031308d) {
            d4 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d4 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        return Color.rgb(m18167h((int) Math.round(d4 * 255.0d), 0, 255), m18167h((int) Math.round(d5 * 255.0d), 0, 255), m18167h((int) Math.round(d6 * 255.0d), 0, 255));
    }

    /* renamed from: c */
    public static double m18162c(int i) {
        double[] i2 = m18168i();
        m18163d(i, i2);
        return i2[1] / 100.0d;
    }

    /* renamed from: d */
    public static void m18163d(int i, double[] dArr) {
        m18160a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: e */
    public static int m18164e(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: f */
    public static int m18165f(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int e = m18164e(alpha2, alpha);
        return Color.argb(e, m18166g(Color.red(i), alpha2, Color.red(i2), alpha, e), m18166g(Color.green(i), alpha2, Color.green(i2), alpha, e), m18166g(Color.blue(i), alpha2, Color.blue(i2), alpha, e));
    }

    /* renamed from: g */
    public static int m18166g(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: h */
    public static int m18167h(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return Math.min(i, i3);
    }

    /* renamed from: i */
    public static double[] m18168i() {
        ThreadLocal<double[]> threadLocal = f12416a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: j */
    public static int m18169j(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
