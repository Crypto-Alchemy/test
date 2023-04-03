package p000;

import android.graphics.drawable.Drawable;

/* renamed from: ai5 */
/* compiled from: RoundRectDrawableWithShadow */
public class ai5 extends Drawable {

    /* renamed from: a */
    public static final double f143a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m317a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f143a) * ((double) f2)));
        }
        return f;
    }

    /* renamed from: b */
    public static float m318b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (f * 1.5f)) + ((1.0d - f143a) * ((double) f2)));
        }
        return f * 1.5f;
    }
}
