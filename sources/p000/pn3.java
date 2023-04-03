package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: pn3 */
/* compiled from: MapCollections */
public abstract class pn3<K, V> {

    /* renamed from: a */
    public pn3<K, V>.C1599b f16569a;

    /* renamed from: b */
    public pn3<K, V>.C6913c f16570b;

    /* renamed from: c */
    public pn3<K, V>.C7006e f16571c;

    /* renamed from: pn3$a */
    /* compiled from: MapCollections */
    public final class C3091a<T> implements Iterator<T> {

        /* renamed from: a */
        public final int f16572a;

        /* renamed from: d */
        public int f16573d;

        /* renamed from: e */
        public int f16574e;

        /* renamed from: g */
        public boolean f16575g = false;

        public C3091a(int i) {
            this.f16572a = i;
            this.f16573d = pn3.this.mo22915d();
        }

        public boolean hasNext() {
            if (this.f16574e < this.f16573d) {
                return true;
            }
            return false;
        }

        public T next() {
            if (hasNext()) {
                T b = pn3.this.mo22913b(this.f16574e, this.f16572a);
                this.f16574e++;
                this.f16575g = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f16575g) {
                int i = this.f16574e - 1;
                this.f16574e = i;
                this.f16573d--;
                this.f16575g = false;
                pn3.this.mo22919h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: pn3$b */
    /* compiled from: MapCollections */
    public final class C3092b implements Set<Map.Entry<K, V>> {
        public C3092b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = pn3.this.mo22915d();
            for (Map.Entry entry : collection) {
                pn3.this.mo22918g(entry.getKey(), entry.getValue());
            }
            if (d != pn3.this.mo22915d()) {
                return true;
            }
            return false;
        }

        public void clear() {
            pn3.this.mo22912a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = pn3.this.mo22916e(entry.getKey());
            if (e < 0) {
                return false;
            }
            return nr0.m23401c(pn3.this.mo22913b(e, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return pn3.m25065k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = pn3.this.mo22915d() - 1; d >= 0; d--) {
                Object b = pn3.this.mo22913b(d, 0);
                Object b2 = pn3.this.mo22913b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            if (pn3.this.mo22915d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3094d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return pn3.this.mo22915d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: pn3$c */
    /* compiled from: MapCollections */
    public final class C3093c implements Set<K> {
        public C3093c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            pn3.this.mo22912a();
        }

        public boolean contains(Object obj) {
            if (pn3.this.mo22916e(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return pn3.m25064j(pn3.this.mo22914c(), collection);
        }

        public boolean equals(Object obj) {
            return pn3.m25065k(this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int d = pn3.this.mo22915d() - 1; d >= 0; d--) {
                Object b = pn3.this.mo22913b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            if (pn3.this.mo22915d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator<K> iterator() {
            return new C3091a(0);
        }

        public boolean remove(Object obj) {
            int e = pn3.this.mo22916e(obj);
            if (e < 0) {
                return false;
            }
            pn3.this.mo22919h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return pn3.m25066o(pn3.this.mo22914c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return pn3.m25067p(pn3.this.mo22914c(), collection);
        }

        public int size() {
            return pn3.this.mo22915d();
        }

        public Object[] toArray() {
            return pn3.this.mo24663q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return pn3.this.mo24664r(tArr, 0);
        }
    }

    /* renamed from: pn3$d */
    /* compiled from: MapCollections */
    public final class C3094d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        public int f16579a;

        /* renamed from: d */
        public int f16580d;

        /* renamed from: e */
        public boolean f16581e = false;

        public C3094d() {
            this.f16579a = pn3.this.mo22915d() - 1;
            this.f16580d = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f16580d++;
                this.f16581e = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f16581e) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!nr0.m23401c(entry.getKey(), pn3.this.mo22913b(this.f16580d, 0)) || !nr0.m23401c(entry.getValue(), pn3.this.mo22913b(this.f16580d, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f16581e) {
                return pn3.this.mo22913b(this.f16580d, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f16581e) {
                return pn3.this.mo22913b(this.f16580d, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            if (this.f16580d < this.f16579a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            if (this.f16581e) {
                int i2 = 0;
                Object b = pn3.this.mo22913b(this.f16580d, 0);
                Object b2 = pn3.this.mo22913b(this.f16580d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f16581e) {
                pn3.this.mo22919h(this.f16580d);
                this.f16580d--;
                this.f16579a--;
                this.f16581e = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f16581e) {
                return pn3.this.mo22920i(this.f16580d, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: pn3$e */
    /* compiled from: MapCollections */
    public final class C3095e implements Collection<V> {
        public C3095e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            pn3.this.mo22912a();
        }

        public boolean contains(Object obj) {
            if (pn3.this.mo22917f(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            if (pn3.this.mo22915d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator<V> iterator() {
            return new C3091a(1);
        }

        public boolean remove(Object obj) {
            int f = pn3.this.mo22917f(obj);
            if (f < 0) {
                return false;
            }
            pn3.this.mo22919h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = pn3.this.mo22915d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(pn3.this.mo22913b(i, 1))) {
                    pn3.this.mo22919h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = pn3.this.mo22915d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(pn3.this.mo22913b(i, 1))) {
                    pn3.this.mo22919h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return pn3.this.mo22915d();
        }

        public Object[] toArray() {
            return pn3.this.mo24663q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return pn3.this.mo24664r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m25064j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m25065k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m25066o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static <K, V> boolean m25067p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo22912a();

    /* renamed from: b */
    public abstract Object mo22913b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo22914c();

    /* renamed from: d */
    public abstract int mo22915d();

    /* renamed from: e */
    public abstract int mo22916e(Object obj);

    /* renamed from: f */
    public abstract int mo22917f(Object obj);

    /* renamed from: g */
    public abstract void mo22918g(K k, V v);

    /* renamed from: h */
    public abstract void mo22919h(int i);

    /* renamed from: i */
    public abstract V mo22920i(int i, V v);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo24660l() {
        if (this.f16569a == null) {
            this.f16569a = new C3092b();
        }
        return this.f16569a;
    }

    /* renamed from: m */
    public Set<K> mo24661m() {
        if (this.f16570b == null) {
            this.f16570b = new C3093c();
        }
        return this.f16570b;
    }

    /* renamed from: n */
    public Collection<V> mo24662n() {
        if (this.f16571c == null) {
            this.f16571c = new C3095e();
        }
        return this.f16571c;
    }

    /* renamed from: q */
    public Object[] mo24663q(int i) {
        int d = mo22915d();
        Object[] objArr = new Object[d];
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo22913b(i2, i);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] mo24664r(T[] tArr, int i) {
        int d = mo22915d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo22913b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }
}
