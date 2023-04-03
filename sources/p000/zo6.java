package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import p000.e87;
import p000.kn7;

/* renamed from: zo6 */
/* compiled from: ThinWormAnimation */
public class zo6 extends kn7 {

    /* renamed from: k */
    public ap6 f36200k = new ap6();

    /* renamed from: zo6$a */
    /* compiled from: ThinWormAnimation */
    public class C6773a implements ValueAnimator.AnimatorUpdateListener {
        public C6773a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            zo6.this.mo49890r(valueAnimator);
        }
    }

    public zo6(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: n */
    public kn7 mo44853n(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i3;
        boolean z2 = z;
        if (mo44850k(i, i2, i3, z)) {
            this.f35463c = mo28832a();
            this.f30939d = i4;
            this.f30940e = i2;
            this.f30941f = i5;
            this.f30942g = z2;
            int i6 = i5 * 2;
            int i7 = i4 - i5;
            this.f30943h = i7;
            this.f30944i = i4 + i5;
            this.f36200k.mo45463d(i7);
            this.f36200k.mo45462c(this.f30944i);
            this.f36200k.mo29032f(i6);
            kn7.C6164b h = mo44847h(z2);
            long j = this.f35461a;
            long j2 = (long) (((double) j) * 0.8d);
            long j3 = (long) (((double) j) * 0.2d);
            long j4 = (long) (((double) j) * 0.5d);
            long j5 = (long) (((double) j) * 0.5d);
            long j6 = j2;
            ValueAnimator i8 = mo44848i(h.f30949a, h.f30950b, j6, false, this.f36200k);
            ValueAnimator i9 = mo44848i(h.f30951c, h.f30952d, j6, true, this.f36200k);
            i9.setStartDelay(j3);
            long j7 = j5;
            ValueAnimator p = mo49888p(i6, i5, j7);
            ValueAnimator p2 = mo49888p(i5, i6, j7);
            p2.setStartDelay(j4);
            ((AnimatorSet) this.f35463c).playTogether(new Animator[]{i8, i9, p, p2});
        }
        return this;
    }

    /* renamed from: p */
    public final ValueAnimator mo49888p(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C6773a());
        return ofInt;
    }

    /* renamed from: q */
    public zo6 mo44849j(long j) {
        super.mo44849j(j);
        return this;
    }

    /* renamed from: r */
    public final void mo49890r(ValueAnimator valueAnimator) {
        this.f36200k.mo29032f(((Integer) valueAnimator.getAnimatedValue()).intValue());
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f36200k);
        }
    }

    /* renamed from: s */
    public zo6 mo44852m(float f) {
        T t = this.f35463c;
        if (t != null) {
            long j = (long) (f * ((float) this.f35461a));
            int size = ((AnimatorSet) t).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.f35463c).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }
}
