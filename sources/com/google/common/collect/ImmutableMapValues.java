package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    /* access modifiers changed from: private */
    public final ImmutableMap<K, V> map;

    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap<?, V> map;

        public SerializedForm(ImmutableMap<?, V> immutableMap) {
            this.map = immutableMap;
        }

        public Object readResolve() {
            return this.map.values();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMapValues$a */
    public class C4542a extends c47<V> {

        /* renamed from: a */
        public final c47<Map.Entry<K, V>> f24878a;

        public C4542a() {
            this.f24878a = ImmutableMapValues.this.map.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f24878a.hasNext();
        }

        public V next() {
            return this.f24878a.next().getValue();
        }
    }

    public ImmutableMapValues(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public ImmutableList<V> asList() {
        final ImmutableList<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new ImmutableList<V>(this) {
            public V get(int i) {
                return ((Map.Entry) asList.get(i)).getValue();
            }

            public boolean isPartialView() {
                return true;
            }

            public int size() {
                return asList.size();
            }
        };
    }

    public boolean contains(Object obj) {
        if (obj == null || !Iterators.m36767d(iterator(), obj)) {
            return false;
        }
        return true;
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.map.size();
    }

    public Object writeReplace() {
        return new SerializedForm(this.map);
    }

    public c47<V> iterator() {
        return new C4542a();
    }
}
