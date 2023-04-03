package java8.util;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java8.util.C6034a;

public final class ImmutableCollections {

    /* renamed from: a */
    public static final int f30291a;

    public static abstract class AbstractImmutableMap<K, V> extends AbstractMap<K, V> implements Serializable {
        public void clear() {
            throw ImmutableCollections.m46197h();
        }

        public V put(K k, V v) {
            throw ImmutableCollections.m46197h();
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            throw ImmutableCollections.m46197h();
        }

        public V remove(Object obj) {
            throw ImmutableCollections.m46197h();
        }
    }

    public static final class ListN<E> extends C6030b<E> implements Serializable {
        public static final List<?> EMPTY_LIST = new ListN(new Object[0]);
        private final E[] elements;

        public ListN(E... eArr) {
            E[] eArr2 = new Object[eArr.length];
            for (int i = 0; i < eArr.length; i++) {
                eArr2[i] = kf4.m47057e(eArr[i]);
            }
            this.elements = eArr2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        private Object writeReplace() {
            return new ColSer(1, this.elements);
        }

        public E get(int i) {
            return this.elements[i];
        }

        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        public int size() {
            return this.elements.length;
        }
    }

    public static final class Map1<K, V> extends AbstractImmutableMap<K, V> {

        /* renamed from: k0 */
        private final K f30294k0;

        /* renamed from: v0 */
        private final V f30295v0;

        public Map1(K k, V v) {
            this.f30294k0 = kf4.m47057e(k);
            this.f30295v0 = kf4.m47057e(v);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        private Object writeReplace() {
            return new ColSer(3, this.f30294k0, this.f30295v0);
        }

        public boolean containsKey(Object obj) {
            return obj.equals(this.f30294k0);
        }

        public boolean containsValue(Object obj) {
            return obj.equals(this.f30295v0);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return C6055d.m46308a(new kb3(this.f30294k0, this.f30295v0));
        }

        public int hashCode() {
            return this.f30294k0.hashCode() ^ this.f30295v0.hashCode();
        }
    }

    public static final class MapN<K, V> extends AbstractImmutableMap<K, V> {
        public static final Map<?, ?> EMPTY_MAP = new MapN(new Object[0]);
        public final int size;
        public final Object[] table;

        /* renamed from: java8.util.ImmutableCollections$MapN$a */
        public class C6025a extends AbstractSet<Map.Entry<K, V>> {
            public C6025a() {
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new C6026b();
            }

            public int size() {
                return MapN.this.size;
            }
        }

        /* renamed from: java8.util.ImmutableCollections$MapN$b */
        public class C6026b extends C6034a.C6035a<Map.Entry<K, V>> {

            /* renamed from: a */
            public int f30297a;

            /* renamed from: d */
            public int f30298d;

            public C6026b() {
                int size = MapN.this.size();
                this.f30297a = size;
                if (size > 0) {
                    this.f30298d = ImmutableCollections.m46195f(ImmutableCollections.f30291a, MapN.this.table.length >> 1) << 1;
                }
            }

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                if (hasNext()) {
                    do {
                    } while (MapN.this.table[nextIndex()] == null);
                    Object[] objArr = MapN.this.table;
                    int i = this.f30298d;
                    this.f30297a--;
                    return new kb3(objArr[i], objArr[i + 1]);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.f30297a > 0) {
                    return true;
                }
                return false;
            }

            public final int nextIndex() {
                int i;
                int i2 = this.f30298d;
                if (ImmutableCollections.f30291a >= 0) {
                    i = i2 + 2;
                    if (i >= MapN.this.table.length) {
                        i = 0;
                    }
                } else {
                    i = i2 - 2;
                    if (i < 0) {
                        i = MapN.this.table.length - 2;
                    }
                }
                this.f30298d = i;
                return i;
            }
        }

