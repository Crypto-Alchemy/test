package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0539b;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ReactiveGuide extends View implements C0539b.C0540a {

    /* renamed from: a */
    public int f3204a = -1;

    /* renamed from: d */
    public boolean f3205d = false;

    /* renamed from: e */
    public int f3206e = 0;

    /* renamed from: g */
    public boolean f3207g = true;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        mo5129a((AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo5129a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f3204a = obtainStyledAttributes.getResourceId(index, this.f3204a);
                } else if (index == c65.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f3205d = obtainStyledAttributes.getBoolean(index, this.f3205d);
                } else if (index == c65.f8348x2694048c) {
                    this.f3206e = obtainStyledAttributes.getResourceId(index, this.f3206e);
                } else if (index == c65.f8347xfdeff96) {
                    this.f3207g = obtainStyledAttributes.getBoolean(index, this.f3207g);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f3204a != -1) {
            ConstraintLayout.getSharedValues().mo5192a(this.f3204a, this);
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f3206e;
    }

    public int getAttributeId() {
        return this.f3204a;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f3205d = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f3206e = i;
    }

    public void setAttributeId(int i) {
        C0539b sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f3204a;
        if (i2 != -1) {
            sharedValues.mo5193b(i2, this);
        }
        this.f3204a = i;
        if (i != -1) {
            sharedValues.mo5192a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3129a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3131b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3133c = f;
        setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        mo5129a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        mo5129a(attributeSet);
    }
}
