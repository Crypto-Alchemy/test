package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f24667b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C4460a extends AnimatorListenerAdapter {
        public C4460a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f24667b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* renamed from: d */
    public boolean mo34099d(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f24667b;
        if (animatorSet != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet f = mo34101f(view, view2, z, z3);
        this.f24667b = f;
        f.addListener(new C4460a());
        this.f24667b.start();
        if (!z2) {
            this.f24667b.end();
        }
        return true;
    }

    /* renamed from: f */
    public abstract AnimatorSet mo34101f(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
