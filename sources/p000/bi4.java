package p000;

import android.view.animation.Interpolator;

/* renamed from: bi4 */
/* compiled from: OneSignalBounceInterpolator */
public class bi4 implements Interpolator {

    /* renamed from: a */
    public double f21345a;

    /* renamed from: b */
    public double f21346b;

    public bi4(double d, double d2) {
        this.f21345a = d;
        this.f21346b = d2;
    }

    public float getInterpolation(float f) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f)) / this.f21345a) * -1.0d * Math.cos(this.f21346b * ((double) f))) + 1.0d);
    }
}
