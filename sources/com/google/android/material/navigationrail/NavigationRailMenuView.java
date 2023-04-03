package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

public class NavigationRailMenuView extends NavigationBarMenuView {

    /* renamed from: v0 */
    public final FrameLayout.LayoutParams f24161v0;

    public NavigationRailMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f24161v0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public NavigationBarItemView mo31843f(Context context) {
        return new y44(context);
    }

    public int getMenuGravity() {
        return this.f24161v0.gravity;
    }

    /* renamed from: l */
    public boolean mo33253l() {
        if ((this.f24161v0.gravity & 112) == 48) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final int mo33254m(int i, int i2, int i3) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i2 / Math.max(1, i3)), 0);
    }

    /* renamed from: n */
    public final int mo33255n(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    /* renamed from: o */
    public final int mo33256o(int i, int i2, int i3, View view) {
        int i4;
        mo33254m(i, i2, i3);
        if (view == null) {
            i4 = mo33254m(i, i2, i3);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                i5 += mo33255n(childAt, i, i4);
            }
        }
        return i5;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().mo1379G().size();
        if (size2 <= 1 || !mo33128g(getLabelVisibilityMode(), size2)) {
            i3 = mo33256o(i, size, size2, (View) null);
        } else {
            i3 = mo33259p(i, size, size2);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(i3, i2, 0));
    }

    /* renamed from: p */
    public final int mo33259p(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = mo33255n(childAt, i, mo33254m(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + mo33256o(i, i2, i3, childAt);
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f24161v0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
