package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p000.a00;

/* renamed from: androidx.constraintlayout.core.widgets.d */
/* compiled from: ConstraintWidgetContainer */
public class C0486d extends vk7 {

    /* renamed from: V0 */
    public a00 f2519V0 = new a00(this);

    /* renamed from: W0 */
    public mc1 f2520W0 = new mc1(this);

    /* renamed from: X0 */
    public int f2521X0;

    /* renamed from: Y0 */
    public a00.C0001b f2522Y0 = null;

    /* renamed from: Z0 */
    public boolean f2523Z0 = false;

    /* renamed from: a1 */
    public C0467c f2524a1 = new C0467c();

    /* renamed from: b1 */
    public int f2525b1;

    /* renamed from: c1 */
    public int f2526c1;

    /* renamed from: d1 */
    public int f2527d1;

    /* renamed from: e1 */
    public int f2528e1;

    /* renamed from: f1 */
    public int f2529f1 = 0;

    /* renamed from: g1 */
    public int f2530g1 = 0;

    /* renamed from: h1 */
    public C0485c[] f2531h1 = new C0485c[4];

    /* renamed from: i1 */
    public C0485c[] f2532i1 = new C0485c[4];

    /* renamed from: j1 */
    public boolean f2533j1 = false;

    /* renamed from: k1 */
    public boolean f2534k1 = false;

    /* renamed from: l1 */
    public boolean f2535l1 = false;

    /* renamed from: m1 */
    public int f2536m1 = 0;

    /* renamed from: n1 */
    public int f2537n1 = 0;

    /* renamed from: o1 */
    public int f2538o1 = 257;

    /* renamed from: p1 */
    public boolean f2539p1 = false;

    /* renamed from: q1 */
    public boolean f2540q1 = false;

    /* renamed from: r1 */
    public boolean f2541r1 = false;

    /* renamed from: s1 */
    public int f2542s1 = 0;

    /* renamed from: t1 */
    public WeakReference<ConstraintAnchor> f2543t1 = null;

    /* renamed from: u1 */
    public WeakReference<ConstraintAnchor> f2544u1 = null;

    /* renamed from: v1 */
    public WeakReference<ConstraintAnchor> f2545v1 = null;

    /* renamed from: w1 */
    public WeakReference<ConstraintAnchor> f2546w1 = null;

    /* renamed from: x1 */
    public HashSet<ConstraintWidget> f2547x1 = new HashSet<>();

    /* renamed from: y1 */
    public a00.C0000a f2548y1 = new a00.C0000a();

