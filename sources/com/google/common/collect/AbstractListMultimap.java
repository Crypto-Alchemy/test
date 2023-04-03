package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements zh3<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    public abstract List<V> createCollection();

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return wrapList(k, (List) collection, (AbstractMapBasedMultimap<K, V>.C7321k) null);
    }

    public List<V> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    public List<V> get(K k) {
        return (List) super.get(k);
    }

    @CanIgnoreReturnValue
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @CanIgnoreReturnValue
    public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return (List) super.replaceValues(k, iterable);
    }
}
