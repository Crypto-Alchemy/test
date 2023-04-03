package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;

public class Constraints extends ViewGroup {

    /* renamed from: a */
    public C0532a f3187a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    public final void mo5107c(AttributeSet attributeSet) {
    }

    public C0532a getConstraintSet() {
        if (this.f3187a == null) {
            this.f3187a = new C0532a();
        }
        this.f3187a.mo5163r(this);
        return this.f3187a;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5107c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5107c(attributeSet);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f3188A0;

        /* renamed from: B0 */
        public float f3189B0;

        /* renamed from: C0 */
        public float f3190C0;

        /* renamed from: D0 */
        public float f3191D0;

        /* renamed from: E0 */
        public float f3192E0;

        /* renamed from: F0 */
        public float f3193F0;

        /* renamed from: G0 */
        public float f3194G0;

        /* renamed from: H0 */
        public float f3195H0;

        /* renamed from: I0 */
        public float f3196I0;

        /* renamed from: w0 */
        public float f3197w0;

        /* renamed from: x0 */
        public boolean f3198x0;

        /* renamed from: y0 */
        public float f3199y0;

        /* renamed from: z0 */
        public float f3200z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f3197w0 = 1.0f;
            this.f3198x0 = false;
            this.f3199y0 = Utils.FLOAT_EPSILON;
            this.f3200z0 = Utils.FLOAT_EPSILON;
            this.f3188A0 = Utils.FLOAT_EPSILON;
            this.f3189B0 = Utils.FLOAT_EPSILON;
            this.f3190C0 = 1.0f;
            this.f3191D0 = 1.0f;
            this.f3192E0 = Utils.FLOAT_EPSILON;
            this.f3193F0 = Utils.FLOAT_EPSILON;
            this.f3194G0 = Utils.FLOAT_EPSILON;
            this.f3195H0 = Utils.FLOAT_EPSILON;
            this.f3196I0 = Utils.FLOAT_EPSILON;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3197w0 = 1.0f;
            this.f3198x0 = false;
            this.f3199y0 = Utils.FLOAT_EPSILON;
            this.f3200z0 = Utils.FLOAT_EPSILON;
            this.f3188A0 = Utils.FLOAT_EPSILON;
            this.f3189B0 = Utils.FLOAT_EPSILON;
            this.f3190C0 = 1.0f;
            this.f3191D0 = 1.0f;
            this.f3192E0 = Utils.FLOAT_EPSILON;
            this.f3193F0 = Utils.FLOAT_EPSILON;
            this.f3194G0 = Utils.FLOAT_EPSILON;
            this.f3195H0 = Utils.FLOAT_EPSILON;
            this.f3196I0 = Utils.FLOAT_EPSILON;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintSet_android_alpha) {
                    this.f3197w0 = obtainStyledAttributes.getFloat(index, this.f3197w0);
                } else if (index == c65.ConstraintSet_android_elevation) {
                    this.f3199y0 = obtainStyledAttributes.getFloat(index, this.f3199y0);
                    this.f3198x0 = true;
                } else if (index == c65.ConstraintSet_android_rotationX) {
                    this.f3188A0 = obtainStyledAttributes.getFloat(index, this.f3188A0);
                } else if (index == c65.ConstraintSet_android_rotationY) {
                    this.f3189B0 = obtainStyledAttributes.getFloat(index, this.f3189B0);
                } else if (index == c65.ConstraintSet_android_rotation) {
                    this.f3200z0 = obtainStyledAttributes.getFloat(index, this.f3200z0);
                } else if (index == c65.ConstraintSet_android_scaleX) {
                    this.f3190C0 = obtainStyledAttributes.getFloat(index, this.f3190C0);
                } else if (index == c65.ConstraintSet_android_scaleY) {
                    this.f3191D0 = obtainStyledAttributes.getFloat(index, this.f3191D0);
                } else if (index == c65.ConstraintSet_android_transformPivotX) {
                    this.f3192E0 = obtainStyledAttributes.getFloat(index, this.f3192E0);
                } else if (index == c65.ConstraintSet_android_transformPivotY) {
                    this.f3193F0 = obtainStyledAttributes.getFloat(index, this.f3193F0);
                } else if (index == c65.ConstraintSet_android_translationX) {
                    this.f3194G0 = obtainStyledAttributes.getFloat(index, this.f3194G0);
                } else if (index == c65.ConstraintSet_android_translationY) {
                    this.f3195H0 = obtainStyledAttributes.getFloat(index, this.f3195H0);
                } else if (index == c65.ConstraintSet_android_translationZ) {
                    this.f3196I0 = obtainStyledAttributes.getFloat(index, this.f3196I0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
