package p000;

/* renamed from: fw2 */
/* compiled from: InstrumentedMemoryCache */
public class fw2<K, V> implements ys3<K, V> {

    /* renamed from: a */
    public final ys3<K, V> f12088a;

    /* renamed from: b */
    public final at3 f12089b;

    public fw2(ys3<K, V> ys3, at3 at3) {
        this.f12088a = ys3;
        this.f12089b = at3;
    }

    /* renamed from: b */
    public nh0<V> mo19973b(K k, nh0<V> nh0) {
        this.f12089b.mo11137c(k);
        return this.f12088a.mo19973b(k, nh0);
    }

    /* renamed from: c */
    public void mo19974c(K k) {
        this.f12088a.mo19974c(k);
    }

    public nh0<V> get(K k) {
        nh0<V> nh0 = this.f12088a.get(k);
        if (nh0 == null) {
            this.f12089b.mo11136b(k);
        } else {
            this.f12089b.mo11135a(k);
        }
        return nh0;
    }
}
