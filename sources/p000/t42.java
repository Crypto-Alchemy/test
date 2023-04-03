package p000;

import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: t42 */
/* compiled from: FloatScroller */
public class t42 {

    /* renamed from: a */
    public final Interpolator f17912a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    public boolean f17913b = true;

    /* renamed from: c */
    public float f17914c;

    /* renamed from: d */
    public float f17915d;

    /* renamed from: e */
    public float f17916e;

    /* renamed from: f */
    public long f17917f;

    /* renamed from: g */
    public long f17918g = 250;

    /* renamed from: d */
    public static float m27299d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public boolean mo26048a() {
        if (this.f17913b) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17917f;
        long j = this.f17918g;
        if (elapsedRealtime >= j) {
            this.f17913b = true;
            this.f17916e = this.f17915d;
            return false;
        }
        this.f17916e = m27299d(this.f17914c, this.f17915d, this.f17912a.getInterpolation(((float) elapsedRealtime) / ((float) j)));
        return true;
    }

    /* renamed from: b */
    public void mo26049b() {
        this.f17913b = true;
    }

    /* renamed from: c */
    public float mo26050c() {
        return this.f17916e;
    }

    /* renamed from: e */
    public boolean mo26051e() {
        return this.f17913b;
    }

    /* renamed from: f */
    public void mo26052f(long j) {
        this.f17918g = j;
    }

    /* renamed from: g */
    public void mo26053g(float f, float f2) {
        this.f17913b = false;
        this.f17917f = SystemClock.elapsedRealtime();
        this.f17914c = f;
        this.f17915d = f2;
        this.f17916e = f;
    }
}
