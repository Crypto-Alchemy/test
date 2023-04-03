package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.C0476a;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Barrier extends ConstraintHelper {

    /* renamed from: A */
    public int f3057A;

    /* renamed from: B */
    public int f3058B;

    /* renamed from: C */
    public C0476a f3059C;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f3059C.mo4444r1();
    }

    public int getMargin() {
        return this.f3059C.mo4446t1();
    }

    public int getType() {
        return this.f3057A;
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        this.f3059C = new C0476a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == c65.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f3059C.mo4449w1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == c65.ConstraintLayout_Layout_barrierMargin) {
                    this.f3059C.mo4451y1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3073g = this.f3059C;
        mo5062w();
    }

    /* renamed from: p */
    public void mo4599p(C0532a.C0533a aVar, wl2 wl2, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.mo4599p(aVar, wl2, layoutParams, sparseArray);
        if (wl2 instanceof C0476a) {
            C0476a aVar2 = (C0476a) wl2;
            mo5036x(aVar2, aVar.f3224e.f3280g0, ((C0486d) wl2.mo4351M()).mo4486M1());
            aVar2.mo4449w1(aVar.f3224e.f3296o0);
            aVar2.mo4451y1(aVar.f3224e.f3282h0);
        }
    }

    /* renamed from: q */
    public void mo4600q(ConstraintWidget constraintWidget, boolean z) {
        mo5036x(constraintWidget, this.f3057A, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f3059C.mo4449w1(z);
    }

    public void setDpMargin(int i) {
        C0476a aVar = this.f3059C;
        aVar.mo4451y1((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f3059C.mo4451y1(i);
    }

    public void setType(int i) {
        this.f3057A = i;
    }

    /* renamed from: x */
    public final void mo5036x(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f3058B = i;
        if (z) {
            int i2 = this.f3057A;
            if (i2 == 5) {
                this.f3058B = 1;
            } else if (i2 == 6) {
                this.f3058B = 0;
            }
        } else {
            int i3 = this.f3057A;
            if (i3 == 5) {
                this.f3058B = 0;
            } else if (i3 == 6) {
                this.f3058B = 1;
            }
        }
        if (constraintWidget instanceof C0476a) {
            ((C0476a) constraintWidget).mo4450x1(this.f3058B);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
