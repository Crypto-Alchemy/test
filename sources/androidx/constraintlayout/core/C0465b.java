package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.SolverVariable;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.b */
/* compiled from: ArrayRow */
public class C0465b implements C0467c.C0468a {

    /* renamed from: a */
    public SolverVariable f2294a = null;

    /* renamed from: b */
    public float f2295b = Utils.FLOAT_EPSILON;

    /* renamed from: c */
    public boolean f2296c = false;

    /* renamed from: d */
    public ArrayList<SolverVariable> f2297d = new ArrayList<>();

    /* renamed from: e */
    public C0466a f2298e;

    /* renamed from: f */
    public boolean f2299f = false;

    /* renamed from: androidx.constraintlayout.core.b$a */
    /* compiled from: ArrayRow */
    public interface C0466a {
        /* renamed from: a */
        boolean mo4212a(SolverVariable solverVariable);

        /* renamed from: b */
        SolverVariable mo4213b(int i);

        /* renamed from: c */
        void mo4214c(SolverVariable solverVariable, float f, boolean z);

        void clear();

        /* renamed from: d */
        void mo4216d();

        /* renamed from: e */
        float mo4217e(SolverVariable solverVariable, boolean z);

        /* renamed from: f */
        int mo4218f();

        /* renamed from: g */
        float mo4219g(C0465b bVar, boolean z);

        /* renamed from: h */
        void mo4220h(SolverVariable solverVariable, float f);

        /* renamed from: i */
        float mo4221i(int i);

        /* renamed from: j */
        float mo4222j(SolverVariable solverVariable);

        /* renamed from: k */
        void mo4223k(float f);
    }

    public C0465b() {
    }

