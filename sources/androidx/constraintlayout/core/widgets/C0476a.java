package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.a */
/* compiled from: Barrier */
public class C0476a extends wl2 {

    /* renamed from: W0 */
    public int f2462W0 = 0;

    /* renamed from: X0 */
    public boolean f2463X0 = true;

    /* renamed from: Y0 */
    public int f2464Y0 = 0;

    /* renamed from: Z0 */
    public boolean f2465Z0 = false;

    /* renamed from: g */
    public void mo4394g(C0467c cVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        ConstraintAnchor[] constraintAnchorArr2 = this.f2404X;
        constraintAnchorArr2[0] = this.f2392P;
        constraintAnchorArr2[2] = this.f2394Q;
        constraintAnchorArr2[1] = this.f2396R;
        constraintAnchorArr2[3] = this.f2398S;
        int i5 = 0;
        while (true) {
            constraintAnchorArr = this.f2404X;
            if (i5 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i5];
            constraintAnchor.f2358i = cVar.mo4279q(constraintAnchor);
            i5++;
        }
        int i6 = this.f2462W0;
        if (i6 >= 0 && i6 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i6];
            if (!this.f2465Z0) {
                mo4443q1();
            }
            if (this.f2465Z0) {
                this.f2465Z0 = false;
                int i7 = this.f2462W0;
                if (i7 == 0 || i7 == 1) {
                    cVar.mo4268f(this.f2392P.f2358i, this.f2420g0);
                    cVar.mo4268f(this.f2396R.f2358i, this.f2420g0);
                } else if (i7 == 2 || i7 == 3) {
                    cVar.mo4268f(this.f2394Q.f2358i, this.f2422h0);
                    cVar.mo4268f(this.f2398S.f2358i, this.f2422h0);
                }
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.f19175V0) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.f19174U0[i8];
                    if ((this.f2463X0 || constraintWidget.mo4397h()) && ((((i3 = this.f2462W0) == 0 || i3 == 1) && constraintWidget.mo4331C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2392P.f2355f != null && constraintWidget.f2396R.f2355f != null) || (((i4 = this.f2462W0) == 2 || i4 == 3) && constraintWidget.mo4363S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2394Q.f2355f != null && constraintWidget.f2398S.f2355f != null))) {
                        z2 = true;
                    } else {
                        i8++;
                    }
                }
                z2 = true;
                if (this.f2392P.mo4316l() || this.f2396R.mo4316l()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f2394Q.mo4316l() || this.f2398S.mo4316l()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2 || (((i2 = this.f2462W0) != 0 || !z3) && ((i2 != 2 || !z4) && ((i2 != 1 || !z3) && (i2 != 3 || !z4))))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                int i9 = 5;
                if (!z5) {
                    i9 = 4;
                }
                for (int i10 = 0; i10 < this.f19175V0; i10++) {
                    ConstraintWidget constraintWidget2 = this.f19174U0[i10];
                    if (this.f2463X0 || constraintWidget2.mo4397h()) {
                        SolverVariable q = cVar.mo4279q(constraintWidget2.f2404X[this.f2462W0]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f2404X;
                        int i11 = this.f2462W0;
                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i11];
                        constraintAnchor3.f2358i = q;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2355f;
                        if (constraintAnchor4 == null || constraintAnchor4.f2353d != this) {
                            i = 0;
                        } else {
                            i = constraintAnchor3.f2356g + 0;
                        }
                        if (i11 == 0 || i11 == 2) {
                            cVar.mo4271i(constraintAnchor2.f2358i, q, this.f2464Y0 - i, z2);
                        } else {
                            cVar.mo4269g(constraintAnchor2.f2358i, q, this.f2464Y0 + i, z2);
                        }
                        cVar.mo4267e(constraintAnchor2.f2358i, q, this.f2464Y0 + i, i9);
                    }
                }
                int i12 = this.f2462W0;
                if (i12 == 0) {
                    cVar.mo4267e(this.f2396R.f2358i, this.f2392P.f2358i, 0, 8);
                    cVar.mo4267e(this.f2392P.f2358i, this.f2410b0.f2396R.f2358i, 0, 4);
                    cVar.mo4267e(this.f2392P.f2358i, this.f2410b0.f2392P.f2358i, 0, 0);
                } else if (i12 == 1) {
                    cVar.mo4267e(this.f2392P.f2358i, this.f2396R.f2358i, 0, 8);
                    cVar.mo4267e(this.f2392P.f2358i, this.f2410b0.f2392P.f2358i, 0, 4);
                    cVar.mo4267e(this.f2392P.f2358i, this.f2410b0.f2396R.f2358i, 0, 0);
                } else if (i12 == 2) {
                    cVar.mo4267e(this.f2398S.f2358i, this.f2394Q.f2358i, 0, 8);
                    cVar.mo4267e(this.f2394Q.f2358i, this.f2410b0.f2398S.f2358i, 0, 4);
                    cVar.mo4267e(this.f2394Q.f2358i, this.f2410b0.f2394Q.f2358i, 0, 0);
                } else if (i12 == 3) {
                    cVar.mo4267e(this.f2394Q.f2358i, this.f2398S.f2358i, 0, 8);
                    cVar.mo4267e(this.f2394Q.f2358i, this.f2410b0.f2394Q.f2358i, 0, 4);
                    cVar.mo4267e(this.f2394Q.f2358i, this.f2410b0.f2398S.f2358i, 0, 0);
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo4397h() {
        return true;
    }

    /* renamed from: m0 */
    public boolean mo4413m0() {
        return this.f2465Z0;
    }

    /* renamed from: n */
    public void mo4415n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo4415n(constraintWidget, hashMap);
        C0476a aVar = (C0476a) constraintWidget;
        this.f2462W0 = aVar.f2462W0;
        this.f2463X0 = aVar.f2463X0;
        this.f2464Y0 = aVar.f2464Y0;
    }

    /* renamed from: n0 */
    public boolean mo4416n0() {
        return this.f2465Z0;
    }

    /* renamed from: q1 */
    public boolean mo4443q1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f19175V0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f19174U0[i4];
            if ((this.f2463X0 || constraintWidget.mo4397h()) && ((((i2 = this.f2462W0) == 0 || i2 == 1) && !constraintWidget.mo4413m0()) || (((i3 = this.f2462W0) == 2 || i3 == 3) && !constraintWidget.mo4416n0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f19175V0; i6++) {
            ConstraintWidget constraintWidget2 = this.f19174U0[i6];
            if (this.f2463X0 || constraintWidget2.mo4397h()) {
                if (!z2) {
                    int i7 = this.f2462W0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.mo4422q(ConstraintAnchor.Type.LEFT).mo4309e();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.mo4422q(ConstraintAnchor.Type.RIGHT).mo4309e();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.mo4422q(ConstraintAnchor.Type.TOP).mo4309e();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.mo4422q(ConstraintAnchor.Type.BOTTOM).mo4309e();
                    }
                    z2 = true;
                }
                int i8 = this.f2462W0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.mo4422q(ConstraintAnchor.Type.LEFT).mo4309e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.mo4422q(ConstraintAnchor.Type.RIGHT).mo4309e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.mo4422q(ConstraintAnchor.Type.TOP).mo4309e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.mo4422q(ConstraintAnchor.Type.BOTTOM).mo4309e());
                }
            }
        }
        int i9 = i5 + this.f2464Y0;
        int i10 = this.f2462W0;
        if (i10 == 0 || i10 == 1) {
            mo4332C0(i9, i9);
        } else {
            mo4338F0(i9, i9);
        }
        this.f2465Z0 = true;
        return true;
    }

    /* renamed from: r1 */
    public boolean mo4444r1() {
        return this.f2463X0;
    }

    /* renamed from: s1 */
    public int mo4445s1() {
        return this.f2462W0;
    }

    /* renamed from: t1 */
    public int mo4446t1() {
        return this.f2464Y0;
    }

    public String toString() {
        String str = "[Barrier] " + mo4433v() + " {";
        for (int i = 0; i < this.f19175V0; i++) {
            ConstraintWidget constraintWidget = this.f19174U0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.mo4433v();
        }
        return str + "}";
    }

    /* renamed from: u1 */
    public int mo4447u1() {
        int i = this.f2462W0;
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        return -1;
    }

    /* renamed from: v1 */
    public void mo4448v1() {
        for (int i = 0; i < this.f19175V0; i++) {
            ConstraintWidget constraintWidget = this.f19174U0[i];
            if (this.f2463X0 || constraintWidget.mo4397h()) {
                int i2 = this.f2462W0;
                if (i2 == 0 || i2 == 1) {
                    constraintWidget.mo4358P0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    constraintWidget.mo4358P0(1, true);
                }
            }
        }
    }

    /* renamed from: w1 */
    public void mo4449w1(boolean z) {
        this.f2463X0 = z;
    }

    /* renamed from: x1 */
    public void mo4450x1(int i) {
        this.f2462W0 = i;
    }

    /* renamed from: y1 */
    public void mo4451y1(int i) {
        this.f2464Y0 = i;
    }
}
