package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final wy3 f24688c = new wy3(75, 150);

    /* renamed from: d */
    public final wy3 f24689d = new wy3(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C4466a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f24690a;

        /* renamed from: d */
        public final /* synthetic */ View f24691d;

        public C4466a(boolean z, View view) {
            this.f24690a = z;
            this.f24691d = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24690a) {
                this.f24691d.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24690a) {
                this.f24691d.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: f */
    public AnimatorSet mo34101f(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        mo34131g(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C5968il.m45767a(animatorSet, arrayList);
        animatorSet.addListener(new C4466a(z, view2));
        return animatorSet;
    }

    /* renamed from: g */
    public final void mo34131g(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        wy3 wy3;
        ObjectAnimator objectAnimator;
        if (z) {
            wy3 = this.f24688c;
        } else {
            wy3 = this.f24689d;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(Utils.FLOAT_EPSILON);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        wy3.mo49320a(objectAnimator);
        list.add(objectAnimator);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
