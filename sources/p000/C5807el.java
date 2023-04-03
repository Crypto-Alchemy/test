package p000;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: el */
/* compiled from: AnimationUtils */
public class C5807el {

    /* renamed from: a */
    public static final TimeInterpolator f28628a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f28629b = new bz1();

    /* renamed from: c */
    public static final TimeInterpolator f28630c = new az1();

    /* renamed from: d */
    public static final TimeInterpolator f28631d = new oh3();

    /* renamed from: e */
    public static final TimeInterpolator f28632e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m43986a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m43987b(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return m43986a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m43988c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
