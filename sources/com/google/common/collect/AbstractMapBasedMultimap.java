package com.google.common.collect;

import com.google.common.collect.C4614a;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import k.a;

abstract class AbstractMapBasedMultimap<K, V> extends C4614a<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: r */
    public transient Map<K, Collection<V>> f24793r;

    /* renamed from: s */
    public transient int f24794s;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$a */
    public class C4503a extends AbstractMapBasedMultimap<K, V>.C6956d<V> {
        public C4503a(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        /* renamed from: a */
        public V mo34364a(K k, V v) {
            return v;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$b */
    public class C4504b extends AbstractMapBasedMultimap<K, V>.C6956d<Map.Entry<K, V>> {
        public C4504b(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            super();
        }

        /* renamed from: b */
        public Map.Entry<K, V> mo34364a(K k, V v) {
            return Maps.m36924e(k, v);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c */
    public class C4505c extends Maps.C4596f<K, Collection<V>> {

        /* renamed from: e */
        public final transient Map<K, Collection<V>> f24795e;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$a */
        public class C4506a extends Maps.C4593c<K, Collection<V>> {
            public C4506a() {
            }

            public boolean contains(Object obj) {
                return C4621c.m36985c(C4505c.this.f24795e.entrySet(), obj);
            }

            /* renamed from: e */
            public Map<K, Collection<V>> mo34380e() {
                return C4505c.this;
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C4507b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.mo34351c(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$c$b */
        public class C4507b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            public final Iterator<Map.Entry<K, Collection<V>>> f24798a;

            /* renamed from: d */
            public Collection<V> f24799d;

            public C4507b() {
                this.f24798a = C4505c.this.f24795e.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f24798a.next();
                this.f24799d = (Collection) next.getValue();
                return C4505c.this.mo34371e(next);
            }

            public boolean hasNext() {
                return this.f24798a.hasNext();
            }

            public void remove() {
                boolean z;
                if (this.f24799d != null) {
                    z = true;
                } else {
                    z = false;
                }
                du4.m43697q(z, "no calls to next() since the last call to remove()");
                this.f24798a.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, this.f24799d.size());
                this.f24799d.clear();
                this.f24799d = null;
            }
        }

        public C4505c(Map<K, Collection<V>> map) {
            this.f24795e = map;
        }

        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo34366a() {
            return new C4506a();
        }

        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) Maps.m36931l(this.f24795e, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.wrapCollection(obj, collection);
        }

        public void clear() {
            if (this.f24795e == AbstractMapBasedMultimap.this.f24793r) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.m36766c(new C4507b());
            }
        }

        public boolean containsKey(Object obj) {
            return Maps.m36930k(this.f24795e, obj);
        }

        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f24795e.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll(remove);
            AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, remove.size());
            remove.clear();
            return createCollection;
        }

        /* renamed from: e */
        public Map.Entry<K, Collection<V>> mo34371e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.m36924e(key, AbstractMapBasedMultimap.this.wrapCollection(key, entry.getValue()));
        }

        public boolean equals(Object obj) {
            if (this == obj || this.f24795e.equals(obj)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f24795e.hashCode();
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        public int size() {
            return this.f24795e.size();
        }

        public String toString() {
            return this.f24795e.toString();
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$d */
    public abstract class C4508d<T> implements Iterator<T> {

        /* renamed from: a */
        public final Iterator<Map.Entry<K, Collection<V>>> f24801a;

        /* renamed from: d */
        public K f24802d = null;

        /* renamed from: e */
        public Collection<V> f24803e = null;

        /* renamed from: g */
        public Iterator<V> f24804g = Iterators.m36771h();

        public C4508d() {
            this.f24801a = AbstractMapBasedMultimap.this.f24793r.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo34364a(K k, V v);

        public boolean hasNext() {
            if (this.f24801a.hasNext() || this.f24804g.hasNext()) {
                return true;
            }
            return false;
        }

        public T next() {
            if (!this.f24804g.hasNext()) {
                Map.Entry next = this.f24801a.next();
                this.f24802d = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f24803e = collection;
                this.f24804g = collection.iterator();
            }
            return mo34364a(ic4.m45613a(this.f24802d), this.f24804g.next());
        }

        public void remove() {
            this.f24804g.remove();
            Collection<V> collection = this.f24803e;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f24801a.remove();
            }
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e */
    public class C4509e extends Maps.C4594d<K, Collection<V>> {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$e$a */
        public class C4510a implements Iterator<K> {

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> f24807a;

            /* renamed from: d */
            public final /* synthetic */ Iterator f24808d;

            public C4510a(Iterator it) {
                this.f24808d = it;
            }

            public boolean hasNext() {
                return this.f24808d.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f24808d.next();
                this.f24807a = entry;
                return entry.getKey();
            }

            public void remove() {
                boolean z;
                if (this.f24807a != null) {
                    z = true;
                } else {
                    z = false;
                }
                du4.m43697q(z, "no calls to next() since the last call to remove()");
                Collection value = this.f24807a.getValue();
                this.f24808d.remove();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, value.size());
                value.clear();
                this.f24807a = null;
            }
        }

        public C4509e(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterators.m36766c(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo35040e().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj || mo35040e().keySet().equals(obj)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return mo35040e().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C4510a(mo35040e().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo35040e().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$f */
    public class C4511f extends AbstractMapBasedMultimap<K, V>.C7196i implements NavigableMap<K, Collection<V>> {
        public C4511f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo34408h().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo34371e(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo34408h().ceilingKey(k);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C4511f(mo34408h().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo34408h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo34371e(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo34408h().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo34371e(floorEntry);
        }

        public K floorKey(K k) {
            return mo34408h().floorKey(k);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo34408h().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo34371e(higherEntry);
        }

        public K higherKey(K k) {
            return mo34408h().higherKey(k);
        }

        /* renamed from: i */
        public NavigableSet<K> mo34403f() {
            return new C4512g(mo34408h());
        }

        /* renamed from: j */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: k */
        public Map.Entry<K, Collection<V>> mo34415k(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection createCollection = AbstractMapBasedMultimap.this.createCollection();
            createCollection.addAll((Collection) next.getValue());
            it.remove();
            return Maps.m36924e(next.getKey(), AbstractMapBasedMultimap.this.unmodifiableCollectionSubclass(createCollection));
        }

        /* renamed from: l */
        public NavigableMap<K, Collection<V>> mo34408h() {
            return (NavigableMap) super.mo34408h();
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo34408h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo34371e(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo34408h().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo34371e(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo34408h().lowerKey(k);
        }

        /* renamed from: m */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        /* renamed from: n */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo34415k(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo34415k(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C4511f(mo34408h().headMap(k, z));
        }

        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C4511f(mo34408h().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C4511f(mo34408h().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$g */
    public class C4512g extends AbstractMapBasedMultimap<K, V>.C7230j implements NavigableSet<K> {
        public C4512g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k) {
            return mo34436j().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C4512g(mo34436j().descendingMap());
        }

        public K floor(K k) {
            return mo34436j().floorKey(k);
        }

        public K higher(K k) {
            return mo34436j().higherKey(k);
        }

        /* renamed from: k */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        public K lower(K k) {
            return mo34436j().lowerKey(k);
        }

        /* renamed from: n */
        public NavigableMap<K, Collection<V>> mo34436j() {
            return (NavigableMap) super.mo34436j();
        }

        /* renamed from: o */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        public K pollFirst() {
            return Iterators.m36777n(iterator());
        }

        public K pollLast() {
            return Iterators.m36777n(descendingIterator());
        }

        /* renamed from: q */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C4512g(mo34436j().headMap(k, z));
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C4512g(mo34436j().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C4512g(mo34436j().tailMap(k, z));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$h */
    public class C4513h extends AbstractMapBasedMultimap<K, V>.C7813l implements RandomAccess {
        public C4513h(AbstractMapBasedMultimap abstractMapBasedMultimap, K k, List<V> list, AbstractMapBasedMultimap<K, V>.C7321k kVar) {
            super(k, list, kVar);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$i */
    public class C4514i extends AbstractMapBasedMultimap<K, V>.C6913c implements SortedMap<K, Collection<V>> {

        /* renamed from: k */
        public SortedSet<K> f24812k;

        public C4514i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo34408h().comparator();
        }

        /* renamed from: f */
        public SortedSet<K> mo34403f() {
            return new C4515j(mo34408h());
        }

        public K firstKey() {
            return mo34408h().firstKey();
        }

        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f24812k;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f = mo34403f();
            this.f24812k = f;
            return f;
        }

        /* renamed from: h */
        public SortedMap<K, Collection<V>> mo34408h() {
            return (SortedMap) this.f24795e;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C4514i(mo34408h().headMap(k));
        }

        public K lastKey() {
            return mo34408h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C4514i(mo34408h().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C4514i(mo34408h().tailMap(k));
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$j */
    public class C4515j extends AbstractMapBasedMultimap<K, V>.C7006e implements SortedSet<K> {
        public C4515j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo34436j().comparator();
        }

        public K first() {
            return mo34436j().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C4515j(mo34436j().headMap(k));
        }

        /* renamed from: j */
        public SortedMap<K, Collection<V>> mo34436j() {
            return (SortedMap) super.mo35040e();
        }

        public K last() {
            return mo34436j().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C4515j(mo34436j().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C4515j(mo34436j().tailMap(k));
        }
    }

    public AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        du4.m43684d(map.isEmpty());
        this.f24793r = map;
    }

    public static /* synthetic */ int access$208(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f24794s;
        abstractMapBasedMultimap.f24794s = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i = abstractMapBasedMultimap.f24794s;
        abstractMapBasedMultimap.f24794s = i - 1;
        return i;
    }

    public static /* synthetic */ int access$212(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.f24794s + i;
        abstractMapBasedMultimap.f24794s = i2;
        return i2;
    }

    public static /* synthetic */ int access$220(AbstractMapBasedMultimap abstractMapBasedMultimap, int i) {
        int i2 = abstractMapBasedMultimap.f24794s - i;
        abstractMapBasedMultimap.f24794s = i2;
        return i2;
    }

    /* renamed from: b */
    public static <E> Iterator<E> m36531b(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* renamed from: a */
    public final Collection<V> mo34349a(K k) {
        Collection<V> collection = this.f24793r.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(k);
        this.f24793r.put(k, createCollection);
        return createCollection;
    }

    public Map<K, Collection<V>> backingMap() {
        return this.f24793r;
    }

    /* renamed from: c */
    public final void mo34351c(Object obj) {
        Collection collection = (Collection) Maps.m36932m(this.f24793r, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f24794s -= size;
        }
    }

    public void clear() {
        for (Collection<V> clear : this.f24793r.values()) {
            clear.clear();
        }
        this.f24793r.clear();
        this.f24794s = 0;
    }

    public boolean containsKey(Object obj) {
        return this.f24793r.containsKey(obj);
    }

    public Map<K, Collection<V>> createAsMap() {
        return new C4505c(this.f24793r);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    public Collection<Map.Entry<K, V>> createEntries() {
        if (this instanceof fy5) {
            return new C4614a.C4616b(this);
        }
        return new C4614a.C4615a();
    }

    public Set<K> createKeySet() {
        return new C4509e(this.f24793r);
    }

    public C4623d<K> createKeys() {
        return new Multimaps.C4603b(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.f24793r;
        if (map instanceof NavigableMap) {
            return new C4511f((NavigableMap) this.f24793r);
        }
        if (map instanceof SortedMap) {
            return new C4514i((SortedMap) this.f24793r);
        }
        return new C4505c(this.f24793r);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.f24793r;
        if (map instanceof NavigableMap) {
            return new C4512g((NavigableMap) this.f24793r);
        }
        if (map instanceof SortedMap) {
            return new C4515j((SortedMap) this.f24793r);
        }
        return new C4509e(this.f24793r);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return unmodifiableCollectionSubclass(createCollection());
    }

    public Collection<V> createValues() {
        return new C4614a.C4617c();
    }

    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C4504b(this);
    }

    public Collection<V> get(K k) {
        Collection collection = this.f24793r.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    public boolean put(K k, V v) {
        Collection collection = this.f24793r.get(k);
        if (collection == null) {
            Collection createCollection = createCollection(k);
            if (createCollection.add(v)) {
                this.f24794s++;
                this.f24793r.put(k, createCollection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f24794s++;
            return true;
        }
    }

    public Collection<V> removeAll(Object obj) {
        Collection remove = this.f24793r.remove(obj);
        if (remove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection createCollection = createCollection();
        createCollection.addAll(remove);
        this.f24794s -= remove.size();
        remove.clear();
        return unmodifiableCollectionSubclass(createCollection);
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection a = mo34349a(k);
        Collection createCollection = createCollection();
        createCollection.addAll(a);
        this.f24794s -= a.size();
        a.clear();
        while (it.hasNext()) {
            if (a.add(it.next())) {
                this.f24794s++;
            }
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.f24793r = map;
        this.f24794s = 0;
        for (Collection next : map.values()) {
            du4.m43684d(!next.isEmpty());
            this.f24794s += next.size();
        }
    }

    public int size() {
        return this.f24794s;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Iterator<V> valueIterator() {
        return new C4503a(this);
    }

    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        return new C4516k(k, collection, (AbstractMapBasedMultimap<K, V>.C7321k) null);
    }

    public final List<V> wrapList(K k, List<V> list, AbstractMapBasedMultimap<K, V>.C7321k kVar) {
        if (list instanceof RandomAccess) {
            return new C4513h(this, k, list, kVar);
        }
        return new C4518l(k, list, kVar);
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k */
    public class C4516k extends AbstractCollection<V> {

        /* renamed from: a */
        public final K f24815a;

        /* renamed from: d */
        public Collection<V> f24816d;

        /* renamed from: e */
        public final AbstractMapBasedMultimap<K, V>.C7321k f24817e;

        /* renamed from: g */
        public final Collection<V> f24818g;

        public C4516k(K k, Collection<V> collection, AbstractMapBasedMultimap<K, V>.C7321k kVar) {
            Collection<V> collection2;
            this.f24815a = k;
            this.f24816d = collection;
            this.f24817e = kVar;
            if (kVar == null) {
                collection2 = null;
            } else {
                collection2 = kVar.mo34464k();
            }
            this.f24818g = collection2;
        }

        public boolean add(V v) {
            mo34466o();
            boolean isEmpty = this.f24816d.isEmpty();
            boolean add = this.f24816d.add(v);
            if (add) {
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    mo34459e();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f24816d.addAll(collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f24816d.size() - size);
                if (size == 0) {
                    mo34459e();
                }
            }
            return addAll;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f24816d.clear();
                AbstractMapBasedMultimap.access$220(AbstractMapBasedMultimap.this, size);
                mo34467q();
            }
        }

        public boolean contains(Object obj) {
            mo34466o();
            return this.f24816d.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo34466o();
            return this.f24816d.containsAll(collection);
        }

        /* renamed from: e */
        public void mo34459e() {
            AbstractMapBasedMultimap<K, V>.C7321k kVar = this.f24817e;
            if (kVar != null) {
                kVar.mo34459e();
            } else {
                AbstractMapBasedMultimap.this.f24793r.put(this.f24815a, this.f24816d);
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo34466o();
            return this.f24816d.equals(obj);
        }

        public int hashCode() {
            mo34466o();
            return this.f24816d.hashCode();
        }

        public Iterator<V> iterator() {
            mo34466o();
            return new C4517a();
        }

        /* renamed from: j */
        public AbstractMapBasedMultimap<K, V>.C7321k mo34463j() {
            return this.f24817e;
        }

        /* renamed from: k */
        public Collection<V> mo34464k() {
            return this.f24816d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public K mo34465n() {
            return this.f24815a;
        }

        /* renamed from: o */
        public void mo34466o() {
            Collection<V> collection;
            AbstractMapBasedMultimap<K, V>.C7321k kVar = this.f24817e;
            if (kVar != null) {
                kVar.mo34466o();
                if (this.f24817e.mo34464k() != this.f24818g) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f24816d.isEmpty() && (collection = (Collection) AbstractMapBasedMultimap.this.f24793r.get(this.f24815a)) != null) {
                this.f24816d = collection;
            }
        }

        /* renamed from: q */
        public void mo34467q() {
            AbstractMapBasedMultimap<K, V>.C7321k kVar = this.f24817e;
            if (kVar != null) {
                kVar.mo34467q();
            } else if (this.f24816d.isEmpty()) {
                AbstractMapBasedMultimap.this.f24793r.remove(this.f24815a);
            }
        }

        public boolean remove(Object obj) {
            mo34466o();
            boolean remove = this.f24816d.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                mo34467q();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f24816d.removeAll(collection);
            if (removeAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f24816d.size() - size);
                mo34467q();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            du4.m43691k(collection);
            int size = size();
            boolean retainAll = this.f24816d.retainAll(collection);
            if (retainAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, this.f24816d.size() - size);
                mo34467q();
            }
            return retainAll;
        }

        public int size() {
            mo34466o();
            return this.f24816d.size();
        }

        public String toString() {
            mo34466o();
            return this.f24816d.toString();
        }

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$k$a */
        public class C4517a implements Iterator<V> {

            /* renamed from: a */
            public final Iterator<V> f24820a;

            /* renamed from: d */
            public final Collection<V> f24821d;

            public C4517a() {
                Collection<V> collection = C4516k.this.f24816d;
                this.f24821d = collection;
                this.f24820a = AbstractMapBasedMultimap.m36531b(collection);
            }

            /* renamed from: a */
            public Iterator<V> mo34473a() {
                mo34474b();
                return this.f24820a;
            }

            /* renamed from: b */
            public void mo34474b() {
                C4516k.this.mo34466o();
                if (C4516k.this.f24816d != this.f24821d) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo34474b();
                return this.f24820a.hasNext();
            }

            public V next() {
                mo34474b();
                return this.f24820a.next();
            }

            public void remove() {
                this.f24820a.remove();
                AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
                C4516k.this.mo34467q();
            }

            public C4517a(Iterator<V> it) {
                this.f24821d = C4516k.this.f24816d;
                this.f24820a = it;
            }
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$l */
    public class C4518l extends AbstractMapBasedMultimap<K, V>.C7321k implements List<V> {

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$l$a */
        public class C4519a extends AbstractMapBasedMultimap<K, V>.a implements ListIterator<V> {
            public C4519a() {
                super();
            }

            public void add(V v) {
                boolean isEmpty = C4518l.this.isEmpty();
                mo34490c().add(v);
                AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
                if (isEmpty) {
                    C4518l.this.mo34459e();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.AbstractMapBasedMultimap$k$a, com.google.common.collect.AbstractMapBasedMultimap$l$a] */
            /* renamed from: c */
            public final ListIterator<V> mo34490c() {
                return (ListIterator) mo34473a();
            }

            public boolean hasPrevious() {
                return mo34490c().hasPrevious();
            }

            public int nextIndex() {
                return mo34490c().nextIndex();
            }

            public V previous() {
                return mo34490c().previous();
            }

            public int previousIndex() {
                return mo34490c().previousIndex();
            }

            public void set(V v) {
                mo34490c().set(v);
            }

            public C4519a(int i) {
                super(C4518l.this.mo34485r().listIterator(i));
            }
        }

        public C4518l(K k, List<V> list, AbstractMapBasedMultimap<K, V>.C7321k kVar) {
            super(k, list, kVar);
        }

        public void add(int i, V v) {
            mo34466o();
            boolean isEmpty = mo34464k().isEmpty();
            mo34485r().add(i, v);
            AbstractMapBasedMultimap.access$208(AbstractMapBasedMultimap.this);
            if (isEmpty) {
                mo34459e();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo34485r().addAll(i, collection);
            if (addAll) {
                AbstractMapBasedMultimap.access$212(AbstractMapBasedMultimap.this, mo34464k().size() - size);
                if (size == 0) {
                    mo34459e();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo34466o();
            return mo34485r().get(i);
        }

        public int indexOf(Object obj) {
            mo34466o();
            return mo34485r().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo34466o();
            return mo34485r().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo34466o();
            return new C4519a();
        }

        /* renamed from: r */
        public List<V> mo34485r() {
            return (List) mo34464k();
        }

        public V remove(int i) {
            mo34466o();
            V remove = mo34485r().remove(i);
            AbstractMapBasedMultimap.access$210(AbstractMapBasedMultimap.this);
            mo34467q();
            return remove;
        }

        public V set(int i, V v) {
            mo34466o();
            return mo34485r().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            AbstractMapBasedMultimap<K, V>.C7321k kVar;
            mo34466o();
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            Object n = mo34465n();
            List subList = mo34485r().subList(i, i2);
            if (mo34463j() == null) {
                kVar = this;
            } else {
                kVar = mo34463j();
            }
            return abstractMapBasedMultimap.wrapList(n, subList, kVar);
        }

        public ListIterator<V> listIterator(int i) {
            mo34466o();
            return new C4519a(i);
        }
    }
}
