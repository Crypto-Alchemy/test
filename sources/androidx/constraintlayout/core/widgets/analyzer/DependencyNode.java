package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements jc1 {

    /* renamed from: a */
    public jc1 f2466a = null;

    /* renamed from: b */
    public boolean f2467b = false;

    /* renamed from: c */
    public boolean f2468c = false;

    /* renamed from: d */
    public WidgetRun f2469d;

    /* renamed from: e */
    public Type f2470e = Type.UNKNOWN;

    /* renamed from: f */
    public int f2471f;

    /* renamed from: g */
    public int f2472g;

    /* renamed from: h */
    public int f2473h = 1;

    /* renamed from: i */
    public C0478a f2474i = null;

    /* renamed from: j */
    public boolean f2475j = false;

    /* renamed from: k */
    public List<jc1> f2476k = new ArrayList();

    /* renamed from: l */
    public List<DependencyNode> f2477l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f2469d = widgetRun;
    }

    /* renamed from: a */
    public void mo141a(jc1 jc1) {
        for (DependencyNode dependencyNode : this.f2477l) {
            if (!dependencyNode.f2475j) {
                return;
            }
        }
        this.f2468c = true;
        jc1 jc12 = this.f2466a;
        if (jc12 != null) {
            jc12.mo141a(this);
        }
        if (this.f2467b) {
            this.f2469d.mo141a(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i = 0;
        for (DependencyNode next : this.f2477l) {
            if (!(next instanceof C0478a)) {
                i++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.f2475j) {
            C0478a aVar = this.f2474i;
            if (aVar != null) {
                if (aVar.f2475j) {
                    this.f2471f = this.f2473h * aVar.f2472g;
                } else {
                    return;
                }
            }
            mo4454d(dependencyNode2.f2472g + this.f2471f);
        }
        jc1 jc13 = this.f2466a;
        if (jc13 != null) {
            jc13.mo141a(this);
        }
    }

    /* renamed from: b */
    public void mo4452b(jc1 jc1) {
        this.f2476k.add(jc1);
        if (this.f2475j) {
            jc1.mo141a(jc1);
        }
    }

    /* renamed from: c */
    public void mo4453c() {
        this.f2477l.clear();
        this.f2476k.clear();
        this.f2475j = false;
        this.f2472g = 0;
        this.f2468c = false;
        this.f2467b = false;
    }

    /* renamed from: d */
    public void mo4454d(int i) {
        if (!this.f2475j) {
            this.f2475j = true;
            this.f2472g = i;
            for (jc1 next : this.f2476k) {
                next.mo141a(next);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2469d.f2480b.mo4433v());
        sb.append(":");
        sb.append(this.f2470e);
        sb.append("(");
        if (this.f2475j) {
            obj = Integer.valueOf(this.f2472g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f2477l.size());
        sb.append(":d=");
        sb.append(this.f2476k.size());
        sb.append(">");
        return sb.toString();
    }
}