        public MapN(Object... objArr) {
            if ((objArr.length & 1) == 0) {
                this.size = objArr.length >> 1;
                this.table = new Object[(((objArr.length * 2) + 1) & -2)];
                int i = 0;
                while (i < objArr.length) {
                    Object e = kf4.m47057e(objArr[i]);
                    Object e2 = kf4.m47057e(objArr[i + 1]);
                    int a = mo44089a(e);
                    if (a < 0) {
                        int i2 = -(a + 1);
                        Object[] objArr2 = this.table;
                        objArr2[i2] = e;
                        objArr2[i2 + 1] = e2;
                        i += 2;
                    } else {
                        throw new IllegalArgumentException("duplicate key: " + e);
                    }
                }
                return;
            }
            throw new InternalError("length is odd");
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        private Object writeReplace() {
            Object[] objArr = new Object[(this.size * 2)];
            int length = this.table.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2 += 2) {
                Object[] objArr2 = this.table;
                Object obj = objArr2[i2];
                if (obj != null) {
                    int i3 = i + 1;
                    objArr[i] = obj;
                    i = i3 + 1;
                    objArr[i3] = objArr2[i2 + 1];
                }
            }
            return new ColSer(3, objArr);
        }

        /* renamed from: a */
        public final int mo44089a(Object obj) {
            int a = ImmutableCollections.m46195f(obj.hashCode(), this.table.length >> 1) << 1;
            while (true) {
                Object obj2 = this.table[a];
                if (obj2 == null) {
                    return (-a) - 1;
                }
                if (obj.equals(obj2)) {
                    return a;
                }
                a += 2;
                if (a == this.table.length) {
                    a = 0;
                }
            }
        }

        public boolean containsKey(Object obj) {
            kf4.m47057e(obj);
            if (this.size <= 0 || mo44089a(obj) < 0) {
                return false;
            }
            return true;
        }

        public boolean containsValue(Object obj) {
            kf4.m47057e(obj);
            int i = 1;
            while (true) {
                Object[] objArr = this.table;
                if (i >= objArr.length) {
                    return false;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
                i += 2;
            }
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new C6025a();
        }

        public V get(Object obj) {
            if (this.size == 0) {
                kf4.m47057e(obj);
                return null;
            }
            int a = mo44089a(obj);
            if (a >= 0) {
                return this.table[a + 1];
            }
            return null;
        }

        public int hashCode() {
            int i = 0;
            int i2 = 0;
            while (true) {
                Object[] objArr = this.table;
                if (i >= objArr.length) {
                    return i2;
                }
                Object obj = objArr[i];
                if (obj != null) {
                    i2 += obj.hashCode() ^ this.table[i + 1].hashCode();
                }
                i += 2;
            }
        }

        public int size() {
            return this.size;
        }
    }

    public static final class SetN<E> extends C6031c<E> implements Serializable {
        public static final Set<?> EMPTY_SET = new SetN(new Object[0]);
        public final E[] elements;
        private final int size;

        /* renamed from: java8.util.ImmutableCollections$SetN$a */
        public final class C6028a extends C6034a.C6035a<E> {

            /* renamed from: a */
            public int f30304a;

            /* renamed from: d */
            public int f30305d;

            public C6028a() {
                int size = SetN.this.size();
                this.f30304a = size;
                if (size > 0) {
                    this.f30305d = ImmutableCollections.m46195f(ImmutableCollections.f30291a, SetN.this.elements.length);
                }
            }

            public boolean hasNext() {
                if (this.f30304a > 0) {
                    return true;
                }
                return false;
            }

            public E next() {
                E e;
                if (hasNext()) {
                    do {
                        e = SetN.this.elements[nextIndex()];
                    } while (e == null);
                    this.f30304a--;
                    return e;
                }
                throw new NoSuchElementException();
            }

            public final int nextIndex() {
                int i;
                int i2 = this.f30305d;
                if (ImmutableCollections.f30291a >= 0) {
                    i = i2 + 1;
                    if (i >= SetN.this.elements.length) {
                        i = 0;
                    }
                } else {
                    i = i2 - 1;
                    if (i < 0) {
                        i = SetN.this.elements.length - 1;
                    }
                }
                this.f30305d = i;
                return i;
            }
        }

