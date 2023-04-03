package p000;

/* renamed from: ki4 */
/* compiled from: OpenHashSet */
public final class ki4<T> {

    /* renamed from: a */
    public final float f30882a;

    /* renamed from: b */
    public int f30883b;

    /* renamed from: c */
    public int f30884c;

    /* renamed from: d */
    public int f30885d;

    /* renamed from: e */
    public T[] f30886e;

    public ki4() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    public static int m47103c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo44801a(T t) {
        T t2;
        T[] tArr = this.f30886e;
        int i = this.f30883b;
        int c = m47103c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                c = (c + 1) & i;
                t2 = tArr[c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[c] = t;
        int i2 = this.f30884c + 1;
        this.f30884c = i2;
        if (i2 >= this.f30885d) {
            mo44803d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] mo44802b() {
        return this.f30886e;
    }

    /* renamed from: d */
    public void mo44803d() {
        T t;
        T[] tArr = this.f30886e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f30884c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    t = tArr[length];
                } while (t == null);
                int c = m47103c(t.hashCode()) & i2;
                if (tArr2[c] != null) {
                    do {
                        c = (c + 1) & i2;
                    } while (tArr2[c] != null);
                }
                tArr2[c] = tArr[length];
                i3 = i4;
            } else {
                this.f30883b = i2;
                this.f30885d = (int) (((float) i) * this.f30882a);
                this.f30886e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean mo44804e(T t) {
        T t2;
        T[] tArr = this.f30886e;
        int i = this.f30883b;
        int c = m47103c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo44805f(c, tArr, i);
        }
        do {
            c = (c + 1) & i;
            t2 = tArr[c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo44805f(c, tArr, i);
    }

    /* renamed from: f */
    public boolean mo44805f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f30884c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int c = m47103c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c || c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c && c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public ki4(int i, float f) {
        this.f30882a = f;
        int a = tt4.m52441a(i);
        this.f30883b = a - 1;
        this.f30885d = (int) (f * ((float) a));
        this.f30886e = new Object[a];
    }
}
