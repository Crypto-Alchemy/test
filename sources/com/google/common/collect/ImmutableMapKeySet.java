package com.google.common.collect;

import java.io.Serializable;

final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {
    private final ImmutableMap<K, V> map;

    public static class KeySetSerializedForm<K> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<K, ?> map;

        public KeySetSerializedForm(ImmutableMap<K, ?> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.keySet();
        }
    }

    public ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public K get(int i) {
        return this.map.entrySet().asList().get(i).getKey();
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.map.size();
    }

    public Object writeReplace() {
        return new KeySetSerializedForm(this.map);
    }

    public c47<K> iterator() {
        return this.map.keyIterator();
    }
}
