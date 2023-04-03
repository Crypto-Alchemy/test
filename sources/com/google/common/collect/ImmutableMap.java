package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

@DoNotMock("Use ImmutableMap.of or another implementation")
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    @RetainedWith
    @LazyInit

    /* renamed from: a */
    public transient ImmutableSet<Map.Entry<K, V>> f24867a;
    @RetainedWith
    @LazyInit

    /* renamed from: d */
    public transient ImmutableSet<K> f24868d;
    @RetainedWith
    @LazyInit

    /* renamed from: e */
    public transient ImmutableCollection<V> f24869e;
    @LazyInit

    /* renamed from: g */
    public transient ImmutableSetMultimap<K, V> f24870g;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() {
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                public c47<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }
            };
        }

        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract c47<Map.Entry<K, V>> entryIterator();

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableMap.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableMap.super.keySet();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return ImmutableMap.super.values();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {

        /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a */
        public class C4537a extends c47<Map.Entry<K, ImmutableSet<V>>> {

            /* renamed from: a */
            public final /* synthetic */ Iterator f24871a;

            /* renamed from: com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$a$a */
            public class C4538a extends C6207l6<K, ImmutableSet<V>> {

                /* renamed from: a */
                public final /* synthetic */ Map.Entry f24872a;

                public C4538a(C4537a aVar, Map.Entry entry) {
                    this.f24872a = entry;
                }

                /* renamed from: a */
                public ImmutableSet<V> getValue() {
                    return ImmutableSet.m36713of(this.f24872a.getValue());
                }

                public K getKey() {
                    return this.f24872a.getKey();
                }
            }

            public C4537a(MapViewOfValuesAsSingletonSets mapViewOfValuesAsSingletonSets, Iterator it) {
                this.f24871a = it;
            }

            /* renamed from: a */
            public Map.Entry<K, ImmutableSet<V>> next() {
                return new C4538a(this, (Map.Entry) this.f24871a.next());
            }

            public boolean hasNext() {
                return this.f24871a.hasNext();
            }
        }

        public MapViewOfValuesAsSingletonSets() {
        }

        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        public c47<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            return new C4537a(this, ImmutableMap.this.entrySet().iterator());
        }

        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        public int size() {
            return ImmutableMap.this.size();
        }

        public /* synthetic */ MapViewOfValuesAsSingletonSets(ImmutableMap immutableMap, C4539a aVar) {
            this();
        }

        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.m36713of(obj2);
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            c47<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            C4540b makeBuilder = makeBuilder(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                makeBuilder.mo34740d(objArr[i], objArr2[i]);
            }
            return makeBuilder.mo34737a();
        }

        public C4540b<K, V> makeBuilder(int i) {
            return new C4540b<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            C4540b makeBuilder = makeBuilder(immutableSet.size());
            c47 it = immutableSet.iterator();
            c47 it2 = ((ImmutableCollection) this.values).iterator();
            while (it.hasNext()) {
                makeBuilder.mo34740d(it.next(), it2.next());
            }
            return makeBuilder.mo34737a();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$a */
    public class C4539a extends c47<K> {

        /* renamed from: a */
        public final /* synthetic */ c47 f24873a;

        public C4539a(ImmutableMap immutableMap, c47 c47) {
            this.f24873a = c47;
        }

        public boolean hasNext() {
            return this.f24873a.hasNext();
        }

        public K next() {
            return ((Map.Entry) this.f24873a.next()).getKey();
        }
    }

    @DoNotMock
    /* renamed from: com.google.common.collect.ImmutableMap$b */
    public static class C4540b<K, V> {

        /* renamed from: a */
        public Comparator<? super V> f24874a;

        /* renamed from: b */
        public Object[] f24875b;

        /* renamed from: c */
        public int f24876c;

        /* renamed from: d */
        public boolean f24877d;

        public C4540b() {
            this(4);
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo34737a() {
            return mo34738b();
        }

        /* renamed from: b */
        public ImmutableMap<K, V> mo34738b() {
            mo34743g();
            this.f24877d = true;
            return RegularImmutableMap.create(this.f24876c, this.f24875b);
        }

        /* renamed from: c */
        public final void mo34739c(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f24875b;
            if (i2 > objArr.length) {
                this.f24875b = Arrays.copyOf(objArr, ImmutableCollection.C4533b.m36621e(objArr.length, i2));
                this.f24877d = false;
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C4540b<K, V> mo34740d(K k, V v) {
            mo34739c(this.f24876c + 1);
            ki0.m47099a(k, v);
            Object[] objArr = this.f24875b;
            int i = this.f24876c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f24876c = i + 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public C4540b<K, V> mo34741e(Map.Entry<? extends K, ? extends V> entry) {
            return mo34740d(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public C4540b<K, V> mo34742f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                mo34739c(this.f24876c + ((Collection) iterable).size());
            }
            for (Map.Entry e : iterable) {
                mo34741e(e);
            }
            return this;
        }

        /* renamed from: g */
        public void mo34743g() {
            int i;
            if (this.f24874a != null) {
                if (this.f24877d) {
                    this.f24875b = Arrays.copyOf(this.f24875b, this.f24876c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f24876c];
                int i2 = 0;
                while (true) {
                    i = this.f24876c;
                    if (i2 >= i) {
                        break;
                    }
                    int i3 = i2 * 2;
                    Object obj = this.f24875b[i3];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.f24875b[i3 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, Ordering.from(this.f24874a).onResultOf(Maps.m36934o()));
                for (int i4 = 0; i4 < this.f24876c; i4++) {
                    int i5 = i4 * 2;
                    this.f24875b[i5] = entryArr[i4].getKey();
                    this.f24875b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }

        public C4540b(int i) {
            this.f24875b = new Object[(i * 2)];
            this.f24876c = 0;
            this.f24877d = false;
        }
    }

    public static <K, V> C4540b<K, V> builder() {
        return new C4540b<>();
    }

    public static <K, V> C4540b<K, V> builderWithExpectedSize(int i) {
        ki0.m47100b(i, "expectedSize");
        return new C4540b<>(i);
    }

    public static void checkNoConflict(boolean z, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z) {
            throw conflictException(str, entry, entry2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + valueOf.length() + valueOf2.length());
        sb.append("Multiple entries with same ");
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        sb.append(" and ");
        sb.append(valueOf2);
        return new IllegalArgumentException(sb.toString());
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        ki0.m47099a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36661of() {
        return RegularImmutableMap.EMPTY;
    }

    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.m36729of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.f24870g;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(this, (C4539a) null), size(), (Comparator) null);
        this.f24870g = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    public boolean equals(Object obj) {
        return Maps.m36923d(this, obj);
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    public int hashCode() {
        return C4632i.m37033d(entrySet());
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public c47<K> keyIterator() {
        return new C4539a(this, entrySet().iterator());
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.m36933n(this);
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36662of(K k, V v) {
        ki0.m47099a(k, v);
        return RegularImmutableMap.create(1, new Object[]{k, v});
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f24867a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.f24867a = createEntrySet;
        return createEntrySet;
    }

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.f24868d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.f24868d = createKeySet;
        return createKeySet;
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f24869e;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.f24869e = createValues;
        return createValues;
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36663of(K k, V v, K k2, V v2) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        return RegularImmutableMap.create(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C4540b bVar = new C4540b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.mo34742f(iterable);
        return bVar.mo34737a();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36664of(K k, V v, K k2, V v2, K k3, V v3) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        return RegularImmutableMap.create(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36665of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        return RegularImmutableMap.create(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36666of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        ki0.m47099a(k5, v5);
        return RegularImmutableMap.create(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36667of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        ki0.m47099a(k5, v5);
        ki0.m47099a(k6, v6);
        return RegularImmutableMap.create(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36668of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        ki0.m47099a(k5, v5);
        ki0.m47099a(k6, v6);
        ki0.m47099a(k7, v7);
        return RegularImmutableMap.create(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36669of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        ki0.m47099a(k5, v5);
        ki0.m47099a(k6, v6);
        ki0.m47099a(k7, v7);
        ki0.m47099a(k8, v8);
        return RegularImmutableMap.create(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36670of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        ki0.m47099a(k5, v5);
        ki0.m47099a(k6, v6);
        ki0.m47099a(k7, v7);
        ki0.m47099a(k8, v8);
        ki0.m47099a(k9, v9);
        return RegularImmutableMap.create(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m36671of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        ki0.m47099a(k, v);
        ki0.m47099a(k2, v2);
        ki0.m47099a(k3, v3);
        ki0.m47099a(k4, v4);
        ki0.m47099a(k5, v5);
        ki0.m47099a(k6, v6);
        ki0.m47099a(k7, v7);
        ki0.m47099a(k8, v8);
        ki0.m47099a(k9, v9);
        ki0.m47099a(k10, v10);
        return RegularImmutableMap.create(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }
}
