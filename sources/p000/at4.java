package p000;

/* renamed from: at4 */
/* compiled from: Pools */
public class at4<T> implements ys4<T> {

    /* renamed from: a */
    public final Object[] f7751a;

    /* renamed from: b */
    public int f7752b;

    public at4(int i) {
        if (i > 0) {
            this.f7751a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo11138a(T t) {
        if (!mo11140c(t)) {
            int i = this.f7752b;
            Object[] objArr = this.f7751a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f7752b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo11139b() {
        int i = this.f7752b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f7751a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f7752b = i - 1;
        return t;
    }

    /* renamed from: c */
    public final boolean mo11140c(T t) {
        for (int i = 0; i < this.f7752b; i++) {
            if (this.f7751a[i] == t) {
                return true;
            }
        }
        return false;
    }
}
