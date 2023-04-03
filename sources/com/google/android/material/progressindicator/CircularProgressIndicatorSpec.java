package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class CircularProgressIndicatorSpec extends C5943hz {

    /* renamed from: g */
    public int f24184g;

    /* renamed from: h */
    public int f24185h;

    /* renamed from: i */
    public int f24186i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.circularProgressIndicatorStyle);
    }

    /* renamed from: e */
    public void mo33320e() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f24183M);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k25.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(k25.mtrl_progress_circular_inset_medium);
        TypedArray h = wo6.m54004h(context, attributeSet, u55.CircularProgressIndicator, i, i2, new int[0]);
        this.f24184g = Math.max(to3.m52392c(context, h, u55.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f29758a * 2);
        this.f24185h = to3.m52392c(context, h, u55.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f24186i = h.getInt(u55.CircularProgressIndicator_indicatorDirectionCircular, 0);
        h.recycle();
        mo33320e();
    }
}
