package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: nf3 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class nf3<K, V> {

    /* renamed from: a */
    public final Map f32111a = new HashMap();

    /* renamed from: a */
    public abstract V mo29570a(K k);

    /* renamed from: b */
    public V mo46069b(K k) {
        synchronized (this.f32111a) {
            if (this.f32111a.containsKey(k)) {
                V v = this.f32111a.get(k);
                return v;
            }
            V a = mo29570a(k);
            this.f32111a.put(k, a);
            return a;
        }
    }
}
