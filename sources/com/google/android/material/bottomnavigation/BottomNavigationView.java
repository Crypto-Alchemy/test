package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public interface C4203a extends NavigationBarView.C4341c {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C4204b extends NavigationBarView.C4342d {
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    public NavigationBarMenuView mo31848e(Context context) {
        return new BottomNavigationMenuView(context);
    }

    /* renamed from: g */
    public final void mo31849g(Context context) {
        View view = new View(context);
        view.setBackgroundColor(zr0.m31440c(context, w15.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(k25.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    public int getMaxItemCount() {
        return 5;
    }

    /* renamed from: h */
    public final boolean mo31851h() {
        return false;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.mo31844l() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1310i(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(C4203a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(C4204b bVar) {
        setOnItemSelectedListener(bVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, e55.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        yq6 i3 = wo6.m54005i(context2, attributeSet, u55.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(i3.mo28175a(u55.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        i3.mo28194w();
        if (mo31851h()) {
            mo31849g(context2);
        }
    }
}