    /* renamed from: P1 */
    public static boolean m3634P1(int i, ConstraintWidget constraintWidget, a00.C0001b bVar, a00.C0000a aVar, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (constraintWidget.mo4367U() == 8 || (constraintWidget instanceof C0489f) || (constraintWidget instanceof C0476a)) {
            aVar.f13e = 0;
            aVar.f14f = 0;
            return false;
        }
        aVar.f9a = constraintWidget.mo4331C();
        aVar.f10b = constraintWidget.mo4363S();
        aVar.f11c = constraintWidget.mo4369V();
        aVar.f12d = constraintWidget.mo4441z();
        aVar.f17i = false;
        aVar.f18j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f9a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f10b == dimensionBehaviour2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || constraintWidget.f2416e0 <= Utils.FLOAT_EPSILON) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || constraintWidget.f2416e0 <= Utils.FLOAT_EPSILON) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z && constraintWidget.mo4377Z(0) && constraintWidget.f2449v == 0 && !z3) {
            aVar.f9a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f2451w == 0) {
                aVar.f9a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.mo4377Z(1) && constraintWidget.f2451w == 0 && !z4) {
            aVar.f10b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.f2449v == 0) {
                aVar.f10b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.mo4413m0()) {
            aVar.f9a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.mo4416n0()) {
            aVar.f10b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f2453x[0] == 4) {
                aVar.f9a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f10b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i4 = aVar.f12d;
                } else {
                    aVar.f9a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.mo9b(constraintWidget, aVar);
                    i4 = aVar.f14f;
                }
                aVar.f9a = dimensionBehaviour4;
                aVar.f11c = (int) (constraintWidget.mo4437x() * ((float) i4));
            }
        }
        if (z4) {
            if (constraintWidget.f2453x[1] == 4) {
                aVar.f10b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f9a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i3 = aVar.f11c;
                } else {
                    aVar.f10b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.mo9b(constraintWidget, aVar);
                    i3 = aVar.f13e;
                }
                aVar.f10b = dimensionBehaviour6;
                if (constraintWidget.mo4439y() == -1) {
                    aVar.f12d = (int) (((float) i3) / constraintWidget.mo4437x());
                } else {
                    aVar.f12d = (int) (constraintWidget.mo4437x() * ((float) i3));
                }
            }
        }
        bVar.mo9b(constraintWidget, aVar);
        constraintWidget.mo4399h1(aVar.f13e);
        constraintWidget.mo4344I0(aVar.f14f);
        constraintWidget.mo4342H0(aVar.f16h);
        constraintWidget.mo4438x0(aVar.f15g);
        aVar.f18j = a00.C0000a.f6k;
        return aVar.f17i;
    }

    /* renamed from: A1 */
    public void mo4474A1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2545v1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo4309e() > this.f2545v1.get().mo4309e()) {
            this.f2545v1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: B1 */
    public void mo4475B1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2543t1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo4309e() > this.f2543t1.get().mo4309e()) {
            this.f2543t1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: C1 */
    public boolean mo4476C1(boolean z) {
        return this.f2520W0.mo23128f(z);
    }

    /* renamed from: D1 */
    public boolean mo4477D1(boolean z) {
        return this.f2520W0.mo23129g(z);
    }

    /* renamed from: E1 */
    public boolean mo4478E1(boolean z, int i) {
        return this.f2520W0.mo23130h(z, i);
    }

    /* renamed from: F1 */
    public a00.C0001b mo4479F1() {
        return this.f2522Y0;
    }

    /* renamed from: G1 */
    public int mo4480G1() {
        return this.f2538o1;
    }

    /* renamed from: H1 */
    public C0467c mo4481H1() {
        return this.f2524a1;
    }

    /* renamed from: I1 */
    public boolean mo4482I1() {
        return false;
    }

    /* renamed from: J1 */
    public void mo4483J1() {
        this.f2520W0.mo23132j();
    }

    /* renamed from: K1 */
    public void mo4484K1() {
        this.f2520W0.mo23133k();
    }

    /* renamed from: L1 */
    public boolean mo4485L1() {
        return this.f2541r1;
    }

    /* renamed from: M1 */
    public boolean mo4486M1() {
        return this.f2523Z0;
    }

    /* renamed from: N1 */
    public boolean mo4487N1() {
        return this.f2540q1;
    }

    /* renamed from: O1 */
    public long mo4488O1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f2525b1 = i10;
        int i11 = i9;
        this.f2526c1 = i11;
        return this.f2519V0.mo6d(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: Q1 */
    public boolean mo4489Q1(int i) {
        if ((this.f2538o1 & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: R1 */
    public final void mo4490R1() {
        this.f2529f1 = 0;
        this.f2530g1 = 0;
    }

    /* renamed from: S1 */
    public void mo4491S1(a00.C0001b bVar) {
        this.f2522Y0 = bVar;
        this.f2520W0.mo23136n(bVar);
    }

    /* renamed from: T1 */
    public void mo4492T1(int i) {
        this.f2538o1 = i;
        C0467c.f2300r = mo4489Q1(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    /* renamed from: U1 */
    public void mo4493U1(int i) {
        this.f2521X0 = i;
    }

    /* renamed from: V1 */
    public void mo4494V1(boolean z) {
        this.f2523Z0 = z;
    }

    /* renamed from: W1 */
    public boolean mo4495W1(C0467c cVar, boolean[] zArr) {
        zArr[2] = false;
        boolean Q1 = mo4489Q1(64);
        mo4417n1(cVar, Q1);
        int size = this.f18830U0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f18830U0.get(i);
            constraintWidget.mo4417n1(cVar, Q1);
            if (constraintWidget.mo4381b0()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: X1 */
    public void mo4496X1() {
        this.f2519V0.mo7e(this);
    }

    /* renamed from: m1 */
    public void mo4414m1(boolean z, boolean z2) {
        super.mo4414m1(z, z2);
        int size = this.f18830U0.size();
        for (int i = 0; i < size; i++) {
            this.f18830U0.get(i).mo4414m1(z, z2);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0312  */
    /* renamed from: p1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4497p1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f2420g0 = r2
            r1.f2422h0 = r2
            r1.f2540q1 = r2
            r1.f2541r1 = r2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.f18830U0
            int r3 = r0.size()
            int r0 = r18.mo4369V()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.mo4441z()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f2408a0
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f2521X0
            if (r8 != 0) goto L_0x0088
            int r8 = r1.f2538o1
            boolean r8 = androidx.constraintlayout.core.widgets.C0491g.m3746b(r8, r6)
            if (r8 == 0) goto L_0x0088
            a00$b r8 = r18.mo4479F1()
            p000.pg1.m24922h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0088
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r9 = r1.f18830U0
            java.lang.Object r9 = r9.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.mo4410l0()
            if (r10 == 0) goto L_0x0085
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C0489f
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.C0493i
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9.mo4407k0()
            if (r10 != 0) goto L_0x0085
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.mo4435w(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.mo4435w(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0076
            int r10 = r9.f2449v
            if (r10 == r6) goto L_0x0076
            if (r11 != r12) goto L_0x0076
            int r10 = r9.f2451w
            if (r10 == r6) goto L_0x0076
            r10 = r6
            goto L_0x0077
        L_0x0076:
            r10 = r2
        L_0x0077:
            if (r10 != 0) goto L_0x0085
            a00$a r10 = new a00$a
            r10.<init>()
            a00$b r11 = r1.f2522Y0
            int r12 = p000.a00.C0000a.f6k
            m3634P1(r2, r9, r11, r10, r12)
        L_0x0085:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0088:
            r8 = 2
            if (r3 <= r8) goto L_0x00d1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0091
            if (r7 != r9) goto L_0x00d1
        L_0x0091:
            int r10 = r1.f2538o1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = androidx.constraintlayout.core.widgets.C0491g.m3746b(r10, r11)
            if (r10 == 0) goto L_0x00d1
            a00$b r10 = r18.mo4479F1()
            boolean r10 = p000.vj2.m28827c(r1, r10)
            if (r10 == 0) goto L_0x00d1
            if (r5 != r9) goto L_0x00b9
            int r10 = r18.mo4369V()
            if (r0 >= r10) goto L_0x00b5
            if (r0 <= 0) goto L_0x00b5
            r1.mo4399h1(r0)
            r1.f2540q1 = r6
            goto L_0x00b9
        L_0x00b5:
            int r0 = r18.mo4369V()
        L_0x00b9:
            if (r7 != r9) goto L_0x00cd
            int r9 = r18.mo4441z()
            if (r4 >= r9) goto L_0x00c9
            if (r4 <= 0) goto L_0x00c9
            r1.mo4344I0(r4)
            r1.f2541r1 = r6
            goto L_0x00cd
        L_0x00c9:
            int r4 = r18.mo4441z()
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d4
        L_0x00d1:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d4:
            r10 = 64
            boolean r11 = r1.mo4489Q1(r10)
            if (r11 != 0) goto L_0x00e7
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.mo4489Q1(r11)
            if (r11 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r11 = r2
            goto L_0x00e8
        L_0x00e7:
            r11 = r6
        L_0x00e8:
            androidx.constraintlayout.core.c r12 = r1.f2524a1
            r12.f2315h = r2
            r12.f2316i = r2
            int r13 = r1.f2538o1
            if (r13 == 0) goto L_0x00f6
            if (r11 == 0) goto L_0x00f6
            r12.f2316i = r6
        L_0x00f6:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r1.f18830U0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.mo4331C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r13) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.mo4363S()
            if (r12 != r13) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r12 = r2
            goto L_0x010a
        L_0x0109:
            r12 = r6
        L_0x010a:
            r18.mo4490R1()
            r13 = r2
        L_0x010e:
            if (r13 >= r3) goto L_0x0124
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r1.f18830U0
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof p000.vk7
            if (r15 == 0) goto L_0x0121
            vk7 r14 = (p000.vk7) r14
            r14.mo4497p1()
        L_0x0121:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0124:
            boolean r10 = r1.mo4489Q1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x012b:
            if (r14 == 0) goto L_0x0319
            int r15 = r0 + 1
            androidx.constraintlayout.core.c r0 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            r0.mo4262D()     // Catch:{ Exception -> 0x01dc }
            r18.mo4490R1()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.c r0 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            r1.mo4418o(r0)     // Catch:{ Exception -> 0x01dc }
            r0 = r2
        L_0x013d:
            if (r0 >= r3) goto L_0x0151
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.f18830U0     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.c r2 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            r6.mo4418o(r2)     // Catch:{ Exception -> 0x01dc }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x013d
        L_0x0151:
            androidx.constraintlayout.core.c r0 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            boolean r14 = r1.mo4499t1(r0)     // Catch:{ Exception -> 0x01dc }
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2543t1     // Catch:{ Exception -> 0x01dc }
            r2 = 0
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0177
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2543t1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.c r6 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f2394Q     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo4279q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.mo4504y1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f2543t1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0177:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2545v1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2545v1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.c r6 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f2398S     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo4279q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.mo4503x1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f2545v1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0196:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2544u1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2544u1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.c r6 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f2392P     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo4279q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.mo4504y1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f2544u1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01b5:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2546w1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f2546w1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.c r6 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.f2396R     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo4279q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.mo4503x1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f2546w1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01d4:
            if (r14 == 0) goto L_0x01f6
            androidx.constraintlayout.core.c r0 = r1.f2524a1     // Catch:{ Exception -> 0x01dc }
            r0.mo4286z()     // Catch:{ Exception -> 0x01dc }
            goto L_0x01f6
        L_0x01dc:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f6:
            if (r14 == 0) goto L_0x0201
            androidx.constraintlayout.core.c r0 = r1.f2524a1
            boolean[] r2 = androidx.constraintlayout.core.widgets.C0491g.f2601a
            boolean r0 = r1.mo4495W1(r0, r2)
            goto L_0x021a
        L_0x0201:
            androidx.constraintlayout.core.c r0 = r1.f2524a1
            r1.mo4417n1(r0, r10)
            r0 = 0
        L_0x0207:
            if (r0 >= r3) goto L_0x0219
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.f18830U0
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.c r6 = r1.f2524a1
            r2.mo4417n1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0207
        L_0x0219:
            r0 = 0
        L_0x021a:
            r2 = 8
            if (r12 == 0) goto L_0x028b
            if (r15 >= r2) goto L_0x028b
            boolean[] r6 = androidx.constraintlayout.core.widgets.C0491g.f2601a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x028b
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x022a:
            if (r6 >= r3) goto L_0x0254
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.f18830U0
            java.lang.Object r2 = r2.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r16 = r0
            int r0 = r2.f2420g0
            int r17 = r2.mo4369V()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f2422h0
            int r2 = r2.mo4441z()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x022a
        L_0x0254:
            r16 = r0
            int r0 = r1.f2434n0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f2436o0
            int r2 = java.lang.Math.max(r2, r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r6) goto L_0x0277
            int r8 = r18.mo4369V()
            if (r8 >= r0) goto L_0x0277
            r1.mo4399h1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0277:
            if (r7 != r6) goto L_0x028d
            int r0 = r18.mo4441z()
            if (r0 >= r2) goto L_0x028d
            r1.mo4344I0(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028d
        L_0x028b:
            r16 = r0
        L_0x028d:
            int r0 = r1.f2434n0
            int r2 = r18.mo4369V()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo4369V()
            if (r0 <= r2) goto L_0x02aa
            r1.mo4399h1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02aa:
            int r0 = r1.f2436o0
            int r2 = r18.mo4441z()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.mo4441z()
            if (r0 <= r2) goto L_0x02c8
            r1.mo4344I0(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02ca
        L_0x02c8:
            r6 = 1
            r2 = r13
        L_0x02ca:
            if (r2 != 0) goto L_0x0309
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x02eb
            if (r4 <= 0) goto L_0x02eb
            int r0 = r18.mo4369V()
            if (r0 <= r4) goto L_0x02eb
            r1.f2540q1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r8] = r2
            r1.mo4399h1(r4)
            r2 = r6
            r16 = r2
        L_0x02eb:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0309
            if (r9 <= 0) goto L_0x0309
            int r0 = r18.mo4441z()
            if (r0 <= r9) goto L_0x0309
            r1.f2541r1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r2
            r1.mo4344I0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030e
        L_0x0309:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030e:
            if (r15 <= r0) goto L_0x0312
            r14 = 0
            goto L_0x0313
        L_0x0312:
            r14 = r2
        L_0x0313:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x012b
        L_0x0319:
            r1.f18830U0 = r11
            if (r13 == 0) goto L_0x0325
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f2408a0
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0325:
            androidx.constraintlayout.core.c r0 = r1.f2524a1
            d80 r0 = r0.mo4283v()
            r1.mo4436w0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0486d.mo4497p1():void");
    }

    /* renamed from: s0 */
    public void mo4427s0() {
        this.f2524a1.mo4262D();
        this.f2525b1 = 0;
        this.f2527d1 = 0;
        this.f2526c1 = 0;
        this.f2528e1 = 0;
        this.f2539p1 = false;
        super.mo4427s0();
    }

    /* renamed from: s1 */
    public void mo4498s1(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            mo4500u1(constraintWidget);
        } else if (i == 1) {
            mo4505z1(constraintWidget);
        }
    }

    /* renamed from: t1 */
    public boolean mo4499t1(C0467c cVar) {
        int i;
        boolean Q1 = mo4489Q1(64);
        mo4394g(cVar, Q1);
        int size = this.f18830U0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = this.f18830U0.get(i2);
            constraintWidget.mo4358P0(0, false);
            constraintWidget.mo4358P0(1, false);
            if (constraintWidget instanceof C0476a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = this.f18830U0.get(i3);
                if (constraintWidget2 instanceof C0476a) {
                    ((C0476a) constraintWidget2).mo4448v1();
                }
            }
        }
        this.f2547x1.clear();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget3 = this.f18830U0.get(i4);
            if (constraintWidget3.mo4391f()) {
                if (constraintWidget3 instanceof C0493i) {
                    this.f2547x1.add(constraintWidget3);
                } else {
                    constraintWidget3.mo4394g(cVar, Q1);
                }
            }
        }
        while (this.f2547x1.size() > 0) {
            int size2 = this.f2547x1.size();
            Iterator<ConstraintWidget> it = this.f2547x1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0493i iVar = (C0493i) it.next();
                if (iVar.mo4567s1(this.f2547x1)) {
                    iVar.mo4394g(cVar, Q1);
                    this.f2547x1.remove(iVar);
                    break;
                }
            }
            if (size2 == this.f2547x1.size()) {
                Iterator<ConstraintWidget> it2 = this.f2547x1.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4394g(cVar, Q1);
                }
                this.f2547x1.clear();
            }
        }
        if (C0467c.f2300r) {
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget4 = this.f18830U0.get(i5);
                if (!constraintWidget4.mo4391f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            if (mo4331C() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            mo4388e(this, cVar, hashSet, i, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it3.next();
                C0491g.m3745a(this, cVar, constraintWidget5);
                constraintWidget5.mo4394g(cVar, Q1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget6 = this.f18830U0.get(i6);
                if (constraintWidget6 instanceof C0486d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f2408a0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.mo4352M0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.mo4387d1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.mo4394g(cVar, Q1);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.mo4352M0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.mo4387d1(dimensionBehaviour2);
                    }
                } else {
                    C0491g.m3745a(this, cVar, constraintWidget6);
                    if (!constraintWidget6.mo4391f()) {
                        constraintWidget6.mo4394g(cVar, Q1);
                    }
                }
            }
        }
        if (this.f2529f1 > 0) {
            C0484b.m3630b(this, cVar, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.f2530g1 > 0) {
            C0484b.m3630b(this, cVar, (ArrayList<ConstraintWidget>) null, 1);
        }
        return true;
    }

    /* renamed from: u1 */
    public final void mo4500u1(ConstraintWidget constraintWidget) {
        int i = this.f2529f1 + 1;
        C0485c[] cVarArr = this.f2532i1;
        if (i >= cVarArr.length) {
            this.f2532i1 = (C0485c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f2532i1[this.f2529f1] = new C0485c(constraintWidget, 0, mo4486M1());
        this.f2529f1++;
    }

    /* renamed from: v1 */
    public void mo4501v1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2546w1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo4309e() > this.f2546w1.get().mo4309e()) {
            this.f2546w1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: w1 */
    public void mo4502w1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f2544u1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo4309e() > this.f2544u1.get().mo4309e()) {
            this.f2544u1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: x1 */
    public final void mo4503x1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f2524a1.mo4270h(solverVariable, this.f2524a1.mo4279q(constraintAnchor), 0, 5);
    }

    /* renamed from: y1 */
    public final void mo4504y1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f2524a1.mo4270h(this.f2524a1.mo4279q(constraintAnchor), solverVariable, 0, 5);
    }

    /* renamed from: z1 */
    public final void mo4505z1(ConstraintWidget constraintWidget) {
        int i = this.f2530g1 + 1;
        C0485c[] cVarArr = this.f2531h1;
        if (i >= cVarArr.length) {
            this.f2531h1 = (C0485c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f2531h1[this.f2530g1] = new C0485c(constraintWidget, 1, mo4486M1());
        this.f2530g1++;
    }
}
