package p000;

import androidx.constraintlayout.core.widgets.C0476a;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import p000.a00;

/* renamed from: pg1 */
/* compiled from: Direct */
public class pg1 {

    /* renamed from: a */
    public static a00.C0000a f16461a = new a00.C0000a();

    /* renamed from: b */
    public static int f16462b = 0;

    /* renamed from: c */
    public static int f16463c = 0;

    /* renamed from: a */
    public static boolean m24915a(int i, ConstraintWidget constraintWidget) {
        C0486d dVar;
        boolean z;
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour C = constraintWidget.mo4331C();
        ConstraintWidget.DimensionBehaviour S = constraintWidget.mo4363S();
        if (constraintWidget.mo4351M() != null) {
            dVar = (C0486d) constraintWidget.mo4351M();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour C2 = dVar.mo4331C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour S2 = dVar.mo4363S();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (C == dimensionBehaviour5 || constraintWidget.mo4413m0() || C == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || ((C == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f2449v == 0 && constraintWidget.f2416e0 == Utils.FLOAT_EPSILON && constraintWidget.mo4377Z(0)) || (C == dimensionBehaviour2 && constraintWidget.f2449v == 1 && constraintWidget.mo4383c0(0, constraintWidget.mo4369V())))) {
            z = true;
        } else {
            z = false;
        }
        if (S == dimensionBehaviour5 || constraintWidget.mo4416n0() || S == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || ((S == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f2451w == 0 && constraintWidget.f2416e0 == Utils.FLOAT_EPSILON && constraintWidget.mo4377Z(1)) || (S == dimensionBehaviour && constraintWidget.f2451w == 1 && constraintWidget.mo4383c0(1, constraintWidget.mo4441z())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (constraintWidget.f2416e0 > Utils.FLOAT_EPSILON && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m24916b(int i, ConstraintWidget constraintWidget, a00.C0001b bVar, boolean z) {
        boolean z2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        boolean z3;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintWidget constraintWidget2 = constraintWidget;
        a00.C0001b bVar2 = bVar;
        boolean z4 = z;
        if (!constraintWidget.mo4392f0()) {
            boolean z5 = true;
            f16462b++;
            if (!(constraintWidget2 instanceof C0486d) && constraintWidget.mo4410l0()) {
                int i2 = i + 1;
                if (m24915a(i2, constraintWidget2)) {
                    C0486d.m3634P1(i2, constraintWidget2, bVar2, new a00.C0000a(), a00.C0000a.f6k);
                }
            }
            ConstraintAnchor q = constraintWidget2.mo4422q(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor q2 = constraintWidget2.mo4422q(ConstraintAnchor.Type.RIGHT);
            int e = q.mo4309e();
            int e2 = q2.mo4309e();
            if (q.mo4308d() != null && q.mo4318n()) {
                Iterator<ConstraintAnchor> it = q.mo4308d().iterator();
                while (it.hasNext()) {
                    ConstraintAnchor next = it.next();
                    ConstraintWidget constraintWidget3 = next.f2353d;
                    int i3 = i + 1;
                    boolean a = m24915a(i3, constraintWidget3);
                    if (constraintWidget3.mo4410l0() && a) {
                        C0486d.m3634P1(i3, constraintWidget3, bVar2, new a00.C0000a(), a00.C0000a.f6k);
                    }
                    if ((next != constraintWidget3.f2392P || (constraintAnchor4 = constraintWidget3.f2396R.f2355f) == null || !constraintAnchor4.mo4318n()) && (next != constraintWidget3.f2396R || (constraintAnchor3 = constraintWidget3.f2392P.f2355f) == null || !constraintAnchor3.mo4318n())) {
                        z3 = false;
                    } else {
                        z3 = z5;
                    }
                    ConstraintWidget.DimensionBehaviour C = constraintWidget3.mo4331C();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (C != dimensionBehaviour || a) {
                        if (!constraintWidget3.mo4410l0()) {
                            ConstraintAnchor constraintAnchor5 = constraintWidget3.f2392P;
                            if (next == constraintAnchor5 && constraintWidget3.f2396R.f2355f == null) {
                                int f = constraintAnchor5.mo4310f() + e;
                                constraintWidget3.mo4332C0(f, constraintWidget3.mo4369V() + f);
                                m24916b(i3, constraintWidget3, bVar2, z4);
                            } else {
                                ConstraintAnchor constraintAnchor6 = constraintWidget3.f2396R;
                                if (next == constraintAnchor6 && constraintAnchor5.f2355f == null) {
                                    int f2 = e - constraintAnchor6.mo4310f();
                                    constraintWidget3.mo4332C0(f2 - constraintWidget3.mo4369V(), f2);
                                    m24916b(i3, constraintWidget3, bVar2, z4);
                                } else if (z3 && !constraintWidget3.mo4398h0()) {
                                    m24918d(i3, bVar2, constraintWidget3, z4);
                                }
                            }
                        }
                    } else if (constraintWidget3.mo4331C() == dimensionBehaviour && constraintWidget3.f2457z >= 0 && constraintWidget3.f2455y >= 0 && ((constraintWidget3.mo4367U() == 8 || (constraintWidget3.f2449v == 0 && constraintWidget3.mo4437x() == Utils.FLOAT_EPSILON)) && !constraintWidget3.mo4398h0() && !constraintWidget3.mo4407k0() && z3 && !constraintWidget3.mo4398h0())) {
                        m24919e(i3, constraintWidget2, bVar2, constraintWidget3, z4);
                    }
                    z5 = true;
                }
            }
            if (!(constraintWidget2 instanceof C0489f)) {
                if (q2.mo4308d() != null && q2.mo4318n()) {
                    Iterator<ConstraintAnchor> it2 = q2.mo4308d().iterator();
                    while (it2.hasNext()) {
                        ConstraintAnchor next2 = it2.next();
                        ConstraintWidget constraintWidget4 = next2.f2353d;
                        int i4 = i + 1;
                        boolean a2 = m24915a(i4, constraintWidget4);
                        if (constraintWidget4.mo4410l0() && a2) {
                            C0486d.m3634P1(i4, constraintWidget4, bVar2, new a00.C0000a(), a00.C0000a.f6k);
                        }
                        if ((next2 != constraintWidget4.f2392P || (constraintAnchor2 = constraintWidget4.f2396R.f2355f) == null || !constraintAnchor2.mo4318n()) && (next2 != constraintWidget4.f2396R || (constraintAnchor = constraintWidget4.f2392P.f2355f) == null || !constraintAnchor.mo4318n())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        ConstraintWidget.DimensionBehaviour C2 = constraintWidget4.mo4331C();
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (C2 != dimensionBehaviour2 || a2) {
                            if (!constraintWidget4.mo4410l0()) {
                                ConstraintAnchor constraintAnchor7 = constraintWidget4.f2392P;
                                if (next2 == constraintAnchor7 && constraintWidget4.f2396R.f2355f == null) {
                                    int f3 = constraintAnchor7.mo4310f() + e2;
                                    constraintWidget4.mo4332C0(f3, constraintWidget4.mo4369V() + f3);
                                    m24916b(i4, constraintWidget4, bVar2, z4);
                                } else {
                                    ConstraintAnchor constraintAnchor8 = constraintWidget4.f2396R;
                                    if (next2 == constraintAnchor8 && constraintAnchor7.f2355f == null) {
                                        int f4 = e2 - constraintAnchor8.mo4310f();
                                        constraintWidget4.mo4332C0(f4 - constraintWidget4.mo4369V(), f4);
                                        m24916b(i4, constraintWidget4, bVar2, z4);
                                    } else if (z2 && !constraintWidget4.mo4398h0()) {
                                        m24918d(i4, bVar2, constraintWidget4, z4);
                                    }
                                }
                            }
                        } else if (constraintWidget4.mo4331C() == dimensionBehaviour2 && constraintWidget4.f2457z >= 0 && constraintWidget4.f2455y >= 0) {
                            if ((constraintWidget4.mo4367U() == 8 || (constraintWidget4.f2449v == 0 && constraintWidget4.mo4437x() == Utils.FLOAT_EPSILON)) && !constraintWidget4.mo4398h0() && !constraintWidget4.mo4407k0() && z2 && !constraintWidget4.mo4398h0()) {
                                m24919e(i4, constraintWidget2, bVar2, constraintWidget4, z4);
                            }
                        }
                    }
                }
                constraintWidget.mo4421p0();
            }
        }
    }

    /* renamed from: c */
    public static void m24917c(int i, C0476a aVar, a00.C0001b bVar, int i2, boolean z) {
        if (!aVar.mo4443q1()) {
            return;
        }
        if (i2 == 0) {
            m24916b(i + 1, aVar, bVar, z);
        } else {
            m24923i(i + 1, aVar, bVar);
        }
    }

    /* renamed from: d */
    public static void m24918d(int i, a00.C0001b bVar, ConstraintWidget constraintWidget, boolean z) {
        float f;
        float A = constraintWidget.mo4327A();
        int e = constraintWidget.f2392P.f2355f.mo4309e();
        int e2 = constraintWidget.f2396R.f2355f.mo4309e();
        int f2 = constraintWidget.f2392P.mo4310f() + e;
        int f3 = e2 - constraintWidget.f2396R.mo4310f();
        if (e == e2) {
            A = 0.5f;
        } else {
            e = f2;
            e2 = f3;
        }
        int V = constraintWidget.mo4369V();
        int i2 = (e2 - e) - V;
        if (e > e2) {
            i2 = (e - e2) - V;
        }
        if (i2 > 0) {
            f = (A * ((float) i2)) + 0.5f;
        } else {
            f = A * ((float) i2);
        }
        int i3 = ((int) f) + e;
        int i4 = i3 + V;
        if (e > e2) {
            i4 = i3 - V;
        }
        constraintWidget.mo4332C0(i3, i4);
        m24916b(i + 1, constraintWidget, bVar, z);
    }

    /* renamed from: e */
    public static void m24919e(int i, ConstraintWidget constraintWidget, a00.C0001b bVar, ConstraintWidget constraintWidget2, boolean z) {
        int i2;
        float A = constraintWidget2.mo4327A();
        int e = constraintWidget2.f2392P.f2355f.mo4309e() + constraintWidget2.f2392P.mo4310f();
        int e2 = constraintWidget2.f2396R.f2355f.mo4309e() - constraintWidget2.f2396R.mo4310f();
        if (e2 >= e) {
            int V = constraintWidget2.mo4369V();
            if (constraintWidget2.mo4367U() != 8) {
                int i3 = constraintWidget2.f2449v;
                if (i3 == 2) {
                    if (constraintWidget instanceof C0486d) {
                        i2 = constraintWidget.mo4369V();
                    } else {
                        i2 = constraintWidget.mo4351M().mo4369V();
                    }
                    V = (int) (constraintWidget2.mo4327A() * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    V = e2 - e;
                }
                V = Math.max(constraintWidget2.f2455y, V);
                int i4 = constraintWidget2.f2457z;
                if (i4 > 0) {
                    V = Math.min(i4, V);
                }
            }
            int i5 = e + ((int) ((A * ((float) ((e2 - e) - V))) + 0.5f));
            constraintWidget2.mo4332C0(i5, V + i5);
            m24916b(i + 1, constraintWidget2, bVar, z);
        }
    }

    /* renamed from: f */
    public static void m24920f(int i, a00.C0001b bVar, ConstraintWidget constraintWidget) {
        float f;
        float Q = constraintWidget.mo4359Q();
        int e = constraintWidget.f2394Q.f2355f.mo4309e();
        int e2 = constraintWidget.f2398S.f2355f.mo4309e();
        int f2 = constraintWidget.f2394Q.mo4310f() + e;
        int f3 = e2 - constraintWidget.f2398S.mo4310f();
        if (e == e2) {
            Q = 0.5f;
        } else {
            e = f2;
            e2 = f3;
        }
        int z = constraintWidget.mo4441z();
        int i2 = (e2 - e) - z;
        if (e > e2) {
            i2 = (e - e2) - z;
        }
        if (i2 > 0) {
            f = (Q * ((float) i2)) + 0.5f;
        } else {
            f = Q * ((float) i2);
        }
        int i3 = (int) f;
        int i4 = e + i3;
        int i5 = i4 + z;
        if (e > e2) {
            i4 = e - i3;
            i5 = i4 - z;
        }
        constraintWidget.mo4338F0(i4, i5);
        m24923i(i + 1, constraintWidget, bVar);
    }

    /* renamed from: g */
    public static void m24921g(int i, ConstraintWidget constraintWidget, a00.C0001b bVar, ConstraintWidget constraintWidget2) {
        int i2;
        float Q = constraintWidget2.mo4359Q();
        int e = constraintWidget2.f2394Q.f2355f.mo4309e() + constraintWidget2.f2394Q.mo4310f();
        int e2 = constraintWidget2.f2398S.f2355f.mo4309e() - constraintWidget2.f2398S.mo4310f();
        if (e2 >= e) {
            int z = constraintWidget2.mo4441z();
            if (constraintWidget2.mo4367U() != 8) {
                int i3 = constraintWidget2.f2451w;
                if (i3 == 2) {
                    if (constraintWidget instanceof C0486d) {
                        i2 = constraintWidget.mo4441z();
                    } else {
                        i2 = constraintWidget.mo4351M().mo4441z();
                    }
                    z = (int) (Q * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    z = e2 - e;
                }
                z = Math.max(constraintWidget2.f2364B, z);
                int i4 = constraintWidget2.f2366C;
                if (i4 > 0) {
                    z = Math.min(i4, z);
                }
            }
            int i5 = e + ((int) ((Q * ((float) ((e2 - e) - z))) + 0.5f));
            constraintWidget2.mo4338F0(i5, z + i5);
            m24923i(i + 1, constraintWidget2, bVar);
        }
    }

    /* renamed from: h */
    public static void m24922h(C0486d dVar, a00.C0001b bVar) {
        ConstraintWidget.DimensionBehaviour C = dVar.mo4331C();
        ConstraintWidget.DimensionBehaviour S = dVar.mo4363S();
        f16462b = 0;
        f16463c = 0;
        dVar.mo4434v0();
        ArrayList<ConstraintWidget> o1 = dVar.mo27206o1();
        int size = o1.size();
        for (int i = 0; i < size; i++) {
            o1.get(i).mo4434v0();
        }
        boolean M1 = dVar.mo4486M1();
        if (C == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.mo4332C0(0, dVar.mo4369V());
        } else {
            dVar.mo4334D0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = o1.get(i2);
            if (constraintWidget instanceof C0489f) {
                C0489f fVar = (C0489f) constraintWidget;
                if (fVar.mo4543p1() == 1) {
                    if (fVar.mo4544q1() != -1) {
                        fVar.mo4547t1(fVar.mo4544q1());
                    } else if (fVar.mo4545r1() != -1 && dVar.mo4413m0()) {
                        fVar.mo4547t1(dVar.mo4369V() - fVar.mo4545r1());
                    } else if (dVar.mo4413m0()) {
                        fVar.mo4547t1((int) ((fVar.mo4546s1() * ((float) dVar.mo4369V())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof C0476a) && ((C0476a) constraintWidget).mo4447u1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = o1.get(i3);
                if (constraintWidget2 instanceof C0489f) {
                    C0489f fVar2 = (C0489f) constraintWidget2;
                    if (fVar2.mo4543p1() == 1) {
                        m24916b(0, fVar2, bVar, M1);
                    }
                }
            }
        }
        m24916b(0, dVar, bVar, M1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = o1.get(i4);
                if (constraintWidget3 instanceof C0476a) {
                    C0476a aVar = (C0476a) constraintWidget3;
                    if (aVar.mo4447u1() == 0) {
                        m24917c(0, aVar, bVar, 0, M1);
                    }
                }
            }
        }
        if (S == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.mo4338F0(0, dVar.mo4441z());
        } else {
            dVar.mo4336E0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = o1.get(i5);
            if (constraintWidget4 instanceof C0489f) {
                C0489f fVar3 = (C0489f) constraintWidget4;
                if (fVar3.mo4543p1() == 0) {
                    if (fVar3.mo4544q1() != -1) {
                        fVar3.mo4547t1(fVar3.mo4544q1());
                    } else if (fVar3.mo4545r1() != -1 && dVar.mo4416n0()) {
                        fVar3.mo4547t1(dVar.mo4441z() - fVar3.mo4545r1());
                    } else if (dVar.mo4416n0()) {
                        fVar3.mo4547t1((int) ((fVar3.mo4546s1() * ((float) dVar.mo4441z())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof C0476a) && ((C0476a) constraintWidget4).mo4447u1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = o1.get(i6);
                if (constraintWidget5 instanceof C0489f) {
                    C0489f fVar4 = (C0489f) constraintWidget5;
                    if (fVar4.mo4543p1() == 0) {
                        m24923i(1, fVar4, bVar);
                    }
                }
            }
        }
        m24923i(0, dVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = o1.get(i7);
                if (constraintWidget6 instanceof C0476a) {
                    C0476a aVar2 = (C0476a) constraintWidget6;
                    if (aVar2.mo4447u1() == 1) {
                        m24917c(0, aVar2, bVar, 1, M1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = o1.get(i8);
            if (constraintWidget7.mo4410l0() && m24915a(0, constraintWidget7)) {
                C0486d.m3634P1(0, constraintWidget7, bVar, f16461a, a00.C0000a.f6k);
                if (!(constraintWidget7 instanceof C0489f)) {
                    m24916b(0, constraintWidget7, bVar, M1);
                    m24923i(0, constraintWidget7, bVar);
                } else if (((C0489f) constraintWidget7).mo4543p1() == 0) {
                    m24923i(0, constraintWidget7, bVar);
                } else {
                    m24916b(0, constraintWidget7, bVar, M1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.f2398S.f2355f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.f2394Q.f2355f;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24923i(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, p000.a00.C0001b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.mo4419o0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f16463c
            r3 = 1
            int r2 = r2 + r3
            f16463c = r2
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.C0486d
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.mo4410l0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = m24915a(r2, r0)
            if (r4 == 0) goto L_0x002d
            a00$a r4 = new a00$a
            r4.<init>()
            int r5 = p000.a00.C0000a.f6k
            androidx.constraintlayout.core.widgets.C0486d.m3634P1(r2, r0, r1, r4, r5)
        L_0x002d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mo4422q(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mo4422q(r4)
            int r5 = r2.mo4309e()
            int r6 = r4.mo4309e()
            java.util.HashSet r7 = r2.mo4308d()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x0132
            boolean r7 = r2.mo4318n()
            if (r7 == 0) goto L_0x0132
            java.util.HashSet r2 = r2.mo4308d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r7.f2353d
            int r12 = r16 + 1
            boolean r13 = m24915a(r12, r11)
            boolean r14 = r11.mo4410l0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            a00$a r14 = new a00$a
            r14.<init>()
            int r15 = p000.a00.C0000a.f6k
            androidx.constraintlayout.core.widgets.C0486d.m3634P1(r12, r11, r1, r14, r15)
        L_0x007e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f2394Q
            if (r7 != r14) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f2355f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.mo4318n()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f2398S
            if (r7 != r14) goto L_0x00a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f2355f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.mo4318n()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = r3
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r11.mo4363S()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r11.mo4363S()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.f2366C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.f2364B
            if (r7 < 0) goto L_0x0058
            int r7 = r11.mo4367U()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f2451w
            if (r7 != 0) goto L_0x0058
            float r7 = r11.mo4437x()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.mo4404j0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.mo4407k0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo4404j0()
            if (r7 != 0) goto L_0x0058
            m24921g(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.mo4410l0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r11.f2394Q
            if (r7 != r10) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f2355f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.mo4310f()
            int r7 = r7 + r5
            int r10 = r11.mo4441z()
            int r10 = r10 + r7
            r11.mo4338F0(r7, r10)
            m24923i(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.f2398S
            if (r7 != r13) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r10.f2355f
            if (r7 != 0) goto L_0x0125
            int r7 = r13.mo4310f()
            int r7 = r5 - r7
            int r10 = r11.mo4441z()
            int r10 = r7 - r10
            r11.mo4338F0(r10, r7)
            m24923i(r12, r11, r1)
            goto L_0x0058
        L_0x0125:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.mo4404j0()
            if (r7 != 0) goto L_0x0058
            m24920f(r12, r1, r11)
            goto L_0x0058
        L_0x0132:
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.C0489f
            if (r2 == 0) goto L_0x0137
            return
        L_0x0137:
            java.util.HashSet r2 = r4.mo4308d()
            if (r2 == 0) goto L_0x0225
            boolean r2 = r4.mo4318n()
            if (r2 == 0) goto L_0x0225
            java.util.HashSet r2 = r4.mo4308d()
            java.util.Iterator r2 = r2.iterator()
        L_0x014b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.f2353d
            int r7 = r16 + 1
            boolean r10 = m24915a(r7, r5)
            boolean r11 = r5.mo4410l0()
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            a00$a r11 = new a00$a
            r11.<init>()
            int r12 = p000.a00.C0000a.f6k
            androidx.constraintlayout.core.widgets.C0486d.m3634P1(r7, r5, r1, r11, r12)
        L_0x0171:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f2394Q
            if (r4 != r11) goto L_0x0181
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f2355f
            if (r11 == 0) goto L_0x0181
            boolean r11 = r11.mo4318n()
            if (r11 != 0) goto L_0x0191
        L_0x0181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f2398S
            if (r4 != r11) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f2355f
            if (r11 == 0) goto L_0x0193
            boolean r11 = r11.mo4318n()
            if (r11 == 0) goto L_0x0193
        L_0x0191:
            r11 = r3
            goto L_0x0194
        L_0x0193:
            r11 = 0
        L_0x0194:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r5.mo4363S()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d8
            if (r10 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r5.mo4363S()
            if (r4 != r13) goto L_0x014b
            int r4 = r5.f2366C
            if (r4 < 0) goto L_0x014b
            int r4 = r5.f2364B
            if (r4 < 0) goto L_0x014b
            int r4 = r5.mo4367U()
            if (r4 == r9) goto L_0x01bf
            int r4 = r5.f2451w
            if (r4 != 0) goto L_0x014b
            float r4 = r5.mo4437x()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x014b
        L_0x01bf:
            boolean r4 = r5.mo4404j0()
            if (r4 != 0) goto L_0x014b
            boolean r4 = r5.mo4407k0()
            if (r4 != 0) goto L_0x014b
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.mo4404j0()
            if (r4 != 0) goto L_0x014b
            m24921g(r7, r0, r1, r5)
            goto L_0x014b
        L_0x01d8:
            boolean r10 = r5.mo4410l0()
            if (r10 == 0) goto L_0x01e0
            goto L_0x014b
        L_0x01e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r5.f2394Q
            if (r4 != r10) goto L_0x01fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f2355f
            if (r12 != 0) goto L_0x01fc
            int r4 = r10.mo4310f()
            int r4 = r4 + r6
            int r10 = r5.mo4441z()
            int r10 = r10 + r4
            r5.mo4338F0(r4, r10)
            m24923i(r7, r5, r1)
            goto L_0x014b
        L_0x01fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.f2398S
            if (r4 != r12) goto L_0x0218
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.f2355f
            if (r4 != 0) goto L_0x0218
            int r4 = r12.mo4310f()
            int r4 = r6 - r4
            int r10 = r5.mo4441z()
            int r10 = r4 - r10
            r5.mo4338F0(r10, r4)
            m24923i(r7, r5, r1)
            goto L_0x014b
        L_0x0218:
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.mo4404j0()
            if (r4 != 0) goto L_0x014b
            m24920f(r7, r1, r5)
            goto L_0x014b
        L_0x0225:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.mo4422q(r2)
            java.util.HashSet r4 = r2.mo4308d()
            if (r4 == 0) goto L_0x028a
            boolean r4 = r2.mo4318n()
            if (r4 == 0) goto L_0x028a
            int r4 = r2.mo4309e()
            java.util.HashSet r2 = r2.mo4308d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0243:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f2353d
            int r7 = r16 + 1
            boolean r8 = m24915a(r7, r6)
            boolean r9 = r6.mo4410l0()
            if (r9 == 0) goto L_0x0269
            if (r8 == 0) goto L_0x0269
            a00$a r9 = new a00$a
            r9.<init>()
            int r10 = p000.a00.C0000a.f6k
            androidx.constraintlayout.core.widgets.C0486d.m3634P1(r7, r6, r1, r9, r10)
        L_0x0269:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r6.mo4363S()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0273
            if (r8 == 0) goto L_0x0243
        L_0x0273:
            boolean r8 = r6.mo4410l0()
            if (r8 == 0) goto L_0x027a
            goto L_0x0243
        L_0x027a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r6.f2400T
            if (r5 != r8) goto L_0x0243
            int r5 = r5.mo4310f()
            int r5 = r5 + r4
            r6.mo4330B0(r5)
            m24923i(r7, r6, r1)     // Catch:{ all -> 0x028e }
            goto L_0x0243
        L_0x028a:
            r17.mo4423q0()
            return
        L_0x028e:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pg1.m24923i(int, androidx.constraintlayout.core.widgets.ConstraintWidget, a00$b):void");
    }
}
