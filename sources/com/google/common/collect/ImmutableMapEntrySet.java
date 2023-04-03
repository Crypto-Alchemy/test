package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<K, V> map;

        public EntrySetSerializedForm(ImmutableMap<K, V> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = map().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return map().hashCode();
    }

    public boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    public boolean isPartialView() {
        return map().isPartialView();
    }

    public abstract ImmutableMap<K, V> map();

    public int size() {
        return map().size();
    }

    public Object writeReplace() {
        return new EntrySetSerializedForm(map());
    }
}
