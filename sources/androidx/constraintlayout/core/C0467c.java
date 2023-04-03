package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.c */
/* compiled from: LinearSystem */
public class C0467c {

    /* renamed from: r */
    public static boolean f2300r = false;

    /* renamed from: s */
    public static boolean f2301s = true;

    /* renamed from: t */
    public static boolean f2302t = true;

    /* renamed from: u */
    public static boolean f2303u = true;

    /* renamed from: v */
    public static boolean f2304v = false;

    /* renamed from: w */
    public static int f2305w = 1000;

    /* renamed from: x */
    public static long f2306x;

    /* renamed from: y */
    public static long f2307y;

    /* renamed from: a */
    public boolean f2308a;

    /* renamed from: b */
    public int f2309b;

    /* renamed from: c */
    public HashMap<String, SolverVariable> f2310c;

    /* renamed from: d */
    public C0468a f2311d;

    /* renamed from: e */
    public int f2312e;

    /* renamed from: f */
    public int f2313f;

    /* renamed from: g */
    public C0465b[] f2314g;

    /* renamed from: h */
    public boolean f2315h;

    /* renamed from: i */
    public boolean f2316i;

    /* renamed from: j */
    public boolean[] f2317j;

    /* renamed from: k */
    public int f2318k;

    /* renamed from: l */
    public int f2319l;

    /* renamed from: m */
    public int f2320m;

    /* renamed from: n */
    public final d80 f2321n;

    /* renamed from: o */
    public SolverVariable[] f2322o;

    /* renamed from: p */
    public int f2323p;

    /* renamed from: q */
    public C0468a f2324q;

    /* renamed from: androidx.constraintlayout.core.c$a */
    /* compiled from: LinearSystem */
    public interface C0468a {
        /* renamed from: a */
        void mo4229a(C0468a aVar);

        /* renamed from: b */
        SolverVariable mo4230b(C0467c cVar, boolean[] zArr);

        /* renamed from: c */
        void mo4231c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    /* renamed from: androidx.constraintlayout.core.c$b */
    /* compiled from: LinearSystem */
    public class C0469b extends C0465b {
        public C0469b(d80 d80) {
            this.f2298e = new C0473e(this, d80);
        }
    }

    public C0467c() {
        this.f2308a = false;
        this.f2309b = 0;
        this.f2310c = null;
        this.f2312e = 32;
        this.f2313f = 32;
        this.f2314g = null;
        this.f2315h = false;
        this.f2316i = false;
        this.f2317j = new boolean[32];
        this.f2318k = 1;
        this.f2319l = 0;
        this.f2320m = 32;
        this.f2322o = new SolverVariable[f2305w];
        this.f2323p = 0;
        this.f2314g = new C0465b[32];
        mo4261C();
        d80 d80 = new d80();
        this.f2321n = d80;
        this.f2311d = new C0470d(d80);
        if (f2304v) {
            this.f2324q = new C0469b(d80);
        } else {
            this.f2324q = new C0465b(d80);
        }
    }

    /* renamed from: s */
    public static C0465b m3376s(C0467c cVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return cVar.mo4280r().mo4241j(solverVariable, solverVariable2, f);
    }

    /* renamed from: w */
    public static pv3 m3377w() {
        return null;
    }

    /* renamed from: A */
    public void mo4259A(C0468a aVar) throws Exception {
        mo4282u(aVar);
        mo4260B(aVar, false);
        mo4276n();
    }

