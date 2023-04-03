package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.C0476a;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.b */
/* compiled from: HelperReferences */
public class C0479b extends WidgetRun {
    public C0479b(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: a */
    public void mo141a(jc1 jc1) {
        C0476a aVar = (C0476a) this.f2480b;
        int s1 = aVar.mo4445s1();
        int i = 0;
        int i2 = -1;
        for (DependencyNode dependencyNode : this.f2486h.f2477l) {
            int i3 = dependencyNode.f2472g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (s1 == 0 || s1 == 2) {
            this.f2486h.mo4454d(i2 + aVar.mo4446t1());
        } else {
            this.f2486h.mo4454d(i + aVar.mo4446t1());
        }
    }

    /* renamed from: d */
    public void mo142d() {
        ConstraintWidget constraintWidget = this.f2480b;
        if (constraintWidget instanceof C0476a) {
            this.f2486h.f2467b = true;
            C0476a aVar = (C0476a) constraintWidget;
            int s1 = aVar.mo4445s1();
            boolean r1 = aVar.mo4444r1();
            int i = 0;
            if (s1 == 0) {
                this.f2486h.f2470e = DependencyNode.Type.LEFT;
                while (i < aVar.f19175V0) {
                    ConstraintWidget constraintWidget2 = aVar.f19174U0[i];
                    if (r1 || constraintWidget2.mo4367U() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.f2415e.f2486h;
                        dependencyNode.f2476k.add(this.f2486h);
                        this.f2486h.f2477l.add(dependencyNode);
                    }
                    i++;
                }
                mo4466q(this.f2480b.f2415e.f2486h);
                mo4466q(this.f2480b.f2415e.f2487i);
            } else if (s1 == 1) {
                this.f2486h.f2470e = DependencyNode.Type.RIGHT;
                while (i < aVar.f19175V0) {
                    ConstraintWidget constraintWidget3 = aVar.f19174U0[i];
                    if (r1 || constraintWidget3.mo4367U() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.f2415e.f2487i;
                        dependencyNode2.f2476k.add(this.f2486h);
                        this.f2486h.f2477l.add(dependencyNode2);
                    }
                    i++;
                }
                mo4466q(this.f2480b.f2415e.f2486h);
                mo4466q(this.f2480b.f2415e.f2487i);
            } else if (s1 == 2) {
                this.f2486h.f2470e = DependencyNode.Type.TOP;
                while (i < aVar.f19175V0) {
                    ConstraintWidget constraintWidget4 = aVar.f19174U0[i];
                    if (r1 || constraintWidget4.mo4367U() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f2417f.f2486h;
                        dependencyNode3.f2476k.add(this.f2486h);
                        this.f2486h.f2477l.add(dependencyNode3);
                    }
                    i++;
                }
                mo4466q(this.f2480b.f2417f.f2486h);
                mo4466q(this.f2480b.f2417f.f2487i);
            } else if (s1 == 3) {
                this.f2486h.f2470e = DependencyNode.Type.BOTTOM;
                while (i < aVar.f19175V0) {
                    ConstraintWidget constraintWidget5 = aVar.f19174U0[i];
                    if (r1 || constraintWidget5.mo4367U() != 8) {
                        DependencyNode dependencyNode4 = constraintWidget5.f2417f.f2487i;
                        dependencyNode4.f2476k.add(this.f2486h);
                        this.f2486h.f2477l.add(dependencyNode4);
                    }
                    i++;
                }
                mo4466q(this.f2480b.f2417f.f2486h);
                mo4466q(this.f2480b.f2417f.f2487i);
            }
        }
    }

    /* renamed from: e */
    public void mo143e() {
        ConstraintWidget constraintWidget = this.f2480b;
        if (constraintWidget instanceof C0476a) {
            int s1 = ((C0476a) constraintWidget).mo4445s1();
            if (s1 == 0 || s1 == 1) {
                this.f2480b.mo4405j1(this.f2486h.f2472g);
            } else {
                this.f2480b.mo4408k1(this.f2486h.f2472g);
            }
        }
    }

    /* renamed from: f */
    public void mo144f() {
        this.f2481c = null;
        this.f2486h.mo4453c();
    }

    /* renamed from: m */
    public boolean mo146m() {
        return false;
    }

    /* renamed from: q */
    public final void mo4466q(DependencyNode dependencyNode) {
        this.f2486h.f2476k.add(dependencyNode);
        dependencyNode.f2477l.add(this.f2486h);
    }
}
