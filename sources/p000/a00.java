package p000;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.C0491g;
import androidx.constraintlayout.core.widgets.C0493i;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* renamed from: a00 */
/* compiled from: BasicMeasure */
public class a00 {

    /* renamed from: a */
    public final ArrayList<ConstraintWidget> f3a = new ArrayList<>();

    /* renamed from: b */
    public C0000a f4b = new C0000a();

    /* renamed from: c */
    public C0486d f5c;

    /* renamed from: a00$a */
    /* compiled from: BasicMeasure */
    public static class C0000a {

        /* renamed from: k */
        public static int f6k = 0;

        /* renamed from: l */
        public static int f7l = 1;

        /* renamed from: m */
        public static int f8m = 2;

        /* renamed from: a */
        public ConstraintWidget.DimensionBehaviour f9a;

        /* renamed from: b */
        public ConstraintWidget.DimensionBehaviour f10b;

        /* renamed from: c */
        public int f11c;

        /* renamed from: d */
        public int f12d;

        /* renamed from: e */
        public int f13e;

        /* renamed from: f */
        public int f14f;

        /* renamed from: g */
        public int f15g;

        /* renamed from: h */
        public boolean f16h;

        /* renamed from: i */
        public boolean f17i;

        /* renamed from: j */
        public int f18j;
    }

    /* renamed from: a00$b */
    /* compiled from: BasicMeasure */
    public interface C0001b {
        /* renamed from: a */
        void mo8a();

        /* renamed from: b */
        void mo9b(ConstraintWidget constraintWidget, C0000a aVar);
    }

    public a00(C0486d dVar) {
        this.f5c = dVar;
    }

