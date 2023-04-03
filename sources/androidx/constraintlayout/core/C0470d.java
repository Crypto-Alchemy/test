package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0465b;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.constraintlayout.core.d */
/* compiled from: PriorityGoalRow */
public class C0470d extends C0465b {

    /* renamed from: g */
    public int f2326g = 128;

    /* renamed from: h */
    public SolverVariable[] f2327h = new SolverVariable[128];

    /* renamed from: i */
    public SolverVariable[] f2328i = new SolverVariable[128];

    /* renamed from: j */
    public int f2329j = 0;

    /* renamed from: k */
    public C0472b f2330k = new C0472b(this);

    /* renamed from: l */
    public d80 f2331l;

    /* renamed from: androidx.constraintlayout.core.d$a */
    /* compiled from: PriorityGoalRow */
    public class C0471a implements Comparator<SolverVariable> {
        public C0471a() {
        }

        /* renamed from: a */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f2274e - solverVariable2.f2274e;
        }
    }

    /* renamed from: androidx.constraintlayout.core.d$b */
    /* compiled from: PriorityGoalRow */
    public class C0472b {

        /* renamed from: a */
        public SolverVariable f2333a;

        /* renamed from: b */
        public C0470d f2334b;

        public C0472b(C0470d dVar) {
            this.f2334b = dVar;
        }

        /* renamed from: a */
        public boolean mo4291a(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (this.f2333a.f2272a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f2333a.f2280y;
                    float f2 = fArr[i] + (solverVariable.f2280y[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.f2333a.f2280y[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C0470d.this.mo4288G(this.f2333a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = solverVariable.f2280y[i2];
                if (f3 != Utils.FLOAT_EPSILON) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.f2333a.f2280y[i2] = f4;
                } else {
                    this.f2333a.f2280y[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo4292b(SolverVariable solverVariable) {
            this.f2333a = solverVariable;
        }

        /* renamed from: c */
        public final boolean mo4293c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f2333a.f2280y[i];
                if (f > Utils.FLOAT_EPSILON) {
                    return false;
                }
                if (f < Utils.FLOAT_EPSILON) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo4294d(SolverVariable solverVariable) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = solverVariable.f2280y[i];
                float f2 = this.f2333a.f2280y[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo4295e() {
            Arrays.fill(this.f2333a.f2280y, Utils.FLOAT_EPSILON);
        }

        public String toString() {
            String str = "[ ";
            if (this.f2333a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f2333a.f2280y[i] + " ";
                }
            }
            return str + "] " + this.f2333a;
        }
    }

    public C0470d(d80 d80) {
        super(d80);
        this.f2331l = d80;
    }

    /* renamed from: B */
    public void mo4226B(C0467c cVar, C0465b bVar, boolean z) {
        SolverVariable solverVariable = bVar.f2294a;
        if (solverVariable != null) {
            C0465b.C0466a aVar = bVar.f2298e;
            int f = aVar.mo4218f();
            for (int i = 0; i < f; i++) {
                SolverVariable b = aVar.mo4213b(i);
                float i2 = aVar.mo4221i(i);
                this.f2330k.mo4292b(b);
                if (this.f2330k.mo4291a(solverVariable, i2)) {
                    mo4287F(b);
                }
                this.f2295b += bVar.f2295b * i2;
            }
            mo4288G(solverVariable);
        }
    }

    /* renamed from: F */
    public final void mo4287F(SolverVariable solverVariable) {
        int i;
        int i2 = this.f2329j + 1;
        SolverVariable[] solverVariableArr = this.f2327h;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f2327h = solverVariableArr2;
            this.f2328i = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f2327h;
        int i3 = this.f2329j;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f2329j = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f2274e > solverVariable.f2274e) {
            int i5 = 0;
            while (true) {
                i = this.f2329j;
                if (i5 >= i) {
                    break;
                }
                this.f2328i[i5] = this.f2327h[i5];
                i5++;
            }
            Arrays.sort(this.f2328i, 0, i, new C0471a());
            for (int i6 = 0; i6 < this.f2329j; i6++) {
                this.f2327h[i6] = this.f2328i[i6];
            }
        }
        solverVariable.f2272a = true;
        solverVariable.mo4203a(this);
    }

    /* renamed from: G */
    public final void mo4288G(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f2329j) {
            if (this.f2327h[i] == solverVariable) {
                while (true) {
                    int i2 = this.f2329j;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.f2327h;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.f2329j = i2 - 1;
                        solverVariable.f2272a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public SolverVariable mo4230b(C0467c cVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f2329j; i2++) {
            SolverVariable solverVariable = this.f2327h[i2];
            if (!zArr[solverVariable.f2274e]) {
                this.f2330k.mo4292b(solverVariable);
                if (i == -1) {
                    if (!this.f2330k.mo4293c()) {
                    }
                } else if (!this.f2330k.mo4294d(this.f2327h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f2327h[i];
    }

    /* renamed from: c */
    public void mo4231c(SolverVariable solverVariable) {
        this.f2330k.mo4292b(solverVariable);
        this.f2330k.mo4295e();
        solverVariable.f2280y[solverVariable.f2276k] = 1.0f;
        mo4287F(solverVariable);
    }

    public void clear() {
        this.f2329j = 0;
        this.f2295b = Utils.FLOAT_EPSILON;
    }

    public boolean isEmpty() {
        if (this.f2329j == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f2295b + ") : ";
        for (int i = 0; i < this.f2329j; i++) {
            this.f2330k.mo4292b(this.f2327h[i]);
            str = str + this.f2330k + " ";
        }
        return str;
    }
}
