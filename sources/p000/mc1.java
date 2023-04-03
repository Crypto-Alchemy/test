package p000;

import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C0478a;
import androidx.constraintlayout.core.widgets.analyzer.C0479b;
import androidx.constraintlayout.core.widgets.analyzer.C0480c;
import androidx.constraintlayout.core.widgets.analyzer.C0482d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.a00;

/* renamed from: mc1 */
/* compiled from: DependencyGraph */
public class mc1 {

    /* renamed from: a */
    public C0486d f14928a;

    /* renamed from: b */
    public boolean f14929b = true;

    /* renamed from: c */
    public boolean f14930c = true;

    /* renamed from: d */
    public C0486d f14931d;

    /* renamed from: e */
    public ArrayList<WidgetRun> f14932e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<ki5> f14933f = new ArrayList<>();

    /* renamed from: g */
    public a00.C0001b f14934g = null;

    /* renamed from: h */
    public a00.C0000a f14935h = new a00.C0000a();

    /* renamed from: i */
    public ArrayList<ki5> f14936i = new ArrayList<>();

    public mc1(C0486d dVar) {
        this.f14928a = dVar;
        this.f14931d = dVar;
    }

    /* renamed from: a */
    public final void mo23123a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<ki5> arrayList, ki5 ki5) {
        WidgetRun widgetRun = dependencyNode.f2469d;
        if (widgetRun.f2481c == null) {
            C0486d dVar = this.f14928a;
            if (widgetRun != dVar.f2415e && widgetRun != dVar.f2417f) {
                if (ki5 == null) {
                    ki5 = new ki5(widgetRun, i2);
                    arrayList.add(ki5);
                }
                widgetRun.f2481c = ki5;
                ki5.mo22319a(widgetRun);
                for (jc1 next : widgetRun.f2486h.f2476k) {
                    if (next instanceof DependencyNode) {
                        mo23123a((DependencyNode) next, i, 0, dependencyNode2, arrayList, ki5);
                    }
                }
                for (jc1 next2 : widgetRun.f2487i.f2476k) {
                    if (next2 instanceof DependencyNode) {
                        mo23123a((DependencyNode) next2, i, 1, dependencyNode2, arrayList, ki5);
                    }
                }
                if (i == 1 && (widgetRun instanceof C0482d)) {
                    for (jc1 next3 : ((C0482d) widgetRun).f2494k.f2476k) {
                        if (next3 instanceof DependencyNode) {
                            mo23123a((DependencyNode) next3, i, 2, dependencyNode2, arrayList, ki5);
                        }
                    }
                }
                for (DependencyNode next4 : widgetRun.f2486h.f2477l) {
                    if (next4 == dependencyNode2) {
                        ki5.f14097b = true;
                    }
                    mo23123a(next4, i, 0, dependencyNode2, arrayList, ki5);
                }
                for (DependencyNode next5 : widgetRun.f2487i.f2477l) {
                    if (next5 == dependencyNode2) {
                        ki5.f14097b = true;
                    }
                    mo23123a(next5, i, 1, dependencyNode2, arrayList, ki5);
                }
                if (i == 1 && (widgetRun instanceof C0482d)) {
                    for (DependencyNode a : ((C0482d) widgetRun).f2494k.f2477l) {
                        mo23123a(a, i, 2, dependencyNode2, arrayList, ki5);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        r4 = r0.f2408a0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23124b(androidx.constraintlayout.core.widgets.C0486d r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.f18830U0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0338
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r2.f2408a0
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo4367U()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f2407a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f2362A
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f2449v = r7
        L_0x0036:
            float r6 = r2.f2368D
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f2451w = r7
        L_0x0042:
            float r6 = r2.mo4437x()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0078
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f2449v = r8
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f2451w = r8
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f2449v
            if (r6 != 0) goto L_0x0072
            r2.f2449v = r8
        L_0x0072:
            int r6 = r2.f2451w
            if (r6 != 0) goto L_0x0078
            r2.f2451w = r8
        L_0x0078:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r9 = r2.f2449v
            if (r9 != r10) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2355f
            if (r9 == 0) goto L_0x008c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2396R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2355f
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x008e:
            r9 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f2451w
            if (r5 != r10) goto L_0x00a3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2355f
            if (r5 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2355f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            androidx.constraintlayout.core.widgets.analyzer.c r4 = r2.f2415e
            r4.f2482d = r9
            int r5 = r2.f2449v
            r4.f2479a = r5
            androidx.constraintlayout.core.widgets.analyzer.d r4 = r2.f2417f
            r4.f2482d = r12
            int r13 = r2.f2451w
            r4.f2479a = r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r9 == r4) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 == r14) goto L_0x00c0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02e2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 == r14) goto L_0x02e2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02e2
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0199
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r12 != r11) goto L_0x0199
        L_0x00d8:
            if (r5 != r8) goto L_0x0113
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.mo23134l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.mo4441z()
            float r3 = (float) r9
            float r4 = r2.f2416e0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x0113:
            if (r5 != r10) goto L_0x012b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r2 = r2.mo4369V()
            r3.f2491m = r2
            goto L_0x0008
        L_0x012b:
            if (r5 != r7) goto L_0x0167
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r0.f2408a0
            r11 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r11 == r15) goto L_0x0137
            if (r11 != r4) goto L_0x0199
        L_0x0137:
            float r3 = r2.f2362A
            int r4 = r17.mo4369V()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.mo4441z()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x0167:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r11 = r2.f2404X
            r7 = r11[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f2355f
            if (r7 == 0) goto L_0x0175
            r7 = r11[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f2355f
            if (r7 != 0) goto L_0x0199
        L_0x0175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x0199:
            if (r12 != r6) goto L_0x0272
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r9 == r11) goto L_0x01a3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r9 != r7) goto L_0x0272
        L_0x01a3:
            if (r13 != r8) goto L_0x01e9
            if (r9 != r11) goto L_0x01b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.mo23134l(r5, r6, r7, r8, r9)
        L_0x01b1:
            int r7 = r2.mo4369V()
            float r3 = r2.f2416e0
            int r4 = r2.mo4439y()
            r5 = -1
            if (r4 != r5) goto L_0x01c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x01e9:
            if (r13 != r10) goto L_0x0202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r2 = r2.mo4441z()
            r3.f2491m = r2
            goto L_0x0008
        L_0x0202:
            r7 = 2
            if (r13 != r7) goto L_0x023f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r0.f2408a0
            r7 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r7 == r8) goto L_0x020f
            if (r7 != r4) goto L_0x0272
        L_0x020f:
            float r3 = r2.f2368D
            int r7 = r2.mo4369V()
            int r4 = r17.mo4441z()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x023f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r2.f2404X
            r7 = 2
            r15 = r4[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r15.f2355f
            if (r7 == 0) goto L_0x024e
            r4 = r4[r8]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2355f
            if (r4 != 0) goto L_0x0272
        L_0x024e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x0272:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02c1
            if (r13 != r10) goto L_0x027b
            goto L_0x02c1
        L_0x027b:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f2408a0
            r3 = r4[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f2362A
            float r4 = r2.f2368D
            int r5 = r17.mo4369V()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo4441z()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x02c1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.f2491m = r4
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r2 = r2.mo4441z()
            r3.f2491m = r2
            goto L_0x0008
        L_0x02e2:
            int r3 = r2.mo4369V()
            if (r9 != r4) goto L_0x02fb
            int r3 = r17.mo4369V()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2392P
            int r5 = r5.f2356g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f2396R
            int r5 = r5.f2356g
            int r3 = r3 - r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7 = r3
            r6 = r5
            goto L_0x02fd
        L_0x02fb:
            r7 = r3
            r6 = r9
        L_0x02fd:
            int r3 = r2.mo4441z()
            if (r12 != r4) goto L_0x0316
            int r3 = r17.mo4441z()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f2394Q
            int r4 = r4.f2356g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f2398S
            int r4 = r4.f2356g
            int r3 = r3 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0318
        L_0x0316:
            r9 = r3
            r8 = r12
        L_0x0318:
            r4 = r16
            r5 = r2
            r4.mo23134l(r5, r6, r7, r8, r9)
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r2.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4369V()
            r3.mo4454d(r4)
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2483e
            int r4 = r2.mo4441z()
            r3.mo4454d(r4)
            r2.f2407a = r10
            goto L_0x0008
        L_0x0338:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mc1.mo23124b(androidx.constraintlayout.core.widgets.d):boolean");
    }

    /* renamed from: c */
    public void mo23125c() {
        mo23126d(this.f14932e);
        this.f14936i.clear();
        ki5.f14095h = 0;
        mo23131i(this.f14928a.f2415e, 0, this.f14936i);
        mo23131i(this.f14928a.f2417f, 1, this.f14936i);
        this.f14929b = false;
    }

    /* renamed from: d */
    public void mo23126d(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f14931d.f2415e.mo144f();
        this.f14931d.f2417f.mo144f();
        arrayList.add(this.f14931d.f2415e);
        arrayList.add(this.f14931d.f2417f);
        Iterator<ConstraintWidget> it = this.f14931d.f18830U0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof C0489f) {
                arrayList.add(new bk2(next));
            } else {
                if (next.mo4398h0()) {
                    if (next.f2411c == null) {
                        next.f2411c = new ad0(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2411c);
                } else {
                    arrayList.add(next.f2415e);
                }
                if (next.mo4404j0()) {
                    if (next.f2413d == null) {
                        next.f2413d = new ad0(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2413d);
                } else {
                    arrayList.add(next.f2417f);
                }
                if (next instanceof wl2) {
                    arrayList.add(new C0479b(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo144f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f2480b != this.f14931d) {
                next2.mo142d();
            }
        }
    }

    /* renamed from: e */
    public final int mo23127e(C0486d dVar, int i) {
        int size = this.f14936i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f14936i.get(i2).mo22320b(dVar, i));
        }
        return (int) j;
    }

    /* renamed from: f */
    public boolean mo23128f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f14929b || this.f14930c) {
            Iterator<ConstraintWidget> it = this.f14928a.f18830U0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.mo4420p();
                next.f2407a = false;
                next.f2415e.mo4468r();
                next.f2417f.mo4470q();
            }
            this.f14928a.mo4420p();
            C0486d dVar = this.f14928a;
            dVar.f2407a = false;
            dVar.f2415e.mo4468r();
            this.f14928a.f2417f.mo4470q();
            this.f14930c = false;
        }
        if (mo23124b(this.f14931d)) {
            return false;
        }
        this.f14928a.mo4405j1(0);
        this.f14928a.mo4408k1(0);
        ConstraintWidget.DimensionBehaviour w = this.f14928a.mo4435w(0);
        ConstraintWidget.DimensionBehaviour w2 = this.f14928a.mo4435w(1);
        if (this.f14929b) {
            mo23125c();
        }
        int W = this.f14928a.mo4371W();
        int X = this.f14928a.mo4373X();
        this.f14928a.f2415e.f2486h.mo4454d(W);
        this.f14928a.f2417f.f2486h.mo4454d(X);
        mo23135m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (w == dimensionBehaviour || w2 == dimensionBehaviour) {
            if (z4) {
                Iterator<WidgetRun> it2 = this.f14932e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo146m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && w == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f14928a.mo4352M0(ConstraintWidget.DimensionBehaviour.FIXED);
                C0486d dVar2 = this.f14928a;
                dVar2.mo4399h1(mo23127e(dVar2, 0));
                C0486d dVar3 = this.f14928a;
                dVar3.f2415e.f2483e.mo4454d(dVar3.mo4369V());
            }
            if (z4 && w2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f14928a.mo4387d1(ConstraintWidget.DimensionBehaviour.FIXED);
                C0486d dVar4 = this.f14928a;
                dVar4.mo4344I0(mo23127e(dVar4, 1));
                C0486d dVar5 = this.f14928a;
                dVar5.f2417f.f2483e.mo4454d(dVar5.mo4441z());
            }
        }
        C0486d dVar6 = this.f14928a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.f2408a0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int V = dVar6.mo4369V() + W;
            this.f14928a.f2415e.f2487i.mo4454d(V);
            this.f14928a.f2415e.f2483e.mo4454d(V - W);
            mo23135m();
            C0486d dVar7 = this.f14928a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.f2408a0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int z5 = dVar7.mo4441z() + X;
                this.f14928a.f2417f.f2487i.mo4454d(z5);
                this.f14928a.f2417f.f2483e.mo4454d(z5 - X);
            }
            mo23135m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<WidgetRun> it3 = this.f14932e.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f2480b != this.f14928a || next2.f2485g) {
                next2.mo143e();
            }
        }
        Iterator<WidgetRun> it4 = this.f14932e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            WidgetRun next3 = it4.next();
            if ((z2 || next3.f2480b != this.f14928a) && (!next3.f2486h.f2475j || ((!next3.f2487i.f2475j && !(next3 instanceof bk2)) || (!next3.f2483e.f2475j && !(next3 instanceof ad0) && !(next3 instanceof bk2))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f14928a.mo4352M0(w);
        this.f14928a.mo4387d1(w2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo23129g(boolean z) {
        if (this.f14929b) {
            Iterator<ConstraintWidget> it = this.f14928a.f18830U0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.mo4420p();
                next.f2407a = false;
                C0480c cVar = next.f2415e;
                cVar.f2483e.f2475j = false;
                cVar.f2485g = false;
                cVar.mo4468r();
                C0482d dVar = next.f2417f;
                dVar.f2483e.f2475j = false;
                dVar.f2485g = false;
                dVar.mo4470q();
            }
            this.f14928a.mo4420p();
            C0486d dVar2 = this.f14928a;
            dVar2.f2407a = false;
            C0480c cVar2 = dVar2.f2415e;
            cVar2.f2483e.f2475j = false;
            cVar2.f2485g = false;
            cVar2.mo4468r();
            C0482d dVar3 = this.f14928a.f2417f;
            dVar3.f2483e.f2475j = false;
            dVar3.f2485g = false;
            dVar3.mo4470q();
            mo23125c();
        }
        if (mo23124b(this.f14931d)) {
            return false;
        }
        this.f14928a.mo4405j1(0);
        this.f14928a.mo4408k1(0);
        this.f14928a.f2415e.f2486h.mo4454d(0);
        this.f14928a.f2417f.f2486h.mo4454d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013f A[EDGE_INSN: B:76:0x013f->B:62:0x013f ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23130h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.core.widgets.d r1 = r9.f14928a
            r2 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r1.mo4435w(r2)
            androidx.constraintlayout.core.widgets.d r3 = r9.f14928a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r3.mo4435w(r0)
            androidx.constraintlayout.core.widgets.d r4 = r9.f14928a
            int r4 = r4.mo4371W()
            androidx.constraintlayout.core.widgets.d r5 = r9.f14928a
            int r5 = r5.mo4373X()
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r6 = r9.f14932e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            int r8 = r7.f2484f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo146m()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.mo4352M0(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            int r6 = r9.mo23127e(r10, r2)
            r10.mo4399h1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            androidx.constraintlayout.core.widgets.analyzer.c r6 = r10.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f2483e
            int r10 = r10.mo4369V()
            r6.mo4454d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.mo4387d1(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            int r6 = r9.mo23127e(r10, r0)
            r10.mo4344I0(r6)
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            androidx.constraintlayout.core.widgets.analyzer.d r6 = r10.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f2483e
            int r10 = r10.mo4441z()
            r6.mo4454d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b2
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r10.f2408a0
            r5 = r5[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r6) goto L_0x0099
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0099:
            int r10 = r10.mo4369V()
            int r10 = r10 + r4
            androidx.constraintlayout.core.widgets.d r5 = r9.f14928a
            androidx.constraintlayout.core.widgets.analyzer.c r5 = r5.f2415e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f2487i
            r5.mo4454d(r10)
            androidx.constraintlayout.core.widgets.d r5 = r9.f14928a
            androidx.constraintlayout.core.widgets.analyzer.c r5 = r5.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r5.f2483e
            int r10 = r10 - r4
            r5.mo4454d(r10)
            goto L_0x00db
        L_0x00b2:
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r10.f2408a0
            r4 = r4[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r6) goto L_0x00c3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r2
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.mo4441z()
            int r10 = r10 + r5
            androidx.constraintlayout.core.widgets.d r4 = r9.f14928a
            androidx.constraintlayout.core.widgets.analyzer.d r4 = r4.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.f2487i
            r4.mo4454d(r10)
            androidx.constraintlayout.core.widgets.d r4 = r9.f14928a
            androidx.constraintlayout.core.widgets.analyzer.d r4 = r4.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r4 = r4.f2483e
            int r10 = r10 - r5
            r4.mo4454d(r10)
        L_0x00db:
            r10 = r0
        L_0x00dc:
            r9.mo23135m()
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.f14932e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f2484f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f2480b
            androidx.constraintlayout.core.widgets.d r7 = r9.f14928a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f2485g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.mo143e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r4 = r9.f14932e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013f
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            int r6 = r5.f2484f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f2480b
            androidx.constraintlayout.core.widgets.d r7 = r9.f14928a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f2486h
            boolean r6 = r6.f2475j
            if (r6 != 0) goto L_0x012d
        L_0x012b:
            r0 = r2
            goto L_0x013f
        L_0x012d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r6 = r5.f2487i
            boolean r6 = r6.f2475j
            if (r6 != 0) goto L_0x0134
            goto L_0x012b
        L_0x0134:
            boolean r6 = r5 instanceof p000.ad0
            if (r6 != 0) goto L_0x010b
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r5.f2483e
            boolean r5 = r5.f2475j
            if (r5 != 0) goto L_0x010b
            goto L_0x012b
        L_0x013f:
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            r10.mo4352M0(r1)
            androidx.constraintlayout.core.widgets.d r10 = r9.f14928a
            r10.mo4387d1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mc1.mo23130h(boolean, int):boolean");
    }

    /* renamed from: i */
    public final void mo23131i(WidgetRun widgetRun, int i, ArrayList<ki5> arrayList) {
        for (jc1 next : widgetRun.f2486h.f2476k) {
            if (next instanceof DependencyNode) {
                mo23123a((DependencyNode) next, i, 0, widgetRun.f2487i, arrayList, (ki5) null);
            } else if (next instanceof WidgetRun) {
                mo23123a(((WidgetRun) next).f2486h, i, 0, widgetRun.f2487i, arrayList, (ki5) null);
            }
        }
        for (jc1 next2 : widgetRun.f2487i.f2476k) {
            if (next2 instanceof DependencyNode) {
                mo23123a((DependencyNode) next2, i, 1, widgetRun.f2486h, arrayList, (ki5) null);
            } else if (next2 instanceof WidgetRun) {
                mo23123a(((WidgetRun) next2).f2487i, i, 1, widgetRun.f2486h, arrayList, (ki5) null);
            }
        }
        if (i == 1) {
            for (jc1 next3 : ((C0482d) widgetRun).f2494k.f2476k) {
                if (next3 instanceof DependencyNode) {
                    mo23123a((DependencyNode) next3, i, 2, (DependencyNode) null, arrayList, (ki5) null);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo23132j() {
        this.f14929b = true;
    }

    /* renamed from: k */
    public void mo23133k() {
        this.f14930c = true;
    }

    /* renamed from: l */
    public final void mo23134l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        a00.C0000a aVar = this.f14935h;
        aVar.f9a = dimensionBehaviour;
        aVar.f10b = dimensionBehaviour2;
        aVar.f11c = i;
        aVar.f12d = i2;
        this.f14934g.mo9b(constraintWidget, aVar);
        constraintWidget.mo4399h1(this.f14935h.f13e);
        constraintWidget.mo4344I0(this.f14935h.f14f);
        constraintWidget.mo4342H0(this.f14935h.f16h);
        constraintWidget.mo4438x0(this.f14935h.f15g);
    }

    /* renamed from: m */
    public void mo23135m() {
        boolean z;
        C0478a aVar;
        Iterator<ConstraintWidget> it = this.f14928a.f18830U0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f2407a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.f2408a0;
                boolean z2 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = next.f2449v;
                int i2 = next.f2451w;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C0478a aVar2 = next.f2415e.f2483e;
                boolean z3 = aVar2.f2475j;
                C0478a aVar3 = next.f2417f.f2483e;
                boolean z4 = aVar3.f2475j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    mo23134l(next, dimensionBehaviour4, aVar2.f2472g, dimensionBehaviour4, aVar3.f2472g);
                    next.f2407a = true;
                } else if (z3 && z2) {
                    mo23134l(next, ConstraintWidget.DimensionBehaviour.FIXED, aVar2.f2472g, dimensionBehaviour3, aVar3.f2472g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f2417f.f2483e.f2491m = next.mo4441z();
                    } else {
                        next.f2417f.f2483e.mo4454d(next.mo4441z());
                        next.f2407a = true;
                    }
                } else if (z4 && z) {
                    mo23134l(next, dimensionBehaviour3, aVar2.f2472g, ConstraintWidget.DimensionBehaviour.FIXED, aVar3.f2472g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f2415e.f2483e.f2491m = next.mo4369V();
                    } else {
                        next.f2415e.f2483e.mo4454d(next.mo4369V());
                        next.f2407a = true;
                    }
                }
                if (next.f2407a && (aVar = next.f2417f.f2495l) != null) {
                    aVar.mo4454d(next.mo4424r());
                }
            }
        }
    }

    /* renamed from: n */
    public void mo23136n(a00.C0001b bVar) {
        this.f14934g = bVar;
    }
}