    /* renamed from: a */
    public final boolean mo3a(C0001b bVar, ConstraintWidget constraintWidget, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f4b.f9a = constraintWidget.mo4331C();
        this.f4b.f10b = constraintWidget.mo4363S();
        this.f4b.f11c = constraintWidget.mo4369V();
        this.f4b.f12d = constraintWidget.mo4441z();
        C0000a aVar = this.f4b;
        aVar.f17i = false;
        aVar.f18j = i;
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
        if (z3 && constraintWidget.f2453x[0] == 4) {
            aVar.f9a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.f2453x[1] == 4) {
            aVar.f10b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.mo9b(constraintWidget, aVar);
        constraintWidget.mo4399h1(this.f4b.f13e);
        constraintWidget.mo4344I0(this.f4b.f14f);
        constraintWidget.mo4342H0(this.f4b.f16h);
        constraintWidget.mo4438x0(this.f4b.f15g);
        C0000a aVar2 = this.f4b;
        aVar2.f18j = C0000a.f6k;
        return aVar2.f17i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f2416e0 <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0097;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4b(androidx.constraintlayout.core.widgets.C0486d r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.f18830U0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo4489Q1(r1)
            a00$b r2 = r13.mo4479F1()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.f18830U0
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.C0489f
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.mo4407k0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.c r6 = r5.f2415e
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.d r7 = r5.f2417f
            if (r7 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f2483e
            boolean r6 = r6.f2475j
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r7.f2483e
            boolean r6 = r6.f2475j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.mo4435w(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.mo4435w(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f2449v
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f2451w
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.mo4489Q1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.C0493i
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f2449v
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.mo4398h0()
            if (r11 != 0) goto L_0x007c
            r10 = r7
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f2451w
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.mo4398h0()
            if (r11 != 0) goto L_0x008b
            r10 = r7
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f2416e0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = p000.a00.C0000a.f6k
            r12.mo3a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.mo8a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a00.mo4b(androidx.constraintlayout.core.widgets.d):void");
    }

    /* renamed from: c */
    public final void mo5c(C0486d dVar, String str, int i, int i2, int i3) {
        int K = dVar.mo4347K();
        int J = dVar.mo4345J();
        dVar.mo4374X0(0);
        dVar.mo4372W0(0);
        dVar.mo4399h1(i2);
        dVar.mo4344I0(i3);
        dVar.mo4374X0(K);
        dVar.mo4372W0(J);
        this.f5c.mo4493U1(i);
        this.f5c.mo4497p1();
    }

    /* renamed from: d */
    public long mo6d(C0486d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        int i10;
        boolean z3;
        int i11;
        C0486d dVar2;
        boolean z4;
        boolean z5;
        int i12;
        boolean z6;
        int i13;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        a00 a00 = this;
        C0486d dVar3 = dVar;
        int i14 = i;
        int i15 = i4;
        int i16 = i6;
        C0001b F1 = dVar.mo4479F1();
        int size = dVar3.f18830U0.size();
        int V = dVar.mo4369V();
        int z13 = dVar.mo4441z();
        boolean b = C0491g.m3746b(i14, 128);
        if (b || C0491g.m3746b(i14, 64)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                ConstraintWidget constraintWidget = dVar3.f18830U0.get(i17);
                ConstraintWidget.DimensionBehaviour C = constraintWidget.mo4331C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (C == dimensionBehaviour) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (constraintWidget.mo4363S() == dimensionBehaviour) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z10 || !z11 || constraintWidget.mo4437x() <= Utils.FLOAT_EPSILON) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if ((!constraintWidget.mo4398h0() || !z12) && ((!constraintWidget.mo4404j0() || !z12) && !(constraintWidget instanceof C0493i) && !constraintWidget.mo4398h0() && !constraintWidget.mo4404j0())) {
                    i17++;
                }
            }
            z = false;
        }
        if (z) {
            boolean z14 = C0467c.f2300r;
        }
        if (!(i15 == 1073741824 && i16 == 1073741824) && !b) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z15 = z & z2;
        int i18 = 2;
        if (z15) {
            int min = Math.min(dVar.mo4343I(), i5);
            int min2 = Math.min(dVar.mo4341H(), i7);
            if (i15 == 1073741824 && dVar.mo4369V() != min) {
                dVar3.mo4399h1(min);
                dVar.mo4483J1();
            }
            if (i16 == 1073741824 && dVar.mo4441z() != min2) {
                dVar3.mo4344I0(min2);
                dVar.mo4483J1();
            }
            if (i15 == 1073741824 && i16 == 1073741824) {
                z3 = dVar3.mo4476C1(b);
                i10 = 2;
            } else {
                boolean D1 = dVar3.mo4477D1(b);
                if (i15 == 1073741824) {
                    D1 &= dVar3.mo4478E1(b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i16 == 1073741824) {
                    z3 = dVar3.mo4478E1(b, 1) & D1;
                    i10++;
                } else {
                    z3 = D1;
                }
            }
            if (z3) {
                if (i15 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (i16 == 1073741824) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                dVar3.mo4414m1(z8, z9);
            }
        } else {
            z3 = false;
            i10 = 0;
        }
        if (z3 && i10 == 2) {
            return 0;
        }
        int G1 = dVar.mo4480G1();
        if (size > 0) {
            mo4b(dVar);
        }
        mo7e(dVar);
        int size2 = a00.f3a.size();
        if (size > 0) {
            mo5c(dVar, "First pass", 0, V, z13);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour C2 = dVar.mo4331C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (C2 == dimensionBehaviour2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dVar.mo4363S() == dimensionBehaviour2) {
                z5 = true;
            } else {
                z5 = false;
            }
            int max = Math.max(dVar.mo4369V(), a00.f5c.mo4347K());
            int max2 = Math.max(dVar.mo4441z(), a00.f5c.mo4345J());
            int i19 = 0;
            boolean z16 = false;
            while (i19 < size2) {
                ConstraintWidget constraintWidget2 = a00.f3a.get(i19);
                if (!(constraintWidget2 instanceof C0493i)) {
                    i13 = G1;
                } else {
                    int V2 = constraintWidget2.mo4369V();
                    int z17 = constraintWidget2.mo4441z();
                    i13 = G1;
                    boolean a = a00.mo3a(F1, constraintWidget2, C0000a.f7l) | z16;
                    int V3 = constraintWidget2.mo4369V();
                    boolean z18 = a;
                    int z19 = constraintWidget2.mo4441z();
                    if (V3 != V2) {
                        constraintWidget2.mo4399h1(V3);
                        if (z4 && constraintWidget2.mo4355O() > max) {
                            max = Math.max(max, constraintWidget2.mo4355O() + constraintWidget2.mo4422q(ConstraintAnchor.Type.RIGHT).mo4310f());
                        }
                        z7 = true;
                    } else {
                        z7 = z18;
                    }
                    if (z19 != z17) {
                        constraintWidget2.mo4344I0(z19);
                        if (z5 && constraintWidget2.mo4428t() > max2) {
                            max2 = Math.max(max2, constraintWidget2.mo4428t() + constraintWidget2.mo4422q(ConstraintAnchor.Type.BOTTOM).mo4310f());
                        }
                        z7 = true;
                    }
                    z16 = z7 | ((C0493i) constraintWidget2).mo4554C1();
                }
                i19++;
                C0486d dVar4 = dVar;
                G1 = i13;
                i18 = 2;
            }
            int i20 = G1;
            int i21 = i18;
            int i22 = 0;
            while (i22 < i21) {
                int i23 = 0;
                while (i23 < size2) {
                    ConstraintWidget constraintWidget3 = a00.f3a.get(i23);
                    if ((!(constraintWidget3 instanceof vl2) || (constraintWidget3 instanceof C0493i)) && !(constraintWidget3 instanceof C0489f) && constraintWidget3.mo4367U() != 8 && ((!z15 || !constraintWidget3.f2415e.f2483e.f2475j || !constraintWidget3.f2417f.f2483e.f2475j) && !(constraintWidget3 instanceof C0493i))) {
                        int V4 = constraintWidget3.mo4369V();
                        int z20 = constraintWidget3.mo4441z();
                        z6 = z15;
                        int r = constraintWidget3.mo4424r();
                        int i24 = C0000a.f7l;
                        i12 = size2;
                        if (i22 == 1) {
                            i24 = C0000a.f8m;
                        }
                        boolean a2 = a00.mo3a(F1, constraintWidget3, i24) | z16;
                        int V5 = constraintWidget3.mo4369V();
                        int z21 = constraintWidget3.mo4441z();
                        if (V5 != V4) {
                            constraintWidget3.mo4399h1(V5);
                            if (z4 && constraintWidget3.mo4355O() > max) {
                                max = Math.max(max, constraintWidget3.mo4355O() + constraintWidget3.mo4422q(ConstraintAnchor.Type.RIGHT).mo4310f());
                            }
                            a2 = true;
                        }
                        if (z21 != z20) {
                            constraintWidget3.mo4344I0(z21);
                            if (z5 && constraintWidget3.mo4428t() > max2) {
                                max2 = Math.max(max2, constraintWidget3.mo4428t() + constraintWidget3.mo4422q(ConstraintAnchor.Type.BOTTOM).mo4310f());
                            }
                            a2 = true;
                        }
                        if (!constraintWidget3.mo4375Y() || r == constraintWidget3.mo4424r()) {
                            z16 = a2;
                        } else {
                            z16 = true;
                        }
                    } else {
                        z6 = z15;
                        i12 = size2;
                    }
                    i23++;
                    a00 = this;
                    z15 = z6;
                    size2 = i12;
                }
                boolean z22 = z15;
                int i25 = size2;
                if (!z16) {
                    break;
                }
                i22++;
                mo5c(dVar, "intermediate pass", i22, V, z13);
                a00 = this;
                z15 = z22;
                size2 = i25;
                i21 = 2;
                z16 = false;
            }
            dVar2 = dVar;
            i11 = i20;
        } else {
            dVar2 = dVar;
            i11 = G1;
        }
        dVar2.mo4492T1(i11);
        return 0;
    }

    /* renamed from: e */
    public void mo7e(C0486d dVar) {
        this.f3a.clear();
        int size = dVar.f18830U0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.f18830U0.get(i);
            ConstraintWidget.DimensionBehaviour C = constraintWidget.mo4331C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (C == dimensionBehaviour || constraintWidget.mo4363S() == dimensionBehaviour) {
                this.f3a.add(constraintWidget);
            }
        }
        dVar.mo4483J1();
    }
}
