package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;

public class GenericDraweeView extends DraweeView<gf2> {
    public GenericDraweeView(Context context) {
        super(context);
        mo13297g(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public void mo13297g(Context context, AttributeSet attributeSet) {
        if (lc2.m21369d()) {
            lc2.m21366a("GenericDraweeView#inflateHierarchy");
        }
        hf2 d = if2.m19585d(context, attributeSet);
        setAspectRatio(d.mo21136f());
        setHierarchy(d.mo21131a());
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo13297g(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo13297g(context, attributeSet);
    }
}