    /* renamed from: A */
    public void mo4225A(C0467c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable != null && solverVariable.f2278s) {
            this.f2295b += solverVariable.f2277r * this.f2298e.mo4222j(solverVariable);
            this.f2298e.mo4217e(solverVariable, z);
            if (z) {
                solverVariable.mo4206f(this);
            }
            if (C0467c.f2302t && this.f2298e.mo4218f() == 0) {
                this.f2299f = true;
                cVar.f2308a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo4226B(C0467c cVar, C0465b bVar, boolean z) {
        this.f2295b += bVar.f2295b * this.f2298e.mo4219g(bVar, z);
        if (z) {
            bVar.f2294a.mo4206f(this);
        }
        if (C0467c.f2302t && this.f2294a != null && this.f2298e.mo4218f() == 0) {
            this.f2299f = true;
            cVar.f2308a = true;
        }
    }

    /* renamed from: C */
    public void mo4227C(C0467c cVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable != null && solverVariable.f2268I) {
            float j = this.f2298e.mo4222j(solverVariable);
            this.f2295b += solverVariable.f2270M * j;
            this.f2298e.mo4217e(solverVariable, z);
            if (z) {
                solverVariable.mo4206f(this);
            }
            this.f2298e.mo4214c(cVar.f2321n.f10534d[solverVariable.f2269L], j, z);
            if (C0467c.f2302t && this.f2298e.mo4218f() == 0) {
                this.f2299f = true;
                cVar.f2308a = true;
            }
        }
    }

    /* renamed from: D */
    public void mo4228D(C0467c cVar) {
        if (cVar.f2314g.length != 0) {
            boolean z = false;
            while (!z) {
                int f = this.f2298e.mo4218f();
                for (int i = 0; i < f; i++) {
                    SolverVariable b = this.f2298e.mo4213b(i);
                    if (b.f2275g != -1 || b.f2278s || b.f2268I) {
                        this.f2297d.add(b);
                    }
                }
                int size = this.f2297d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        SolverVariable solverVariable = this.f2297d.get(i2);
                        if (solverVariable.f2278s) {
                            mo4225A(cVar, solverVariable, true);
                        } else if (solverVariable.f2268I) {
                            mo4227C(cVar, solverVariable, true);
                        } else {
                            mo4226B(cVar, cVar.f2314g[solverVariable.f2275g], true);
                        }
                    }
                    this.f2297d.clear();
                } else {
                    z = true;
                }
            }
            if (C0467c.f2302t && this.f2294a != null && this.f2298e.mo4218f() == 0) {
                this.f2299f = true;
                cVar.f2308a = true;
            }
        }
    }

    /* renamed from: a */
    public void mo4229a(C0467c.C0468a aVar) {
        if (aVar instanceof C0465b) {
            C0465b bVar = (C0465b) aVar;
            this.f2294a = null;
            this.f2298e.clear();
            for (int i = 0; i < bVar.f2298e.mo4218f(); i++) {
                this.f2298e.mo4214c(bVar.f2298e.mo4213b(i), bVar.f2298e.mo4221i(i), true);
            }
        }
    }

    /* renamed from: b */
    public SolverVariable mo4230b(C0467c cVar, boolean[] zArr) {
        return mo4255w(zArr, (SolverVariable) null);
    }

    /* renamed from: c */
    public void mo4231c(SolverVariable solverVariable) {
        int i = solverVariable.f2276k;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f2298e.mo4220h(solverVariable, f);
    }

    public void clear() {
        this.f2298e.clear();
        this.f2294a = null;
        this.f2295b = Utils.FLOAT_EPSILON;
    }

    /* renamed from: d */
    public C0465b mo4233d(C0467c cVar, int i) {
        this.f2298e.mo4220h(cVar.mo4277o(i, "ep"), 1.0f);
        this.f2298e.mo4220h(cVar.mo4277o(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: e */
    public C0465b mo4234e(SolverVariable solverVariable, int i) {
        this.f2298e.mo4220h(solverVariable, (float) i);
        return this;
    }

    /* renamed from: f */
    public boolean mo4235f(C0467c cVar) {
        boolean z;
        SolverVariable g = mo4236g(cVar);
        if (g == null) {
            z = true;
        } else {
            mo4256x(g);
            z = false;
        }
        if (this.f2298e.mo4218f() == 0) {
            this.f2299f = true;
        }
        return z;
    }

    /* renamed from: g */
    public SolverVariable mo4236g(C0467c cVar) {
        boolean u;
        boolean u2;
        int f = this.f2298e.mo4218f();
        SolverVariable solverVariable = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        SolverVariable solverVariable2 = null;
        for (int i = 0; i < f; i++) {
            float i2 = this.f2298e.mo4221i(i);
            SolverVariable b = this.f2298e.mo4213b(i);
            if (b.f2264A == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    u2 = mo4253u(b, cVar);
                } else if (f2 > i2) {
                    u2 = mo4253u(b, cVar);
                } else if (!z && mo4253u(b, cVar)) {
                    f2 = i2;
                    solverVariable = b;
                    z = true;
                }
                z = u2;
                f2 = i2;
                solverVariable = b;
            } else if (solverVariable == null && i2 < Utils.FLOAT_EPSILON) {
                if (solverVariable2 == null) {
                    u = mo4253u(b, cVar);
                } else if (f3 > i2) {
                    u = mo4253u(b, cVar);
                } else if (!z2 && mo4253u(b, cVar)) {
                    f3 = i2;
                    solverVariable2 = b;
                    z2 = true;
                }
                z2 = u;
                f3 = i2;
                solverVariable2 = b;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    public SolverVariable getKey() {
        return this.f2294a;
    }

    /* renamed from: h */
    public C0465b mo4238h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable4, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
            this.f2298e.mo4220h(solverVariable3, -1.0f);
            this.f2298e.mo4220h(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f2295b = (float) ((-i) + i2);
            }
        } else if (f <= Utils.FLOAT_EPSILON) {
            this.f2298e.mo4220h(solverVariable, -1.0f);
            this.f2298e.mo4220h(solverVariable2, 1.0f);
            this.f2295b = (float) i;
        } else if (f >= 1.0f) {
            this.f2298e.mo4220h(solverVariable4, -1.0f);
            this.f2298e.mo4220h(solverVariable3, 1.0f);
            this.f2295b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f2298e.mo4220h(solverVariable, f2 * 1.0f);
            this.f2298e.mo4220h(solverVariable2, f2 * -1.0f);
            this.f2298e.mo4220h(solverVariable3, -1.0f * f);
            this.f2298e.mo4220h(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f2295b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: i */
    public C0465b mo4239i(SolverVariable solverVariable, int i) {
        this.f2294a = solverVariable;
        float f = (float) i;
        solverVariable.f2277r = f;
        this.f2295b = f;
        this.f2299f = true;
        return this;
    }

    public boolean isEmpty() {
        if (this.f2294a == null && this.f2295b == Utils.FLOAT_EPSILON && this.f2298e.mo4218f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public C0465b mo4241j(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.f2298e.mo4220h(solverVariable, -1.0f);
        this.f2298e.mo4220h(solverVariable2, f);
        return this;
    }

    /* renamed from: k */
    public C0465b mo4242k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f2298e.mo4220h(solverVariable, -1.0f);
        this.f2298e.mo4220h(solverVariable2, 1.0f);
        this.f2298e.mo4220h(solverVariable3, f);
        this.f2298e.mo4220h(solverVariable4, -f);
        return this;
    }

    /* renamed from: l */
    public C0465b mo4243l(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f2295b = Utils.FLOAT_EPSILON;
        if (f2 == Utils.FLOAT_EPSILON || f == f3) {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
            this.f2298e.mo4220h(solverVariable4, 1.0f);
            this.f2298e.mo4220h(solverVariable3, -1.0f);
        } else if (f == Utils.FLOAT_EPSILON) {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
        } else if (f3 == Utils.FLOAT_EPSILON) {
            this.f2298e.mo4220h(solverVariable3, 1.0f);
            this.f2298e.mo4220h(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
            this.f2298e.mo4220h(solverVariable4, f4);
            this.f2298e.mo4220h(solverVariable3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C0465b mo4244m(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f2295b = (float) (i * -1);
            this.f2298e.mo4220h(solverVariable, 1.0f);
        } else {
            this.f2295b = (float) i;
            this.f2298e.mo4220h(solverVariable, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C0465b mo4245n(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2295b = (float) i;
        }
        if (!z) {
            this.f2298e.mo4220h(solverVariable, -1.0f);
            this.f2298e.mo4220h(solverVariable2, 1.0f);
        } else {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0465b mo4246o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2295b = (float) i;
        }
        if (!z) {
            this.f2298e.mo4220h(solverVariable, -1.0f);
            this.f2298e.mo4220h(solverVariable2, 1.0f);
            this.f2298e.mo4220h(solverVariable3, 1.0f);
        } else {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
            this.f2298e.mo4220h(solverVariable3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C0465b mo4247p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2295b = (float) i;
        }
        if (!z) {
            this.f2298e.mo4220h(solverVariable, -1.0f);
            this.f2298e.mo4220h(solverVariable2, 1.0f);
            this.f2298e.mo4220h(solverVariable3, -1.0f);
        } else {
            this.f2298e.mo4220h(solverVariable, 1.0f);
            this.f2298e.mo4220h(solverVariable2, -1.0f);
            this.f2298e.mo4220h(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C0465b mo4248q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f2298e.mo4220h(solverVariable3, 0.5f);
        this.f2298e.mo4220h(solverVariable4, 0.5f);
        this.f2298e.mo4220h(solverVariable, -0.5f);
        this.f2298e.mo4220h(solverVariable2, -0.5f);
        this.f2295b = -f;
        return this;
    }

    /* renamed from: r */
    public void mo4249r() {
        float f = this.f2295b;
        if (f < Utils.FLOAT_EPSILON) {
            this.f2295b = f * -1.0f;
            this.f2298e.mo4216d();
        }
    }

    /* renamed from: s */
    public boolean mo4250s() {
        SolverVariable solverVariable = this.f2294a;
        if (solverVariable == null || (solverVariable.f2264A != SolverVariable.Type.UNRESTRICTED && this.f2295b < Utils.FLOAT_EPSILON)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo4251t(SolverVariable solverVariable) {
        return this.f2298e.mo4212a(solverVariable);
    }

    public String toString() {
        return mo4258z();
    }

    /* renamed from: u */
    public final boolean mo4253u(SolverVariable solverVariable, C0467c cVar) {
        if (solverVariable.f2267H <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public SolverVariable mo4254v(SolverVariable solverVariable) {
        return mo4255w((boolean[]) null, solverVariable);
    }

    /* renamed from: w */
    public final SolverVariable mo4255w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int f = this.f2298e.mo4218f();
        SolverVariable solverVariable2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < f; i++) {
            float i2 = this.f2298e.mo4221i(i);
            if (i2 < Utils.FLOAT_EPSILON) {
                SolverVariable b = this.f2298e.mo4213b(i);
                if ((zArr == null || !zArr[b.f2274e]) && b != solverVariable && (((type = b.f2264A) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && i2 < f2)) {
                    f2 = i2;
                    solverVariable2 = b;
                }
            }
        }
        return solverVariable2;
    }

    /* renamed from: x */
    public void mo4256x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f2294a;
        if (solverVariable2 != null) {
            this.f2298e.mo4220h(solverVariable2, -1.0f);
            this.f2294a.f2275g = -1;
            this.f2294a = null;
        }
        float e = this.f2298e.mo4217e(solverVariable, true) * -1.0f;
        this.f2294a = solverVariable;
        if (e != 1.0f) {
            this.f2295b /= e;
            this.f2298e.mo4223k(e);
        }
    }

    /* renamed from: y */
    public void mo4257y() {
        this.f2294a = null;
        this.f2298e.clear();
        this.f2295b = Utils.FLOAT_EPSILON;
        this.f2299f = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo4258z() {
        /*
            r10 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r10.f2294a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r10.f2294a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f2295b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f2295b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            androidx.constraintlayout.core.b$a r5 = r10.f2298e
            int r5 = r5.mo4218f()
        L_0x005d:
            if (r3 >= r5) goto L_0x00eb
            androidx.constraintlayout.core.b$a r6 = r10.f2298e
            androidx.constraintlayout.core.SolverVariable r6 = r6.mo4213b(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e7
        L_0x0069:
            androidx.constraintlayout.core.b$a r7 = r10.f2298e
            float r7 = r7.mo4221i(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e7
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0093:
            if (r8 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b9
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r9
        L_0x00b9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e6
        L_0x00cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e6:
            r1 = r4
        L_0x00e7:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00eb:
            if (r1 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0465b.mo4258z():java.lang.String");
    }

    public C0465b(d80 d80) {
        this.f2298e = new C0464a(this, d80);
    }
}