    /* renamed from: B */
    public final int mo4260B(C0468a aVar, boolean z) {
        for (int i = 0; i < this.f2318k; i++) {
            this.f2317j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f2318k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f2317j[aVar.getKey().f2274e] = true;
            }
            SolverVariable b = aVar.mo4230b(this, this.f2317j);
            if (b != null) {
                boolean[] zArr = this.f2317j;
                int i3 = b.f2274e;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f2319l; i5++) {
                    C0465b bVar = this.f2314g[i5];
                    if (bVar.f2294a.f2264A != SolverVariable.Type.UNRESTRICTED && !bVar.f2299f && bVar.mo4251t(b)) {
                        float j = bVar.f2298e.mo4222j(b);
                        if (j < Utils.FLOAT_EPSILON) {
                            float f2 = (-bVar.f2295b) / j;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0465b bVar2 = this.f2314g[i4];
                    bVar2.f2294a.f2275g = -1;
                    bVar2.mo4256x(b);
                    SolverVariable solverVariable = bVar2.f2294a;
                    solverVariable.f2275g = i4;
                    solverVariable.mo4210l(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    public final void mo4261C() {
        int i = 0;
        if (f2304v) {
            while (i < this.f2319l) {
                C0465b bVar = this.f2314g[i];
                if (bVar != null) {
                    this.f2321n.f10531a.mo11808a(bVar);
                }
                this.f2314g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f2319l) {
            C0465b bVar2 = this.f2314g[i];
            if (bVar2 != null) {
                this.f2321n.f10532b.mo11808a(bVar2);
            }
            this.f2314g[i] = null;
            i++;
        }
    }

    /* renamed from: D */
    public void mo4262D() {
        d80 d80;
        int i = 0;
        while (true) {
            d80 = this.f2321n;
            SolverVariable[] solverVariableArr = d80.f10534d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.mo4207g();
            }
            i++;
        }
        d80.f10533c.mo11810c(this.f2322o, this.f2323p);
        this.f2323p = 0;
        Arrays.fill(this.f2321n.f10534d, (Object) null);
        HashMap<String, SolverVariable> hashMap = this.f2310c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2309b = 0;
        this.f2311d.clear();
        this.f2318k = 1;
        for (int i2 = 0; i2 < this.f2319l; i2++) {
            C0465b bVar = this.f2314g[i2];
            if (bVar != null) {
                bVar.f2296c = false;
            }
        }
        mo4261C();
        this.f2319l = 0;
        if (f2304v) {
            this.f2324q = new C0469b(this.f2321n);
        } else {
            this.f2324q = new C0465b(this.f2321n);
        }
    }

    /* renamed from: a */
    public final SolverVariable mo4263a(SolverVariable.Type type, String str) {
        SolverVariable b = this.f2321n.f10533c.mo11809b();
        if (b == null) {
            b = new SolverVariable(type, str);
            b.mo4209i(type, str);
        } else {
            b.mo4207g();
            b.mo4209i(type, str);
        }
        int i = this.f2323p;
        int i2 = f2305w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f2305w = i3;
            this.f2322o = (SolverVariable[]) Arrays.copyOf(this.f2322o, i3);
        }
        SolverVariable[] solverVariableArr = this.f2322o;
        int i4 = this.f2323p;
        this.f2323p = i4 + 1;
        solverVariableArr[i4] = b;
        return b;
    }

    /* renamed from: b */
    public void mo4264b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable q = mo4279q(constraintWidget3.mo4422q(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable q2 = mo4279q(constraintWidget3.mo4422q(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable q3 = mo4279q(constraintWidget3.mo4422q(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable q4 = mo4279q(constraintWidget3.mo4422q(type4));
        SolverVariable q5 = mo4279q(constraintWidget4.mo4422q(type));
        SolverVariable q6 = mo4279q(constraintWidget4.mo4422q(type2));
        SolverVariable q7 = mo4279q(constraintWidget4.mo4422q(type3));
        SolverVariable q8 = mo4279q(constraintWidget4.mo4422q(type4));
        C0465b r = mo4280r();
        double d = (double) f;
        SolverVariable solverVariable = q7;
        double d2 = (double) i;
        r.mo4248q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        mo4266d(r);
        C0465b r2 = mo4280r();
        r2.mo4248q(q, q3, q5, solverVariable, (float) (Math.cos(d) * d2));
        mo4266d(r2);
    }

    /* renamed from: c */
    public void mo4265c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        int i4 = i3;
        C0465b r = mo4280r();
        r.mo4238h(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i4 != 8) {
            r.mo4233d(this, i4);
        }
        mo4266d(r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4266d(androidx.constraintlayout.core.C0465b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f2319l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f2320m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f2318k
            int r0 = r0 + r1
            int r2 = r5.f2313f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.mo4285y()
        L_0x0015:
            r0 = 0
            boolean r2 = r6.f2299f
            if (r2 != 0) goto L_0x0084
            r6.mo4228D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.mo4249r()
            boolean r2 = r6.mo4235f(r5)
            if (r2 == 0) goto L_0x007b
            androidx.constraintlayout.core.SolverVariable r2 = r5.mo4278p()
            r6.f2294a = r2
            int r3 = r5.f2319l
            r5.mo4274l(r6)
            int r4 = r5.f2319l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            androidx.constraintlayout.core.c$a r0 = r5.f2324q
            r0.mo4229a(r6)
            androidx.constraintlayout.core.c$a r0 = r5.f2324q
            r5.mo4260B(r0, r1)
            int r0 = r2.f2275g
            r3 = -1
            if (r0 != r3) goto L_0x007c
            androidx.constraintlayout.core.SolverVariable r0 = r6.f2294a
            if (r0 != r2) goto L_0x0059
            androidx.constraintlayout.core.SolverVariable r0 = r6.mo4254v(r2)
            if (r0 == 0) goto L_0x0059
            r6.mo4256x(r0)
        L_0x0059:
            boolean r0 = r6.f2299f
            if (r0 != 0) goto L_0x0062
            androidx.constraintlayout.core.SolverVariable r0 = r6.f2294a
            r0.mo4210l(r5, r6)
        L_0x0062:
            boolean r0 = f2304v
            if (r0 == 0) goto L_0x006e
            d80 r0 = r5.f2321n
            zs4<androidx.constraintlayout.core.b> r0 = r0.f10531a
            r0.mo11808a(r6)
            goto L_0x0075
        L_0x006e:
            d80 r0 = r5.f2321n
            zs4<androidx.constraintlayout.core.b> r0 = r0.f10532b
            r0.mo11808a(r6)
        L_0x0075:
            int r0 = r5.f2319l
            int r0 = r0 - r1
            r5.f2319l = r0
            goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            boolean r0 = r6.mo4250s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r0 = r1
        L_0x0084:
            if (r0 != 0) goto L_0x0089
            r5.mo4274l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0467c.mo4266d(androidx.constraintlayout.core.b):void");
    }

    /* renamed from: e */
    public C0465b mo4267e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (!f2301s || i2 != 8 || !solverVariable2.f2278s || solverVariable.f2275g != -1) {
            C0465b r = mo4280r();
            r.mo4245n(solverVariable, solverVariable2, i);
            if (i2 != 8) {
                r.mo4233d(this, i2);
            }
            mo4266d(r);
            return r;
        }
        solverVariable.mo4208h(this, solverVariable2.f2277r + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo4268f(SolverVariable solverVariable, int i) {
        if (!f2301s || solverVariable.f2275g != -1) {
            int i2 = solverVariable.f2275g;
            if (i2 != -1) {
                C0465b bVar = this.f2314g[i2];
                if (bVar.f2299f) {
                    bVar.f2295b = (float) i;
                } else if (bVar.f2298e.mo4218f() == 0) {
                    bVar.f2299f = true;
                    bVar.f2295b = (float) i;
                } else {
                    C0465b r = mo4280r();
                    r.mo4244m(solverVariable, i);
                    mo4266d(r);
                }
            } else {
                C0465b r2 = mo4280r();
                r2.mo4239i(solverVariable, i);
                mo4266d(r2);
            }
        } else {
            float f = (float) i;
            solverVariable.mo4208h(this, f);
            for (int i3 = 0; i3 < this.f2309b + 1; i3++) {
                SolverVariable solverVariable2 = this.f2321n.f10534d[i3];
                if (solverVariable2 != null && solverVariable2.f2268I && solverVariable2.f2269L == solverVariable.f2274e) {
                    solverVariable2.mo4208h(this, solverVariable2.f2270M + f);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo4269g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        C0465b r = mo4280r();
        SolverVariable t = mo4281t();
        t.f2276k = 0;
        r.mo4246o(solverVariable, solverVariable2, t, i);
        mo4266d(r);
    }

    /* renamed from: h */
    public void mo4270h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0465b r = mo4280r();
        SolverVariable t = mo4281t();
        t.f2276k = 0;
        r.mo4246o(solverVariable, solverVariable2, t, i);
        if (i2 != 8) {
            mo4275m(r, (int) (r.f2298e.mo4222j(t) * -1.0f), i2);
        }
        mo4266d(r);
    }

    /* renamed from: i */
    public void mo4271i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        C0465b r = mo4280r();
        SolverVariable t = mo4281t();
        t.f2276k = 0;
        r.mo4247p(solverVariable, solverVariable2, t, i);
        mo4266d(r);
    }

    /* renamed from: j */
    public void mo4272j(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C0465b r = mo4280r();
        SolverVariable t = mo4281t();
        t.f2276k = 0;
        r.mo4247p(solverVariable, solverVariable2, t, i);
        if (i2 != 8) {
            mo4275m(r, (int) (r.f2298e.mo4222j(t) * -1.0f), i2);
        }
        mo4266d(r);
    }

    /* renamed from: k */
    public void mo4273k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C0465b r = mo4280r();
        r.mo4242k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            r.mo4233d(this, i);
        }
        mo4266d(r);
    }

    /* renamed from: l */
    public final void mo4274l(C0465b bVar) {
        int i;
        if (!f2302t || !bVar.f2299f) {
            C0465b[] bVarArr = this.f2314g;
            int i2 = this.f2319l;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.f2294a;
            solverVariable.f2275g = i2;
            this.f2319l = i2 + 1;
            solverVariable.mo4210l(this, bVar);
        } else {
            bVar.f2294a.mo4208h(this, bVar.f2295b);
        }
        if (f2302t && this.f2308a) {
            int i3 = 0;
            while (i3 < this.f2319l) {
                if (this.f2314g[i3] == null) {
                    System.out.println("WTF");
                }
                C0465b bVar2 = this.f2314g[i3];
                if (bVar2 != null && bVar2.f2299f) {
                    bVar2.f2294a.mo4208h(this, bVar2.f2295b);
                    if (f2304v) {
                        this.f2321n.f10531a.mo11808a(bVar2);
                    } else {
                        this.f2321n.f10532b.mo11808a(bVar2);
                    }
                    this.f2314g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f2319l;
                        if (i4 >= i) {
                            break;
                        }
                        C0465b[] bVarArr2 = this.f2314g;
                        int i6 = i4 - 1;
                        C0465b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f2294a;
                        if (solverVariable2.f2275g == i4) {
                            solverVariable2.f2275g = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f2314g[i5] = null;
                    }
                    this.f2319l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f2308a = false;
        }
    }

    /* renamed from: m */
    public void mo4275m(C0465b bVar, int i, int i2) {
        bVar.mo4234e(mo4277o(i2, (String) null), i);
    }

    /* renamed from: n */
    public final void mo4276n() {
        for (int i = 0; i < this.f2319l; i++) {
            C0465b bVar = this.f2314g[i];
            bVar.f2294a.f2277r = bVar.f2295b;
        }
    }

    /* renamed from: o */
    public SolverVariable mo4277o(int i, String str) {
        if (this.f2318k + 1 >= this.f2313f) {
            mo4285y();
        }
        SolverVariable a = mo4263a(SolverVariable.Type.ERROR, str);
        int i2 = this.f2309b + 1;
        this.f2309b = i2;
        this.f2318k++;
        a.f2274e = i2;
        a.f2276k = i;
        this.f2321n.f10534d[i2] = a;
        this.f2311d.mo4231c(a);
        return a;
    }

    /* renamed from: p */
    public SolverVariable mo4278p() {
        if (this.f2318k + 1 >= this.f2313f) {
            mo4285y();
        }
        SolverVariable a = mo4263a(SolverVariable.Type.SLACK, (String) null);
        int i = this.f2309b + 1;
        this.f2309b = i;
        this.f2318k++;
        a.f2274e = i;
        this.f2321n.f10534d[i] = a;
        return a;
    }

    /* renamed from: q */
    public SolverVariable mo4279q(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f2318k + 1 >= this.f2313f) {
            mo4285y();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.mo4313i();
            if (solverVariable == null) {
                constraintAnchor.mo4323s(this.f2321n);
                solverVariable = constraintAnchor.mo4313i();
            }
            int i = solverVariable.f2274e;
            if (i == -1 || i > this.f2309b || this.f2321n.f10534d[i] == null) {
                if (i != -1) {
                    solverVariable.mo4207g();
                }
                int i2 = this.f2309b + 1;
                this.f2309b = i2;
                this.f2318k++;
                solverVariable.f2274e = i2;
                solverVariable.f2264A = SolverVariable.Type.UNRESTRICTED;
                this.f2321n.f10534d[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* renamed from: r */
    public C0465b mo4280r() {
        C0465b bVar;
        if (f2304v) {
            bVar = this.f2321n.f10531a.mo11809b();
            if (bVar == null) {
                bVar = new C0469b(this.f2321n);
                f2307y++;
            } else {
                bVar.mo4257y();
            }
        } else {
            bVar = this.f2321n.f10532b.mo11809b();
            if (bVar == null) {
                bVar = new C0465b(this.f2321n);
                f2306x++;
            } else {
                bVar.mo4257y();
            }
        }
        SolverVariable.m3316e();
        return bVar;
    }

    /* renamed from: t */
    public SolverVariable mo4281t() {
        if (this.f2318k + 1 >= this.f2313f) {
            mo4285y();
        }
        SolverVariable a = mo4263a(SolverVariable.Type.SLACK, (String) null);
        int i = this.f2309b + 1;
        this.f2309b = i;
        this.f2318k++;
        a.f2274e = i;
        this.f2321n.f10534d[i] = a;
        return a;
    }

    /* renamed from: u */
    public final int mo4282u(C0468a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f2319l) {
                z = false;
                break;
            }
            C0465b bVar = this.f2314g[i];
            if (bVar.f2294a.f2264A != SolverVariable.Type.UNRESTRICTED && bVar.f2295b < Utils.FLOAT_EPSILON) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2319l; i6++) {
                C0465b bVar2 = this.f2314g[i6];
                if (bVar2.f2294a.f2264A != SolverVariable.Type.UNRESTRICTED && !bVar2.f2299f && bVar2.f2295b < Utils.FLOAT_EPSILON) {
                    int i7 = 9;
                    if (f2303u) {
                        int f2 = bVar2.f2298e.mo4218f();
                        int i8 = 0;
                        while (i8 < f2) {
                            SolverVariable b = bVar2.f2298e.mo4213b(i8);
                            float j = bVar2.f2298e.mo4222j(b);
                            if (j > Utils.FLOAT_EPSILON) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f3 = b.f2279x[i9] / j;
                                    if ((f3 < f && i9 == i5) || i9 > i5) {
                                        i4 = b.f2274e;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f3;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f2318k; i10++) {
                            SolverVariable solverVariable = this.f2321n.f10534d[i10];
                            float j2 = bVar2.f2298e.mo4222j(solverVariable);
                            if (j2 > Utils.FLOAT_EPSILON) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f4 = solverVariable.f2279x[i11] / j2;
                                    if ((f4 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i3 = i6;
                                        i5 = i11;
                                        f = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C0465b bVar3 = this.f2314g[i3];
                bVar3.f2294a.f2275g = -1;
                bVar3.mo4256x(this.f2321n.f10534d[i4]);
                SolverVariable solverVariable2 = bVar3.f2294a;
                solverVariable2.f2275g = i3;
                solverVariable2.mo4210l(this, bVar3);
            } else {
                z2 = true;
            }
            if (i2 > this.f2318k / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public d80 mo4283v() {
        return this.f2321n;
    }

    /* renamed from: x */
    public int mo4284x(Object obj) {
        SolverVariable i = ((ConstraintAnchor) obj).mo4313i();
        if (i != null) {
            return (int) (i.f2277r + 0.5f);
        }
        return 0;
    }

    /* renamed from: y */
    public final void mo4285y() {
        int i = this.f2312e * 2;
        this.f2312e = i;
        this.f2314g = (C0465b[]) Arrays.copyOf(this.f2314g, i);
        d80 d80 = this.f2321n;
        d80.f10534d = (SolverVariable[]) Arrays.copyOf(d80.f10534d, this.f2312e);
        int i2 = this.f2312e;
        this.f2317j = new boolean[i2];
        this.f2313f = i2;
        this.f2320m = i2;
    }

    /* renamed from: z */
    public void mo4286z() throws Exception {
        if (this.f2311d.isEmpty()) {
            mo4276n();
        } else if (this.f2315h || this.f2316i) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f2319l) {
                    z = true;
                    break;
                } else if (!this.f2314g[i].f2299f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo4259A(this.f2311d);
            } else {
                mo4276n();
            }
        } else {
            mo4259A(this.f2311d);
        }
    }
}
