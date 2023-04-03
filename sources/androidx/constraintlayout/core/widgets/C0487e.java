package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.e */
/* compiled from: Flow */
public class C0487e extends C0493i {

    /* renamed from: A1 */
    public int f2549A1 = -1;

    /* renamed from: B1 */
    public int f2550B1 = 0;

    /* renamed from: C1 */
    public ArrayList<C0488a> f2551C1 = new ArrayList<>();

    /* renamed from: D1 */
    public ConstraintWidget[] f2552D1 = null;

    /* renamed from: E1 */
    public ConstraintWidget[] f2553E1 = null;

    /* renamed from: F1 */
    public int[] f2554F1 = null;

    /* renamed from: G1 */
    public ConstraintWidget[] f2555G1;

    /* renamed from: H1 */
    public int f2556H1 = 0;

    /* renamed from: j1 */
    public int f2557j1 = -1;

    /* renamed from: k1 */
    public int f2558k1 = -1;

    /* renamed from: l1 */
    public int f2559l1 = -1;

    /* renamed from: m1 */
    public int f2560m1 = -1;

    /* renamed from: n1 */
    public int f2561n1 = -1;

    /* renamed from: o1 */
    public int f2562o1 = -1;

    /* renamed from: p1 */
    public float f2563p1 = 0.5f;

    /* renamed from: q1 */
    public float f2564q1 = 0.5f;

    /* renamed from: r1 */
    public float f2565r1 = 0.5f;

    /* renamed from: s1 */
    public float f2566s1 = 0.5f;

    /* renamed from: t1 */
    public float f2567t1 = 0.5f;

    /* renamed from: u1 */
    public float f2568u1 = 0.5f;

    /* renamed from: v1 */
    public int f2569v1 = 0;

    /* renamed from: w1 */
    public int f2570w1 = 0;

    /* renamed from: x1 */
    public int f2571x1 = 2;

    /* renamed from: y1 */
    public int f2572y1 = 2;

    /* renamed from: z1 */
    public int f2573z1 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.e$a */
    /* compiled from: Flow */
    public class C0488a {

        /* renamed from: a */
        public int f2574a;

        /* renamed from: b */
        public ConstraintWidget f2575b = null;

        /* renamed from: c */
        public int f2576c = 0;

        /* renamed from: d */
        public ConstraintAnchor f2577d;

        /* renamed from: e */
        public ConstraintAnchor f2578e;

        /* renamed from: f */
        public ConstraintAnchor f2579f;

        /* renamed from: g */
        public ConstraintAnchor f2580g;

        /* renamed from: h */
        public int f2581h = 0;

        /* renamed from: i */
        public int f2582i = 0;

        /* renamed from: j */
        public int f2583j = 0;

        /* renamed from: k */
        public int f2584k = 0;

        /* renamed from: l */
        public int f2585l = 0;

        /* renamed from: m */
        public int f2586m = 0;

        /* renamed from: n */
        public int f2587n = 0;

        /* renamed from: o */
        public int f2588o = 0;

        /* renamed from: p */
        public int f2589p = 0;

        /* renamed from: q */
        public int f2590q = 0;

        public C0488a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f2574a = i;
            this.f2577d = constraintAnchor;
            this.f2578e = constraintAnchor2;
            this.f2579f = constraintAnchor3;
            this.f2580g = constraintAnchor4;
            this.f2581h = C0487e.this.mo4571w1();
            this.f2582i = C0487e.this.mo4573y1();
            this.f2583j = C0487e.this.mo4572x1();
            this.f2584k = C0487e.this.mo4570v1();
            this.f2590q = i2;
        }