        public SetN(E... eArr) {
            this.size = eArr.length;
            this.elements = new Object[(eArr.length * 2)];
            int i = 0;
            while (i < eArr.length) {
                E e = eArr[i];
                int e2 = mo44109e(e);
                if (e2 < 0) {
                    this.elements[-(e2 + 1)] = e;
                    i++;
                } else {
                    throw new IllegalArgumentException("duplicate element: " + e);
                }
            }
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        private Object writeReplace() {
            Object[] objArr = new Object[this.size];
            int i = 0;
            for (E e : this.elements) {
                if (e != null) {
                    objArr[i] = e;
                    i++;
                }
            }
            return new ColSer(2, objArr);
        }

        public boolean contains(Object obj) {
            kf4.m47057e(obj);
            if (this.size <= 0 || mo44109e(obj) < 0) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public final int mo44109e(Object obj) {
            int a = ImmutableCollections.m46195f(obj.hashCode(), this.elements.length);
            while (true) {
                E e = this.elements[a];
                if (e == null) {
                    return (-a) - 1;
                }
                if (obj.equals(e)) {
                    return a;
                }
                a++;
                if (a == this.elements.length) {
                    a = 0;
                }
            }
        }

        public int hashCode() {
            int i = 0;
            for (E e : this.elements) {
                if (e != null) {
                    i += e.hashCode();
                }
            }
            return i;
        }

        public Iterator<E> iterator() {
            return new C6028a();
        }

        public int size() {
            return this.size;
        }
    }

    /* renamed from: java8.util.ImmutableCollections$a */
    public static abstract class C6029a<E> extends AbstractCollection<E> {
        public boolean add(E e) {
            throw ImmutableCollections.m46197h();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw ImmutableCollections.m46197h();
        }

        public void clear() {
            throw ImmutableCollections.m46197h();
        }

        public boolean remove(Object obj) {
            throw ImmutableCollections.m46197h();
        }

        public boolean removeAll(Collection<?> collection) {
            throw ImmutableCollections.m46197h();
        }

        public boolean retainAll(Collection<?> collection) {
            throw ImmutableCollections.m46197h();
        }
    }

    /* renamed from: java8.util.ImmutableCollections$b */
    public static abstract class C6030b<E> extends C6029a<E> implements List<E>, RandomAccess {
        public static void subListRangeCheck(int i, int i2, int i3) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("fromIndex = " + i);
            } else if (i2 > i3) {
                throw new IndexOutOfBoundsException("toIndex = " + i2);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
            }
        }

        public void add(int i, E e) {
            throw ImmutableCollections.m46197h();
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            ImmutableCollections.m46196g(i, size());
            throw ImmutableCollections.m46197h();
        }

        public boolean contains(Object obj) {
            if (indexOf(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof List)) {
                return false;
            }
            Iterator it = ((List) obj).iterator();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (!it.hasNext() || !get(i).equals(it.next())) {
                    return false;
                }
            }
            return !it.hasNext();
        }

        public int hashCode() {
            int size = size();
            int i = 1;
            for (int i2 = 0; i2 < size; i2++) {
                i = (i * 31) + get(i2).hashCode();
            }
            return i;
        }

        public int indexOf(Object obj) {
            kf4.m47057e(obj);
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
            return -1;
        }

        public Iterator<E> iterator() {
            return new C6032d(this, size());
        }

        public int lastIndexOf(Object obj) {
            kf4.m47057e(obj);
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
            return -1;
        }

        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public IndexOutOfBoundsException outOfBounds(int i) {
            return new IndexOutOfBoundsException("Index: " + i + " Size: " + size());
        }

        public E remove(int i) {
            throw ImmutableCollections.m46197h();
        }

        public E set(int i, E e) {
            throw ImmutableCollections.m46197h();
        }

        public List<E> subList(int i, int i2) {
            subListRangeCheck(i, i2, size());
            return C6033e.m46201e(this, i, i2);
        }

        public ListIterator<E> listIterator(int i) {
            int size = size();
            if (i >= 0 && i <= size) {
                return new C6032d(this, size, i);
            }
            throw outOfBounds(i);
        }
    }

