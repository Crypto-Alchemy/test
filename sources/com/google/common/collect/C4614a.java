package com.google.common.collect;

import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.a */
/* compiled from: AbstractMultimap */
public abstract class C4614a<K, V> implements c04<K, V> {
    @LazyInit

    /* renamed from: a */
    public transient Collection<Map.Entry<K, V>> f24996a;
    @LazyInit

    /* renamed from: d */
    public transient Set<K> f24997d;
    @LazyInit

    /* renamed from: e */
    public transient C4623d<K> f24998e;
    @LazyInit

    /* renamed from: g */
    public transient Collection<V> f24999g;
    @LazyInit

    /* renamed from: k */
    public transient Map<K, Collection<V>> f25000k;

    /* renamed from: com.google.common.collect.a$a */
    /* compiled from: AbstractMultimap */
    public class C4615a extends Multimaps.C4602a<K, V> {
        public C4615a() {
        }

        /* renamed from: e */
        public c04<K, V> mo35061e() {
            return C4614a.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C4614a.this.entryIterator();
        }
    }

    /* renamed from: com.google.common.collect.a$b */
    /* compiled from: AbstractMultimap */
    public class C4616b extends C4614a<K, V>.C6784a implements Set<Map.Entry<K, V>> {
        public C4616b(C4614a aVar) {
            super();
        }

        public boolean equals(Object obj) {
            return C4632i.m37030a(this, obj);
        }

        public int hashCode() {
            return C4632i.m37033d(this);
        }
    }

    /* renamed from: com.google.common.collect.a$c */
    /* compiled from: AbstractMultimap */
    public class C4617c extends AbstractCollection<V> {
        public C4617c() {
        }

        public void clear() {
            C4614a.this.clear();
        }

        public boolean contains(Object obj) {
            return C4614a.this.containsValue(obj);
        }

        public Iterator<V> iterator() {
            return C4614a.this.valueIterator();
        }

        public int size() {
            return C4614a.this.size();
        }
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f25000k;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.f25000k = createAsMap;
        return createAsMap;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    public boolean containsValue(Object obj) {
        for (Collection contains : asMap().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract C4623d<K> createKeys();

    public abstract Collection<V> createValues();

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f24996a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.f24996a = createEntries;
        return createEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(Object obj) {
        return Multimaps.m36957a(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> set = this.f24997d;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.f24997d = createKeySet;
        return createKeySet;
    }

    public C4623d<K> keys() {
        C4623d<K> dVar = this.f24998e;
        if (dVar != null) {
            return dVar;
        }
        C4623d<K> createKeys = createKeys();
        this.f24998e = createKeys;
        return createKeys;
    }

    @CanIgnoreReturnValue
    public boolean put(K k, V v) {
        return get(k).add(v);
    }

    @CanIgnoreReturnValue
    public boolean putAll(K k, Iterable<? extends V> iterable) {
        du4.m43691k(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !Iterators.m36764a(get(k), it)) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) asMap().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        du4.m43691k(iterable);
        Collection<V> removeAll = removeAll(k);
        putAll(k, iterable);
        return removeAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return Maps.m36935p(entries().iterator());
    }

    public Collection<V> values() {
        Collection<V> collection = this.f24999g;
        if (collection != null) {
            return collection;
        }
        Collection<V> createValues = createValues();
        this.f24999g = createValues;
        return createValues;
    }

    @CanIgnoreReturnValue
    public boolean putAll(c04<? extends K, ? extends V> c04) {
        boolean z = false;
        for (Map.Entry next : c04.entries()) {
            z |= put(next.getKey(), next.getValue());
        }
        return z;
    }
}
