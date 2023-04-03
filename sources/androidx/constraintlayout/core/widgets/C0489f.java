package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.f */
/* compiled from: Guideline */
public class C0489f extends ConstraintWidget {

    /* renamed from: U0 */
    public float f2592U0 = -1.0f;

    /* renamed from: V0 */
    public int f2593V0 = -1;

    /* renamed from: W0 */
    public int f2594W0 = -1;

    /* renamed from: X0 */
    public boolean f2595X0 = true;

    /* renamed from: Y0 */
    public ConstraintAnchor f2596Y0 = this.f2394Q;

    /* renamed from: Z0 */
    public int f2597Z0;

    /* renamed from: a1 */
    public int f2598a1;

    /* renamed from: b1 */
    public boolean f2599b1;

    /* renamed from: androidx.constraintlayout.core.widgets.f$a */
    /* compiled from: Guideline */
    public static /* synthetic */ class C0490a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2600a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2600a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2600a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0489f.C0490a.<clinit>():void");
        }
    }

    public C0489f() {
        this.f2597Z0 = 0;
        this.f2598a1 = 0;
        this.f2405Y.clear();
        this.f2405Y.add(this.f2596Y0);
        int length = this.f2404X.length;
        for (int i = 0; i < length; i++) {
            this.f2404X[i] = this.f2596Y0;
        }
    }

    /* renamed from: g */
    public void mo4394g(C0467c cVar, boolean z) {
        boolean z2;
        C0486d dVar = (C0486d) mo4351M();
        if (dVar != null) {
            ConstraintAnchor q = dVar.mo4422q(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor q2 = dVar.mo4422q(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f2410b0;
            boolean z3 = true;
            if (constraintWidget == null || constraintWidget.f2408a0[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f2597Z0 == 0) {
                q = dVar.mo4422q(ConstraintAnchor.Type.TOP);
                q2 = dVar.mo4422q(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f2410b0;
                if (constraintWidget2 == null || constraintWidget2.f2408a0[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.f2599b1 && this.f2596Y0.mo4318n()) {
                SolverVariable q3 = cVar.mo4279q(this.f2596Y0);
                cVar.mo4268f(q3, this.f2596Y0.mo4309e());
                if (this.f2593V0 != -1) {
                    if (z2) {
                        cVar.mo4270h(cVar.mo4279q(q2), q3, 0, 5);
                    }
                } else if (this.f2594W0 != -1 && z2) {
                    SolverVariable q4 = cVar.mo4279q(q2);
                    cVar.mo4270h(q3, cVar.mo4279q(q), 0, 5);
                    cVar.mo4270h(q4, q3, 0, 5);
                }
                this.f2599b1 = false;
            } else if (this.f2593V0 != -1) {
                SolverVariable q5 = cVar.mo4279q(this.f2596Y0);
                cVar.mo4267e(q5, cVar.mo4279q(q), this.f2593V0, 8);
                if (z2) {
                    cVar.mo4270h(cVar.mo4279q(q2), q5, 0, 5);
                }
            } else if (this.f2594W0 != -1) {
                SolverVariable q6 = cVar.mo4279q(this.f2596Y0);
                SolverVariable q7 = cVar.mo4279q(q2);
                cVar.mo4267e(q6, q7, -this.f2594W0, 8);
                if (z2) {
                    cVar.mo4270h(q6, cVar.mo4279q(q), 0, 5);
                    cVar.mo4270h(q7, q6, 0, 5);
                }
            } else if (this.f2592U0 != -1.0f) {
                cVar.mo4266d(C0467c.m3376s(cVar, cVar.mo4279q(this.f2596Y0), cVar.mo4279q(q2), this.f2592U0));
            }
        }
    }

    /* renamed from: h */
    public boolean mo4397h() {
        return true;
    }

    /* renamed from: m0 */
    public boolean mo4413m0() {
        return this.f2599b1;
    }

    /* renamed from: n */
    public void mo4415n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo4415n(constraintWidget, hashMap);
        C0489f fVar = (C0489f) constraintWidget;
        this.f2592U0 = fVar.f2592U0;
        this.f2593V0 = fVar.f2593V0;
        this.f2594W0 = fVar.f2594W0;
        this.f2595X0 = fVar.f2595X0;
        mo4551x1(fVar.f2597Z0);
    }

    /* renamed from: n0 */
    public boolean mo4416n0() {
        return this.f2599b1;
    }

    /* renamed from: n1 */
    public void mo4417n1(C0467c cVar, boolean z) {
        if (mo4351M() != null) {
            int x = cVar.mo4284x(this.f2596Y0);
            if (this.f2597Z0 == 1) {
                mo4405j1(x);
                mo4408k1(0);
                mo4344I0(mo4351M().mo4441z());
                mo4399h1(0);
                return;
            }
            mo4405j1(0);
            mo4408k1(x);
            mo4399h1(mo4351M().mo4369V());
            mo4344I0(0);
        }
    }

    /* renamed from: o1 */
    public ConstraintAnchor mo4542o1() {
        return this.f2596Y0;
    }

    /* renamed from: p1 */
    public int mo4543p1() {
        return this.f2597Z0;
    }

    /* renamed from: q */
    public ConstraintAnchor mo4422q(ConstraintAnchor.Type type) {
        int i = C0490a.f2600a[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f2597Z0 == 1) {
                return this.f2596Y0;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f2597Z0 == 0) {
            return this.f2596Y0;
        } else {
            return null;
        }
    }

    /* renamed from: q1 */
    public int mo4544q1() {
        return this.f2593V0;
    }

    /* renamed from: r1 */
    public int mo4545r1() {
        return this.f2594W0;
    }

    /* renamed from: s1 */
    public float mo4546s1() {
        return this.f2592U0;
    }

    /* renamed from: t1 */
    public void mo4547t1(int i) {
        this.f2596Y0.mo4324t(i);
        this.f2599b1 = true;
    }

    /* renamed from: u1 */
    public void mo4548u1(int i) {
        if (i > -1) {
            this.f2592U0 = -1.0f;
            this.f2593V0 = i;
            this.f2594W0 = -1;
        }
    }

    /* renamed from: v1 */
    public void mo4549v1(int i) {
        if (i > -1) {
            this.f2592U0 = -1.0f;
            this.f2593V0 = -1;
            this.f2594W0 = i;
        }
    }

    /* renamed from: w1 */
    public void mo4550w1(float f) {
        if (f > -1.0f) {
            this.f2592U0 = f;
            this.f2593V0 = -1;
            this.f2594W0 = -1;
        }
    }

    /* renamed from: x1 */
    public void mo4551x1(int i) {
        if (this.f2597Z0 != i) {
            this.f2597Z0 = i;
            this.f2405Y.clear();
            if (this.f2597Z0 == 1) {
                this.f2596Y0 = this.f2392P;
            } else {
                this.f2596Y0 = this.f2394Q;
            }
            this.f2405Y.add(this.f2596Y0);
            int length = this.f2404X.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2404X[i2] = this.f2596Y0;
            }
        }
    }
}
