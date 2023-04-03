package p000;

/* renamed from: ti1 */
/* compiled from: DownsampleUtil */
public class ti1 {
    /* renamed from: a */
    public static float m27753a(xh5 xh5, te5 te5, gp1 gp1) {
        au4.m10787b(Boolean.valueOf(gp1.m18286z(gp1)));
        return 1.0f;
    }

    /* renamed from: b */
    public static int m27754b(xh5 xh5, te5 te5, gp1 gp1, int i) {
        int i2;
        int i3;
        if (!gp1.m18286z(gp1)) {
            return 1;
        }
        float a = m27753a(xh5, te5, gp1);
        if (gp1.mo20751k() == r81.f17197a) {
            i2 = m27757e(a);
        } else {
            i2 = m27756d(a);
        }
        int max = Math.max(gp1.mo20750j(), gp1.mo20757s());
        float f = (float) i;
        while (((float) (max / i2)) > f) {
            if (gp1.mo20751k() == r81.f17197a) {
                i3 = i2 * 2;
            } else {
                i3 = i2 + 1;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m27755c(gp1 gp1, int i, int i2) {
        int p = gp1.mo20755p();
        while ((((gp1.mo20757s() * gp1.mo20750j()) * i) / p) / p > i2) {
            p *= 2;
        }
        return p;
    }

    /* renamed from: d */
    public static int m27756d(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: e */
    public static int m27757e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / ((double) i2);
            if (d + (0.3333333432674408d * d) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }
}
