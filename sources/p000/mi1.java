package p000;

/* renamed from: mi1 */
/* compiled from: DoubleCheck */
public final class mi1<T> implements ky4<T> {

    /* renamed from: c */
    public static final Object f31708c = new Object();

    /* renamed from: a */
    public volatile ky4<T> f31709a;

    /* renamed from: b */
    public volatile Object f31710b = f31708c;

    public mi1(ky4<T> ky4) {
        this.f31709a = ky4;
    }

    /* renamed from: a */
    public static <P extends ky4<T>, T> ky4<T> m48304a(P p) {
        bu4.m32726b(p);
        if (p instanceof mi1) {
            return p;
        }
        return new mi1(p);
    }

    /* renamed from: b */
    public static Object m48305b(Object obj, Object obj2) {
        boolean z;
        if (obj != f31708c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f31710b;
        T t2 = f31708c;
        if (t == t2) {
            synchronized (this) {
                t = this.f31710b;
                if (t == t2) {
                    t = this.f31709a.get();
                    this.f31710b = m48305b(this.f31710b, t);
                    this.f31709a = null;
                }
            }
        }
        return t;
    }
}