    /* renamed from: java8.util.ImmutableCollections$c */
    public static abstract class C6031c<E> extends C6029a<E> implements Set<E> {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof java.util.Set
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                java.util.Collection r5 = (java.util.Collection) r5
                int r1 = r5.size()
                int r3 = r4.size()
                if (r1 == r3) goto L_0x0017
                return r2
            L_0x0017:
                java.util.Iterator r5 = r5.iterator()
            L_0x001b:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x002e
                java.lang.Object r1 = r5.next()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r4.contains(r1)
                if (r1 != 0) goto L_0x001b
            L_0x002d:
                return r2
            L_0x002e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.ImmutableCollections.C6031c.equals(java.lang.Object):boolean");
        }

        public abstract int hashCode();
    }

    /* renamed from: java8.util.ImmutableCollections$e */
    public static final class C6033e<E> extends C6030b<E> {

        /* renamed from: a */
        public final List<E> f30311a;

        /* renamed from: d */
        public final int f30312d;

        /* renamed from: e */
        public final int f30313e;

        public C6033e(List<E> list, int i, int i2) {
            this.f30311a = list;
            this.f30312d = i;
            this.f30313e = i2;
        }

        /* renamed from: e */
        public static <E> C6033e<E> m46201e(List<E> list, int i, int i2) {
            return new C6033e<>(list, i, i2 - i);
        }

        /* renamed from: j */
        public static <E> C6033e<E> m46202j(C6033e<E> eVar, int i, int i2) {
            return new C6033e<>(eVar.f30311a, eVar.f30312d + i, i2 - i);
        }

        public E get(int i) {
            kf4.m47053a(i, this.f30313e);
            return this.f30311a.get(this.f30312d + i);
        }

        public Iterator<E> iterator() {
            return new C6032d(this, size());
        }

        /* renamed from: k */
        public final void mo44146k(int i) {
            if (i < 0 || i > this.f30313e) {
                throw outOfBounds(i);
            }
        }

        public ListIterator<E> listIterator(int i) {
            mo44146k(i);
            return new C6032d(this, size(), i);
        }

        public int size() {
            return this.f30313e;
        }

        public List<E> subList(int i, int i2) {
            C6030b.subListRangeCheck(i, i2, this.f30313e);
            return m46202j(this, i, i2);
        }
    }

    static {
        long nanoTime = System.nanoTime();
        f30291a = (int) (nanoTime ^ (nanoTime >>> 32));
    }

