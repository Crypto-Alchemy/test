package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f24349a;

    /* renamed from: d */
    public final Drawable f24350d;

    /* renamed from: e */
    public final int f24351e;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yq6 u = yq6.m30732u(context, attributeSet, u55.TabItem);
        this.f24349a = u.mo28190p(u55.TabItem_android_text);
        this.f24350d = u.mo28181g(u55.TabItem_android_icon);
        this.f24351e = u.mo28188n(u55.TabItem_android_layout, 0);
        u.mo28194w();
    }
}