        /* renamed from: b */
        public void mo4533b(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f2574a == 0) {
                int Y1 = C0487e.this.mo4514i2(constraintWidget, this.f2590q);
                if (constraintWidget.mo4331C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2589p++;
                    Y1 = 0;
                }
                int M1 = C0487e.this.f2569v1;
                if (constraintWidget.mo4367U() != 8) {
                    i = M1;
                }
                this.f2585l += Y1 + i;
                int Z1 = C0487e.this.mo4513h2(constraintWidget, this.f2590q);
                if (this.f2575b == null || this.f2576c < Z1) {
                    this.f2575b = constraintWidget;
                    this.f2576c = Z1;
                    this.f2586m = Z1;
                }
            } else {
                int Y12 = C0487e.this.mo4514i2(constraintWidget, this.f2590q);
                int Z12 = C0487e.this.mo4513h2(constraintWidget, this.f2590q);
                if (constraintWidget.mo4363S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2589p++;
                    Z12 = 0;
                }
                int N1 = C0487e.this.f2570w1;
                if (constraintWidget.mo4367U() != 8) {
                    i = N1;
                }
                this.f2586m += Z12 + i;
                if (this.f2575b == null || this.f2576c < Y12) {
                    this.f2575b = constraintWidget;
                    this.f2576c = Y12;
                    this.f2585l = Y12;
                }
            }
            this.f2588o++;
        }

        /* renamed from: c */
        public void mo4534c() {
            this.f2576c = 0;
            this.f2575b = null;
            this.f2585l = 0;
            this.f2586m = 0;
            this.f2587n = 0;
            this.f2588o = 0;
            this.f2589p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4535d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f2588o
                r2 = 0
                r3 = r2
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f2587n
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.e r5 = androidx.constraintlayout.core.widgets.C0487e.this
                int r5 = r5.f2556H1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.core.widgets.e r4 = androidx.constraintlayout.core.widgets.C0487e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.f2555G1
                int r5 = r0.f2587n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.mo4432u0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0384
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2575b
                if (r3 != 0) goto L_0x002f
                goto L_0x0384
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = r2
            L_0x0036:
                r5 = -1
                r6 = r2
                r7 = r5
                r8 = r7
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f2587n
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2556H1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0487e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.f2555G1
                int r11 = r0.f2587n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.mo4367U()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                r6 = 0
                int r9 = r0.f2574a
                if (r9 != 0) goto L_0x020e
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.f2575b
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0487e.this
                int r10 = r10.f2558k1
                r9.mo4382b1(r10)
                int r10 = r0.f2582i
                if (r18 <= 0) goto L_0x0084
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2570w1
                int r10 = r10 + r11
            L_0x0084:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f2394Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f2578e
                r11.mo4305a(r12, r10)
                if (r19 == 0) goto L_0x0096
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2580g
                int r12 = r0.f2584k
                r10.mo4305a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2578e
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f2353d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f2394Q
                r10.mo4305a(r11, r2)
            L_0x00a3:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0487e.this
                int r10 = r10.f2572y1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r9.mo4375Y()
                if (r10 != 0) goto L_0x00dd
                r10 = r2
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f2587n
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.e r14 = androidx.constraintlayout.core.widgets.C0487e.this
                int r14 = r14.f2556H1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r13.f2555G1
                int r14 = r0.f2587n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo4375Y()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r9
            L_0x00de:
                r10 = r2
            L_0x00df:
                if (r10 >= r1) goto L_0x0384
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f2587n
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C0487e.this
                int r15 = r15.f2556H1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0384
            L_0x00f5:
                androidx.constraintlayout.core.widgets.e r14 = androidx.constraintlayout.core.widgets.C0487e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r14.f2555G1
                int r15 = r0.f2587n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r6
                r6 = r11
                goto L_0x0208
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2577d
                int r3 = r0.f2581h
                r14.mo4409l(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0487e.this
                int r3 = r3.f2557j1
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                float r13 = r13.f2563p1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f2587n
                if (r15 != 0) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C0487e.this
                int r15 = r15.f2559l1
                if (r15 == r5) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0487e.this
                int r3 = r3.f2559l1
                if (r17 == 0) goto L_0x0141
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                float r13 = r13.f2565r1
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                float r11 = r11.f2565r1
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C0487e.this
                int r15 = r15.f2561n1
                if (r15 == r5) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0487e.this
                int r3 = r3.f2561n1
                if (r17 == 0) goto L_0x0162
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                float r13 = r13.f2567t1
                goto L_0x013f
            L_0x0162:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                float r11 = r11.f2567t1
                goto L_0x0147
            L_0x0169:
                r14.mo4348K0(r3)
                r14.mo4346J0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2579f
                int r13 = r0.f2583j
                r14.mo4409l(r3, r11, r13)
            L_0x017c:
                if (r6 == 0) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f2396R
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                int r13 = r13.f2569v1
                r3.mo4305a(r11, r13)
                if (r10 != r7) goto L_0x0194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2392P
                int r11 = r0.f2581h
                r3.mo4326u(r11)
            L_0x0194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.f2392P
                r3.mo4305a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.f2396R
                int r6 = r0.f2583j
                r3.mo4326u(r6)
            L_0x01a7:
                if (r14 == r9) goto L_0x0207
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0487e.this
                int r3 = r3.f2572y1
                r6 = 3
                if (r3 != r6) goto L_0x01c8
                boolean r3 = r12.mo4375Y()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.mo4375Y()
                if (r3 == 0) goto L_0x01c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2400T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.f2400T
                r3.mo4305a(r11, r2)
                goto L_0x0208
            L_0x01c8:
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0487e.this
                int r3 = r3.f2572y1
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2394Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2578e
                int r13 = r0.f2582i
                r3.mo4305a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2580g
                int r13 = r0.f2584k
                r3.mo4305a(r11, r13)
                goto L_0x0208
            L_0x01e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2394Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f2394Q
                r3.mo4305a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f2398S
                r3.mo4305a(r11, r2)
                goto L_0x0208
            L_0x01f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f2398S
                r3.mo4305a(r11, r2)
                goto L_0x0208
            L_0x01ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.f2394Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.f2394Q
                r3.mo4305a(r11, r2)
                goto L_0x0208
            L_0x0207:
                r6 = 3
            L_0x0208:
                int r10 = r10 + 1
                r11 = r6
                r6 = r14
                goto L_0x00df
            L_0x020e:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2575b
                androidx.constraintlayout.core.widgets.e r9 = androidx.constraintlayout.core.widgets.C0487e.this
                int r9 = r9.f2557j1
                r3.mo4348K0(r9)
                int r9 = r0.f2581h
                if (r18 <= 0) goto L_0x0224
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0487e.this
                int r10 = r10.f2569v1
                int r9 = r9 + r10
            L_0x0224:
                if (r17 == 0) goto L_0x0246
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2579f
                r10.mo4305a(r11, r9)
                if (r19 == 0) goto L_0x0238
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2577d
                int r11 = r0.f2583j
                r9.mo4305a(r10, r11)
            L_0x0238:
                if (r18 <= 0) goto L_0x0265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f2579f
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.f2353d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f2396R
                r9.mo4305a(r10, r2)
                goto L_0x0265
            L_0x0246:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2577d
                r10.mo4305a(r11, r9)
                if (r19 == 0) goto L_0x0258
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2579f
                int r11 = r0.f2583j
                r9.mo4305a(r10, r11)
            L_0x0258:
                if (r18 <= 0) goto L_0x0265
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f2577d
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.f2353d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f2392P
                r9.mo4305a(r10, r2)
            L_0x0265:
                r9 = r2
            L_0x0266:
                if (r9 >= r1) goto L_0x0384
                int r10 = r0.f2587n
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2556H1
                if (r10 < r11) goto L_0x0275
                goto L_0x0384
            L_0x0275:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0487e.this
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.f2555G1
                int r11 = r0.f2587n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0285
                r12 = 1
                goto L_0x0380
            L_0x0285:
                if (r9 != 0) goto L_0x02d1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f2394Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f2578e
                int r13 = r0.f2582i
                r10.mo4409l(r11, r12, r13)
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2558k1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C0487e.this
                float r12 = r12.f2564q1
                int r13 = r0.f2587n
                if (r13 != 0) goto L_0x02b5
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                int r13 = r13.f2560m1
                if (r13 == r5) goto L_0x02b5
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2560m1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C0487e.this
                float r12 = r12.f2566s1
                goto L_0x02cb
            L_0x02b5:
                if (r19 == 0) goto L_0x02cb
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                int r13 = r13.f2562o1
                if (r13 == r5) goto L_0x02cb
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2562o1
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C0487e.this
                float r12 = r12.f2568u1
            L_0x02cb:
                r10.mo4382b1(r11)
                r10.mo4380a1(r12)
            L_0x02d1:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02de
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f2580g
                int r13 = r0.f2584k
                r10.mo4409l(r11, r12, r13)
            L_0x02de:
                if (r6 == 0) goto L_0x0309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f2394Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.f2398S
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0487e.this
                int r13 = r13.f2570w1
                r11.mo4305a(r12, r13)
                if (r9 != r7) goto L_0x02f6
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.f2394Q
                int r12 = r0.f2582i
                r11.mo4326u(r12)
            L_0x02f6:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f2398S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.f2394Q
                r11.mo4305a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x0309
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f2398S
                int r11 = r0.f2584k
                r6.mo4326u(r11)
            L_0x0309:
                if (r10 == r3) goto L_0x037e
                r6 = 2
                if (r17 == 0) goto L_0x033b
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2571x1
                if (r11 == 0) goto L_0x0333
                r12 = 1
                if (r11 == r12) goto L_0x032b
                if (r11 == r6) goto L_0x031c
                goto L_0x037e
            L_0x031c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2392P
                r6.mo4305a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2396R
                r6.mo4305a(r11, r2)
                goto L_0x037e
            L_0x032b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2392P
                r6.mo4305a(r11, r2)
                goto L_0x037e
            L_0x0333:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2396R
                r6.mo4305a(r11, r2)
                goto L_0x037e
            L_0x033b:
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0487e.this
                int r11 = r11.f2571x1
                if (r11 == 0) goto L_0x0375
                r12 = 1
                if (r11 == r12) goto L_0x036d
                if (r11 == r6) goto L_0x0349
                goto L_0x037f
            L_0x0349:
                if (r4 == 0) goto L_0x035e
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2577d
                int r13 = r0.f2581h
                r6.mo4305a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2579f
                int r13 = r0.f2583j
                r6.mo4305a(r11, r13)
                goto L_0x037f
            L_0x035e:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2392P
                r6.mo4305a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2396R
                r6.mo4305a(r11, r2)
                goto L_0x037f
            L_0x036d:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2396R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2396R
                r6.mo4305a(r11, r2)
                goto L_0x037f
            L_0x0375:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.f2392P
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.f2392P
                r6.mo4305a(r11, r2)
                goto L_0x037f
            L_0x037e:
                r12 = 1
            L_0x037f:
                r6 = r10
            L_0x0380:
                int r9 = r9 + 1
                goto L_0x0266
            L_0x0384:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0487e.C0488a.mo4535d(boolean, int, boolean):void");
        }

        /* renamed from: e */
        public int mo4536e() {
            if (this.f2574a == 1) {
                return this.f2586m - C0487e.this.f2570w1;
            }
            return this.f2586m;
        }

        /* renamed from: f */
        public int mo4537f() {
            if (this.f2574a == 0) {
                return this.f2585l - C0487e.this.f2569v1;
            }
            return this.f2585l;
        }

        /* renamed from: g */
        public void mo4538g(int i) {
            int i2 = this.f2589p;
            if (i2 != 0) {
                int i3 = this.f2588o;
                int i4 = i / i2;
                int i5 = 0;
                while (i5 < i3 && this.f2587n + i5 < C0487e.this.f2556H1) {
                    ConstraintWidget constraintWidget = C0487e.this.f2555G1[this.f2587n + i5];
                    if (this.f2574a == 0) {
                        if (constraintWidget != null && constraintWidget.mo4331C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2449v == 0) {
                            C0487e.this.mo4552A1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.mo4363S(), constraintWidget.mo4441z());
                        }
                    } else if (constraintWidget != null && constraintWidget.mo4363S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2451w == 0) {
                        C0487e.this.mo4552A1(constraintWidget, constraintWidget.mo4331C(), constraintWidget.mo4369V(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                    }
                    i5++;
                }
                mo4539h();
            }
        }

        /* renamed from: h */
        public final void mo4539h() {
            this.f2585l = 0;
            this.f2586m = 0;
            this.f2575b = null;
            this.f2576c = 0;
            int i = this.f2588o;
            int i2 = 0;
            while (i2 < i && this.f2587n + i2 < C0487e.this.f2556H1) {
                ConstraintWidget constraintWidget = C0487e.this.f2555G1[this.f2587n + i2];
                if (this.f2574a == 0) {
                    int V = constraintWidget.mo4369V();
                    int M1 = C0487e.this.f2569v1;
                    if (constraintWidget.mo4367U() == 8) {
                        M1 = 0;
                    }
                    this.f2585l += V + M1;
                    int Z1 = C0487e.this.mo4513h2(constraintWidget, this.f2590q);
                    if (this.f2575b == null || this.f2576c < Z1) {
                        this.f2575b = constraintWidget;
                        this.f2576c = Z1;
                        this.f2586m = Z1;
                    }
                } else {
                    int Y1 = C0487e.this.mo4514i2(constraintWidget, this.f2590q);
                    int Z12 = C0487e.this.mo4513h2(constraintWidget, this.f2590q);
                    int N1 = C0487e.this.f2570w1;
                    if (constraintWidget.mo4367U() == 8) {
                        N1 = 0;
                    }
                    this.f2586m += Z12 + N1;
                    if (this.f2575b == null || this.f2576c < Y1) {
                        this.f2575b = constraintWidget;
                        this.f2576c = Y1;
                        this.f2585l = Y1;
                    }
                }
                i2++;
            }
        }

        /* renamed from: i */
        public void mo4540i(int i) {
            this.f2587n = i;
        }

        /* renamed from: j */
        public void mo4541j(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f2574a = i;
            this.f2577d = constraintAnchor;
            this.f2578e = constraintAnchor2;
            this.f2579f = constraintAnchor3;
            this.f2580g = constraintAnchor4;
            this.f2581h = i2;
            this.f2582i = i3;
            this.f2583j = i4;
            this.f2584k = i5;
            this.f2590q = i6;
        }
    }

    /* renamed from: A2 */
    public void mo4506A2(int i) {
        this.f2550B1 = i;
    }

    /* renamed from: B2 */
    public void mo4507B2(int i) {
        this.f2572y1 = i;
    }

    /* renamed from: C2 */
    public void mo4508C2(float f) {
        this.f2564q1 = f;
    }

    /* renamed from: D2 */
    public void mo4509D2(int i) {
        this.f2570w1 = i;
    }

    /* renamed from: E2 */
    public void mo4510E2(int i) {
        this.f2558k1 = i;
    }

    /* renamed from: F2 */
    public void mo4511F2(int i) {
        this.f2573z1 = i;
    }

    /* renamed from: g */
    public void mo4394g(C0467c cVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        super.mo4394g(cVar, z);
        if (mo4351M() == null || !((C0486d) mo4351M()).mo4486M1()) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i = this.f2573z1;
        if (i != 0) {
            if (i == 1) {
                int size = this.f2551C1.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0488a aVar = this.f2551C1.get(i2);
                    if (i2 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.mo4535d(z2, i2, z3);
                }
            } else if (i == 2) {
                mo4512g2(z2);
            } else if (i == 3) {
                int size2 = this.f2551C1.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0488a aVar2 = this.f2551C1.get(i3);
                    if (i3 == size2 - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aVar2.mo4535d(z2, i3, z4);
                }
            }
        } else if (this.f2551C1.size() > 0) {
            this.f2551C1.get(0).mo4535d(z2, 0, true);
        }
        mo4555D1(false);
    }

    /* renamed from: g2 */
    public final void mo4512g2(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.f2554F1 != null && this.f2553E1 != null && this.f2552D1 != null) {
            for (int i2 = 0; i2 < this.f2556H1; i2++) {
                this.f2555G1[i2].mo4432u0();
            }
            int[] iArr = this.f2554F1;
            int i3 = iArr[0];
            int i4 = iArr[1];
            ConstraintWidget constraintWidget2 = null;
            float f2 = this.f2563p1;
            int i5 = 0;
            while (i5 < i3) {
                if (z) {
                    i = (i3 - i5) - 1;
                    f = 1.0f - this.f2563p1;
                } else {
                    f = f2;
                    i = i5;
                }
                ConstraintWidget constraintWidget3 = this.f2553E1[i];
                if (!(constraintWidget3 == null || constraintWidget3.mo4367U() == 8)) {
                    if (i5 == 0) {
                        constraintWidget3.mo4409l(constraintWidget3.f2392P, this.f2392P, mo4571w1());
                        constraintWidget3.mo4348K0(this.f2557j1);
                        constraintWidget3.mo4346J0(f);
                    }
                    if (i5 == i3 - 1) {
                        constraintWidget3.mo4409l(constraintWidget3.f2396R, this.f2396R, mo4572x1());
                    }
                    if (i5 > 0 && constraintWidget2 != null) {
                        constraintWidget3.mo4409l(constraintWidget3.f2392P, constraintWidget2.f2396R, this.f2569v1);
                        constraintWidget2.mo4409l(constraintWidget2.f2396R, constraintWidget3.f2392P, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i5++;
                f2 = f;
            }
            for (int i6 = 0; i6 < i4; i6++) {
                ConstraintWidget constraintWidget4 = this.f2552D1[i6];
                if (!(constraintWidget4 == null || constraintWidget4.mo4367U() == 8)) {
                    if (i6 == 0) {
                        constraintWidget4.mo4409l(constraintWidget4.f2394Q, this.f2394Q, mo4573y1());
                        constraintWidget4.mo4382b1(this.f2558k1);
                        constraintWidget4.mo4380a1(this.f2564q1);
                    }
                    if (i6 == i4 - 1) {
                        constraintWidget4.mo4409l(constraintWidget4.f2398S, this.f2398S, mo4570v1());
                    }
                    if (i6 > 0 && constraintWidget2 != null) {
                        constraintWidget4.mo4409l(constraintWidget4.f2394Q, constraintWidget2.f2398S, this.f2570w1);
                        constraintWidget2.mo4409l(constraintWidget2.f2398S, constraintWidget4.f2394Q, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i7 = 0; i7 < i3; i7++) {
                for (int i8 = 0; i8 < i4; i8++) {
                    int i9 = (i8 * i3) + i7;
                    if (this.f2550B1 == 1) {
                        i9 = (i7 * i4) + i8;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.f2555G1;
                    if (!(i9 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i9]) == null || constraintWidget.mo4367U() == 8)) {
                        ConstraintWidget constraintWidget5 = this.f2553E1[i7];
                        ConstraintWidget constraintWidget6 = this.f2552D1[i8];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.mo4409l(constraintWidget.f2392P, constraintWidget5.f2392P, 0);
                            constraintWidget.mo4409l(constraintWidget.f2396R, constraintWidget5.f2396R, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.mo4409l(constraintWidget.f2394Q, constraintWidget6.f2394Q, 0);
                            constraintWidget.mo4409l(constraintWidget.f2398S, constraintWidget6.f2398S, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h2 */
    public final int mo4513h2(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mo4363S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f2451w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f2368D * ((float) i));
                if (i3 != constraintWidget.mo4441z()) {
                    constraintWidget.mo4370V0(true);
                    mo4552A1(constraintWidget, constraintWidget.mo4331C(), constraintWidget.mo4369V(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo4441z();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo4369V()) * constraintWidget.f2416e0) + 0.5f);
                }
            }
        }
        return constraintWidget.mo4441z();
    }

    /* renamed from: i2 */
    public final int mo4514i2(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.mo4331C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f2449v;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f2362A * ((float) i));
                if (i3 != constraintWidget.mo4369V()) {
                    constraintWidget.mo4370V0(true);
                    mo4552A1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.mo4363S(), constraintWidget.mo4441z());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo4369V();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo4441z()) * constraintWidget.f2416e0) + 0.5f);
                }
            }
        }
        return constraintWidget.mo4369V();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005e  */
    /* renamed from: j2 */
    public final void mo4515j2(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0026
            int r1 = r10.f2549A1
            if (r1 > 0) goto L_0x0023
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.f2569v1
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.mo4514i2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = r0
            goto L_0x0047
        L_0x0026:
            int r1 = r10.f2549A1
            if (r1 > 0) goto L_0x0046
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x002d:
            if (r2 >= r12) goto L_0x0046
            if (r2 <= 0) goto L_0x0034
            int r4 = r10.f2570w1
            int r3 = r3 + r4
        L_0x0034:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            int r4 = r10.mo4513h2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            int r1 = r1 + 1
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0046:
            r2 = r0
        L_0x0047:
            int[] r3 = r10.f2554F1
            if (r3 != 0) goto L_0x0050
            r3 = 2
            int[] r3 = new int[r3]
            r10.f2554F1 = r3
        L_0x0050:
            r3 = 1
            if (r1 != 0) goto L_0x0055
            if (r13 == r3) goto L_0x0059
        L_0x0055:
            if (r2 != 0) goto L_0x005b
            if (r13 != 0) goto L_0x005b
        L_0x0059:
            r4 = r3
            goto L_0x005c
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 != 0) goto L_0x011d
            if (r13 != 0) goto L_0x006a
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0073
        L_0x006a:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0073:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.f2553E1
            r6 = 0
            if (r5 == 0) goto L_0x0080
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0084
        L_0x0080:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r2]
            r10.f2553E1 = r5
        L_0x0084:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r10.f2552D1
            if (r5 == 0) goto L_0x0090
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0094
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r10.f2552D1 = r5
        L_0x0094:
            r5 = r0
        L_0x0095:
            if (r5 >= r2) goto L_0x00d9
            r6 = r0
        L_0x0098:
            if (r6 >= r1) goto L_0x00d6
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a2
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a2:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a6
            goto L_0x00d3
        L_0x00a6:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00ab
            goto L_0x00d3
        L_0x00ab:
            int r8 = r10.mo4514i2(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.f2553E1
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00bb
            int r9 = r9.mo4369V()
            if (r9 >= r8) goto L_0x00bf
        L_0x00bb:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f2553E1
            r8[r5] = r7
        L_0x00bf:
            int r8 = r10.mo4513h2(r7, r14)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r10.f2552D1
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cf
            int r9 = r9.mo4441z()
            if (r9 >= r8) goto L_0x00d3
        L_0x00cf:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f2552D1
            r8[r6] = r7
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x0098
        L_0x00d6:
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00d9:
            r5 = r0
            r6 = r5
        L_0x00db:
            if (r5 >= r2) goto L_0x00f0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r10.f2553E1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00ed
            if (r5 <= 0) goto L_0x00e8
            int r8 = r10.f2569v1
            int r6 = r6 + r8
        L_0x00e8:
            int r7 = r10.mo4514i2(r7, r14)
            int r6 = r6 + r7
        L_0x00ed:
            int r5 = r5 + 1
            goto L_0x00db
        L_0x00f0:
            r5 = r0
            r7 = r5
        L_0x00f2:
            if (r5 >= r1) goto L_0x0107
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r10.f2552D1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0104
            if (r5 <= 0) goto L_0x00ff
            int r9 = r10.f2570w1
            int r7 = r7 + r9
        L_0x00ff:
            int r8 = r10.mo4513h2(r8, r14)
            int r7 = r7 + r8
        L_0x0104:
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x0107:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0115
            if (r6 <= r14) goto L_0x0059
            if (r2 <= r3) goto L_0x0059
            int r2 = r2 + -1
            goto L_0x005c
        L_0x0115:
            if (r7 <= r14) goto L_0x0059
            if (r1 <= r3) goto L_0x0059
            int r1 = r1 + -1
            goto L_0x005c
        L_0x011d:
            int[] r11 = r10.f2554F1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0487e.mo4515j2(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    /* renamed from: k2 */
    public final void mo4516k2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        int i7;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f2551C1.clear();
            C0488a aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
            this.f2551C1.add(aVar);
            if (i2 == 0) {
                i4 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i13 < i10) {
                    ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                    int i22 = mo4514i2(constraintWidget, i11);
                    if (constraintWidget.mo4331C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i14 = i4;
                    if ((i12 == i11 || this.f2569v1 + i12 + i22 > i11) && aVar.f2575b != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && i13 > 0 && (i9 = this.f2549A1) > 0 && i13 % i9 == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
                        aVar.mo4540i(i13);
                        this.f2551C1.add(aVar);
                    } else if (i13 > 0) {
                        i12 += this.f2569v1 + i22;
                        aVar.mo4533b(constraintWidget);
                        i13++;
                        i4 = i14;
                    }
                    i12 = i22;
                    aVar.mo4533b(constraintWidget);
                    i13++;
                    i4 = i14;
                }
            } else {
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < i10) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                    int h2 = mo4513h2(constraintWidget2, i11);
                    if (constraintWidget2.mo4363S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i18 = i4;
                    if ((i16 == i11 || this.f2570w1 + i16 + h2 > i11) && aVar.f2575b != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i17 > 0 && (i8 = this.f2549A1) > 0 && i17 % i8 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
                        aVar.mo4540i(i17);
                        this.f2551C1.add(aVar);
                    } else if (i17 > 0) {
                        i16 += this.f2570w1 + h2;
                        aVar.mo4533b(constraintWidget2);
                        i17++;
                        i15 = i18;
                    }
                    i16 = h2;
                    aVar.mo4533b(constraintWidget2);
                    i17++;
                    i15 = i18;
                }
            }
            int size = this.f2551C1.size();
            ConstraintAnchor constraintAnchor3 = this.f2392P;
            ConstraintAnchor constraintAnchor4 = this.f2394Q;
            ConstraintAnchor constraintAnchor5 = this.f2396R;
            ConstraintAnchor constraintAnchor6 = this.f2398S;
            int w1 = mo4571w1();
            int y1 = mo4573y1();
            int x1 = mo4572x1();
            int v1 = mo4570v1();
            ConstraintWidget.DimensionBehaviour C = mo4331C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (C == dimensionBehaviour || mo4363S() == dimensionBehaviour) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0 && z) {
                for (int i19 = 0; i19 < size; i19++) {
                    C0488a aVar2 = this.f2551C1.get(i19);
                    if (i2 == 0) {
                        aVar2.mo4538g(i11 - aVar2.mo4537f());
                    } else {
                        aVar2.mo4538g(i11 - aVar2.mo4536e());
                    }
                }
            }
            int i20 = y1;
            int i21 = x1;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = w1;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i27 = v1;
            while (i25 < size) {
                C0488a aVar3 = this.f2551C1.get(i25);
                if (i2 == 0) {
                    if (i25 < size - 1) {
                        constraintAnchor2 = this.f2551C1.get(i25 + 1).f2575b.f2394Q;
                        i7 = 0;
                    } else {
                        constraintAnchor2 = this.f2398S;
                        i7 = mo4570v1();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar3.f2575b.f2398S;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i28 = i23;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i29 = i24;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i5 = i25;
                    aVar3.mo4541j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i26, i20, i21, i7, i3);
                    int max = Math.max(i29, aVar3.mo4537f());
                    i23 = i28 + aVar3.mo4536e();
                    if (i5 > 0) {
                        i23 += this.f2570w1;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i24 = max;
                    i20 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i30 = i7;
                    constraintAnchor6 = constraintAnchor2;
                    i27 = i30;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i31 = i23;
                    int i32 = i24;
                    i5 = i25;
                    if (i5 < size - 1) {
                        constraintAnchor = this.f2551C1.get(i5 + 1).f2575b.f2392P;
                        i6 = 0;
                    } else {
                        constraintAnchor = this.f2396R;
                        i6 = mo4572x1();
                    }
                    ConstraintAnchor constraintAnchor16 = aVar3.f2575b.f2396R;
                    aVar3.mo4541j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i26, i20, i6, i27, i3);
                    i24 = i32 + aVar3.mo4537f();
                    int max2 = Math.max(i31, aVar3.mo4536e());
                    if (i5 > 0) {
                        i24 += this.f2569v1;
                    }
                    i23 = max2;
                    i26 = 0;
                    i21 = i6;
                    constraintAnchor8 = constraintAnchor16;
                }
                i25 = i5 + 1;
                int i33 = i3;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i24;
            iArr[1] = i23;
        }
    }

    /* renamed from: l2 */
    public final void mo4517l2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        boolean z;
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        int i7;
        ConstraintAnchor constraintAnchor2;
        boolean z2;
        int i8;
        boolean z3;
        int i9;
        int i10 = i;
        int i11 = i3;
        if (i10 != 0) {
            this.f2551C1.clear();
            C0488a aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
            this.f2551C1.add(aVar);
            if (i2 == 0) {
                int i12 = 0;
                i4 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i14 < i10) {
                    int i15 = i12 + 1;
                    ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                    int i22 = mo4514i2(constraintWidget, i11);
                    if (constraintWidget.mo4331C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i16 = i4;
                    if ((i13 == i11 || this.f2569v1 + i13 + i22 > i11) && aVar.f2575b != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && i14 > 0 && (i9 = this.f2549A1) > 0 && i15 > i9) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
                        aVar.mo4540i(i14);
                        this.f2551C1.add(aVar);
                        i12 = i15;
                        i13 = i22;
                    } else {
                        if (i14 > 0) {
                            i13 += this.f2569v1 + i22;
                        } else {
                            i13 = i22;
                        }
                        i12 = 0;
                    }
                    aVar.mo4533b(constraintWidget);
                    i14++;
                    i4 = i16;
                }
            } else {
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (i19 < i10) {
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i19];
                    int h2 = mo4513h2(constraintWidget2, i11);
                    if (constraintWidget2.mo4363S() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i4++;
                    }
                    int i20 = i4;
                    if ((i17 == i11 || this.f2570w1 + i17 + h2 > i11) && aVar.f2575b != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && i19 > 0 && (i8 = this.f2549A1) > 0 && i8 < 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
                        aVar.mo4540i(i19);
                        this.f2551C1.add(aVar);
                    } else if (i19 > 0) {
                        i17 += this.f2570w1 + h2;
                        aVar.mo4533b(constraintWidget2);
                        i19++;
                        i18 = i20;
                    }
                    i17 = h2;
                    aVar.mo4533b(constraintWidget2);
                    i19++;
                    i18 = i20;
                }
            }
            int size = this.f2551C1.size();
            ConstraintAnchor constraintAnchor3 = this.f2392P;
            ConstraintAnchor constraintAnchor4 = this.f2394Q;
            ConstraintAnchor constraintAnchor5 = this.f2396R;
            ConstraintAnchor constraintAnchor6 = this.f2398S;
            int w1 = mo4571w1();
            int y1 = mo4573y1();
            int x1 = mo4572x1();
            int v1 = mo4570v1();
            ConstraintWidget.DimensionBehaviour C = mo4331C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (C == dimensionBehaviour || mo4363S() == dimensionBehaviour) {
                z = true;
            } else {
                z = false;
            }
            if (i4 > 0 && z) {
                for (int i21 = 0; i21 < size; i21++) {
                    C0488a aVar2 = this.f2551C1.get(i21);
                    if (i2 == 0) {
                        aVar2.mo4538g(i11 - aVar2.mo4537f());
                    } else {
                        aVar2.mo4538g(i11 - aVar2.mo4536e());
                    }
                }
            }
            int i23 = y1;
            int i24 = x1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = w1;
            ConstraintAnchor constraintAnchor7 = constraintAnchor4;
            ConstraintAnchor constraintAnchor8 = constraintAnchor3;
            int i29 = v1;
            while (i27 < size) {
                C0488a aVar3 = this.f2551C1.get(i27);
                if (i2 == 0) {
                    if (i27 < size - 1) {
                        constraintAnchor2 = this.f2551C1.get(i27 + 1).f2575b.f2394Q;
                        i7 = 0;
                    } else {
                        constraintAnchor2 = this.f2398S;
                        i7 = mo4570v1();
                    }
                    ConstraintAnchor constraintAnchor9 = aVar3.f2575b.f2398S;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                    int i30 = i25;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                    int i31 = i26;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                    i5 = i27;
                    aVar3.mo4541j(i2, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i28, i23, i24, i7, i3);
                    int max = Math.max(i31, aVar3.mo4537f());
                    i25 = i30 + aVar3.mo4536e();
                    if (i5 > 0) {
                        i25 += this.f2570w1;
                    }
                    constraintAnchor8 = constraintAnchor11;
                    i26 = max;
                    i23 = 0;
                    constraintAnchor7 = constraintAnchor9;
                    constraintAnchor = constraintAnchor14;
                    int i32 = i7;
                    constraintAnchor6 = constraintAnchor2;
                    i29 = i32;
                } else {
                    ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                    int i33 = i25;
                    int i34 = i26;
                    i5 = i27;
                    if (i5 < size - 1) {
                        constraintAnchor = this.f2551C1.get(i5 + 1).f2575b.f2392P;
                        i6 = 0;
                    } else {
                        constraintAnchor = this.f2396R;
                        i6 = mo4572x1();
                    }
                    ConstraintAnchor constraintAnchor16 = aVar3.f2575b.f2396R;
                    aVar3.mo4541j(i2, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i28, i23, i6, i29, i3);
                    i26 = i34 + aVar3.mo4537f();
                    int max2 = Math.max(i33, aVar3.mo4536e());
                    if (i5 > 0) {
                        i26 += this.f2569v1;
                    }
                    i25 = max2;
                    i28 = 0;
                    i24 = i6;
                    constraintAnchor8 = constraintAnchor16;
                }
                i27 = i5 + 1;
                int i35 = i3;
                constraintAnchor5 = constraintAnchor;
            }
            iArr[0] = i26;
            iArr[1] = i25;
        }
    }

    /* renamed from: m2 */
    public final void mo4518m2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        C0488a aVar;
        int i4 = i;
        if (i4 != 0) {
            if (this.f2551C1.size() == 0) {
                aVar = new C0488a(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, i3);
                this.f2551C1.add(aVar);
            } else {
                C0488a aVar2 = this.f2551C1.get(0);
                aVar2.mo4534c();
                aVar = aVar2;
                aVar.mo4541j(i2, this.f2392P, this.f2394Q, this.f2396R, this.f2398S, mo4571w1(), mo4573y1(), mo4572x1(), mo4570v1(), i3);
            }
            for (int i5 = 0; i5 < i4; i5++) {
                aVar.mo4533b(constraintWidgetArr[i5]);
            }
            iArr[0] = aVar.mo4537f();
            iArr[1] = aVar.mo4536e();
        }
    }

    /* renamed from: n */
    public void mo4415n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo4415n(constraintWidget, hashMap);
        C0487e eVar = (C0487e) constraintWidget;
        this.f2557j1 = eVar.f2557j1;
        this.f2558k1 = eVar.f2558k1;
        this.f2559l1 = eVar.f2559l1;
        this.f2560m1 = eVar.f2560m1;
        this.f2561n1 = eVar.f2561n1;
        this.f2562o1 = eVar.f2562o1;
        this.f2563p1 = eVar.f2563p1;
        this.f2564q1 = eVar.f2564q1;
        this.f2565r1 = eVar.f2565r1;
        this.f2566s1 = eVar.f2566s1;
        this.f2567t1 = eVar.f2567t1;
        this.f2568u1 = eVar.f2568u1;
        this.f2569v1 = eVar.f2569v1;
        this.f2570w1 = eVar.f2570w1;
        this.f2571x1 = eVar.f2571x1;
        this.f2572y1 = eVar.f2572y1;
        this.f2573z1 = eVar.f2573z1;
        this.f2549A1 = eVar.f2549A1;
        this.f2550B1 = eVar.f2550B1;
    }

    /* renamed from: n2 */
    public void mo4519n2(float f) {
        this.f2565r1 = f;
    }

    /* renamed from: o2 */
    public void mo4520o2(int i) {
        this.f2559l1 = i;
    }

    /* renamed from: p2 */
    public void mo4521p2(float f) {
        this.f2566s1 = f;
    }

    /* renamed from: q2 */
    public void mo4522q2(int i) {
        this.f2560m1 = i;
    }

    /* renamed from: r2 */
    public void mo4523r2(int i) {
        this.f2571x1 = i;
    }

    /* renamed from: s2 */
    public void mo4524s2(float f) {
        this.f2563p1 = f;
    }

    /* renamed from: t2 */
    public void mo4525t2(int i) {
        this.f2569v1 = i;
    }

    /* renamed from: u2 */
    public void mo4526u2(int i) {
        this.f2557j1 = i;
    }

    /* renamed from: v2 */
    public void mo4527v2(float f) {
        this.f2567t1 = f;
    }

    /* renamed from: w2 */
    public void mo4528w2(int i) {
        this.f2561n1 = i;
    }

    /* renamed from: x2 */
    public void mo4529x2(float f) {
        this.f2568u1 = f;
    }

    /* renamed from: y2 */
    public void mo4530y2(int i) {
        this.f2562o1 = i;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4531z1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.f19175V0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.mo4553B1()
            if (r0 != 0) goto L_0x001c
            r6.mo4556E1(r11, r11)
            r6.mo4555D1(r11)
            return
        L_0x001c:
            int r12 = r18.mo4571w1()
            int r13 = r18.mo4572x1()
            int r14 = r18.mo4573y1()
            int r15 = r18.mo4570v1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.f2550B1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.f2557j1
            if (r2 != r1) goto L_0x0045
            r6.f2557j1 = r11
        L_0x0045:
            int r2 = r6.f2558k1
            if (r2 != r1) goto L_0x0058
            r6.f2558k1 = r11
            goto L_0x0058
        L_0x004c:
            int r2 = r6.f2557j1
            if (r2 != r1) goto L_0x0052
            r6.f2557j1 = r11
        L_0x0052:
            int r2 = r6.f2558k1
            if (r2 != r1) goto L_0x0058
            r6.f2558k1 = r11
        L_0x0058:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r6.f19174U0
            r2 = r11
            r3 = r2
        L_0x005c:
            int r11 = r6.f19175V0
            r0 = 8
            if (r2 >= r11) goto L_0x0072
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.f19174U0
            r11 = r11[r2]
            int r11 = r11.mo4367U()
            if (r11 != r0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005c
        L_0x0072:
            if (r3 <= 0) goto L_0x0091
            int r11 = r11 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r11]
            r2 = 0
            r3 = 0
        L_0x0079:
            int r11 = r6.f19175V0
            if (r2 >= r11) goto L_0x008f
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r6.f19174U0
            r11 = r11[r2]
            int r4 = r11.mo4367U()
            if (r4 == r0) goto L_0x008b
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008b:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0079
        L_0x008f:
            r2 = r3
            goto L_0x0092
        L_0x0091:
            r2 = r11
        L_0x0092:
            r6.f2555G1 = r1
            r6.f2556H1 = r2
            int r0 = r6.f2573z1
            if (r0 == 0) goto L_0x00cf
            r4 = 1
            if (r0 == r4) goto L_0x00c2
            r3 = 2
            if (r0 == r3) goto L_0x00b5
            r3 = 3
            if (r0 == r3) goto L_0x00a8
            r11 = r4
            r17 = r5
        L_0x00a6:
            r0 = 0
            goto L_0x00dc
        L_0x00a8:
            int r3 = r6.f2550B1
            r0 = r18
            r11 = r4
            r4 = r16
            r17 = r5
            r0.mo4517l2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00b5:
            r11 = r4
            r17 = r5
            int r3 = r6.f2550B1
            r0 = r18
            r4 = r16
            r0.mo4515j2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00c2:
            r11 = r4
            r17 = r5
            int r3 = r6.f2550B1
            r0 = r18
            r4 = r16
            r0.mo4516k2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00cf:
            r17 = r5
            r11 = 1
            int r3 = r6.f2550B1
            r0 = r18
            r4 = r16
            r0.mo4518m2(r1, r2, r3, r4, r5)
            goto L_0x00a6
        L_0x00dc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ec
            r1 = r8
            goto L_0x00f7
        L_0x00ec:
            if (r7 != r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f7
        L_0x00f3:
            if (r7 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r1 = r0
        L_0x00f7:
            if (r9 != r4) goto L_0x00fb
            r2 = r10
            goto L_0x0106
        L_0x00fb:
            if (r9 != r3) goto L_0x0102
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0106
        L_0x0102:
            if (r9 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = r0
        L_0x0106:
            r6.mo4556E1(r1, r2)
            r6.mo4399h1(r1)
            r6.mo4344I0(r2)
            int r1 = r6.f19175V0
            if (r1 <= 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r11 = r0
        L_0x0115:
            r6.mo4555D1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0487e.mo4531z1(int, int, int, int):void");
    }

    /* renamed from: z2 */
    public void mo4532z2(int i) {
        this.f2549A1 = i;
    }
}
