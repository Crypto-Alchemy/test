package p000;

/* renamed from: fq0 */
/* compiled from: constantValues.kt */
public abstract class fq0<T> {

    /* renamed from: a */
    public final T f37869a;

    public fq0(T t) {
        this.f37869a = t;
    }

    /* renamed from: a */
    public abstract xc3 mo50070a(mx3 mx3);

    /* renamed from: b */
    public T mo51739b() {
        return this.f37869a;
    }

    public boolean equals(Object obj) {
        fq0 fq0;
        if (this != obj) {
            Object b = mo51739b();
            Object obj2 = null;
            if (obj instanceof fq0) {
                fq0 = (fq0) obj;
            } else {
                fq0 = null;
            }
            if (fq0 != null) {
                obj2 = fq0.mo51739b();
            }
            if (vx2.m53586b(b, obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object b = mo51739b();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo51739b());
    }
}
