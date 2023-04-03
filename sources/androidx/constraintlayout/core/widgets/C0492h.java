package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* renamed from: androidx.constraintlayout.core.widgets.h */
/* compiled from: Placeholder */
public class C0492h extends C0493i {
    /* renamed from: g */
    public void mo4394g(C0467c cVar, boolean z) {
        super.mo4394g(cVar, z);
        if (this.f19175V0 > 0) {
            ConstraintWidget constraintWidget = this.f19174U0[0];
            constraintWidget.mo4429t0();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.mo4403j(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.mo4403j(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.mo4403j(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.mo4403j(type4, this, type4);
        }
    }

    /* renamed from: z1 */
    public void mo4531z1(int i, int i2, int i3, int i4) {
        boolean z = false;
        int w1 = mo4571w1() + mo4572x1() + 0;
        int y1 = mo4573y1() + mo4570v1() + 0;
        if (this.f19175V0 > 0) {
            w1 += this.f19174U0[0].mo4369V();
            y1 += this.f19174U0[0].mo4441z();
        }
        int max = Math.max(mo4347K(), w1);
        int max2 = Math.max(mo4345J(), y1);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else if (i == 0) {
                i2 = max;
            } else {
                i2 = 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else if (i3 == 0) {
                i4 = max2;
            } else {
                i4 = 0;
            }
        }
        mo4556E1(i2, i4);
        mo4399h1(i2);
        mo4344I0(i4);
        if (this.f19175V0 > 0) {
            z = true;
        }
        mo4555D1(z);
    }
}
