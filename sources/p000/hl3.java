package p000;

/* renamed from: hl3 */
/* compiled from: LongSparseArray */
public class hl3<E> implements Cloneable {

    /* renamed from: k */
    public static final Object f12917k = new Object();

    /* renamed from: a */
    public boolean f12918a;

    /* renamed from: d */
    public long[] f12919d;

    /* renamed from: e */
    public Object[] f12920e;

    /* renamed from: g */
    public int f12921g;

    public hl3() {
        this(10);
    }

    /* renamed from: a */
    public void mo21203a(long j, E e) {
        int i = this.f12921g;
        if (i == 0 || j > this.f12919d[i - 1]) {
            if (this.f12918a && i >= this.f12919d.length) {
                mo21208g();
            }
            int i2 = this.f12921g;
            if (i2 >= this.f12919d.length) {
                int f = nr0.m23404f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f12919d;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f12920e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f12919d = jArr;
                this.f12920e = objArr;
            }
            this.f12919d[i2] = j;
            this.f12920e[i2] = e;
            this.f12921g = i2 + 1;
            return;
        }
        mo21214o(j, e);
    }

    /* renamed from: b */
    public void mo21204b() {
        int i = this.f12921g;
        Object[] objArr = this.f12920e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f12921g = 0;
        this.f12918a = false;
    }

    /* renamed from: d */
    public hl3<E> clone() {
        try {
            hl3<E> hl3 = (hl3) super.clone();
            hl3.f12919d = (long[]) this.f12919d.clone();
            hl3.f12920e = (Object[]) this.f12920e.clone();
            return hl3;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean mo21207f(long j) {
        if (mo21211j(j) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo21208g() {
        int i = this.f12921g;
        long[] jArr = this.f12919d;
        Object[] objArr = this.f12920e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f12917k) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f12918a = false;
        this.f12921g = i2;
    }

    /* renamed from: h */
    public E mo21209h(long j) {
        return mo21210i(j, (Object) null);
    }

    /* renamed from: i */
    public E mo21210i(long j, E e) {
        E e2;
        int b = nr0.m23400b(this.f12919d, this.f12921g, j);
        if (b < 0 || (e2 = this.f12920e[b]) == f12917k) {
            return e;
        }
        return e2;
    }

    /* renamed from: j */
    public int mo21211j(long j) {
        if (this.f12918a) {
            mo21208g();
        }
        return nr0.m23400b(this.f12919d, this.f12921g, j);
    }

    /* renamed from: l */
    public boolean mo21212l() {
        if (mo21219u() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public long mo21213m(int i) {
        if (this.f12918a) {
            mo21208g();
        }
        return this.f12919d[i];
    }

    /* renamed from: o */
    public void mo21214o(long j, E e) {
        int b = nr0.m23400b(this.f12919d, this.f12921g, j);
        if (b >= 0) {
            this.f12920e[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f12921g;
        if (i < i2) {
            Object[] objArr = this.f12920e;
            if (objArr[i] == f12917k) {
                this.f12919d[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f12918a && i2 >= this.f12919d.length) {
            mo21208g();
            i = ~nr0.m23400b(this.f12919d, this.f12921g, j);
        }
        int i3 = this.f12921g;
        if (i3 >= this.f12919d.length) {
            int f = nr0.m23404f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f12919d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12920e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12919d = jArr;
            this.f12920e = objArr2;
        }
        int i4 = this.f12921g;
        if (i4 - i != 0) {
            long[] jArr3 = this.f12919d;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f12920e;
            System.arraycopy(objArr4, i, objArr4, i5, this.f12921g - i);
        }
        this.f12919d[i] = j;
        this.f12920e[i] = e;
        this.f12921g++;
    }

    /* renamed from: p */
    public void mo21215p(hl3<? extends E> hl3) {
        int u = hl3.mo21219u();
        for (int i = 0; i < u; i++) {
            mo21214o(hl3.mo21213m(i), hl3.mo21220v(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f12920e;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21216r(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f12919d
            int r1 = r2.f12921g
            int r3 = p000.nr0.m23400b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f12920e
            r0 = r4[r3]
            java.lang.Object r1 = f12917k
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f12918a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hl3.mo21216r(long):void");
    }

    /* renamed from: t */
    public void mo21217t(int i) {
        Object[] objArr = this.f12920e;
        Object obj = objArr[i];
        Object obj2 = f12917k;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f12918a = true;
        }
    }

    public String toString() {
        if (mo21219u() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12921g * 28);
        sb.append('{');
        for (int i = 0; i < this.f12921g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo21213m(i));
            sb.append('=');
            Object v = mo21220v(i);
            if (v != this) {
                sb.append(v);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public int mo21219u() {
        if (this.f12918a) {
            mo21208g();
        }
        return this.f12921g;
    }

    /* renamed from: v */
    public E mo21220v(int i) {
        if (this.f12918a) {
            mo21208g();
        }
        return this.f12920e[i];
    }

    public hl3(int i) {
        this.f12918a = false;
        if (i == 0) {
            this.f12919d = nr0.f15657b;
            this.f12920e = nr0.f15658c;
            return;
        }
        int f = nr0.m23404f(i);
        this.f12919d = new long[f];
        this.f12920e = new Object[f];
    }
}
