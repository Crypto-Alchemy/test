package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: vd7 */
/* compiled from: ViewPropertyAnimatorCompat */
public final class vd7 {

    /* renamed from: a */
    public final WeakReference<View> f18735a;

    /* renamed from: b */
    public Runnable f18736b = null;

    /* renamed from: c */
    public Runnable f18737c = null;

    /* renamed from: d */
    public int f18738d = -1;

    /* renamed from: vd7$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    public class C3480a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ xd7 f18739a;

        /* renamed from: d */
        public final /* synthetic */ View f18740d;

        public C3480a(xd7 xd7, View view) {
            this.f18739a = xd7;
            this.f18740d = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18739a.mo2623a(this.f18740d);
        }

        public void onAnimationEnd(Animator animator) {
            this.f18739a.mo1162b(this.f18740d);
        }

        public void onAnimationStart(Animator animator) {
            this.f18739a.mo1163c(this.f18740d);
        }
    }

    /* renamed from: vd7$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    public static class C3481b {
        /* renamed from: a */
        public static ViewPropertyAnimator m28750a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public vd7(View view) {
        this.f18735a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public vd7 mo27115b(float f) {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void mo27116c() {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long mo27117d() {
        View view = this.f18735a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public vd7 mo27118f(long j) {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public vd7 mo27119g(Interpolator interpolator) {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public vd7 mo27120h(xd7 xd7) {
        View view = this.f18735a.get();
        if (view != null) {
            mo27121i(view, xd7);
        }
        return this;
    }

    /* renamed from: i */
    public final void mo27121i(View view, xd7 xd7) {
        if (xd7 != null) {
            view.animate().setListener(new C3480a(xd7, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: j */
    public vd7 mo27122j(long j) {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public vd7 mo27123k(zd7 zd7) {
        View view = this.f18735a.get();
        if (view != null) {
            ud7 ud7 = null;
            if (zd7 != null) {
                ud7 = new ud7(zd7, view);
            }
            C3481b.m28750a(view.animate(), ud7);
        }
        return this;
    }

    /* renamed from: l */
    public void mo27124l() {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public vd7 mo27125m(float f) {
        View view = this.f18735a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
