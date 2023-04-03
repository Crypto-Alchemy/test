package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;

/* renamed from: e82 */
/* compiled from: ForwardingConcurrentMap */
public abstract class e82<K, V> extends l82<K, V> implements ConcurrentMap<K, V> {
    public abstract ConcurrentMap<K, V> delegate();

    @CanIgnoreReturnValue
    public V putIfAbsent(K k, V v) {
        return delegate().putIfAbsent(k, v);
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public V replace(K k, V v) {
        return delegate().replace(k, v);
    }

    @CanIgnoreReturnValue
    public boolean replace(K k, V v, V v2) {
        return delegate().replace(k, v, v2);
    }
}
