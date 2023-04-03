package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;
import p000.e87;

/* renamed from: kn7 */
/* compiled from: WormAnimation */
public class kn7 extends C6678wx<AnimatorSet> {

    /* renamed from: d */
    public int f30939d;

    /* renamed from: e */
    public int f30940e;

    /* renamed from: f */
    public int f30941f;

    /* renamed from: g */
    public boolean f30942g;

    /* renamed from: h */
    public int f30943h;

    /* renamed from: i */
    public int f30944i;

    /* renamed from: j */
    public ln7 f30945j = new ln7();

    /* renamed from: kn7$a */
    /* compiled from: WormAnimation */
    public class C6163a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ln7 f30946a;

        /* renamed from: d */
        public final /* synthetic */ boolean f30947d;

        public C6163a(ln7 ln7, boolean z) {
            this.f30946a = ln7;
            this.f30947d = z;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            kn7.this.mo44851l(this.f30946a, valueAnimator, this.f30947d);
        }
    }

    /* renamed from: kn7$b */
    /* compiled from: WormAnimation */
    public class C6164b {

        /* renamed from: a */
        public final int f30949a;

        /* renamed from: b */
        public final int f30950b;

        /* renamed from: c */
        public final int f30951c;

        /* renamed from: d */
        public final int f30952d;

        public C6164b(int i, int i2, int i3, int i4) {
            this.f30949a = i;
            this.f30950b = i2;
            this.f30951c = i3;
            this.f30952d = i4;
        }
    }

    public kn7(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: g */
    public AnimatorSet mo28832a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: h */
    public C6164b mo44847h(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f30939d;
            int i6 = this.f30941f;
            i4 = i5 + i6;
            int i7 = this.f30940e;
            i2 = i7 + i6;
            i = i5 - i6;
            i3 = i7 - i6;
        } else {
            int i8 = this.f30939d;
            int i9 = this.f30941f;
            i4 = i8 - i9;
            int i10 = this.f30940e;
            i2 = i10 - i9;
            i = i8 + i9;
            i3 = i10 + i9;
        }
        return new C6164b(i4, i2, i, i3);
    }

    /* renamed from: i */
    public ValueAnimator mo44848i(int i, int i2, long j, boolean z, ln7 ln7) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C6163a(ln7, z));
        return ofInt;
    }

    /* renamed from: j */
    public kn7 mo44849j(long j) {
        super.mo49306b(j);
        return this;
    }

    /* renamed from: k */
    public boolean mo44850k(int i, int i2, int i3, boolean z) {
        if (this.f30939d == i && this.f30940e == i2 && this.f30941f == i3 && this.f30942g == z) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo44851l(ln7 ln7, ValueAnimator valueAnimator, boolean z) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.f30942g) {
            if (!z) {
                ln7.mo45462c(intValue);
            } else {
                ln7.mo45463d(intValue);
            }
        } else if (!z) {
            ln7.mo45463d(intValue);
        } else {
            ln7.mo45462c(intValue);
        }
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(ln7);
        }
    }

    /* renamed from: m */
    public kn7 mo28833d(float f) {
        T t = this.f35463c;
        if (t == null) {
            return this;
        }
        long j = (long) (f * ((float) this.f35461a));
        Iterator<Animator> it = ((AnimatorSet) t).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    /* renamed from: n */
    public kn7 mo44853n(int i, int i2, int i3, boolean z) {
        if (mo44850k(i, i2, i3, z)) {
            this.f35463c = mo28832a();
            this.f30939d = i;
            this.f30940e = i2;
            this.f30941f = i3;
            this.f30942g = z;
            int i4 = i - i3;
            this.f30943h = i4;
            this.f30944i = i + i3;
            this.f30945j.mo45463d(i4);
            this.f30945j.mo45462c(this.f30944i);
            C6164b h = mo44847h(z);
            long j = this.f35461a / 2;
            ((AnimatorSet) this.f35463c).playSequentially(new Animator[]{mo44848i(h.f30949a, h.f30950b, j, false, this.f30945j), mo44848i(h.f30951c, h.f30952d, j, true, this.f30945j)});
        }
        return this;
    }
}
