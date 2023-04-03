package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.c */
/* compiled from: HorizontalWidgetRun */
public class C0480c extends WidgetRun {

    /* renamed from: k */
    public static int[] f2492k = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.c$a */
    /* compiled from: HorizontalWidgetRun */
    public static /* synthetic */ class C0481a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2493a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2493a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2493a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2493a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0480c.C0481a.<clinit>():void");
        }
    }

    public C0480c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2486h.f2470e = DependencyNode.Type.LEFT;
        this.f2487i.f2470e = DependencyNode.Type.RIGHT;
        this.f2484f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b9, code lost:
        if (r14 != 1) goto L_0x031e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141a(p000.jc1 r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.core.widgets.analyzer.C0480c.C0481a.f2493a
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = r8.f2488j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396R
            r3 = r17
            r8.mo4463n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo4464o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo4465p(r17)
        L_0x002e:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            boolean r0 = r0.f2475j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            int r3 = r0.f2449v
            if (r3 == r1) goto L_0x0301
            if (r3 == r2) goto L_0x0046
            goto L_0x031e
        L_0x0046:
            int r1 = r0.f2451w
            r3 = -1
            if (r1 == 0) goto L_0x008e
            if (r1 != r2) goto L_0x004e
            goto L_0x008e
        L_0x004e:
            int r0 = r0.mo4439y()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0087
        L_0x005a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2483e
            int r1 = r1.f2472g
            float r1 = (float) r1
            float r0 = r0.mo4437x()
            goto L_0x0084
        L_0x0068:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2483e
            int r1 = r1.f2472g
            float r1 = (float) r1
            float r0 = r0.mo4437x()
            float r1 = r1 / r0
            goto L_0x0085
        L_0x0077:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2483e
            int r1 = r1.f2472g
            float r1 = (float) r1
            float r0 = r0.mo4437x()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0085:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0087:
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2483e
            r1.mo4454d(r0)
            goto L_0x031e
        L_0x008e:
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r12 = r1.f2486h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r1.f2487i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2355f
            if (r1 == 0) goto L_0x009c
            r1 = r9
            goto L_0x009d
        L_0x009c:
            r1 = r10
        L_0x009d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 == 0) goto L_0x00a5
            r2 = r9
            goto L_0x00a6
        L_0x00a5:
            r2 = r10
        L_0x00a6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.f2396R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2355f
            if (r4 == 0) goto L_0x00ae
            r4 = r9
            goto L_0x00af
        L_0x00ae:
            r4 = r10
        L_0x00af:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2355f
            if (r5 == 0) goto L_0x00b7
            r5 = r9
            goto L_0x00b8
        L_0x00b7:
            r5 = r10
        L_0x00b8:
            int r14 = r0.mo4439y()
            if (r1 == 0) goto L_0x01ff
            if (r2 == 0) goto L_0x01ff
            if (r4 == 0) goto L_0x01ff
            if (r5 == 0) goto L_0x01ff
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            float r15 = r0.mo4437x()
            boolean r0 = r12.f2475j
            if (r0 == 0) goto L_0x012d
            boolean r0 = r13.f2475j
            if (r0 == 0) goto L_0x012d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            boolean r1 = r0.f2468c
            if (r1 == 0) goto L_0x012c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            boolean r1 = r1.f2468c
            if (r1 != 0) goto L_0x00df
            goto L_0x012c
        L_0x00df:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2486h
            int r1 = r1.f2471f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            int r1 = r1.f2471f
            int r3 = r0 - r1
            int r0 = r12.f2472g
            int r1 = r12.f2471f
            int r4 = r0 + r1
            int r0 = r13.f2472g
            int r1 = r13.f2471f
            int r5 = r0 - r1
            int[] r1 = f2492k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo4467q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            int[] r1 = f2492k
            r1 = r1[r10]
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            int[] r1 = f2492k
            r1 = r1[r9]
            r0.mo4454d(r1)
        L_0x012c:
            return
        L_0x012d:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            boolean r1 = r0.f2475j
            if (r1 == 0) goto L_0x018a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            boolean r2 = r1.f2475j
            if (r2 == 0) goto L_0x018a
            boolean r2 = r12.f2468c
            if (r2 == 0) goto L_0x0189
            boolean r2 = r13.f2468c
            if (r2 != 0) goto L_0x0142
            goto L_0x0189
        L_0x0142:
            int r2 = r0.f2472g
            int r0 = r0.f2471f
            int r2 = r2 + r0
            int r0 = r1.f2472g
            int r1 = r1.f2471f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            int r1 = r12.f2471f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            int r1 = r13.f2471f
            int r5 = r0 - r1
            int[] r1 = f2492k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo4467q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            int[] r1 = f2492k
            r1 = r1[r10]
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            int[] r1 = f2492k
            r1 = r1[r9]
            r0.mo4454d(r1)
            goto L_0x018a
        L_0x0189:
            return
        L_0x018a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            boolean r1 = r0.f2468c
            if (r1 == 0) goto L_0x01fe
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            boolean r1 = r1.f2468c
            if (r1 == 0) goto L_0x01fe
            boolean r1 = r12.f2468c
            if (r1 == 0) goto L_0x01fe
            boolean r1 = r13.f2468c
            if (r1 != 0) goto L_0x019f
            goto L_0x01fe
        L_0x019f:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2486h
            int r1 = r1.f2471f
            int r2 = r0 + r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            int r1 = r1.f2471f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r12.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            int r1 = r12.f2471f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r13.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            int r0 = r0.f2472g
            int r1 = r13.f2471f
            int r5 = r0 - r1
            int[] r1 = f2492k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.mo4467q(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            int[] r1 = f2492k
            r1 = r1[r10]
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            int[] r1 = f2492k
            r1 = r1[r9]
            r0.mo4454d(r1)
            goto L_0x031e
        L_0x01fe:
            return
        L_0x01ff:
            if (r1 == 0) goto L_0x0288
            if (r4 == 0) goto L_0x0288
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            boolean r0 = r0.f2468c
            if (r0 == 0) goto L_0x0287
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            boolean r0 = r0.f2468c
            if (r0 != 0) goto L_0x0211
            goto L_0x0287
        L_0x0211:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            float r0 = r0.mo4437x()
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2486h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f2477l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2486h
            int r2 = r2.f2471f
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.f2477l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f2487i
            int r4 = r4.f2471f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0264
            if (r14 == 0) goto L_0x0264
            if (r14 == r9) goto L_0x0241
            goto L_0x031e
        L_0x0241:
            int r2 = r2 - r1
            int r1 = r8.mo4458g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4458g(r2, r9)
            if (r2 == r3) goto L_0x0254
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0254:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            r0.mo4454d(r3)
            goto L_0x031e
        L_0x0264:
            int r2 = r2 - r1
            int r1 = r8.mo4458g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4458g(r2, r9)
            if (r2 == r3) goto L_0x0277
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0277:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            r0.mo4454d(r3)
            goto L_0x031e
        L_0x0287:
            return
        L_0x0288:
            if (r2 == 0) goto L_0x031e
            if (r5 == 0) goto L_0x031e
            boolean r0 = r12.f2468c
            if (r0 == 0) goto L_0x0300
            boolean r0 = r13.f2468c
            if (r0 != 0) goto L_0x0295
            goto L_0x0300
        L_0x0295:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            float r0 = r0.mo4437x()
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r12.f2477l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f2472g
            int r2 = r12.f2471f
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r13.f2477l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r2 = r2.f2472g
            int r4 = r13.f2471f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02de
            if (r14 == 0) goto L_0x02bc
            if (r14 == r9) goto L_0x02de
            goto L_0x031e
        L_0x02bc:
            int r2 = r2 - r1
            int r1 = r8.mo4458g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4458g(r2, r10)
            if (r2 == r3) goto L_0x02cf
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02cf:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            r0.mo4454d(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            r0.mo4454d(r1)
            goto L_0x031e
        L_0x02de:
            int r2 = r2 - r1
            int r1 = r8.mo4458g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo4458g(r2, r10)
            if (r2 == r3) goto L_0x02f1
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f1:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            r0.mo4454d(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2417f
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            r0.mo4454d(r1)
            goto L_0x031e
        L_0x0300:
            return
        L_0x0301:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mo4351M()
            if (r0 == 0) goto L_0x031e
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r0.f2415e
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2483e
            boolean r1 = r0.f2475j
            if (r1 == 0) goto L_0x031e
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2480b
            float r1 = r1.f2362A
            int r0 = r0.f2472g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2483e
            r1.mo4454d(r0)
        L_0x031e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            boolean r1 = r0.f2468c
            if (r1 == 0) goto L_0x043e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            boolean r2 = r1.f2468c
            if (r2 != 0) goto L_0x032c
            goto L_0x043e
        L_0x032c:
            boolean r0 = r0.f2475j
            if (r0 == 0) goto L_0x033b
            boolean r0 = r1.f2475j
            if (r0 == 0) goto L_0x033b
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            boolean r0 = r0.f2475j
            if (r0 == 0) goto L_0x033b
            return
        L_0x033b:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            boolean r0 = r0.f2475j
            if (r0 != 0) goto L_0x0385
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0385
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2480b
            int r1 = r0.f2449v
            if (r1 != 0) goto L_0x0385
            boolean r0 = r0.mo4398h0()
            if (r0 != 0) goto L_0x0385
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f2477l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2486h
            int r3 = r2.f2471f
            int r0 = r0 + r3
            int r1 = r1.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f2487i
            int r3 = r3.f2471f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo4454d(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            r0.mo4454d(r3)
            return
        L_0x0385:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            boolean r0 = r0.f2475j
            if (r0 != 0) goto L_0x03e9
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f2482d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03e9
            int r0 = r8.f2479a
            if (r0 != r9) goto L_0x03e9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03e9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03e9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f2477l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r0 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2486h
            int r2 = r2.f2471f
            int r0 = r0 + r2
            int r1 = r1.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2487i
            int r2 = r2.f2471f
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            int r0 = r0.f2491m
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2480b
            int r2 = r1.f2457z
            int r1 = r1.f2455y
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e4:
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2483e
            r1.mo4454d(r0)
        L_0x03e9:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            boolean r0 = r0.f2475j
            if (r0 != 0) goto L_0x03f0
            return
        L_0x03f0:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.f2477l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2487i
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r1 = r1.f2477l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r2 = r0.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.f2486h
            int r3 = r3.f2471f
            int r2 = r2 + r3
            int r3 = r1.f2472g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f2487i
            int r4 = r4.f2471f
            int r3 = r3 + r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.f2480b
            float r4 = r4.mo4327A()
            if (r0 != r1) goto L_0x041f
            int r2 = r0.f2472g
            int r3 = r1.f2472g
            r4 = r11
        L_0x041f:
            int r3 = r3 - r2
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2483e
            int r0 = r0.f2472g
            int r3 = r3 - r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo4454d(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2486h
            int r1 = r1.f2472g
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r8.f2483e
            int r2 = r2.f2472g
            int r1 = r1 + r2
            r0.mo4454d(r1)
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0480c.mo141a(jc1):void");
    }

    /* renamed from: d */
    public void mo142d() {
        ConstraintWidget M;
        ConstraintWidget M2;
        ConstraintWidget constraintWidget = this.f2480b;
        if (constraintWidget.f2407a) {
            this.f2483e.mo4454d(constraintWidget.mo4369V());
        }
        if (!this.f2483e.f2475j) {
            ConstraintWidget.DimensionBehaviour C = this.f2480b.mo4331C();
            this.f2482d = C;
            if (C != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (C == dimensionBehaviour && (M2 = this.f2480b.mo4351M()) != null && (M2.mo4331C() == ConstraintWidget.DimensionBehaviour.FIXED || M2.mo4331C() == dimensionBehaviour)) {
                    int V = (M2.mo4369V() - this.f2480b.f2392P.mo4310f()) - this.f2480b.f2396R.mo4310f();
                    mo4456b(this.f2486h, M2.f2415e.f2486h, this.f2480b.f2392P.mo4310f());
                    mo4456b(this.f2487i, M2.f2415e.f2487i, -this.f2480b.f2396R.mo4310f());
                    this.f2483e.mo4454d(V);
                    return;
                } else if (this.f2482d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f2483e.mo4454d(this.f2480b.mo4369V());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f2482d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour2 == dimensionBehaviour3 && (M = this.f2480b.mo4351M()) != null && (M.mo4331C() == ConstraintWidget.DimensionBehaviour.FIXED || M.mo4331C() == dimensionBehaviour3)) {
                mo4456b(this.f2486h, M.f2415e.f2486h, this.f2480b.f2392P.mo4310f());
                mo4456b(this.f2487i, M.f2415e.f2487i, -this.f2480b.f2396R.mo4310f());
                return;
            }
        }
        C0478a aVar = this.f2483e;
        if (aVar.f2475j) {
            ConstraintWidget constraintWidget2 = this.f2480b;
            if (constraintWidget2.f2407a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f2404X;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f2355f;
                if (constraintAnchor2 == null || constraintAnchorArr[1].f2355f == null) {
                    if (constraintAnchor2 != null) {
                        DependencyNode h = mo4459h(constraintAnchor);
                        if (h != null) {
                            mo4456b(this.f2486h, h, this.f2480b.f2404X[0].mo4310f());
                            mo4456b(this.f2487i, this.f2486h, this.f2483e.f2472g);
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                    if (constraintAnchor3.f2355f != null) {
                        DependencyNode h2 = mo4459h(constraintAnchor3);
                        if (h2 != null) {
                            mo4456b(this.f2487i, h2, -this.f2480b.f2404X[1].mo4310f());
                            mo4456b(this.f2486h, this.f2487i, -this.f2483e.f2472g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof vl2) && constraintWidget2.mo4351M() != null && this.f2480b.mo4422q(ConstraintAnchor.Type.CENTER).f2355f == null) {
                        mo4456b(this.f2486h, this.f2480b.mo4351M().f2415e.f2486h, this.f2480b.mo4371W());
                        mo4456b(this.f2487i, this.f2486h, this.f2483e.f2472g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget2.mo4398h0()) {
                    this.f2486h.f2471f = this.f2480b.f2404X[0].mo4310f();
                    this.f2487i.f2471f = -this.f2480b.f2404X[1].mo4310f();
                    return;
                } else {
                    DependencyNode h3 = mo4459h(this.f2480b.f2404X[0]);
                    if (h3 != null) {
                        mo4456b(this.f2486h, h3, this.f2480b.f2404X[0].mo4310f());
                    }
                    DependencyNode h4 = mo4459h(this.f2480b.f2404X[1]);
                    if (h4 != null) {
                        mo4456b(this.f2487i, h4, -this.f2480b.f2404X[1].mo4310f());
                    }
                    this.f2486h.f2467b = true;
                    this.f2487i.f2467b = true;
                    return;
                }
            }
        }
        if (this.f2482d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f2480b;
            int i = constraintWidget3.f2449v;
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
            } else if (i == 3) {
                if (constraintWidget3.f2451w == 3) {
                    this.f2486h.f2466a = this;
                    this.f2487i.f2466a = this;
                    C0482d dVar = constraintWidget3.f2417f;
                    dVar.f2486h.f2466a = this;
                    dVar.f2487i.f2466a = this;
                    aVar.f2466a = this;
                    if (constraintWidget3.mo4404j0()) {
                        this.f2483e.f2477l.add(this.f2480b.f2417f.f2483e);
                        this.f2480b.f2417f.f2483e.f2476k.add(this.f2483e);
                        C0482d dVar2 = this.f2480b.f2417f;
                        dVar2.f2483e.f2466a = this;
                        this.f2483e.f2477l.add(dVar2.f2486h);
                        this.f2483e.f2477l.add(this.f2480b.f2417f.f2487i);
                        this.f2480b.f2417f.f2486h.f2476k.add(this.f2483e);
                        this.f2480b.f2417f.f2487i.f2476k.add(this.f2483e);
                    } else if (this.f2480b.mo4398h0()) {
                        this.f2480b.f2417f.f2483e.f2477l.add(this.f2483e);
                        this.f2483e.f2476k.add(this.f2480b.f2417f.f2483e);
                    } else {
                        this.f2480b.f2417f.f2483e.f2477l.add(this.f2483e);
                    }
                } else {
                    C0478a aVar4 = constraintWidget3.f2417f.f2483e;
                    aVar.f2477l.add(aVar4);
                    aVar4.f2476k.add(this.f2483e);
                    this.f2480b.f2417f.f2486h.f2476k.add(this.f2483e);
                    this.f2480b.f2417f.f2487i.f2476k.add(this.f2483e);
                    C0478a aVar5 = this.f2483e;
                    aVar5.f2467b = true;
                    aVar5.f2476k.add(this.f2486h);
                    this.f2483e.f2476k.add(this.f2487i);
                    this.f2486h.f2477l.add(this.f2483e);
                    this.f2487i.f2477l.add(this.f2483e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f2480b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f2404X;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f2355f;
        if (constraintAnchor5 == null || constraintAnchorArr2[1].f2355f == null) {
            if (constraintAnchor5 != null) {
                DependencyNode h5 = mo4459h(constraintAnchor4);
                if (h5 != null) {
                    mo4456b(this.f2486h, h5, this.f2480b.f2404X[0].mo4310f());
                    mo4457c(this.f2487i, this.f2486h, 1, this.f2483e);
                    return;
                }
                return;
            }
            ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
            if (constraintAnchor6.f2355f != null) {
                DependencyNode h6 = mo4459h(constraintAnchor6);
                if (h6 != null) {
                    mo4456b(this.f2487i, h6, -this.f2480b.f2404X[1].mo4310f());
                    mo4457c(this.f2486h, this.f2487i, -1, this.f2483e);
                }
            } else if (!(constraintWidget4 instanceof vl2) && constraintWidget4.mo4351M() != null) {
                mo4456b(this.f2486h, this.f2480b.mo4351M().f2415e.f2486h, this.f2480b.mo4371W());
                mo4457c(this.f2487i, this.f2486h, 1, this.f2483e);
            }
        } else if (constraintWidget4.mo4398h0()) {
            this.f2486h.f2471f = this.f2480b.f2404X[0].mo4310f();
            this.f2487i.f2471f = -this.f2480b.f2404X[1].mo4310f();
        } else {
            DependencyNode h7 = mo4459h(this.f2480b.f2404X[0]);
            DependencyNode h8 = mo4459h(this.f2480b.f2404X[1]);
            if (h7 != null) {
                h7.mo4452b(this);
            }
            if (h8 != null) {
                h8.mo4452b(this);
            }
            this.f2488j = WidgetRun.RunType.CENTER;
        }
    }

    /* renamed from: e */
    public void mo143e() {
        DependencyNode dependencyNode = this.f2486h;
        if (dependencyNode.f2475j) {
            this.f2480b.mo4405j1(dependencyNode.f2472g);
        }
    }

    /* renamed from: f */
    public void mo144f() {
        this.f2481c = null;
        this.f2486h.mo4453c();
        this.f2487i.mo4453c();
        this.f2483e.mo4453c();
        this.f2485g = false;
    }

    /* renamed from: m */
    public boolean mo146m() {
        if (this.f2482d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2480b.f2449v == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void mo4467q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* renamed from: r */
    public void mo4468r() {
        this.f2485g = false;
        this.f2486h.mo4453c();
        this.f2486h.f2475j = false;
        this.f2487i.mo4453c();
        this.f2487i.f2475j = false;
        this.f2483e.f2475j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f2480b.mo4433v();
    }
}
