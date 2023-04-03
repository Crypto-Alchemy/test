package p000;

/* renamed from: dp3 */
/* compiled from: MathUtils */
public final class dp3 {
    /* renamed from: a */
    public static float m43580a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m43581b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m43584e(m43580a(f, f2, f3, f4), m43580a(f, f2, f5, f4), m43580a(f, f2, f5, f6), m43580a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static boolean m43582c(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: d */
    public static float m43583d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: e */
    public static float m43584e(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
