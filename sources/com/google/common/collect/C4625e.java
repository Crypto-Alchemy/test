package com.google.common.collect;

import com.github.mikephil.charting.utils.Utils;
import com.google.common.collect.C4623d;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* renamed from: com.google.common.collect.e */
/* compiled from: ObjectCountHashMap */
public class C4625e<K> {

    /* renamed from: a */
    public transient Object[] f25009a;

    /* renamed from: b */
    public transient int[] f25010b;

    /* renamed from: c */
    public transient int f25011c;

    /* renamed from: d */
    public transient int f25012d;

    /* renamed from: e */
    public transient int[] f25013e;

    /* renamed from: f */
    public transient long[] f25014f;

    /* renamed from: g */
    public transient float f25015g;

    /* renamed from: h */
    public transient int f25016h;

    /* renamed from: com.google.common.collect.e$a */
    /* compiled from: ObjectCountHashMap */
    public class C4626a extends Multisets.C4606a<K> {

        /* renamed from: a */
        public final K f25017a;

        /* renamed from: d */
        public int f25018d;

        public C4626a(int i) {
            this.f25017a = C4625e.this.f25009a[i];
            this.f25018d = i;
        }

        /* renamed from: a */
        public void mo35207a() {
            int i = this.f25018d;
            if (i == -1 || i >= C4625e.this.mo35186C() || !jf4.m46496a(this.f25017a, C4625e.this.f25009a[this.f25018d])) {
                this.f25018d = C4625e.this.mo35195m(this.f25017a);
            }
        }

        public int getCount() {
            mo35207a();
            int i = this.f25018d;
            if (i == -1) {
                return 0;
            }
            return C4625e.this.f25010b[i];
        }

        public K getElement() {
            return this.f25017a;
        }
    }

    public C4625e() {
        mo35196n(3, 1.0f);
    }

