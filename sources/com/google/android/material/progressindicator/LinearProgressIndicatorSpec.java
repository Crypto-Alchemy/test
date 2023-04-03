package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class LinearProgressIndicatorSpec extends C5943hz {

    /* renamed from: g */
    public int f24188g;

    /* renamed from: h */
    public int f24189h;

    /* renamed from: i */
    public boolean f24190i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.linearProgressIndicatorStyle);
    }

    /* renamed from: e */
    public void mo33320e() {
        if (this.f24188g != 0) {
            return;
        }
        if (this.f29759b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f29760c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f24187M);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        boolean z = false;
        TypedArray h = wo6.m54004h(context, attributeSet, u55.LinearProgressIndicator, j15.linearProgressIndicatorStyle, LinearProgressIndicator.f24187M, new int[0]);
        this.f24188g = h.getInt(u55.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f24189h = h.getInt(u55.LinearProgressIndicator_indicatorDirectionLinear, 0);
        h.recycle();
        mo33320e();
        this.f24190i = this.f24189h == 1 ? true : z;
    }
}
