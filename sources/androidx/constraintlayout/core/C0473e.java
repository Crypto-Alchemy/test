package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0465b;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.e */
/* compiled from: SolverVariableValues */
public class C0473e implements C0465b.C0466a {

    /* renamed from: n */
    public static float f2336n = 0.001f;

    /* renamed from: a */
    public final int f2337a = -1;

    /* renamed from: b */
    public int f2338b = 16;

    /* renamed from: c */
    public int f2339c = 16;

    /* renamed from: d */
    public int[] f2340d = new int[16];

    /* renamed from: e */
    public int[] f2341e = new int[16];

    /* renamed from: f */
    public int[] f2342f = new int[16];

    /* renamed from: g */
    public float[] f2343g = new float[16];

    /* renamed from: h */
    public int[] f2344h = new int[16];

    /* renamed from: i */
    public int[] f2345i = new int[16];

    /* renamed from: j */
    public int f2346j = 0;

    /* renamed from: k */
    public int f2347k = -1;

    /* renamed from: l */
    public final C0465b f2348l;

    /* renamed from: m */
    public final d80 f2349m;

    public C0473e(C0465b bVar, d80 d80) {
        this.f2348l = bVar;
        this.f2349m = d80;
        clear();
    }

    /* renamed from: a */
    public boolean mo4212a(SolverVariable solverVariable) {
        if (mo4301p(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public SolverVariable mo4213b(int i) {
        int i2 = this.f2346j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f2347k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f2349m.f10534d[this.f2342f[i3]];
            }
            i3 = this.f2345i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo4214c(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f2336n;
        if (f <= (-f2) || f >= f2) {
            int p = mo4301p(solverVariable);
            if (p == -1) {
                mo4220h(solverVariable, f);
                return;
            }
            float[] fArr = this.f2343g;
            float f3 = fArr[p] + f;
            fArr[p] = f3;
            float f4 = f2336n;
            if (f3 > (-f4) && f3 < f4) {
                fArr[p] = 0.0f;
                mo4217e(solverVariable, z);
            }
        }
    }

    public void clear() {
        int i = this.f2346j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable b = mo4213b(i2);
            if (b != null) {
                b.mo4206f(this.f2348l);
            }
        }
        for (int i3 = 0; i3 < this.f2338b; i3++) {
            this.f2342f[i3] = -1;
            this.f2341e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f2339c; i4++) {
            this.f2340d[i4] = -1;
        }
        this.f2346j = 0;
        this.f2347k = -1;
    }

    /* renamed from: d */
    public void mo4216d() {
        int i = this.f2346j;
        int i2 = this.f2347k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f2343g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f2345i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public float mo4217e(SolverVariable solverVariable, boolean z) {
        int p = mo4301p(solverVariable);
        if (p == -1) {
            return Utils.FLOAT_EPSILON;
        }
        mo4303r(solverVariable);
        float f = this.f2343g[p];
        if (this.f2347k == p) {
            this.f2347k = this.f2345i[p];
        }
        this.f2342f[p] = -1;
        int[] iArr = this.f2344h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.f2345i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.f2345i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.f2346j--;
        solverVariable.f2267H--;
        if (z) {
            solverVariable.mo4206f(this.f2348l);
        }
        return f;
    }

    /* renamed from: f */
    public int mo4218f() {
        return this.f2346j;
    }

    /* renamed from: g */
    public float mo4219g(C0465b bVar, boolean z) {
        float j = mo4222j(bVar.f2294a);
        mo4217e(bVar.f2294a, z);
        C0473e eVar = (C0473e) bVar.f2298e;
        int f = eVar.mo4218f();
        int i = 0;
        int i2 = 0;
        while (i < f) {
            int i3 = eVar.f2342f[i2];
            if (i3 != -1) {
                mo4214c(this.f2349m.f10534d[i3], eVar.f2343g[i2] * j, z);
                i++;
            }
            i2++;
        }
        return j;
    }

    /* renamed from: h */
    public void mo4220h(SolverVariable solverVariable, float f) {
        float f2 = f2336n;
        if (f <= (-f2) || f >= f2) {
            if (this.f2346j == 0) {
                mo4298m(0, solverVariable, f);
                mo4297l(solverVariable, 0);
                this.f2347k = 0;
                return;
            }
            int p = mo4301p(solverVariable);
            if (p != -1) {
                this.f2343g[p] = f;
                return;
            }
            if (this.f2346j + 1 >= this.f2338b) {
                mo4300o();
            }
            int i = this.f2346j;
            int i2 = this.f2347k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.f2342f[i2];
                int i6 = solverVariable.f2274e;
                if (i5 == i6) {
                    this.f2343g[i2] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i2;
                }
                i2 = this.f2345i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            mo4302q(i3, solverVariable, f);
            return;
        }
        mo4217e(solverVariable, true);
    }

    /* renamed from: i */
    public float mo4221i(int i) {
        int i2 = this.f2346j;
        int i3 = this.f2347k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2343g[i3];
            }
            i3 = this.f2345i[i3];
            if (i3 == -1) {
                return Utils.FLOAT_EPSILON;
            }
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: j */
    public float mo4222j(SolverVariable solverVariable) {
        int p = mo4301p(solverVariable);
        if (p != -1) {
            return this.f2343g[p];
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: k */
    public void mo4223k(float f) {
        int i = this.f2346j;
        int i2 = this.f2347k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f2343g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f2345i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final void mo4297l(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f2274e % this.f2339c;
        int[] iArr2 = this.f2340d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2341e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f2341e[i] = -1;
    }

    /* renamed from: m */
    public final void mo4298m(int i, SolverVariable solverVariable, float f) {
        this.f2342f[i] = solverVariable.f2274e;
        this.f2343g[i] = f;
        this.f2344h[i] = -1;
        this.f2345i[i] = -1;
        solverVariable.mo4203a(this.f2348l);
        solverVariable.f2267H++;
        this.f2346j++;
    }

    /* renamed from: n */
    public final int mo4299n() {
        for (int i = 0; i < this.f2338b; i++) {
            if (this.f2342f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void mo4300o() {
        int i = this.f2338b * 2;
        this.f2342f = Arrays.copyOf(this.f2342f, i);
        this.f2343g = Arrays.copyOf(this.f2343g, i);
        this.f2344h = Arrays.copyOf(this.f2344h, i);
        this.f2345i = Arrays.copyOf(this.f2345i, i);
        this.f2341e = Arrays.copyOf(this.f2341e, i);
        for (int i2 = this.f2338b; i2 < i; i2++) {
            this.f2342f[i2] = -1;
            this.f2341e[i2] = -1;
        }
        this.f2338b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo4301p(androidx.constraintlayout.core.SolverVariable r4) {
        /*
            r3 = this;
            int r0 = r3.f2346j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f2274e
            int r0 = r3.f2339c
            int r0 = r4 % r0
            int[] r2 = r3.f2340d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f2342f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f2341e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f2342f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f2342f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0473e.mo4301p(androidx.constraintlayout.core.SolverVariable):int");
    }

    /* renamed from: q */
    public final void mo4302q(int i, SolverVariable solverVariable, float f) {
        int n = mo4299n();
        mo4298m(n, solverVariable, f);
        if (i != -1) {
            this.f2344h[n] = i;
            int[] iArr = this.f2345i;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f2344h[n] = -1;
            if (this.f2346j > 0) {
                this.f2345i[n] = this.f2347k;
                this.f2347k = n;
            } else {
                this.f2345i[n] = -1;
            }
        }
        int i2 = this.f2345i[n];
        if (i2 != -1) {
            this.f2344h[i2] = n;
        }
        mo4297l(solverVariable, n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4303r(androidx.constraintlayout.core.SolverVariable r6) {
        /*
            r5 = this;
            int r6 = r6.f2274e
            int r0 = r5.f2339c
            int r0 = r6 % r0
            int[] r1 = r5.f2340d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f2342f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f2341e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f2341e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f2342f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f2342f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0473e.mo4303r(androidx.constraintlayout.core.SolverVariable):void");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f2346j;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable b = mo4213b(i2);
            if (b != null) {
                String str4 = str3 + b + " = " + mo4221i(i2) + " ";
                int p = mo4301p(b);
                String str5 = str4 + "[p: ";
                if (this.f2344h[p] != -1) {
                    str = str5 + this.f2349m.f10534d[this.f2342f[this.f2344h[p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f2345i[p] != -1) {
                    str2 = str6 + this.f2349m.f10534d[this.f2342f[this.f2345i[p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
