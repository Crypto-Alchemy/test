package p000;

import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* renamed from: bk2 */
/* compiled from: GuidelineReference */
public class bk2 extends WidgetRun {
    public bk2(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2415e.mo144f();
        constraintWidget.f2417f.mo144f();
        this.f2484f = ((C0489f) constraintWidget).mo4543p1();
    }

    /* renamed from: a */
    public void mo141a(jc1 jc1) {
        DependencyNode dependencyNode = this.f2486h;
        if (dependencyNode.f2468c && !dependencyNode.f2475j) {
            this.f2486h.mo4454d((int) ((((float) dependencyNode.f2477l.get(0).f2472g) * ((C0489f) this.f2480b).mo4546s1()) + 0.5f));
        }
    }

    /* renamed from: d */
    public void mo142d() {
        C0489f fVar = (C0489f) this.f2480b;
        int q1 = fVar.mo4544q1();
        int r1 = fVar.mo4545r1();
        fVar.mo4546s1();
        if (fVar.mo4543p1() == 1) {
            if (q1 != -1) {
                this.f2486h.f2477l.add(this.f2480b.f2410b0.f2415e.f2486h);
                this.f2480b.f2410b0.f2415e.f2486h.f2476k.add(this.f2486h);
                this.f2486h.f2471f = q1;
            } else if (r1 != -1) {
                this.f2486h.f2477l.add(this.f2480b.f2410b0.f2415e.f2487i);
                this.f2480b.f2410b0.f2415e.f2487i.f2476k.add(this.f2486h);
                this.f2486h.f2471f = -r1;
            } else {
                DependencyNode dependencyNode = this.f2486h;
                dependencyNode.f2467b = true;
                dependencyNode.f2477l.add(this.f2480b.f2410b0.f2415e.f2487i);
                this.f2480b.f2410b0.f2415e.f2487i.f2476k.add(this.f2486h);
            }
            mo11694q(this.f2480b.f2415e.f2486h);
            mo11694q(this.f2480b.f2415e.f2487i);
            return;
        }
        if (q1 != -1) {
            this.f2486h.f2477l.add(this.f2480b.f2410b0.f2417f.f2486h);
            this.f2480b.f2410b0.f2417f.f2486h.f2476k.add(this.f2486h);
            this.f2486h.f2471f = q1;
        } else if (r1 != -1) {
            this.f2486h.f2477l.add(this.f2480b.f2410b0.f2417f.f2487i);
            this.f2480b.f2410b0.f2417f.f2487i.f2476k.add(this.f2486h);
            this.f2486h.f2471f = -r1;
        } else {
            DependencyNode dependencyNode2 = this.f2486h;
            dependencyNode2.f2467b = true;
            dependencyNode2.f2477l.add(this.f2480b.f2410b0.f2417f.f2487i);
            this.f2480b.f2410b0.f2417f.f2487i.f2476k.add(this.f2486h);
        }
        mo11694q(this.f2480b.f2417f.f2486h);
        mo11694q(this.f2480b.f2417f.f2487i);
    }

    /* renamed from: e */
    public void mo143e() {
        if (((C0489f) this.f2480b).mo4543p1() == 1) {
            this.f2480b.mo4405j1(this.f2486h.f2472g);
        } else {
            this.f2480b.mo4408k1(this.f2486h.f2472g);
        }
    }

    /* renamed from: f */
    public void mo144f() {
        this.f2486h.mo4453c();
    }

    /* renamed from: m */
    public boolean mo146m() {
        return false;
    }

    /* renamed from: q */
    public final void mo11694q(DependencyNode dependencyNode) {
        this.f2486h.f2476k.add(dependencyNode);
        dependencyNode.f2477l.add(this.f2486h);
    }
}
