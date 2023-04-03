package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements jc1 {

    /* renamed from: a */
    public int f2479a;

    /* renamed from: b */
    public ConstraintWidget f2480b;

    /* renamed from: c */
    public ki5 f2481c;

    /* renamed from: d */
    public ConstraintWidget.DimensionBehaviour f2482d;

    /* renamed from: e */
    public C0478a f2483e = new C0478a(this);

    /* renamed from: f */
    public int f2484f = 0;

    /* renamed from: g */
    public boolean f2485g = false;

    /* renamed from: h */
    public DependencyNode f2486h = new DependencyNode(this);

    /* renamed from: i */
    public DependencyNode f2487i = new DependencyNode(this);

    /* renamed from: j */
    public RunType f2488j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$a */
    public static /* synthetic */ class C0477a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2490a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2490a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2490a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2490a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2490a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2490a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C0477a.<clinit>():void");
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f2480b = constraintWidget;
    }

    /* renamed from: a */
    public void mo141a(jc1 jc1) {
    }

    /* renamed from: b */
    public final void mo4456b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f2477l.add(dependencyNode2);
        dependencyNode.f2471f = i;
        dependencyNode2.f2476k.add(dependencyNode);
    }

    /* renamed from: c */
    public final void mo4457c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, C0478a aVar) {
        dependencyNode.f2477l.add(dependencyNode2);
        dependencyNode.f2477l.add(this.f2483e);
        dependencyNode.f2473h = i;
        dependencyNode.f2474i = aVar;
        dependencyNode2.f2476k.add(dependencyNode);
        aVar.f2476k.add(dependencyNode);
    }

    /* renamed from: d */
    public abstract void mo142d();

    /* renamed from: e */
    public abstract void mo143e();

    /* renamed from: f */
    public abstract void mo144f();

    /* renamed from: g */
    public final int mo4458g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f2480b;
            int i4 = constraintWidget.f2457z;
            i3 = Math.max(constraintWidget.f2455y, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f2480b;
            int i5 = constraintWidget2.f2366C;
            int max = Math.max(constraintWidget2.f2364B, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: h */
    public final DependencyNode mo4459h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2355f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2353d;
        int i = C0477a.f2490a[constraintAnchor2.f2354e.ordinal()];
        if (i == 1) {
            return constraintWidget.f2415e.f2486h;
        }
        if (i == 2) {
            return constraintWidget.f2415e.f2487i;
        }
        if (i == 3) {
            return constraintWidget.f2417f.f2486h;
        }
        if (i == 4) {
            return constraintWidget.f2417f.f2494k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f2417f.f2487i;
    }

    /* renamed from: i */
    public final DependencyNode mo4460i(ConstraintAnchor constraintAnchor, int i) {
        WidgetRun widgetRun;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2355f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2353d;
        if (i == 0) {
            widgetRun = constraintWidget.f2415e;
        } else {
            widgetRun = constraintWidget.f2417f;
        }
        int i2 = C0477a.f2490a[constraintAnchor2.f2354e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f2487i;
        }
        return widgetRun.f2486h;
    }

    /* renamed from: j */
    public long mo145j() {
        C0478a aVar = this.f2483e;
        if (aVar.f2475j) {
            return (long) aVar.f2472g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo4461k() {
        return this.f2485g;
    }

    /* renamed from: l */
    public final void mo4462l(int i, int i2) {
        WidgetRun widgetRun;
        float f;
        int i3;
        int i4 = this.f2479a;
        if (i4 == 0) {
            this.f2483e.mo4454d(mo4458g(i2, i));
        } else if (i4 == 1) {
            this.f2483e.mo4454d(Math.min(mo4458g(this.f2483e.f2491m, i), i2));
        } else if (i4 == 2) {
            ConstraintWidget M = this.f2480b.mo4351M();
            if (M != null) {
                if (i == 0) {
                    widgetRun = M.f2415e;
                } else {
                    widgetRun = M.f2417f;
                }
                C0478a aVar = widgetRun.f2483e;
                if (aVar.f2475j) {
                    ConstraintWidget constraintWidget = this.f2480b;
                    if (i == 0) {
                        f = constraintWidget.f2362A;
                    } else {
                        f = constraintWidget.f2368D;
                    }
                    this.f2483e.mo4454d(mo4458g((int) ((((float) aVar.f2472g) * f) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            ConstraintWidget constraintWidget2 = this.f2480b;
            WidgetRun widgetRun2 = constraintWidget2.f2415e;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun2.f2482d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 && widgetRun2.f2479a == 3) {
                C0482d dVar = constraintWidget2.f2417f;
                if (dVar.f2482d == dimensionBehaviour2 && dVar.f2479a == 3) {
                    return;
                }
            }
            if (i == 0) {
                widgetRun2 = constraintWidget2.f2417f;
            }
            if (widgetRun2.f2483e.f2475j) {
                float x = constraintWidget2.mo4437x();
                if (i == 1) {
                    i3 = (int) ((((float) widgetRun2.f2483e.f2472g) / x) + 0.5f);
                } else {
                    i3 = (int) ((x * ((float) widgetRun2.f2483e.f2472g)) + 0.5f);
                }
                this.f2483e.mo4454d(i3);
            }
        }
    }

    /* renamed from: m */
    public abstract boolean mo146m();

    /* renamed from: n */
    public void mo4463n(jc1 jc1, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        float f;
        DependencyNode h = mo4459h(constraintAnchor);
        DependencyNode h2 = mo4459h(constraintAnchor2);
        if (h.f2475j && h2.f2475j) {
            int f2 = h.f2472g + constraintAnchor.mo4310f();
            int f3 = h2.f2472g - constraintAnchor2.mo4310f();
            int i2 = f3 - f2;
            if (!this.f2483e.f2475j && this.f2482d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                mo4462l(i, i2);
            }
            C0478a aVar = this.f2483e;
            if (aVar.f2475j) {
                if (aVar.f2472g == i2) {
                    this.f2486h.mo4454d(f2);
                    this.f2487i.mo4454d(f3);
                    return;
                }
                ConstraintWidget constraintWidget = this.f2480b;
                if (i == 0) {
                    f = constraintWidget.mo4327A();
                } else {
                    f = constraintWidget.mo4359Q();
                }
                if (h == h2) {
                    f2 = h.f2472g;
                    f3 = h2.f2472g;
                    f = 0.5f;
                }
                this.f2486h.mo4454d((int) (((float) f2) + 0.5f + (((float) ((f3 - f2) - this.f2483e.f2472g)) * f)));
                this.f2487i.mo4454d(this.f2486h.f2472g + this.f2483e.f2472g);
            }
        }
    }

    /* renamed from: o */
    public void mo4464o(jc1 jc1) {
    }

    /* renamed from: p */
    public void mo4465p(jc1 jc1) {
    }
}
