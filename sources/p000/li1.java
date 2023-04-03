package p000;

/* renamed from: li1 */
/* compiled from: DoubleCheck */
public final class li1<T> implements ky4<T> {

    /* renamed from: c */
    public static final Object f31322c = new Object();

    /* renamed from: a */
    public volatile ky4<T> f31323a;

    /* renamed from: b */
    public volatile Object f31324b = f31322c;

    public li1(ky4<T> ky4) {
        this.f31323a = ky4;
    }

    /* renamed from: a */
    public static <P extends ky4<T>, T> ky4<T> m47821a(P p) {
        fu4.m44411b(p);
        if (p instanceof li1) {
            return p;
        }
        return new li1(p);
    }

    /* renamed from: b */
    public static Object m47822b(Object obj, Object obj2) {
        boolean z;
        if (obj != f31322c) {
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
        T t = this.f31324b;
        T t2 = f31322c;
        if (t == t2) {
            synchronized (this) {
                t = this.f31324b;
                if (t == t2) {
                    t = this.f31323a.get();
                    this.f31324b = m47822b(this.f31324b, t);
                    this.f31323a = null;
                }
            }
        }
        return t;
    }
}
