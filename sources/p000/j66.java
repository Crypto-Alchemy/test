package p000;

/* renamed from: j66 */
/* compiled from: SparseArrayCompat */
public class j66<E> implements Cloneable {

    /* renamed from: k */
    public static final Object f13529k = new Object();

    /* renamed from: a */
    public boolean f13530a;

    /* renamed from: d */
    public int[] f13531d;

    /* renamed from: e */
    public Object[] f13532e;

    /* renamed from: g */
    public int f13533g;

    public j66() {
        this(10);
    }

    /* renamed from: a */
    public void mo21749a(int i, E e) {
        int i2 = this.f13533g;
        if (i2 == 0 || i > this.f13531d[i2 - 1]) {
            if (this.f13530a && i2 >= this.f13531d.length) {
                mo21755h();
            }
            int i3 = this.f13533g;
            if (i3 >= this.f13531d.length) {
                int e2 = nr0.m23403e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f13531d;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f13532e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f13531d = iArr;
                this.f13532e = objArr;
            }
            this.f13531d[i3] = i;
            this.f13532e[i3] = e;
            this.f13533g = i3 + 1;
            return;
        }
        mo21762r(i, e);
    }

    /* renamed from: b */
    public void mo21750b() {
        int i = this.f13533g;
        Object[] objArr = this.f13532e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f13533g = 0;
        this.f13530a = false;
    }

    /* renamed from: d */
    public j66<E> clone() {
        try {
            j66<E> j66 = (j66) super.clone();
            j66.f13531d = (int[]) this.f13531d.clone();
            j66.f13532e = (Object[]) this.f13532e.clone();
            return j66;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public boolean mo21753f(int i) {
        if (mo21758l(i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo21754g(E e) {
        if (mo21759m(e) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo21755h() {
        int i = this.f13533g;
        int[] iArr = this.f13531d;
        Object[] objArr = this.f13532e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f13529k) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f13530a = false;
        this.f13533g = i2;
    }

    /* renamed from: i */
    public E mo21756i(int i) {
        return mo21757j(i, (Object) null);
    }

    /* renamed from: j */
    public E mo21757j(int i, E e) {
        E e2;
        int a = nr0.m23399a(this.f13531d, this.f13533g, i);
        if (a < 0 || (e2 = this.f13532e[a]) == f13529k) {
            return e;
        }
        return e2;
    }

    /* renamed from: l */
    public int mo21758l(int i) {
        if (this.f13530a) {
            mo21755h();
        }
        return nr0.m23399a(this.f13531d, this.f13533g, i);
    }

    /* renamed from: m */
    public int mo21759m(E e) {
        if (this.f13530a) {
            mo21755h();
        }
        for (int i = 0; i < this.f13533g; i++) {
            if (this.f13532e[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public boolean mo21760o() {
        if (mo21766v() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public int mo21761p(int i) {
        if (this.f13530a) {
            mo21755h();
        }
        return this.f13531d[i];
    }

    /* renamed from: r */
    public void mo21762r(int i, E e) {
        int a = nr0.m23399a(this.f13531d, this.f13533g, i);
        if (a >= 0) {
            this.f13532e[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f13533g;
        if (i2 < i3) {
            Object[] objArr = this.f13532e;
            if (objArr[i2] == f13529k) {
                this.f13531d[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f13530a && i3 >= this.f13531d.length) {
            mo21755h();
            i2 = ~nr0.m23399a(this.f13531d, this.f13533g, i);
        }
        int i4 = this.f13533g;
        if (i4 >= this.f13531d.length) {
            int e2 = nr0.m23403e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f13531d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f13532e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f13531d = iArr;
            this.f13532e = objArr2;
        }
        int i5 = this.f13533g;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f13531d;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f13532e;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f13533g - i2);
        }
        this.f13531d[i2] = i;
        this.f13532e[i2] = e;
        this.f13533g++;
    }

    /* renamed from: t */
    public void mo21763t(int i) {
        Object[] objArr = this.f13532e;
        Object obj = objArr[i];
        Object obj2 = f13529k;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f13530a = true;
        }
    }

    public String toString() {
        if (mo21766v() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f13533g * 28);
        sb.append('{');
        for (int i = 0; i < this.f13533g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo21761p(i));
            sb.append('=');
            Object w = mo21767w(i);
            if (w != this) {
                sb.append(w);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public E mo21765u(int i, E e) {
        int l = mo21758l(i);
        if (l < 0) {
            return null;
        }
        E[] eArr = this.f13532e;
        E e2 = eArr[l];
        eArr[l] = e;
        return e2;
    }

    /* renamed from: v */
    public int mo21766v() {
        if (this.f13530a) {
            mo21755h();
        }
        return this.f13533g;
    }

    /* renamed from: w */
    public E mo21767w(int i) {
        if (this.f13530a) {
            mo21755h();
        }
        return this.f13532e[i];
    }

    public j66(int i) {
        this.f13530a = false;
        if (i == 0) {
            this.f13531d = nr0.f15656a;
            this.f13532e = nr0.f15658c;
            return;
        }
        int e = nr0.m23403e(i);
        this.f13531d = new int[e];
        this.f13532e = new Object[e];
    }
}
