package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0465b;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.core.a */
/* compiled from: ArrayLinkedVariables */
public class C0464a implements C0465b.C0466a {

    /* renamed from: l */
    public static float f2282l = 0.001f;

    /* renamed from: a */
    public int f2283a = 0;

    /* renamed from: b */
    public final C0465b f2284b;

    /* renamed from: c */
    public final d80 f2285c;

    /* renamed from: d */
    public int f2286d = 8;

    /* renamed from: e */
    public SolverVariable f2287e = null;

    /* renamed from: f */
    public int[] f2288f = new int[8];

    /* renamed from: g */
    public int[] f2289g = new int[8];

    /* renamed from: h */
    public float[] f2290h = new float[8];

    /* renamed from: i */
    public int f2291i = -1;

    /* renamed from: j */
    public int f2292j = -1;

    /* renamed from: k */
    public boolean f2293k = false;

    public C0464a(C0465b bVar, d80 d80) {
        this.f2284b = bVar;
        this.f2285c = d80;
    }

    /* renamed from: a */
    public boolean mo4212a(SolverVariable solverVariable) {
        int i = this.f2291i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f2283a) {
            if (this.f2288f[i] == solverVariable.f2274e) {
                return true;
            }
            i = this.f2289g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: b */
    public SolverVariable mo4213b(int i) {
        int i2 = this.f2291i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2283a) {
            if (i3 == i) {
                return this.f2285c.f10534d[this.f2288f[i2]];
            }
            i2 = this.f2289g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: c */
    public void mo4214c(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f2282l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f2291i;
            if (i == -1) {
                this.f2291i = 0;
                this.f2290h[0] = f;
                this.f2288f[0] = solverVariable.f2274e;
                this.f2289g[0] = -1;
                solverVariable.f2267H++;
                solverVariable.mo4203a(this.f2284b);
                this.f2283a++;
                if (!this.f2293k) {
                    int i2 = this.f2292j + 1;
                    this.f2292j = i2;
                    int[] iArr = this.f2288f;
                    if (i2 >= iArr.length) {
                        this.f2293k = true;
                        this.f2292j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f2283a) {
                int i5 = this.f2288f[i];
                int i6 = solverVariable.f2274e;
                if (i5 == i6) {
                    float[] fArr = this.f2290h;
                    float f3 = fArr[i] + f;
                    float f4 = f2282l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == Utils.FLOAT_EPSILON) {
                        if (i == this.f2291i) {
                            this.f2291i = this.f2289g[i];
                        } else {
                            int[] iArr2 = this.f2289g;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.mo4206f(this.f2284b);
                        }
                        if (this.f2293k) {
                            this.f2292j = i;
                        }
                        solverVariable.f2267H--;
                        this.f2283a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f2289g[i];
                i3++;
            }
            int i7 = this.f2292j;
            int i8 = i7 + 1;
            if (this.f2293k) {
                int[] iArr3 = this.f2288f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f2288f;
            if (i7 >= iArr4.length && this.f2283a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f2288f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f2288f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f2286d * 2;
                this.f2286d = i10;
                this.f2293k = false;
                this.f2292j = i7 - 1;
                this.f2290h = Arrays.copyOf(this.f2290h, i10);
                this.f2288f = Arrays.copyOf(this.f2288f, this.f2286d);
                this.f2289g = Arrays.copyOf(this.f2289g, this.f2286d);
            }
            this.f2288f[i7] = solverVariable.f2274e;
            this.f2290h[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f2289g;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f2289g[i7] = this.f2291i;
                this.f2291i = i7;
            }
            solverVariable.f2267H++;
            solverVariable.mo4203a(this.f2284b);
            this.f2283a++;
            if (!this.f2293k) {
                this.f2292j++;
            }
            int i11 = this.f2292j;
            int[] iArr8 = this.f2288f;
            if (i11 >= iArr8.length) {
                this.f2293k = true;
                this.f2292j = iArr8.length - 1;
            }
        }
    }

    public final void clear() {
        int i = this.f2291i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2283a) {
            SolverVariable solverVariable = this.f2285c.f10534d[this.f2288f[i]];
            if (solverVariable != null) {
                solverVariable.mo4206f(this.f2284b);
            }
            i = this.f2289g[i];
            i2++;
        }
        this.f2291i = -1;
        this.f2292j = -1;
        this.f2293k = false;
        this.f2283a = 0;
    }

    /* renamed from: d */
    public void mo4216d() {
        int i = this.f2291i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2283a) {
            float[] fArr = this.f2290h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f2289g[i];
            i2++;
        }
    }

    /* renamed from: e */
    public final float mo4217e(SolverVariable solverVariable, boolean z) {
        if (this.f2287e == solverVariable) {
            this.f2287e = null;
        }
        int i = this.f2291i;
        if (i == -1) {
            return Utils.FLOAT_EPSILON;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2283a) {
            if (this.f2288f[i] == solverVariable.f2274e) {
                if (i == this.f2291i) {
                    this.f2291i = this.f2289g[i];
                } else {
                    int[] iArr = this.f2289g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.mo4206f(this.f2284b);
                }
                solverVariable.f2267H--;
                this.f2283a--;
                this.f2288f[i] = -1;
                if (this.f2293k) {
                    this.f2292j = i;
                }
                return this.f2290h[i];
            }
            i2++;
            i3 = i;
            i = this.f2289g[i];
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: f */
    public int mo4218f() {
        return this.f2283a;
    }

    /* renamed from: g */
    public float mo4219g(C0465b bVar, boolean z) {
        float j = mo4222j(bVar.f2294a);
        mo4217e(bVar.f2294a, z);
        C0465b.C0466a aVar = bVar.f2298e;
        int f = aVar.mo4218f();
        for (int i = 0; i < f; i++) {
            SolverVariable b = aVar.mo4213b(i);
            mo4214c(b, aVar.mo4222j(b) * j, z);
        }
        return j;
    }

    /* renamed from: h */
    public final void mo4220h(SolverVariable solverVariable, float f) {
        if (f == Utils.FLOAT_EPSILON) {
            mo4217e(solverVariable, true);
            return;
        }
        int i = this.f2291i;
        if (i == -1) {
            this.f2291i = 0;
            this.f2290h[0] = f;
            this.f2288f[0] = solverVariable.f2274e;
            this.f2289g[0] = -1;
            solverVariable.f2267H++;
            solverVariable.mo4203a(this.f2284b);
            this.f2283a++;
            if (!this.f2293k) {
                int i2 = this.f2292j + 1;
                this.f2292j = i2;
                int[] iArr = this.f2288f;
                if (i2 >= iArr.length) {
                    this.f2293k = true;
                    this.f2292j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f2283a) {
            int i5 = this.f2288f[i];
            int i6 = solverVariable.f2274e;
            if (i5 == i6) {
                this.f2290h[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f2289g[i];
            i3++;
        }
        int i7 = this.f2292j;
        int i8 = i7 + 1;
        if (this.f2293k) {
            int[] iArr2 = this.f2288f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f2288f;
        if (i7 >= iArr3.length && this.f2283a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f2288f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f2288f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f2286d * 2;
            this.f2286d = i10;
            this.f2293k = false;
            this.f2292j = i7 - 1;
            this.f2290h = Arrays.copyOf(this.f2290h, i10);
            this.f2288f = Arrays.copyOf(this.f2288f, this.f2286d);
            this.f2289g = Arrays.copyOf(this.f2289g, this.f2286d);
        }
        this.f2288f[i7] = solverVariable.f2274e;
        this.f2290h[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f2289g;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f2289g[i7] = this.f2291i;
            this.f2291i = i7;
        }
        solverVariable.f2267H++;
        solverVariable.mo4203a(this.f2284b);
        int i11 = this.f2283a + 1;
        this.f2283a = i11;
        if (!this.f2293k) {
            this.f2292j++;
        }
        int[] iArr7 = this.f2288f;
        if (i11 >= iArr7.length) {
            this.f2293k = true;
        }
        if (this.f2292j >= iArr7.length) {
            this.f2293k = true;
            this.f2292j = iArr7.length - 1;
        }
    }

    /* renamed from: i */
    public float mo4221i(int i) {
        int i2 = this.f2291i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2283a) {
            if (i3 == i) {
                return this.f2290h[i2];
            }
            i2 = this.f2289g[i2];
            i3++;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: j */
    public final float mo4222j(SolverVariable solverVariable) {
        int i = this.f2291i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2283a) {
            if (this.f2288f[i] == solverVariable.f2274e) {
                return this.f2290h[i];
            }
            i = this.f2289g[i];
            i2++;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: k */
    public void mo4223k(float f) {
        int i = this.f2291i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2283a) {
            float[] fArr = this.f2290h;
            fArr[i] = fArr[i] / f;
            i = this.f2289g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f2291i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f2283a) {
            str = ((str + " -> ") + this.f2290h[i] + " : ") + this.f2285c.f10534d[this.f2288f[i]];
            i = this.f2289g[i];
            i2++;
        }
        return str;
    }
}
