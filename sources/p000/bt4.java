package p000;

/* renamed from: bt4 */
/* compiled from: Pools */
public class bt4<T> implements zs4<T> {

    /* renamed from: a */
    public final Object[] f8240a;

    /* renamed from: b */
    public int f8241b;

    public bt4(int i) {
        if (i > 0) {
            this.f8240a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo11808a(T t) {
        int i = this.f8241b;
        Object[] objArr = this.f8240a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f8241b = i + 1;
        return true;
    }

    /* renamed from: b */
    public T mo11809b() {
        int i = this.f8241b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f8240a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f8241b = i - 1;
        return t;
    }

    /* renamed from: c */
    public void mo11810c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f8241b;
            Object[] objArr = this.f8240a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f8241b = i3 + 1;
            }
        }
    }
}
