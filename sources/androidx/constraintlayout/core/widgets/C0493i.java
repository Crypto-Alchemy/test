package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashSet;
import p000.a00;

/* renamed from: androidx.constraintlayout.core.widgets.i */
/* compiled from: VirtualLayout */
public class C0493i extends wl2 {

    /* renamed from: W0 */
    public int f2602W0 = 0;

    /* renamed from: X0 */
    public int f2603X0 = 0;

    /* renamed from: Y0 */
    public int f2604Y0 = 0;

    /* renamed from: Z0 */
    public int f2605Z0 = 0;

    /* renamed from: a1 */
    public int f2606a1 = 0;

    /* renamed from: b1 */
    public int f2607b1 = 0;

    /* renamed from: c1 */
    public int f2608c1 = 0;

    /* renamed from: d1 */
    public int f2609d1 = 0;

    /* renamed from: e1 */
    public boolean f2610e1 = false;

    /* renamed from: f1 */
    public int f2611f1 = 0;

    /* renamed from: g1 */
    public int f2612g1 = 0;

    /* renamed from: h1 */
    public a00.C0000a f2613h1 = new a00.C0000a();

    /* renamed from: i1 */
    public a00.C0001b f2614i1 = null;

    /* renamed from: A1 */
    public void mo4552A1(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.f2614i1 == null && mo4351M() != null) {
            this.f2614i1 = ((C0486d) mo4351M()).mo4479F1();
        }
        a00.C0000a aVar = this.f2613h1;
        aVar.f9a = dimensionBehaviour;
        aVar.f10b = dimensionBehaviour2;
        aVar.f11c = i;
        aVar.f12d = i2;
        this.f2614i1.mo9b(constraintWidget, aVar);
        constraintWidget.mo4399h1(this.f2613h1.f13e);
        constraintWidget.mo4344I0(this.f2613h1.f14f);
        constraintWidget.mo4342H0(this.f2613h1.f16h);
        constraintWidget.mo4438x0(this.f2613h1.f15g);
    }

    /* renamed from: B1 */
    public boolean mo4553B1() {
        a00.C0001b bVar;
        ConstraintWidget constraintWidget = this.f2410b0;
        if (constraintWidget != null) {
            bVar = ((C0486d) constraintWidget).mo4479F1();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f19175V0) {
                return true;
            }
            ConstraintWidget constraintWidget2 = this.f19174U0[i];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof C0489f)) {
                ConstraintWidget.DimensionBehaviour w = constraintWidget2.mo4435w(0);
                ConstraintWidget.DimensionBehaviour w2 = constraintWidget2.mo4435w(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (w != dimensionBehaviour || constraintWidget2.f2449v == 1 || w2 != dimensionBehaviour || constraintWidget2.f2451w == 1) {
                    z = false;
                }
                if (!z) {
                    if (w == dimensionBehaviour) {
                        w = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (w2 == dimensionBehaviour) {
                        w2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    a00.C0000a aVar = this.f2613h1;
                    aVar.f9a = w;
                    aVar.f10b = w2;
                    aVar.f11c = constraintWidget2.mo4369V();
                    this.f2613h1.f12d = constraintWidget2.mo4441z();
                    bVar.mo9b(constraintWidget2, this.f2613h1);
                    constraintWidget2.mo4399h1(this.f2613h1.f13e);
                    constraintWidget2.mo4344I0(this.f2613h1.f14f);
                    constraintWidget2.mo4438x0(this.f2613h1.f15g);
                }
            }
            i++;
        }
    }

    /* renamed from: C1 */
    public boolean mo4554C1() {
        return this.f2610e1;
    }

    /* renamed from: D1 */
    public void mo4555D1(boolean z) {
        this.f2610e1 = z;
    }

    /* renamed from: E1 */
    public void mo4556E1(int i, int i2) {
        this.f2611f1 = i;
        this.f2612g1 = i2;
    }

    /* renamed from: F1 */
    public void mo4557F1(int i) {
        this.f2604Y0 = i;
        this.f2602W0 = i;
        this.f2605Z0 = i;
        this.f2603X0 = i;
        this.f2606a1 = i;
        this.f2607b1 = i;
    }

    /* renamed from: G1 */
    public void mo4558G1(int i) {
        this.f2603X0 = i;
    }

    /* renamed from: H1 */
    public void mo4559H1(int i) {
        this.f2607b1 = i;
    }

    /* renamed from: I1 */
    public void mo4560I1(int i) {
        this.f2604Y0 = i;
        this.f2608c1 = i;
    }

    /* renamed from: J1 */
    public void mo4561J1(int i) {
        this.f2605Z0 = i;
        this.f2609d1 = i;
    }

    /* renamed from: K1 */
    public void mo4562K1(int i) {
        this.f2606a1 = i;
        this.f2608c1 = i;
        this.f2609d1 = i;
    }

    /* renamed from: L1 */
    public void mo4563L1(int i) {
        this.f2602W0 = i;
    }

    /* renamed from: c */
    public void mo4564c(C0486d dVar) {
        mo4566r1();
    }

    /* renamed from: q1 */
    public void mo4565q1(boolean z) {
        int i = this.f2606a1;
        if (i <= 0 && this.f2607b1 <= 0) {
            return;
        }
        if (z) {
            this.f2608c1 = this.f2607b1;
            this.f2609d1 = i;
            return;
        }
        this.f2608c1 = i;
        this.f2609d1 = this.f2607b1;
    }

    /* renamed from: r1 */
    public void mo4566r1() {
        for (int i = 0; i < this.f19175V0; i++) {
            ConstraintWidget constraintWidget = this.f19174U0[i];
            if (constraintWidget != null) {
                constraintWidget.mo4362R0(true);
            }
        }
    }

    /* renamed from: s1 */
    public boolean mo4567s1(HashSet<ConstraintWidget> hashSet) {
        for (int i = 0; i < this.f19175V0; i++) {
            if (hashSet.contains(this.f19174U0[i])) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t1 */
    public int mo4568t1() {
        return this.f2612g1;
    }

    /* renamed from: u1 */
    public int mo4569u1() {
        return this.f2611f1;
    }

    /* renamed from: v1 */
    public int mo4570v1() {
        return this.f2603X0;
    }

    /* renamed from: w1 */
    public int mo4571w1() {
        return this.f2608c1;
    }

    /* renamed from: x1 */
    public int mo4572x1() {
        return this.f2609d1;
    }

    /* renamed from: y1 */
    public int mo4573y1() {
        return this.f2602W0;
    }

    /* renamed from: z1 */
    public void mo4531z1(int i, int i2, int i3, int i4) {
    }
}
