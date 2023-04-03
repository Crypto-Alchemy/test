package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f24662a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C4459a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f24663a;

        /* renamed from: d */
        public final /* synthetic */ int f24664d;

        /* renamed from: e */
        public final /* synthetic */ fx1 f24665e;

        public C4459a(View view, int i, fx1 fx1) {
            this.f24663a = view;
            this.f24664d = i;
            this.f24665e = fx1;
        }

        public boolean onPreDraw() {
            this.f24663a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f24662a == this.f24664d) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                fx1 fx1 = this.f24665e;
                expandableBehavior.mo34099d((View) fx1, this.f24663a, fx1.mo32716a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: b */
    public final boolean mo34097b(boolean z) {
        if (z) {
            int i = this.f24662a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f24662a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public fx1 mo34098c(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (fx1) view2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public abstract boolean mo34099d(View view, View view2, boolean z, boolean z2);

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        fx1 fx1 = (fx1) view2;
        if (!mo34097b(fx1.mo32716a())) {
            return false;
        }
        if (fx1.mo32716a()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f24662a = i;
        return mo34099d((View) fx1, view, fx1.mo32716a(), true);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        fx1 c;
        int i2;
        if (ga7.m17747T(view) || (c = mo34098c(coordinatorLayout, view)) == null || !mo34097b(c.mo32716a())) {
            return false;
        }
        if (c.mo32716a()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f24662a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C4459a(view, i2, c));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
