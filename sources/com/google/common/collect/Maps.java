package com.google.common.collect;

import com.google.common.collect.C4632i;
import com.google.common.collect.ImmutableMap;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class Maps {

    public enum EntryFunction implements hd2<Map.Entry<?, ?>, Object> {
        KEY {
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* renamed from: com.google.common.collect.Maps$a */
    public class C4591a extends rw6<Map.Entry<K, V>, K> {
        public C4591a(Iterator it) {
            super(it);
        }

        /* renamed from: b */
        public K mo35031a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* renamed from: com.google.common.collect.Maps$b */
    public class C4592b extends rw6<Map.Entry<K, V>, V> {
        public C4592b(Iterator it) {
            super(it);
        }

        /* renamed from: b */
        public V mo35031a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: com.google.common.collect.Maps$c */
    public static abstract class C4593c<K, V> extends C4632i.C4637d<Map.Entry<K, V>> {
        public void clear() {
            mo34380e().clear();
        }

        public abstract boolean contains(Object obj);

        /* renamed from: e */
        public abstract Map<K, V> mo34380e();

        public boolean isEmpty() {
            return mo34380e().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) du4.m43691k(collection));
            } catch (UnsupportedOperationException unused) {
                return C4632i.m37039j(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) du4.m43691k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g = C4632i.m37036g(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        g.add(((Map.Entry) next).getKey());
                    }
                }
                return mo34380e().keySet().retainAll(g);
            }
        }

        public int size() {
            return mo34380e().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$d */
    public static class C4594d<K, V> extends C4632i.C4637d<K> {
        @Weak

        /* renamed from: a */
        public final Map<K, V> f24957a;

        public C4594d(Map<K, V> map) {
            this.f24957a = (Map) du4.m43691k(map);
        }

        public boolean contains(Object obj) {
            return mo35040e().containsKey(obj);
        }

        /* renamed from: e */
        public Map<K, V> mo35040e() {
            return this.f24957a;
        }

        public boolean isEmpty() {
            return mo35040e().isEmpty();
        }

        public int size() {
            return mo35040e().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$e */
    public static class C4595e<K, V> extends AbstractCollection<V> {
        @Weak

        /* renamed from: a */
        public final Map<K, V> f24958a;

        public C4595e(Map<K, V> map) {
            this.f24958a = (Map) du4.m43691k(map);
        }

        public void clear() {
            mo35045e().clear();
        }

        public boolean contains(Object obj) {
            return mo35045e().containsValue(obj);
        }

        /* renamed from: e */
        public final Map<K, V> mo35045e() {
            return this.f24958a;
        }

        public boolean isEmpty() {
            return mo35045e().isEmpty();
        }

        public Iterator<V> iterator() {
            return Maps.m36935p(mo35045e().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo35045e().entrySet()) {
                    if (jf4.m46496a(obj, entry.getValue())) {
                        mo35045e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) du4.m43691k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = C4632i.m37035f();
                for (Map.Entry entry : mo35045e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return mo35045e().keySet().removeAll(f);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) du4.m43691k(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f = C4632i.m37035f();
                for (Map.Entry entry : mo35045e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f.add(entry.getKey());
                    }
                }
                return mo35045e().keySet().retainAll(f);
            }
        }

        public int size() {
            return mo35045e().size();
        }
    }

    /* renamed from: com.google.common.collect.Maps$f */
    public static abstract class C4596f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a */
        public transient Set<Map.Entry<K, V>> f24959a;

        /* renamed from: d */
        public transient Collection<V> f24960d;

        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo34366a();

        /* renamed from: b */
        public Collection<V> mo35052b() {
            return new C4595e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f24959a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo34366a();
            this.f24959a = a;
            return a;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f24960d;
            if (collection != null) {
                return collection;
            }
            Collection<V> b = mo35052b();
            this.f24960d = b;
            return b;
        }
    }

    /* renamed from: a */
    public static int m36920a(int i) {
        if (i < 3) {
            ki0.m47100b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: b */
    public static boolean m36921b(Map<?, ?> map, Object obj) {
        return Iterators.m36767d(m36927h(map.entrySet().iterator()), obj);
    }

    /* renamed from: c */
    public static boolean m36922c(Map<?, ?> map, Object obj) {
        return Iterators.m36767d(m36935p(map.entrySet().iterator()), obj);
    }

    /* renamed from: d */
    public static boolean m36923d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: e */
    public static <K, V> Map.Entry<K, V> m36924e(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    /* renamed from: f */
    public static <E> ImmutableMap<E, Integer> m36925f(Collection<E> collection) {
        ImmutableMap.C4540b bVar = new ImmutableMap.C4540b(collection.size());
        int i = 0;
        for (E d : collection) {
            bVar.mo34740d(d, Integer.valueOf(i));
            i++;
        }
        return bVar.mo34737a();
    }

    /* renamed from: g */
    public static <K> hd2<Map.Entry<K, ?>, K> m36926g() {
        return EntryFunction.KEY;
    }

    /* renamed from: h */
    public static <K, V> Iterator<K> m36927h(Iterator<Map.Entry<K, V>> it) {
        return new C4591a(it);
    }

    /* renamed from: i */
    public static <K, V> IdentityHashMap<K, V> m36928i() {
        return new IdentityHashMap<>();
    }

    /* renamed from: j */
    public static <K, V> void m36929j(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry next : map2.entrySet()) {
            map.put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: k */
    public static boolean m36930k(Map<?, ?> map, Object obj) {
        du4.m43691k(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static <V> V m36931l(Map<?, V> map, Object obj) {
        du4.m43691k(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static <V> V m36932m(Map<?, V> map, Object obj) {
        du4.m43691k(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public static String m36933n(Map<?, ?> map) {
        StringBuilder b = C4621c.m36984b(map.size());
        b.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                b.append(", ");
            }
            z = false;
            b.append(next.getKey());
            b.append('=');
            b.append(next.getValue());
        }
        b.append('}');
        return b.toString();
    }

    /* renamed from: o */
    public static <V> hd2<Map.Entry<?, V>, V> m36934o() {
        return EntryFunction.VALUE;
    }

    /* renamed from: p */
    public static <K, V> Iterator<V> m36935p(Iterator<Map.Entry<K, V>> it) {
        return new C4592b(it);
    }
}
