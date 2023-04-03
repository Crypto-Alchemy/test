package p000;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0006\u001a\u00020\u0005H\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rR2\u0010\u0010\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0015"}, mo44877d2 = {"Ltn4;", "K", "V", "", "", "", "hasNext", "a", "Lr37;", "remove", "key", "newValue", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lrn4;", "Lrn4;", "base", "Lqn4;", "builder", "<init>", "(Lqn4;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tn4 */
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class tn4<K, V> implements Iterator<Map.Entry<K, V>>, a93 {

    /* renamed from: a */
    public final rn4<K, V, Map.Entry<K, V>> f18199a;

    public tn4(qn4<K, V> qn4) {
        vx2.m53591g(qn4, "builder");
        vx6[] vx6Arr = new vx6[8];
        for (int i = 0; i < 8; i++) {
            vx6Arr[i] = new zx6(this);
        }
        this.f18199a = new rn4<>(qn4, vx6Arr);
    }

    /* renamed from: a */
    public Map.Entry<K, V> next() {
        return this.f18199a.next();
    }

    /* renamed from: b */
    public final void mo26520b(K k, V v) {
        this.f18199a.mo25461k(k, v);
    }

    public boolean hasNext() {
        return this.f18199a.hasNext();
    }

    public void remove() {
        this.f18199a.remove();
    }
}
