package p000;

/* renamed from: k80 */
/* compiled from: CachedHashCodeArrayMap */
public final class k80<K, V> extends C2781lq<K, V> {

    /* renamed from: y */
    public int f13991y;

    public void clear() {
        this.f13991y = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f13991y == 0) {
            this.f13991y = super.hashCode();
        }
        return this.f13991y;
    }

    /* renamed from: j */
    public void mo22210j(y16<? extends K, ? extends V> y16) {
        this.f13991y = 0;
        super.mo22210j(y16);
    }

    /* renamed from: k */
    public V mo22211k(int i) {
        this.f13991y = 0;
        return super.mo22211k(i);
    }

    /* renamed from: l */
    public V mo22212l(int i, V v) {
        this.f13991y = 0;
        return super.mo22212l(i, v);
    }

    public V put(K k, V v) {
        this.f13991y = 0;
        return super.put(k, v);
    }
}