    /* renamed from: D */
    public static long m36986D(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    public static <K> C4625e<K> m36987b() {
        return new C4625e<>();
    }

    /* renamed from: c */
    public static <K> C4625e<K> m36988c(int i) {
        return new C4625e<>(i);
    }

    /* renamed from: h */
    public static int m36989h(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: j */
    public static int m36990j(long j) {
        return (int) j;
    }

    /* renamed from: q */
    public static long[] m36991q(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: r */
    public static int[] m36992r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: A */
    public final void mo35184A(int i) {
        if (this.f25013e.length >= 1073741824) {
            this.f25016h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f25015g)) + 1;
        int[] r = m36992r(i);
        long[] jArr = this.f25014f;
        int length = r.length - 1;
        for (int i3 = 0; i3 < this.f25011c; i3++) {
            int h = m36989h(jArr[i3]);
            int i4 = h & length;
            int i5 = r[i4];
            r[i4] = i3;
            jArr[i3] = (((long) h) << 32) | (((long) i5) & 4294967295L);
        }
        this.f25016h = i2;
        this.f25013e = r;
    }

    /* renamed from: B */
    public void mo35185B(int i, int i2) {
        du4.m43689i(i, this.f25011c);
        this.f25010b[i] = i2;
    }

    /* renamed from: C */
    public int mo35186C() {
        return this.f25011c;
    }

    /* renamed from: a */
    public void mo35187a() {
        this.f25012d++;
        Arrays.fill(this.f25009a, 0, this.f25011c, (Object) null);
        Arrays.fill(this.f25010b, 0, this.f25011c, 0);
        Arrays.fill(this.f25013e, -1);
        Arrays.fill(this.f25014f, -1);
        this.f25011c = 0;
    }

    /* renamed from: d */
    public void mo35188d(int i) {
        if (i > this.f25014f.length) {
            mo35205y(i);
        }
        if (i >= this.f25016h) {
            mo35184A(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* renamed from: e */
    public int mo35189e() {
        if (this.f25011c == 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: f */
    public int mo35190f(Object obj) {
        int m = mo35195m(obj);
        if (m == -1) {
            return 0;
        }
        return this.f25010b[m];
    }

    /* renamed from: g */
    public C4623d.C4624a<K> mo35191g(int i) {
        du4.m43689i(i, this.f25011c);
        return new C4626a(i);
    }

    /* renamed from: i */
    public K mo35192i(int i) {
        du4.m43689i(i, this.f25011c);
        return this.f25009a[i];
    }

    /* renamed from: k */
    public int mo35193k(int i) {
        du4.m43689i(i, this.f25011c);
        return this.f25010b[i];
    }

    /* renamed from: l */
    public final int mo35194l() {
        return this.f25013e.length - 1;
    }

    /* renamed from: m */
    public int mo35195m(Object obj) {
        int c = ml2.m48362c(obj);
        int i = this.f25013e[mo35194l() & c];
        while (i != -1) {
            long j = this.f25014f[i];
            if (m36989h(j) == c && jf4.m46496a(obj, this.f25009a[i])) {
                return i;
            }
            i = m36990j(j);
        }
        return -1;
    }

    /* renamed from: n */
    public void mo35196n(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43685e(z, "Initial capacity must be non-negative");
        if (f > Utils.FLOAT_EPSILON) {
            z2 = true;
        }
        du4.m43685e(z2, "Illegal load factor");
        int a = ml2.m48360a(i, (double) f);
        this.f25013e = m36992r(a);
        this.f25015g = f;
        this.f25009a = new Object[i];
        this.f25010b = new int[i];
        this.f25014f = m36991q(i);
        this.f25016h = Math.max(1, (int) (((float) a) * f));
    }

    /* renamed from: o */
    public void mo35197o(int i, K k, int i2, int i3) {
        this.f25014f[i] = (((long) i3) << 32) | 4294967295L;
        this.f25009a[i] = k;
        this.f25010b[i] = i2;
    }

    /* renamed from: p */
    public void mo35198p(int i) {
        int C = mo35186C() - 1;
        if (i < C) {
            Object[] objArr = this.f25009a;
            objArr[i] = objArr[C];
            int[] iArr = this.f25010b;
            iArr[i] = iArr[C];
            objArr[C] = null;
            iArr[C] = 0;
            long[] jArr = this.f25014f;
            long j = jArr[C];
            jArr[i] = j;
            jArr[C] = -1;
            int h = m36989h(j) & mo35194l();
            int[] iArr2 = this.f25013e;
            int i2 = iArr2[h];
            if (i2 == C) {
                iArr2[h] = i;
                return;
            }
            while (true) {
                long j2 = this.f25014f[i2];
                int j3 = m36990j(j2);
                if (j3 == C) {
                    this.f25014f[i2] = m36986D(j2, i);
                    return;
                }
                i2 = j3;
            }
        } else {
            this.f25009a[i] = null;
            this.f25010b[i] = 0;
            this.f25014f[i] = -1;
        }
    }

    /* renamed from: s */
    public int mo35199s(int i) {
        int i2 = i + 1;
        if (i2 < this.f25011c) {
            return i2;
        }
        return -1;
    }

    /* renamed from: t */
    public int mo35200t(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    /* renamed from: u */
    public int mo35201u(K k, int i) {
        ki0.m47101c(i, "count");
        long[] jArr = this.f25014f;
        Object[] objArr = this.f25009a;
        int[] iArr = this.f25010b;
        int c = ml2.m48362c(k);
        int l = mo35194l() & c;
        int i2 = this.f25011c;
        int[] iArr2 = this.f25013e;
        int i3 = iArr2[l];
        if (i3 == -1) {
            iArr2[l] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m36989h(j) != c || !jf4.m46496a(k, objArr[i3])) {
                    int j2 = m36990j(j);
                    if (j2 == -1) {
                        jArr[i3] = m36986D(j, i2);
                        break;
                    }
                    i3 = j2;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            mo35206z(i5);
            mo35197o(i2, k, i, c);
            this.f25011c = i5;
            if (i2 >= this.f25016h) {
                mo35184A(this.f25013e.length * 2);
            }
            this.f25012d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @CanIgnoreReturnValue
    /* renamed from: v */
    public int mo35202v(Object obj) {
        return mo35203w(obj, ml2.m48362c(obj));
    }

    /* renamed from: w */
    public final int mo35203w(Object obj, int i) {
        int l = mo35194l() & i;
        int i2 = this.f25013e[l];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m36989h(this.f25014f[i2]) != i || !jf4.m46496a(obj, this.f25009a[i2])) {
                int j = m36990j(this.f25014f[i2]);
                if (j == -1) {
                    return 0;
                }
                int i4 = j;
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f25010b[i2];
                if (i3 == -1) {
                    this.f25013e[l] = m36990j(this.f25014f[i2]);
                } else {
                    long[] jArr = this.f25014f;
                    jArr[i3] = m36986D(jArr[i3], m36990j(jArr[i2]));
                }
                mo35198p(i2);
                this.f25011c--;
                this.f25012d++;
                return i5;
            }
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: x */
    public int mo35204x(int i) {
        return mo35203w(this.f25009a[i], m36989h(this.f25014f[i]));
    }

    /* renamed from: y */
    public void mo35205y(int i) {
        this.f25009a = Arrays.copyOf(this.f25009a, i);
        this.f25010b = Arrays.copyOf(this.f25010b, i);
        long[] jArr = this.f25014f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f25014f = copyOf;
    }

    /* renamed from: z */
    public final void mo35206z(int i) {
        int length = this.f25014f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo35205y(max);
            }
        }
    }

    public C4625e(C4625e<? extends K> eVar) {
        mo35196n(eVar.mo35186C(), 1.0f);
        int e = eVar.mo35189e();
        while (e != -1) {
            mo35201u(eVar.mo35192i(e), eVar.mo35193k(e));
            e = eVar.mo35199s(e);
        }
    }

    public C4625e(int i) {
        this(i, 1.0f);
    }

    public C4625e(int i, float f) {
        mo35196n(i, f);
    }
}
