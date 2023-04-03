package com.google.android.material.bottomnavigation;

import android.content.Context;
import com.google.android.material.navigation.NavigationBarItemView;

public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(Context context) {
        super(context);
    }

    public int getItemDefaultMarginResId() {
        return k25.design_bottom_navigation_margin;
    }

    public int getItemLayoutResId() {
        return c45.design_bottom_navigation_item;
    }
}
