package androidx.constraintlayout.core;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: Q */
    public static int f2263Q = 1;

    /* renamed from: A */
    public Type f2264A;

    /* renamed from: B */
    public C0465b[] f2265B = new C0465b[16];

    /* renamed from: C */
    public int f2266C = 0;

    /* renamed from: H */
    public int f2267H = 0;

    /* renamed from: I */
    public boolean f2268I = false;

    /* renamed from: L */
    public int f2269L = -1;

    /* renamed from: M */
    public float f2270M = Utils.FLOAT_EPSILON;

    /* renamed from: P */
    public HashSet<C0465b> f2271P = null;

    /* renamed from: a */
    public boolean f2272a;

    /* renamed from: d */
    public String f2273d;

    /* renamed from: e */
    public int f2274e = -1;

    /* renamed from: g */
    public int f2275g = -1;

    /* renamed from: k */
    public int f2276k = 0;

    /* renamed from: r */
    public float f2277r;

    /* renamed from: s */
    public boolean f2278s = false;

    /* renamed from: x */
    public float[] f2279x = new float[9];

    /* renamed from: y */
    public float[] f2280y = new float[9];

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.f2264A = type;
    }

    /* renamed from: e */
    public static void m3316e() {
        f2263Q++;
    }

    /* renamed from: a */
    public final void mo4203a(C0465b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f2266C;
            if (i >= i2) {
                C0465b[] bVarArr = this.f2265B;
                if (i2 >= bVarArr.length) {
                    this.f2265B = (C0465b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0465b[] bVarArr2 = this.f2265B;
                int i3 = this.f2266C;
                bVarArr2[i3] = bVar;
                this.f2266C = i3 + 1;
                return;
            } else if (this.f2265B[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public int compareTo(SolverVariable solverVariable) {
        return this.f2274e - solverVariable.f2274e;
    }

    /* renamed from: f */
    public final void mo4206f(C0465b bVar) {
        int i = this.f2266C;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2265B[i2] == bVar) {
                while (i2 < i - 1) {
                    C0465b[] bVarArr = this.f2265B;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f2266C--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public void mo4207g() {
        this.f2273d = null;
        this.f2264A = Type.UNKNOWN;
        this.f2276k = 0;
        this.f2274e = -1;
        this.f2275g = -1;
        this.f2277r = Utils.FLOAT_EPSILON;
        this.f2278s = false;
        this.f2268I = false;
        this.f2269L = -1;
        this.f2270M = Utils.FLOAT_EPSILON;
        int i = this.f2266C;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2265B[i2] = null;
        }
        this.f2266C = 0;
        this.f2267H = 0;
        this.f2272a = false;
        Arrays.fill(this.f2280y, Utils.FLOAT_EPSILON);
    }

    /* renamed from: h */
    public void mo4208h(C0467c cVar, float f) {
        this.f2277r = f;
        this.f2278s = true;
        this.f2268I = false;
        this.f2269L = -1;
        this.f2270M = Utils.FLOAT_EPSILON;
        int i = this.f2266C;
        this.f2275g = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2265B[i2].mo4225A(cVar, this, false);
        }
        this.f2266C = 0;
    }

    /* renamed from: i */
    public void mo4209i(Type type, String str) {
        this.f2264A = type;
    }

    /* renamed from: l */
    public final void mo4210l(C0467c cVar, C0465b bVar) {
        int i = this.f2266C;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2265B[i2].mo4226B(cVar, bVar, false);
        }
        this.f2266C = 0;
    }

    public String toString() {
        if (this.f2273d != null) {
            return "" + this.f2273d;
        }
        return "" + this.f2274e;
    }
}
