package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.core.widgets.g */
/* compiled from: Optimizer */
public class C0491g {

    /* renamed from: a */
    public static boolean[] f2601a = new boolean[3];

    /* renamed from: a */
    public static void m3745a(C0486d dVar, C0467c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f2443s = -1;
        constraintWidget.f2445t = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f2408a0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f2408a0[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f2392P.f2356g;
            int V = dVar.mo4369V() - constraintWidget.f2396R.f2356g;
            ConstraintAnchor constraintAnchor = constraintWidget.f2392P;
            constraintAnchor.f2358i = cVar.mo4279q(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f2396R;
            constraintAnchor2.f2358i = cVar.mo4279q(constraintAnchor2);
            cVar.mo4268f(constraintWidget.f2392P.f2358i, i);
            cVar.mo4268f(constraintWidget.f2396R.f2358i, V);
            constraintWidget.f2443s = 2;
            constraintWidget.mo4350L0(i, V);
        }
        if (dVar.f2408a0[1] != dimensionBehaviour2 && constraintWidget.f2408a0[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.f2394Q.f2356g;
            int z = dVar.mo4441z() - constraintWidget.f2398S.f2356g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.f2394Q;
            constraintAnchor3.f2358i = cVar.mo4279q(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.f2398S;
            constraintAnchor4.f2358i = cVar.mo4279q(constraintAnchor4);
            cVar.mo4268f(constraintWidget.f2394Q.f2358i, i2);
            cVar.mo4268f(constraintWidget.f2398S.f2358i, z);
            if (constraintWidget.f2432m0 > 0 || constraintWidget.mo4367U() == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f2400T;
                constraintAnchor5.f2358i = cVar.mo4279q(constraintAnchor5);
                cVar.mo4268f(constraintWidget.f2400T.f2358i, constraintWidget.f2432m0 + i2);
            }
            constraintWidget.f2445t = 2;
            constraintWidget.mo4384c1(i2, z);
        }
    }

    /* renamed from: b */
    public static final boolean m3746b(int i, int i2) {
        return (i & i2) == i2;
    }
}
