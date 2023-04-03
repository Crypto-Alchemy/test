package p000;

/* renamed from: yw2 */
/* compiled from: IntTreePMap */
public final class yw2<V> {

    /* renamed from: b */
    public static final yw2<Object> f46282b = new yw2<>(xw2.f46026f);

    /* renamed from: a */
    public final xw2<V> f46283a;

    public yw2(xw2<V> xw2) {
        this.f46283a = xw2;
    }

    /* renamed from: a */
    public static <V> yw2<V> m74667a() {
        return f46282b;
    }

    /* renamed from: b */
    public V mo67180b(int i) {
        return this.f46283a.mo66946a((long) i);
    }

    /* renamed from: c */
    public yw2<V> mo67181c(int i, V v) {
        return mo67182d(this.f46283a.mo66947b((long) i, v));
    }

    /* renamed from: d */
    public final yw2<V> mo67182d(xw2<V> xw2) {
        if (xw2 == this.f46283a) {
            return this;
        }
        return new yw2<>(xw2);
    }
}
