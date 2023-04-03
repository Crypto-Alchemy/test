package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.C0492h;
import androidx.constraintlayout.core.widgets.C0493i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.VirtualLayout;

public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: C */
    public C0492h f2677C;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    /* renamed from: o */
    public void mo4593o(AttributeSet attributeSet) {
        super.mo4593o(attributeSet);
        this.f3073g = new C0492h();
        mo5062w();
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo4625x(this.f2677C, i, i2);
    }

    /* renamed from: u */
    public void mo4644u(C0486d dVar, vl2 vl2, SparseArray<ConstraintWidget> sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
