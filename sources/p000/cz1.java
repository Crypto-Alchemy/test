package p000;

import java.util.HashMap;
import java.util.Map;
import p000.ok5;

/* renamed from: cz1 */
/* compiled from: FastSafeIterableMap */
public class cz1<K, V> extends ok5<K, V> {

    /* renamed from: k */
    public HashMap<K, ok5.C2962c<K, V>> f10414k = new HashMap<>();

    public boolean contains(K k) {
        return this.f10414k.containsKey(k);
    }

    /* renamed from: j */
    public ok5.C2962c<K, V> mo18385j(K k) {
        return this.f10414k.get(k);
    }

    /* renamed from: q */
    public V mo18386q(K k, V v) {
        ok5.C2962c j = mo18385j(k);
        if (j != null) {
            return j.f15925d;
        }
        this.f10414k.put(k, mo23972o(k, v));
        return null;
    }

    /* renamed from: r */
    public V mo18387r(K k) {
        V r = super.mo18387r(k);
        this.f10414k.remove(k);
        return r;
    }

    /* renamed from: s */
    public Map.Entry<K, V> mo18388s(K k) {
        if (contains(k)) {
            return this.f10414k.get(k).f15927g;
        }
        return null;
    }
}
