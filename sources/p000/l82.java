package p000;

import com.google.common.collect.C4632i;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: l82 */
/* compiled from: ForwardingMap */
public abstract class l82<K, V> extends m82 implements Map<K, V> {
    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        if (obj == this || delegate().equals(obj)) {
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        Iterators.m36766c(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj) {
        return Maps.m36921b(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        return Maps.m36922c(this, obj);
    }

    public boolean standardEquals(Object obj) {
        return Maps.m36923d(this, obj);
    }

    public int standardHashCode() {
        return C4632i.m37033d(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        Maps.m36929j(this, map);
    }

    public V standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (jf4.m46496a(entry.getKey(), obj)) {
                V value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return Maps.m36933n(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
