package p000;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
/* renamed from: c04 */
/* compiled from: Multimap */
public interface c04<K, V> {
    Map<K, Collection<V>> asMap();

    void clear();

    boolean containsEntry(@CompatibleWith("K") Object obj, @CompatibleWith("V") Object obj2);

    boolean containsKey(@CompatibleWith("K") Object obj);

    Collection<Map.Entry<K, V>> entries();

    Collection<V> get(K k);

    boolean isEmpty();

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean put(K k, V v);

    @CanIgnoreReturnValue
    boolean remove(@CompatibleWith("K") Object obj, @CompatibleWith("V") Object obj2);

    @CanIgnoreReturnValue
    Collection<V> removeAll(@CompatibleWith("K") Object obj);

    int size();

    Collection<V> values();
}
