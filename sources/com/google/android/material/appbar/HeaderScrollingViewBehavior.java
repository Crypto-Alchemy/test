package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    public final Rect tempRect1 = new Rect();
    public final Rect tempRect2 = new Rect();
    private int verticalLayoutGap = 0;

    public HeaderScrollingViewBehavior() {
    }

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return ep3.m16274b((int) (overlapRatioForOffset * ((float) i)), 0, i);
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency != null) {
            CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, findFirstDependency.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            hl7 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ga7.m17802y(coordinatorLayout) && !ga7.m17802y(view)) {
                rect.left += lastWindowInsets.mo21238k();
                rect.right -= lastWindowInsets.mo21239l();
            }
            Rect rect2 = this.tempRect2;
            pj2.m24970a(resolveGravity(eVar.f3351c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.verticalLayoutGap = 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View findFirstDependency;
        int i5;
        hl7 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ga7.m17802y(findFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo21240m() + lastWindowInsets.mo21237j();
        }
        int scrollRange = size + getScrollRange(findFirstDependency);
        int measuredHeight = findFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            scrollRange -= measuredHeight;
        }
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5), i4);
        return true;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
