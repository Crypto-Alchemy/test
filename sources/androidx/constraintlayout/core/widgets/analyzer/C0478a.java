package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.a */
/* compiled from: DimensionDependency */
public class C0478a extends DependencyNode {

    /* renamed from: m */
    public int f2491m;

    public C0478a(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof C0480c) {
            this.f2470e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f2470e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
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
}
