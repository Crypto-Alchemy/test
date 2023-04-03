package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.collect.C4628g;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class ImmutableMultimap<K, V> extends C6507sy<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    public final transient int size;

    public static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        @Weak
        public final ImmutableMultimap<K, V> multimap;

        public EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        public boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        public int size() {
            return this.multimap.size();
        }

        public c47<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }
    }

    public class Keys extends ImmutableMultiset<K> {
        public Keys() {
        }

        public boolean contains(Object obj) {
            return ImmutableMultimap.this.containsKey(obj);
        }

        public int count(Object obj) {
            Collection collection = (Collection) ImmutableMultimap.this.map.get(obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public C4623d.C4624a<K> getEntry(int i) {
            Map.Entry entry = ImmutableMultimap.this.map.entrySet().asList().get(i);
            return Multisets.m36967f(entry.getKey(), ((Collection) entry.getValue()).size());
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return ImmutableMultimap.this.size();
        }

        public Object writeReplace() {
            return new KeysSerializedForm(ImmutableMultimap.this);
        }

        public ImmutableSet<K> elementSet() {
            return ImmutableMultimap.this.keySet();
        }
    }

    public static final class KeysSerializedForm implements Serializable {
        public final ImmutableMultimap<?, ?> multimap;

        public KeysSerializedForm(ImmutableMultimap<?, ?> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public Object readResolve() {
            return this.multimap.keys();
        }
    }

    public static final class Values<K, V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        @Weak

        /* renamed from: d */
        public final transient ImmutableMultimap<K, V> f24880d;

        public Values(ImmutableMultimap<K, V> immutableMultimap) {
            this.f24880d = immutableMultimap;
        }

        public boolean contains(Object obj) {
            return this.f24880d.containsValue(obj);
        }

        public int copyIntoArray(Object[] objArr, int i) {
            c47<? extends ImmutableCollection<V>> it = this.f24880d.map.values().iterator();
            while (it.hasNext()) {
                i = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i);
            }
            return i;
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f24880d.size();
        }

        public c47<V> iterator() {
            return this.f24880d.valueIterator();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$a */
    public class C4543a extends c47<Map.Entry<K, V>> {

        /* renamed from: a */
        public final Iterator<? extends Map.Entry<K, ? extends ImmutableCollection<V>>> f24881a;

        /* renamed from: d */
        public K f24882d = null;

        /* renamed from: e */
        public Iterator<V> f24883e = Iterators.m36769f();

        public C4543a() {
            this.f24881a = ImmutableMultimap.this.map.entrySet().iterator();
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f24883e.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f24881a.next();
                this.f24882d = entry.getKey();
                this.f24883e = ((ImmutableCollection) entry.getValue()).iterator();
            }
            K k = this.f24882d;
            Objects.requireNonNull(k);
            return Maps.m36924e(k, this.f24883e.next());
        }

        public boolean hasNext() {
            if (this.f24883e.hasNext() || this.f24881a.hasNext()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$b */
    public class C4544b extends c47<V> {

        /* renamed from: a */
        public Iterator<? extends ImmutableCollection<V>> f24885a;

        /* renamed from: d */
        public Iterator<V> f24886d = Iterators.m36769f();

        public C4544b() {
            this.f24885a = ImmutableMultimap.this.map.values().iterator();
        }

        public boolean hasNext() {
            if (this.f24886d.hasNext() || this.f24885a.hasNext()) {
                return true;
            }
            return false;
        }

        public V next() {
            if (!this.f24886d.hasNext()) {
                this.f24886d = ((ImmutableCollection) this.f24885a.next()).iterator();
            }
            return this.f24886d.next();
        }
    }

    @DoNotMock
    /* renamed from: com.google.common.collect.ImmutableMultimap$c */
    public static class C4545c<K, V> {

        /* renamed from: a */
        public final Map<K, Collection<V>> f24888a = C4627f.m37021e();

        /* renamed from: b */
        public Comparator<? super K> f24889b;

        /* renamed from: c */
        public Comparator<? super V> f24890c;

        /* renamed from: a */
        public ImmutableMultimap<K, V> mo34774a() {
            Collection entrySet = this.f24888a.entrySet();
            Comparator comparator = this.f24889b;
            if (comparator != null) {
                entrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(entrySet);
            }
            return ImmutableListMultimap.fromMapEntries(entrySet, this.f24890c);
        }

        /* renamed from: b */
        public Collection<V> mo34775b() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4545c<K, V> mo34696c(K k, V v) {
            ki0.m47099a(k, v);
            Collection collection = this.f24888a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f24888a;
                Collection b = mo34775b();
                map.put(k, b);
                collection = b;
            }
            collection.add(v);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C4545c<K, V> mo34697d(Map.Entry<? extends K, ? extends V> entry) {
            return mo34696c(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C4545c<K, V> mo34776e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry d : iterable) {
                mo34697d(d);
            }
            return this;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultimap$d */
    public static class C4546d {

        /* renamed from: a */
        public static final C4628g.C4630b<ImmutableMultimap> f24891a = C4628g.m37023a(ImmutableMultimap.class, "map");

        /* renamed from: b */
        public static final C4628g.C4630b<ImmutableMultimap> f24892b = C4628g.m37023a(ImmutableMultimap.class, "size");
    }

    public ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public static <K, V> C4545c<K, V> builder() {
        return new C4545c<>();
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(c04<? extends K, ? extends V> c04) {
        if (c04 instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) c04;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf(c04);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m36681of() {
        return ImmutableListMultimap.m36648of();
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        if (obj == null || !super.containsValue(obj)) {
            return false;
        }
        return true;
    }

    public Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    public Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public abstract ImmutableCollection<V> get(K k);

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ImmutableMultimap<V, K> inverse();

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.size;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m36682of(K k, V v) {
        return ImmutableListMultimap.m36649of(k, v);
    }

    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    public ImmutableCollection<Map.Entry<K, V>> createEntries() {
        return new EntryCollection(this);
    }

    public ImmutableMultiset<K> createKeys() {
        return new Keys();
    }

    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    public ImmutableCollection<Map.Entry<K, V>> entries() {
        return (ImmutableCollection) super.entries();
    }

    public c47<Map.Entry<K, V>> entryIterator() {
        return new C4543a();
    }

    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    public ImmutableMultiset<K> keys() {
        return (ImmutableMultiset) super.keys();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(c04<? extends K, ? extends V> c04) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public c47<V> valueIterator() {
        return new C4544b();
    }

    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m36683of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.m36650of(k, v, k2, v2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m36684of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.m36651of(k, v, k2, v2, k3, v3);
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return ImmutableListMultimap.copyOf(iterable);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m36685of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.m36652of(k, v, k2, v2, k3, v3, k4, v4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m36686of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.m36653of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }
}
