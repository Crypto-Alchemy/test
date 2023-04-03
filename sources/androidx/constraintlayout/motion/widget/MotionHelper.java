package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

public class MotionHelper extends ConstraintHelper implements MotionLayout.C0506j {

    /* renamed from: A */
    public boolean f2678A = false;

    /* renamed from: B */
    public boolean f2679B = false;

    /* renamed from: C */
    public float f2680C;

    /* renamed from: H */
    public View[] f2681H;

    public MotionHelper(Context context) {
        super(context);
    }

    /* renamed from: A */
    public void mo4645A(MotionLayout motionLayout) {
    }

    /* renamed from: B */
    public void mo4646B(Canvas canvas) {
    }

    /* renamed from: C */
    public void mo4647C(Canvas canvas) {
    }

    /* renamed from: D */
    public void mo4641D(MotionLayout motionLayout, HashMap<View, jy3> hashMap) {
    }

    /* renamed from: a */
    public void mo4579a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo4580b(MotionLayout motionLayout, int i) {
    }

    /* renamed from: c */
    public void mo4648c(MotionLayout motionLayout, int i, int i2) {
    }

    /* renamed from: d */
    public void mo4649d(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public float getProgress() {
        return this.f2680C;
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.MotionHelper_onShow) {
                    this.f2678A = obtainStyledAttributes.getBoolean(index, this.f2678A);
                } else if (index == c65.MotionHelper_onHide) {
                    this.f2679B = obtainStyledAttributes.getBoolean(index, this.f2679B);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f2680C = f;
        int i = 0;
        if (this.f3071d > 0) {
            this.f2681H = mo5054n((ConstraintLayout) getParent());
            while (i < this.f3071d) {
                setProgress(this.f2681H[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public void setProgress(View view, float f) {
    }

    /* renamed from: x */
    public boolean mo4643x() {
        return false;
    }

    /* renamed from: y */
    public boolean mo4653y() {
        return this.f2679B;
    }

    /* renamed from: z */
    public boolean mo4654z() {
        return this.f2678A;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4593o(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4593o(attributeSet);
    }
}
