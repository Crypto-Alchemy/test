package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    /* renamed from: j */
    public void mo4626j(ConstraintLayout constraintLayout) {
        mo5050i(constraintLayout);
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        this.f3074k = false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo5049h();
    }

    /* renamed from: r */
    public void mo4627r(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3170u0.mo4399h1(0);
        layoutParams.f3170u0.mo4344I0(0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo5049h();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo5049h();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
