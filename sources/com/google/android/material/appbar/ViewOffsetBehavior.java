package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int tempLeftRightOffset = 0;
    private int tempTopBottomOffset = 0;
    private jd7 viewOffsetHelper;

    public ViewOffsetBehavior() {
    }

    public int getLeftAndRightOffset() {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 != null) {
            return jd7.mo44421c();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 != null) {
            return jd7.mo44422d();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 == null || !jd7.mo44423e()) {
            return false;
        }
        return true;
    }

    public boolean isVerticalOffsetEnabled() {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 == null || !jd7.mo44424f()) {
            return false;
        }
        return true;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new jd7(v);
        }
        this.viewOffsetHelper.mo44425g();
        this.viewOffsetHelper.mo44419a();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.mo44428j(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 == 0) {
            return true;
        }
        this.viewOffsetHelper.mo44427i(i3);
        this.tempLeftRightOffset = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 != null) {
            jd7.mo44426h(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 != null) {
            return jd7.mo44427i(i);
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 != null) {
            return jd7.mo44428j(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        jd7 jd7 = this.viewOffsetHelper;
        if (jd7 != null) {
            jd7.mo44429k(z);
        }
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
