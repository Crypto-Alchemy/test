package p000;

import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: wl2 */
/* compiled from: HelperWidget */
public class wl2 extends ConstraintWidget implements vl2 {

    /* renamed from: U0 */
    public ConstraintWidget[] f19174U0 = new ConstraintWidget[4];

    /* renamed from: V0 */
    public int f19175V0 = 0;

    /* renamed from: a */
    public void mo27209a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.f19175V0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f19174U0;
            if (i > constraintWidgetArr.length) {
                this.f19174U0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f19174U0;
            int i2 = this.f19175V0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.f19175V0 = i2 + 1;
        }
    }

    /* renamed from: b */
    public void mo27210b() {
        this.f19175V0 = 0;
        Arrays.fill(this.f19174U0, (Object) null);
    }

    /* renamed from: c */
    public void mo4564c(C0486d dVar) {
    }

    /* renamed from: n */
    public void mo4415n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo4415n(constraintWidget, hashMap);
        wl2 wl2 = (wl2) constraintWidget;
        this.f19175V0 = 0;
        int i = wl2.f19175V0;
        for (int i2 = 0; i2 < i; i2++) {
            mo27209a(hashMap.get(wl2.f19174U0[i2]));
        }
    }

    /* renamed from: o1 */
    public void mo27553o1(ArrayList<xk7> arrayList, int i, xk7 xk7) {
        for (int i2 = 0; i2 < this.f19175V0; i2++) {
            xk7.mo27776a(this.f19174U0[i2]);
        }
        for (int i3 = 0; i3 < this.f19175V0; i3++) {
            vj2.m28825a(this.f19174U0[i3], i, arrayList, xk7);
        }
    }

    /* renamed from: p1 */
    public int mo27554p1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.f19175V0; i4++) {
            ConstraintWidget constraintWidget = this.f19174U0[i4];
            if (i == 0 && (i3 = constraintWidget.f2397R0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = constraintWidget.f2399S0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
