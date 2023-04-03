package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: x */
    public final int f24162x;

    /* renamed from: y */
    public View f24163y;

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    /* renamed from: g */
    public void mo33261g(int i) {
        mo33264h(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public View getHeaderView() {
        return this.f24163y;
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* renamed from: h */
    public void mo33264h(View view) {
        mo33268l();
        this.f24163y = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f24162x;
        addView(view, 0, layoutParams);
    }

    /* renamed from: i */
    public NavigationRailMenuView mo31848e(Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: j */
    public final boolean mo33266j() {
        View view = this.f24163y;
        if (view == null || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final int mo33267k(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* renamed from: l */
    public void mo33268l() {
        View view = this.f24163y;
        if (view != null) {
            removeView(view);
            this.f24163y = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (mo33266j()) {
            int bottom = this.f24163y.getBottom() + this.f24162x;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.mo33253l()) {
            i5 = this.f24162x;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int k = mo33267k(i);
        super.onMeasure(k, i2);
        if (mo33266j()) {
            measureChild(getNavigationRailMenuView(), k, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f24163y.getMeasuredHeight()) - this.f24162x, Integer.MIN_VALUE));
        }
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, e55.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24162x = getResources().getDimensionPixelSize(k25.mtrl_navigation_rail_margin);
        yq6 i3 = wo6.m54005i(getContext(), attributeSet, u55.NavigationRailView, i, i2, new int[0]);
        int n = i3.mo28188n(u55.NavigationRailView_headerLayout, 0);
        if (n != 0) {
            mo33261g(n);
        }
        setMenuGravity(i3.mo28185k(u55.NavigationRailView_menuGravity, 49));
        i3.mo28194w();
    }
}
