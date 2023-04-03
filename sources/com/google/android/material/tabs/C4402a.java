package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.a */
/* compiled from: TabIndicatorInterpolator */
public class C4402a {
    /* renamed from: a */
    public static RectF m36086a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.mo33672x() || !(view instanceof TabLayout.TabView)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m36087b((TabLayout.TabView) view, 24);
    }

    /* renamed from: b */
    public static RectF m36087b(TabLayout.TabView tabView, int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int c = (int) pe7.m49897c(tabView.getContext(), i);
        if (contentWidth < c) {
            contentWidth = c;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* renamed from: c */
    public void mo33740c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m36086a(tabLayout, view);
        RectF a2 = m36086a(tabLayout, view2);
        drawable.setBounds(C5807el.m43988c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C5807el.m43988c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }

    /* renamed from: d */
    public void mo33741d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = m36086a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }
}
