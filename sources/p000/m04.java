package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00028\u00018\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo44877d2 = {"Lm04;", "K", "V", "Lqn3;", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ltn4;", "e", "Ltn4;", "parentIterator", "g", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "a", "(Ljava/lang/Object;)V", "value", "key", "<init>", "(Ltn4;Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: m04 */
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class m04<K, V> extends qn3<K, V> {

    /* renamed from: e */
    public final tn4<K, V> f14766e;

    /* renamed from: g */
    public V f14767g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m04(tn4<K, V> tn4, K k, V v) {
        super(k, v);
        vx2.m53591g(tn4, "parentIterator");
        this.f14766e = tn4;
        this.f14767g = v;
    }

    /* renamed from: a */
    public void mo22996a(V v) {
        this.f14767g = v;
    }

    public V getValue() {
        return this.f14767g;
    }

    public V setValue(V v) {
        V value = getValue();
        mo22996a(v);
        this.f14766e.mo26520b(getKey(), v);
        return value;
    }
}
