package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;

public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: M */
    public static final int f24183M = e55.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f24170a).f24186i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f24170a).f24185h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f24170a).f24184g;
    }

    /* renamed from: q */
    public CircularProgressIndicatorSpec mo33282i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: r */
    public final void mo33316r() {
        setIndeterminateDrawable(st2.m51904s(getContext(), (CircularProgressIndicatorSpec) this.f24170a));
        setProgressDrawable(fe1.m44282u(getContext(), (CircularProgressIndicatorSpec) this.f24170a));
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f24170a).f24186i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f24170a;
        if (((CircularProgressIndicatorSpec) s).f24185h != i) {
            ((CircularProgressIndicatorSpec) s).f24185h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f24170a;
        if (((CircularProgressIndicatorSpec) s).f24184g != max) {
            ((CircularProgressIndicatorSpec) s).f24184g = max;
            ((CircularProgressIndicatorSpec) s).mo33320e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f24170a).mo33320e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f24183M);
        mo33316r();
    }
}
