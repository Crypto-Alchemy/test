package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public int f23377a = 0;

    /* renamed from: b */
    public int f23378b = 2;

    /* renamed from: c */
    public int f23379c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f23380d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C4185a extends AnimatorListenerAdapter {
        public C4185a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f23380d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: b */
    public final void mo31760b(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f23380d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C4185a());
    }

    /* renamed from: c */
    public void mo31761c(V v, int i) {
        this.f23379c = i;
        if (this.f23378b == 1) {
            v.setTranslationY((float) (this.f23377a + i));
        }
    }

    /* renamed from: d */
    public void mo31762d(V v) {
        if (this.f23378b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f23380d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f23378b = 1;
            mo31760b(v, this.f23377a + this.f23379c, 175, C5807el.f28630c);
        }
    }

    /* renamed from: e */
    public void mo31763e(V v) {
        if (this.f23378b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f23380d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f23378b = 2;
            mo31760b(v, 0, 225, C5807el.f28631d);
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f23377a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo31762d(v);
        } else if (i2 < 0) {
            mo31763e(v);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
