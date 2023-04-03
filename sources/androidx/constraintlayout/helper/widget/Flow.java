package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0487e;
import androidx.constraintlayout.core.widgets.C0493i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;

public class Flow extends VirtualLayout {

    /* renamed from: C */
    public C0487e f2650C;

    public Flow(Context context) {
        super(context);
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        this.f2650C = new C0487e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_Layout_android_orientation) {
                    this.f2650C.mo4506A2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_padding) {
                    this.f2650C.mo4557F1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_paddingStart) {
                    this.f2650C.mo4562K1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f2650C.mo4559H1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f2650C.mo4560I1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_paddingTop) {
                    this.f2650C.mo4563L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_paddingRight) {
                    this.f2650C.mo4561J1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f2650C.mo4558G1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f2650C.mo4511F2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f2650C.mo4526u2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f2650C.mo4510E2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f2650C.mo4520o2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f2650C.mo4528w2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f2650C.mo4522q2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f2650C.mo4530y2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f2650C.mo4524s2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c65.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f2650C.mo4519n2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c65.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f2650C.mo4527v2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c65.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f2650C.mo4521p2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c65.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f2650C.mo4529x2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c65.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f2650C.mo4508C2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == c65.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f2650C.mo4523r2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == c65.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f2650C.mo4507B2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == c65.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f2650C.mo4525t2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f2650C.mo4509D2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f2650C.mo4532z2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3073g = this.f2650C;
        mo5062w();
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo4625x(this.f2650C, i, i2);
    }

    /* renamed from: p */
    public void mo4599p(C0532a.C0533a aVar, wl2 wl2, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.mo4599p(aVar, wl2, layoutParams, sparseArray);
        if (wl2 instanceof C0487e) {
            C0487e eVar = (C0487e) wl2;
            int i = layoutParams.f3127Y;
            if (i != -1) {
                eVar.mo4506A2(i);
            }
        }
    }

    /* renamed from: q */
    public void mo4600q(ConstraintWidget constraintWidget, boolean z) {
        this.f2650C.mo4565q1(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.f2650C.mo4519n2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f2650C.mo4520o2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f2650C.mo4521p2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f2650C.mo4522q2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f2650C.mo4523r2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f2650C.mo4524s2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f2650C.mo4525t2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f2650C.mo4526u2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f2650C.mo4527v2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f2650C.mo4528w2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f2650C.mo4529x2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f2650C.mo4530y2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f2650C.mo4532z2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f2650C.mo4506A2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f2650C.mo4557F1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f2650C.mo4558G1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f2650C.mo4560I1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f2650C.mo4561J1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f2650C.mo4563L1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f2650C.mo4507B2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f2650C.mo4508C2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f2650C.mo4509D2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f2650C.mo4510E2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f2650C.mo4511F2(i);
        requestLayout();
    }

    /* renamed from: x */
    public void mo4625x(C0493i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar != null) {
            iVar.mo4531z1(mode, size, mode2, size2);
            setMeasuredDimension(iVar.mo4569u1(), iVar.mo4568t1());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
