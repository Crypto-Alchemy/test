package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;

public class Layer extends ConstraintHelper {

    /* renamed from: A */
    public float f2651A = Float.NaN;

    /* renamed from: B */
    public float f2652B = Float.NaN;

    /* renamed from: C */
    public float f2653C = Float.NaN;

    /* renamed from: H */
    public ConstraintLayout f2654H;

    /* renamed from: I */
    public float f2655I = 1.0f;

    /* renamed from: L */
    public float f2656L = 1.0f;

    /* renamed from: M */
    public float f2657M = Float.NaN;

    /* renamed from: P */
    public float f2658P = Float.NaN;

    /* renamed from: Q */
    public float f2659Q = Float.NaN;

    /* renamed from: U */
    public float f2660U = Float.NaN;

    /* renamed from: b1 */
    public View[] f2661b1 = null;

    /* renamed from: e0 */
    public float f2662e0 = Float.NaN;

    /* renamed from: e1 */
    public float f2663e1 = Utils.FLOAT_EPSILON;

    /* renamed from: k0 */
    public float f2664k0 = Float.NaN;

    /* renamed from: o1 */
    public float f2665o1 = Utils.FLOAT_EPSILON;

    /* renamed from: p1 */
    public boolean f2666p1;

    /* renamed from: q1 */
    public boolean f2667q1;

    /* renamed from: v0 */
    public boolean f2668v0 = true;

    public Layer(Context context) {
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
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_Layout_android_visibility) {
                    this.f2666p1 = true;
                } else if (index == c65.ConstraintLayout_Layout_android_elevation) {
                    this.f2667q1 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2654H = (ConstraintLayout) getParent();
        if (this.f2666p1 || this.f2667q1) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f3071d; i++) {
                View i2 = this.f2654H.mo5078i(this.f3070a[i]);
                if (i2 != null) {
                    if (this.f2666p1) {
                        i2.setVisibility(visibility);
                    }
                    if (this.f2667q1 && elevation > Utils.FLOAT_EPSILON) {
                        i2.setTranslationZ(i2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo4627r(ConstraintLayout constraintLayout) {
        mo4639y();
        this.f2657M = Float.NaN;
        this.f2658P = Float.NaN;
        ConstraintWidget b = ((ConstraintLayout.LayoutParams) getLayoutParams()).mo5100b();
        b.mo4399h1(0);
        b.mo4344I0(0);
        mo4638x();
        layout(((int) this.f2662e0) - getPaddingLeft(), ((int) this.f2664k0) - getPaddingTop(), ((int) this.f2659Q) + getPaddingRight(), ((int) this.f2660U) + getPaddingBottom());
        mo4640z();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo5049h();
    }

    public void setPivotX(float f) {
        this.f2651A = f;
        mo4640z();
    }

    public void setPivotY(float f) {
        this.f2652B = f;
        mo4640z();
    }

    public void setRotation(float f) {
        this.f2653C = f;
        mo4640z();
    }

    public void setScaleX(float f) {
        this.f2655I = f;
        mo4640z();
    }

    public void setScaleY(float f) {
        this.f2656L = f;
        mo4640z();
    }

    public void setTranslationX(float f) {
        this.f2663e1 = f;
        mo4640z();
    }

    public void setTranslationY(float f) {
        this.f2665o1 = f;
        mo4640z();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo5049h();
    }

    /* renamed from: t */
    public void mo4637t(ConstraintLayout constraintLayout) {
        this.f2654H = constraintLayout;
        float rotation = getRotation();
        if (rotation != Utils.FLOAT_EPSILON) {
            this.f2653C = rotation;
        } else if (!Float.isNaN(this.f2653C)) {
            this.f2653C = rotation;
        }
    }

    /* renamed from: x */
    public void mo4638x() {
        if (this.f2654H != null) {
            if (!this.f2668v0 && !Float.isNaN(this.f2657M) && !Float.isNaN(this.f2658P)) {
                return;
            }
            if (Float.isNaN(this.f2651A) || Float.isNaN(this.f2652B)) {
                View[] n = mo5054n(this.f2654H);
                int left = n[0].getLeft();
                int top = n[0].getTop();
                int right = n[0].getRight();
                int bottom = n[0].getBottom();
                for (int i = 0; i < this.f3071d; i++) {
                    View view = n[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f2659Q = (float) right;
                this.f2660U = (float) bottom;
                this.f2662e0 = (float) left;
                this.f2664k0 = (float) top;
                if (Float.isNaN(this.f2651A)) {
                    this.f2657M = (float) ((left + right) / 2);
                } else {
                    this.f2657M = this.f2651A;
                }
                if (Float.isNaN(this.f2652B)) {
                    this.f2658P = (float) ((top + bottom) / 2);
                } else {
                    this.f2658P = this.f2652B;
                }
            } else {
                this.f2658P = this.f2652B;
                this.f2657M = this.f2651A;
            }
        }
    }

    /* renamed from: y */
    public final void mo4639y() {
        int i;
        if (this.f2654H != null && (i = this.f3071d) != 0) {
            View[] viewArr = this.f2661b1;
            if (viewArr == null || viewArr.length != i) {
                this.f2661b1 = new View[i];
            }
            for (int i2 = 0; i2 < this.f3071d; i2++) {
                this.f2661b1[i2] = this.f2654H.mo5078i(this.f3070a[i2]);
            }
        }
    }

    /* renamed from: z */
    public final void mo4640z() {
        double d;
        if (this.f2654H != null) {
            if (this.f2661b1 == null) {
                mo4639y();
            }
            mo4638x();
            if (Float.isNaN(this.f2653C)) {
                d = Utils.DOUBLE_EPSILON;
            } else {
                d = Math.toRadians((double) this.f2653C);
            }
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = this.f2655I;
            float f2 = f * cos;
            float f3 = this.f2656L;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f3071d; i++) {
                View view = this.f2661b1[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f2657M;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f2658P;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f2663e1);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f2665o1);
                view.setScaleY(this.f2656L);
                view.setScaleX(this.f2655I);
                if (!Float.isNaN(this.f2653C)) {
                    view.setRotation(this.f2653C);
                }
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