    /* renamed from: b */
    public static <E> List<E> m46191b() {
        return ListN.EMPTY_LIST;
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m46192c() {
        return MapN.EMPTY_MAP;
    }

    /* renamed from: d */
    public static <E> Set<E> m46193d() {
        return SetN.EMPTY_SET;
    }

    /* renamed from: e */
    public static int m46194e(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) >= 0 || i2 * i3 == i) {
            return i3;
        }
        return i3 - 1;
    }

    /* renamed from: f */
    public static int m46195f(int i, int i2) {
        return i - (m46194e(i, i2) * i2);
    }

    /* renamed from: g */
    public static void m46196g(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i2);
        }
    }

    /* renamed from: h */
    public static UnsupportedOperationException m46197h() {
        return new UnsupportedOperationException();
    }

    public static final class List12<E> extends C6030b<E> implements Serializable {

        /* renamed from: e0 */
        private final E f30292e0;

        /* renamed from: e1 */
        private final E f30293e1;

        public List12(E e) {
            this.f30292e0 = kf4.m47057e(e);
            this.f30293e1 = null;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        private Object writeReplace() {
            E e = this.f30293e1;
            if (e == null) {
                return new ColSer(1, this.f30292e0);
            }
            return new ColSer(1, this.f30292e0, e);
        }

        public E get(int i) {
            E e;
            if (i == 0) {
                return this.f30292e0;
            }
            if (i == 1 && (e = this.f30293e1) != null) {
                return e;
            }
            throw outOfBounds(i);
        }

        public int size() {
            if (this.f30293e1 != null) {
                return 2;
            }
            return 1;
        }

        public List12(E e, E e2) {
            this.f30292e0 = kf4.m47057e(e);
            this.f30293e1 = kf4.m47057e(e2);
        }
    }

    public static final class Set12<E> extends C6031c<E> implements Serializable {

        /* renamed from: e0 */
        public final E f30300e0;

        /* renamed from: e1 */
        public final E f30301e1;

        /* renamed from: java8.util.ImmutableCollections$Set12$a */
        public class C6027a extends C6034a.C6035a<E> {

            /* renamed from: a */
            public int f30302a;

            public C6027a() {
                this.f30302a = Set12.this.size();
            }

            public boolean hasNext() {
                if (this.f30302a > 0) {
                    return true;
                }
                return false;
            }

            public E next() {
                E e;
                int i = this.f30302a;
                if (i == 1) {
                    this.f30302a = 0;
                    if (ImmutableCollections.f30291a >= 0 || (e = Set12.this.f30301e1) == null) {
                        return Set12.this.f30300e0;
                    }
                    return e;
                } else if (i == 2) {
                    this.f30302a = 1;
                    if (ImmutableCollections.f30291a >= 0) {
                        return Set12.this.f30301e1;
                    }
                    return Set12.this.f30300e0;
                } else {
                    throw new NoSuchElementException();
                }
            }
        }

        public Set12(E e) {
            this.f30300e0 = kf4.m47057e(e);
            this.f30301e1 = null;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            throw new InvalidObjectException("not serial proxy");
        }

        private Object writeReplace() {
            E e = this.f30301e1;
            if (e == null) {
                return new ColSer(2, this.f30300e0);
            }
            return new ColSer(2, this.f30300e0, e);
        }

        public boolean contains(Object obj) {
            if (obj.equals(this.f30300e0) || obj.equals(this.f30301e1)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f30300e0.hashCode();
            E e = this.f30301e1;
            if (e == null) {
                i = 0;
            } else {
                i = e.hashCode();
            }
            return hashCode + i;
        }

        public Iterator<E> iterator() {
            return new C6027a();
        }

        public int size() {
            if (this.f30301e1 == null) {
                return 1;
            }
            return 2;
        }

        public Set12(E e, E e2) {
            if (!e.equals(kf4.m47057e(e2))) {
                this.f30300e0 = e;
                this.f30301e1 = e2;
                return;
            }
            throw new IllegalArgumentException("duplicate element: " + e);
        }
    }

    /* renamed from: java8.util.ImmutableCollections$d */
    public static final class C6032d<E> implements ListIterator<E> {

        /* renamed from: a */
        public final List<E> f30307a;

        /* renamed from: d */
        public final int f30308d;

        /* renamed from: e */
        public final boolean f30309e;

        /* renamed from: g */
        public int f30310g;

        public C6032d(List<E> list, int i) {
            this.f30307a = list;
            this.f30308d = i;
            this.f30310g = 0;
            this.f30309e = false;
        }

        public void add(E e) {
            throw ImmutableCollections.m46197h();
        }

        public boolean hasNext() {
            if (this.f30310g != this.f30308d) {
                return true;
            }
            return false;
        }

        public boolean hasPrevious() {
            if (!this.f30309e) {
                throw ImmutableCollections.m46197h();
            } else if (this.f30310g != 0) {
                return true;
            } else {
                return false;
            }
        }

        public E next() {
            try {
                int i = this.f30310g;
                E e = this.f30307a.get(i);
                this.f30310g = i + 1;
                return e;
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }

        public int nextIndex() {
            if (this.f30309e) {
                return this.f30310g;
            }
            throw ImmutableCollections.m46197h();
        }

        public E previous() {
            if (this.f30309e) {
                try {
                    int i = this.f30310g - 1;
                    E e = this.f30307a.get(i);
                    this.f30310g = i;
                    return e;
                } catch (IndexOutOfBoundsException unused) {
                    throw new NoSuchElementException();
                }
            } else {
                throw ImmutableCollections.m46197h();
            }
        }

        public int previousIndex() {
            if (this.f30309e) {
                return this.f30310g - 1;
            }
            throw ImmutableCollections.m46197h();
        }

        public void remove() {
            throw ImmutableCollections.m46197h();
        }

        public void set(E e) {
            throw ImmutableCollections.m46197h();
        }

        public C6032d(List<E> list, int i, int i2) {
            this.f30307a = list;
            this.f30308d = i;
            this.f30310g = i2;
            this.f30309e = true;
        }
    }
}
