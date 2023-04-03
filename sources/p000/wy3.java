package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: wy3 */
/* compiled from: MotionTiming */
public class wy3 {

    /* renamed from: a */
    public long f35485a;

    /* renamed from: b */
    public long f35486b;

    /* renamed from: c */
    public TimeInterpolator f35487c;

    /* renamed from: d */
    public int f35488d;

    /* renamed from: e */
    public int f35489e;

    public wy3(long j, long j2) {
        this.f35487c = null;
        this.f35488d = 0;
        this.f35489e = 1;
        this.f35485a = j;
        this.f35486b = j2;
    }

    /* renamed from: b */
    public static wy3 m54134b(ValueAnimator valueAnimator) {
        wy3 wy3 = new wy3(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m54135f(valueAnimator));
        wy3.f35488d = valueAnimator.getRepeatCount();
        wy3.f35489e = valueAnimator.getRepeatMode();
        return wy3;
    }

    /* renamed from: f */
    public static TimeInterpolator m54135f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C5807el.f28629b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C5807el.f28630c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C5807el.f28631d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public void mo49320a(Animator animator) {
        animator.setStartDelay(mo49321c());
        animator.setDuration(mo49322d());
        animator.setInterpolator(mo49323e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo49325g());
            valueAnimator.setRepeatMode(mo49326h());
        }
    }

    /* renamed from: c */
    public long mo49321c() {
        return this.f35485a;
    }

    /* renamed from: d */
    public long mo49322d() {
        return this.f35486b;
    }

    /* renamed from: e */
    public TimeInterpolator mo49323e() {
        TimeInterpolator timeInterpolator = this.f35487c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C5807el.f28629b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy3)) {
            return false;
        }
        wy3 wy3 = (wy3) obj;
        if (mo49321c() == wy3.mo49321c() && mo49322d() == wy3.mo49322d() && mo49325g() == wy3.mo49325g() && mo49326h() == wy3.mo49326h()) {
            return mo49323e().getClass().equals(wy3.mo49323e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo49325g() {
        return this.f35488d;
    }

    /* renamed from: h */
    public int mo49326h() {
        return this.f35489e;
    }

    public int hashCode() {
        return (((((((((int) (mo49321c() ^ (mo49321c() >>> 32))) * 31) + ((int) (mo49322d() ^ (mo49322d() >>> 32)))) * 31) + mo49323e().getClass().hashCode()) * 31) + mo49325g()) * 31) + mo49326h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo49321c() + " duration: " + mo49322d() + " interpolator: " + mo49323e().getClass() + " repeatCount: " + mo49325g() + " repeatMode: " + mo49326h() + "}\n";
    }

    public wy3(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f35488d = 0;
        this.f35489e = 1;
        this.f35485a = j;
        this.f35486b = j2;
        this.f35487c = timeInterpolator;
    }
}
