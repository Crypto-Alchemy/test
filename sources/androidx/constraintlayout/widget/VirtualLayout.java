package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C0493i;
import com.github.mikephil.charting.utils.Utils;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: A */
    public boolean f3208A;

    /* renamed from: B */
    public boolean f3209B;

    public VirtualLayout(Context context) {
        super(context);
    }

    /* renamed from: j */
    public void mo4626j(ConstraintLayout constraintLayout) {
        mo5050i(constraintLayout);
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_Layout_android_visibility) {
                    this.f3208A = true;
                } else if (index == c65.ConstraintLayout_Layout_android_elevation) {
                    this.f3209B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3208A || this.f3209B) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f3071d; i++) {
                    View i2 = constraintLayout.mo5078i(this.f3070a[i]);
                    if (i2 != null) {
                        if (this.f3208A) {
                            i2.setVisibility(visibility);
                        }
                        if (this.f3209B && elevation > Utils.FLOAT_EPSILON) {
                            i2.setTranslationZ(i2.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo5049h();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo5049h();
    }

    /* renamed from: x */
    public void mo4625x(C0493i iVar, int i, int i2) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
