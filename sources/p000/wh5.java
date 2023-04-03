package p000;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: wh5 */
/* compiled from: RotationGestureDetector */
public class wh5 {

    /* renamed from: a */
    public final C3550a f19128a;

    /* renamed from: b */
    public float f19129b;

    /* renamed from: c */
    public float f19130c;

    /* renamed from: d */
    public float f19131d;

    /* renamed from: e */
    public float f19132e;

    /* renamed from: f */
    public float f19133f;

    /* renamed from: g */
    public boolean f19134g;

    /* renamed from: h */
    public boolean f19135h;

    /* renamed from: wh5$a */
    /* compiled from: RotationGestureDetector */
    public interface C3550a {
        /* renamed from: a */
        boolean mo12210a(wh5 wh5);

        /* renamed from: b */
        void mo12211b(wh5 wh5);

        /* renamed from: c */
        boolean mo12212c(wh5 wh5);
    }

    public wh5(Context context, C3550a aVar) {
        this.f19128a = aVar;
    }

    /* renamed from: a */
    public final void mo27537a() {
        if (this.f19134g) {
            this.f19134g = false;
            if (this.f19135h) {
                this.f19128a.mo12211b(this);
                this.f19135h = false;
            }
        }
    }

    /* renamed from: b */
    public final float mo27538b(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2((double) (motionEvent.getY(1) - motionEvent.getY(0)), (double) (motionEvent.getX(1) - motionEvent.getX(0))));
    }

    /* renamed from: c */
    public float mo27539c() {
        return this.f19129b;
    }

    /* renamed from: d */
    public float mo27540d() {
        return this.f19130c;
    }

    /* renamed from: e */
    public float mo27541e() {
        return this.f19132e - this.f19133f;
    }

    /* renamed from: f */
    public boolean mo27542f(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!(actionMasked == 0 || actionMasked == 1)) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6 && motionEvent.getPointerCount() == 2) {
                            mo27537a();
                        }
                    } else if (motionEvent.getPointerCount() == 2) {
                        float b = mo27538b(motionEvent);
                        this.f19132e = b;
                        this.f19133f = b;
                        this.f19131d = b;
                    }
                }
            } else if (motionEvent.getPointerCount() >= 2 && (!this.f19134g || this.f19135h)) {
                this.f19132e = mo27538b(motionEvent);
                boolean z = false;
                this.f19129b = (motionEvent.getX(1) + motionEvent.getX(0)) * 0.5f;
                this.f19130c = (motionEvent.getY(1) + motionEvent.getY(0)) * 0.5f;
                boolean z2 = this.f19134g;
                mo27544h();
                if (!z2 || mo27543g()) {
                    z = true;
                }
                if (z) {
                    this.f19133f = this.f19132e;
                }
            }
            return true;
        }
        mo27537a();
        return true;
    }

    /* renamed from: g */
    public final boolean mo27543g() {
        if (!this.f19134g || !this.f19135h || !this.f19128a.mo12212c(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo27544h() {
        if (!this.f19134g && Math.abs(this.f19131d - this.f19132e) >= 5.0f) {
            this.f19134g = true;
            this.f19135h = this.f19128a.mo12210a(this);
        }
    }
}
