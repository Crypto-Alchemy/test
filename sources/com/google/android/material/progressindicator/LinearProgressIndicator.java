package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;

public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: M */
    public static final int f24187M = e55.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f24170a).f24188g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f24170a).f24189h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f24170a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (!(((LinearProgressIndicatorSpec) s).f24189h == 1 || ((ga7.m17715B(this) == 1 && ((LinearProgressIndicatorSpec) this.f24170a).f24189h == 2) || (ga7.m17715B(this) == 0 && ((LinearProgressIndicatorSpec) this.f24170a).f24189h == 3)))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f24190i = z2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        st2 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        fe1 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* renamed from: q */
    public LinearProgressIndicatorSpec mo33282i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: r */
    public final void mo33326r() {
        setIndeterminateDrawable(st2.m51905t(getContext(), (LinearProgressIndicatorSpec) this.f24170a));
        setProgressDrawable(fe1.m44283v(getContext(), (LinearProgressIndicatorSpec) this.f24170a));
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f24170a).f24188g != i) {
            if (!mo33296p() || !isIndeterminate()) {
                S s = this.f24170a;
                ((LinearProgressIndicatorSpec) s).f24188g = i;
                ((LinearProgressIndicatorSpec) s).mo33320e();
                if (i == 0) {
                    getIndeterminateDrawable().mo47865w(new mh3((LinearProgressIndicatorSpec) this.f24170a));
                } else {
                    getIndeterminateDrawable().mo47865w(new nh3(getContext(), (LinearProgressIndicatorSpec) this.f24170a));
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f24170a).mo33320e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f24170a;
        ((LinearProgressIndicatorSpec) s).f24189h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (!(i == 1 || ((ga7.m17715B(this) == 1 && ((LinearProgressIndicatorSpec) this.f24170a).f24189h == 2) || (ga7.m17715B(this) == 0 && i == 3)))) {
            z = false;
        }
        linearProgressIndicatorSpec.f24190i = z;
        invalidate();
    }

    public void setProgressCompat(int i, boolean z) {
        S s = this.f24170a;
        if (s == null || ((LinearProgressIndicatorSpec) s).f24188g != 0 || !isIndeterminate()) {
            super.setProgressCompat(i, z);
        }
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f24170a).mo33320e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f24187M);
        mo33326r();
    }
}
