package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.d */
/* compiled from: VerticalWidgetRun */
public class C0482d extends WidgetRun {

    /* renamed from: k */
    public DependencyNode f2494k;

    /* renamed from: l */
    public C0478a f2495l = null;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.d$a */
    /* compiled from: VerticalWidgetRun */
    public static /* synthetic */ class C0483a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2496a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2496a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2496a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2496a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0482d.C0483a.<clinit>():void");
        }
    }

    public C0482d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f2494k = dependencyNode;
        this.f2486h.f2470e = DependencyNode.Type.TOP;
        this.f2487i.f2470e = DependencyNode.Type.BOTTOM;
        dependencyNode.f2470e = DependencyNode.Type.BASELINE;
        this.f2484f = 1;
    }

    /* renamed from: a */
    public void mo141a(jc1 jc1) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C0483a.f2496a[this.f2488j.ordinal()];
        if (i2 == 1) {
            mo4465p(jc1);
        } else if (i2 == 2) {
            mo4464o(jc1);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget = this.f2480b;
            mo4463n(jc1, constraintWidget.f2394Q, constraintWidget.f2398S, 1);
            return;
        }
        C0478a aVar = this.f2483e;
        if (aVar.f2468c && !aVar.f2475j && this.f2482d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f2480b;
            int i3 = constraintWidget2.f2451w;
            if (i3 == 2) {
                ConstraintWidget M = constraintWidget2.mo4351M();
                if (M != null) {
                    C0478a aVar2 = M.f2417f.f2483e;
                    if (aVar2.f2475j) {
                        this.f2483e.mo4454d((int) ((((float) aVar2.f2472g) * this.f2480b.f2368D) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget2.f2415e.f2483e.f2475j) {
                int y = constraintWidget2.mo4439y();
                if (y == -1) {
                    ConstraintWidget constraintWidget3 = this.f2480b;
                    f3 = (float) constraintWidget3.f2415e.f2483e.f2472g;
                    f2 = constraintWidget3.mo4437x();
                } else if (y == 0) {
                    ConstraintWidget constraintWidget4 = this.f2480b;
                    f = ((float) constraintWidget4.f2415e.f2483e.f2472g) * constraintWidget4.mo4437x();
                    i = (int) (f + 0.5f);
                    this.f2483e.mo4454d(i);
                } else if (y != 1) {
                    i = 0;
                    this.f2483e.mo4454d(i);
                } else {
                    ConstraintWidget constraintWidget5 = this.f2480b;
                    f3 = (float) constraintWidget5.f2415e.f2483e.f2472g;
                    f2 = constraintWidget5.mo4437x();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f2483e.mo4454d(i);
            }
        }
        DependencyNode dependencyNode = this.f2486h;
        if (dependencyNode.f2468c) {
            DependencyNode dependencyNode2 = this.f2487i;
            if (dependencyNode2.f2468c) {
                if (!dependencyNode.f2475j || !dependencyNode2.f2475j || !this.f2483e.f2475j) {
                    if (!this.f2483e.f2475j && this.f2482d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget6 = this.f2480b;
                        if (constraintWidget6.f2449v == 0 && !constraintWidget6.mo4404j0()) {
                            int i4 = this.f2486h.f2477l.get(0).f2472g;
                            DependencyNode dependencyNode3 = this.f2486h;
                            int i5 = i4 + dependencyNode3.f2471f;
                            int i6 = this.f2487i.f2477l.get(0).f2472g + this.f2487i.f2471f;
                            dependencyNode3.mo4454d(i5);
                            this.f2487i.mo4454d(i6);
                            this.f2483e.mo4454d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f2483e.f2475j && this.f2482d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f2479a == 1 && this.f2486h.f2477l.size() > 0 && this.f2487i.f2477l.size() > 0) {
                        int i7 = (this.f2487i.f2477l.get(0).f2472g + this.f2487i.f2471f) - (this.f2486h.f2477l.get(0).f2472g + this.f2486h.f2471f);
                        C0478a aVar3 = this.f2483e;
                        int i8 = aVar3.f2491m;
                        if (i7 < i8) {
                            aVar3.mo4454d(i7);
                        } else {
                            aVar3.mo4454d(i8);
                        }
                    }
                    if (this.f2483e.f2475j && this.f2486h.f2477l.size() > 0 && this.f2487i.f2477l.size() > 0) {
                        DependencyNode dependencyNode4 = this.f2486h.f2477l.get(0);
                        DependencyNode dependencyNode5 = this.f2487i.f2477l.get(0);
                        int i9 = dependencyNode4.f2472g + this.f2486h.f2471f;
                        int i10 = dependencyNode5.f2472g + this.f2487i.f2471f;
                        float Q = this.f2480b.mo4359Q();
                        if (dependencyNode4 == dependencyNode5) {
                            i9 = dependencyNode4.f2472g;
                            i10 = dependencyNode5.f2472g;
                            Q = 0.5f;
                        }
                        this.f2486h.mo4454d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f2483e.f2472g)) * Q)));
                        this.f2487i.mo4454d(this.f2486h.f2472g + this.f2483e.f2472g);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void mo142d() {
        ConstraintWidget M;
        ConstraintWidget M2;
        ConstraintWidget constraintWidget = this.f2480b;
        if (constraintWidget.f2407a) {
            this.f2483e.mo4454d(constraintWidget.mo4441z());
        }
        if (!this.f2483e.f2475j) {
            this.f2482d = this.f2480b.mo4363S();
            if (this.f2480b.mo4375Y()) {
                this.f2495l = new C3232rz(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f2482d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (M2 = this.f2480b.mo4351M()) != null && M2.mo4363S() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int z = (M2.mo4441z() - this.f2480b.f2394Q.mo4310f()) - this.f2480b.f2398S.mo4310f();
                    mo4456b(this.f2486h, M2.f2417f.f2486h, this.f2480b.f2394Q.mo4310f());
                    mo4456b(this.f2487i, M2.f2417f.f2487i, -this.f2480b.f2398S.mo4310f());
                    this.f2483e.mo4454d(z);
                    return;
                } else if (this.f2482d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f2483e.mo4454d(this.f2480b.mo4441z());
                }
            }
        } else if (this.f2482d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (M = this.f2480b.mo4351M()) != null && M.mo4363S() == ConstraintWidget.DimensionBehaviour.FIXED) {
            mo4456b(this.f2486h, M.f2417f.f2486h, this.f2480b.f2394Q.mo4310f());
            mo4456b(this.f2487i, M.f2417f.f2487i, -this.f2480b.f2398S.mo4310f());
            return;
        }
        C0478a aVar = this.f2483e;
        boolean z2 = aVar.f2475j;
        if (z2) {
            ConstraintWidget constraintWidget2 = this.f2480b;
            if (constraintWidget2.f2407a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f2404X;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f2355f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f2355f != null) {
                    if (constraintWidget2.mo4404j0()) {
                        this.f2486h.f2471f = this.f2480b.f2404X[2].mo4310f();
                        this.f2487i.f2471f = -this.f2480b.f2404X[3].mo4310f();
                    } else {
                        DependencyNode h = mo4459h(this.f2480b.f2404X[2]);
                        if (h != null) {
                            mo4456b(this.f2486h, h, this.f2480b.f2404X[2].mo4310f());
                        }
                        DependencyNode h2 = mo4459h(this.f2480b.f2404X[3]);
                        if (h2 != null) {
                            mo4456b(this.f2487i, h2, -this.f2480b.f2404X[3].mo4310f());
                        }
                        this.f2486h.f2467b = true;
                        this.f2487i.f2467b = true;
                    }
                    if (this.f2480b.mo4375Y()) {
                        mo4456b(this.f2494k, this.f2486h, this.f2480b.mo4424r());
                        return;
                    }
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode h3 = mo4459h(constraintAnchor);
                    if (h3 != null) {
                        mo4456b(this.f2486h, h3, this.f2480b.f2404X[2].mo4310f());
                        mo4456b(this.f2487i, this.f2486h, this.f2483e.f2472g);
                        if (this.f2480b.mo4375Y()) {
                            mo4456b(this.f2494k, this.f2486h, this.f2480b.mo4424r());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.f2355f != null) {
                        DependencyNode h4 = mo4459h(constraintAnchor3);
                        if (h4 != null) {
                            mo4456b(this.f2487i, h4, -this.f2480b.f2404X[3].mo4310f());
                            mo4456b(this.f2486h, this.f2487i, -this.f2483e.f2472g);
                        }
                        if (this.f2480b.mo4375Y()) {
                            mo4456b(this.f2494k, this.f2486h, this.f2480b.mo4424r());
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                    if (constraintAnchor4.f2355f != null) {
                        DependencyNode h5 = mo4459h(constraintAnchor4);
                        if (h5 != null) {
                            mo4456b(this.f2494k, h5, 0);
                            mo4456b(this.f2486h, this.f2494k, -this.f2480b.mo4424r());
                            mo4456b(this.f2487i, this.f2486h, this.f2483e.f2472g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof vl2) && constraintWidget2.mo4351M() != null && this.f2480b.mo4422q(ConstraintAnchor.Type.CENTER).f2355f == null) {
                        mo4456b(this.f2486h, this.f2480b.mo4351M().f2417f.f2486h, this.f2480b.mo4373X());
                        mo4456b(this.f2487i, this.f2486h, this.f2483e.f2472g);
                        if (this.f2480b.mo4375Y()) {
                            mo4456b(this.f2494k, this.f2486h, this.f2480b.mo4424r());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z2 || this.f2482d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            aVar.mo4452b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f2480b;
            int i = constraintWidget3.f2451w;
            if (i == 2) {
                ConstraintWidget M3 = constraintWidget3.mo4351M();
                if (M3 != null) {
                    C0478a aVar2 = M3.f2417f.f2483e;
                    this.f2483e.f2477l.add(aVar2);
                    aVar2.f2476k.add(this.f2483e);
                    C0478a aVar3 = this.f2483e;
                    aVar3.f2467b = true;
                    aVar3.f2476k.add(this.f2486h);
                    this.f2483e.f2476k.add(this.f2487i);
                }
            } else if (i == 3 && !constraintWidget3.mo4404j0()) {
                ConstraintWidget constraintWidget4 = this.f2480b;
                if (constraintWidget4.f2449v != 3) {
                    C0478a aVar4 = constraintWidget4.f2415e.f2483e;
                    this.f2483e.f2477l.add(aVar4);
                    aVar4.f2476k.add(this.f2483e);
                    C0478a aVar5 = this.f2483e;
                    aVar5.f2467b = true;
                    aVar5.f2476k.add(this.f2486h);
                    this.f2483e.f2476k.add(this.f2487i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f2480b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f2404X;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f2355f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f2355f != null) {
            if (constraintWidget5.mo4404j0()) {
                this.f2486h.f2471f = this.f2480b.f2404X[2].mo4310f();
                this.f2487i.f2471f = -this.f2480b.f2404X[3].mo4310f();
            } else {
                DependencyNode h6 = mo4459h(this.f2480b.f2404X[2]);
                DependencyNode h7 = mo4459h(this.f2480b.f2404X[3]);
                if (h6 != null) {
                    h6.mo4452b(this);
                }
                if (h7 != null) {
                    h7.mo4452b(this);
                }
                this.f2488j = WidgetRun.RunType.CENTER;
            }
            if (this.f2480b.mo4375Y()) {
                mo4457c(this.f2494k, this.f2486h, 1, this.f2495l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h8 = mo4459h(constraintAnchor5);
            if (h8 != null) {
                mo4456b(this.f2486h, h8, this.f2480b.f2404X[2].mo4310f());
                mo4457c(this.f2487i, this.f2486h, 1, this.f2483e);
                if (this.f2480b.mo4375Y()) {
                    mo4457c(this.f2494k, this.f2486h, 1, this.f2495l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f2482d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f2480b.mo4437x() > Utils.FLOAT_EPSILON) {
                    C0480c cVar = this.f2480b.f2415e;
                    if (cVar.f2482d == dimensionBehaviour3) {
                        cVar.f2483e.f2476k.add(this.f2483e);
                        this.f2483e.f2477l.add(this.f2480b.f2415e.f2483e);
                        this.f2483e.f2466a = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f2355f != null) {
                DependencyNode h9 = mo4459h(constraintAnchor7);
                if (h9 != null) {
                    mo4456b(this.f2487i, h9, -this.f2480b.f2404X[3].mo4310f());
                    mo4457c(this.f2486h, this.f2487i, -1, this.f2483e);
                    if (this.f2480b.mo4375Y()) {
                        mo4457c(this.f2494k, this.f2486h, 1, this.f2495l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f2355f != null) {
                    DependencyNode h10 = mo4459h(constraintAnchor8);
                    if (h10 != null) {
                        mo4456b(this.f2494k, h10, 0);
                        mo4457c(this.f2486h, this.f2494k, -1, this.f2495l);
                        mo4457c(this.f2487i, this.f2486h, 1, this.f2483e);
                    }
                } else if (!(constraintWidget5 instanceof vl2) && constraintWidget5.mo4351M() != null) {
                    mo4456b(this.f2486h, this.f2480b.mo4351M().f2417f.f2486h, this.f2480b.mo4373X());
                    mo4457c(this.f2487i, this.f2486h, 1, this.f2483e);
                    if (this.f2480b.mo4375Y()) {
                        mo4457c(this.f2494k, this.f2486h, 1, this.f2495l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f2482d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f2480b.mo4437x() > Utils.FLOAT_EPSILON) {
                        C0480c cVar2 = this.f2480b.f2415e;
                        if (cVar2.f2482d == dimensionBehaviour5) {
                            cVar2.f2483e.f2476k.add(this.f2483e);
                            this.f2483e.f2477l.add(this.f2480b.f2415e.f2483e);
                            this.f2483e.f2466a = this;
                        }
                    }
                }
            }
        }
        if (this.f2483e.f2477l.size() == 0) {
            this.f2483e.f2468c = true;
        }
    }

    /* renamed from: e */
    public void mo143e() {
        DependencyNode dependencyNode = this.f2486h;
        if (dependencyNode.f2475j) {
            this.f2480b.mo4408k1(dependencyNode.f2472g);
        }
    }

    /* renamed from: f */
    public void mo144f() {
        this.f2481c = null;
        this.f2486h.mo4453c();
        this.f2487i.mo4453c();
        this.f2494k.mo4453c();
        this.f2483e.mo4453c();
        this.f2485g = false;
    }

    /* renamed from: m */
    public boolean mo146m() {
        if (this.f2482d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2480b.f2451w == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void mo4470q() {
        this.f2485g = false;
        this.f2486h.mo4453c();
        this.f2486h.f2475j = false;
        this.f2487i.mo4453c();
        this.f2487i.f2475j = false;
        this.f2494k.mo4453c();
        this.f2494k.f2475j = false;
        this.f2483e.f2475j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f2480b.mo4433v();
    }
}
