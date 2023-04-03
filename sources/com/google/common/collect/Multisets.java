package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.collect.C4632i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class Multisets {

    public static class ImmutableEntry<E> extends C4606a<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            ki0.m47100b(i, "count");
        }

        public final int getCount() {
            return this.count;
        }

        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$a */
    public static abstract class C4606a<E> implements C4623d.C4624a<E> {
        public boolean equals(Object obj) {
            if (!(obj instanceof C4623d.C4624a)) {
                return false;
            }
            C4623d.C4624a aVar = (C4623d.C4624a) obj;
            if (getCount() != aVar.getCount() || !jf4.m46496a(getElement(), aVar.getElement())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Object element = getElement();
            if (element == null) {
                i = 0;
            } else {
                i = element.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$b */
    public static abstract class C4607b<E> extends C4632i.C4637d<E> {
        public void clear() {
            mo35075e().clear();
        }

        public boolean contains(Object obj) {
            return mo35075e().contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return mo35075e().containsAll(collection);
        }

        /* renamed from: e */
        public abstract C4623d<E> mo35075e();

        public boolean isEmpty() {
            return mo35075e().isEmpty();
        }

        public boolean remove(Object obj) {
            if (mo35075e().remove(obj, Integer.MAX_VALUE) > 0) {
                return true;
            }
            return false;
        }

        public int size() {
            return mo35075e().entrySet().size();
        }
    }

    /* renamed from: com.google.common.collect.Multisets$c */
    public static abstract class C4608c<E> extends C4632i.C4637d<C4623d.C4624a<E>> {
        public void clear() {
            mo35081e().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C4623d.C4624a)) {
                return false;
            }
            C4623d.C4624a aVar = (C4623d.C4624a) obj;
            if (aVar.getCount() > 0 && mo35081e().count(aVar.getElement()) == aVar.getCount()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public abstract C4623d<E> mo35081e();

        public boolean remove(Object obj) {
            if (obj instanceof C4623d.C4624a) {
                C4623d.C4624a aVar = (C4623d.C4624a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return mo35081e().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$d */
    public static final class C4609d<E> implements Iterator<E> {

        /* renamed from: a */
        public final C4623d<E> f24967a;

        /* renamed from: d */
        public final Iterator<C4623d.C4624a<E>> f24968d;

        /* renamed from: e */
        public C4623d.C4624a<E> f24969e;

        /* renamed from: g */
        public int f24970g;

        /* renamed from: k */
        public int f24971k;

        /* renamed from: r */
        public boolean f24972r;

        public C4609d(C4623d<E> dVar, Iterator<C4623d.C4624a<E>> it) {
            this.f24967a = dVar;
            this.f24968d = it;
        }

        public boolean hasNext() {
            if (this.f24970g > 0 || this.f24968d.hasNext()) {
                return true;
            }
            return false;
        }

        public E next() {
            if (hasNext()) {
                if (this.f24970g == 0) {
                    C4623d.C4624a<E> next = this.f24968d.next();
                    this.f24969e = next;
                    int count = next.getCount();
                    this.f24970g = count;
                    this.f24971k = count;
                }
                this.f24970g--;
                this.f24972r = true;
                C4623d.C4624a<E> aVar = this.f24969e;
                Objects.requireNonNull(aVar);
                return aVar.getElement();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            ki0.m47102d(this.f24972r);
            if (this.f24971k == 1) {
                this.f24968d.remove();
            } else {
                C4623d<E> dVar = this.f24967a;
                C4623d.C4624a<E> aVar = this.f24969e;
                Objects.requireNonNull(aVar);
                dVar.remove(aVar.getElement());
            }
            this.f24971k--;
            this.f24972r = false;
        }
    }

    /* renamed from: a */
    public static <E> boolean m36962a(C4623d<E> dVar, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(dVar);
        return true;
    }

    /* renamed from: b */
    public static <E> boolean m36963b(C4623d<E> dVar, C4623d<? extends E> dVar2) {
        if (dVar2 instanceof AbstractMapBasedMultiset) {
            return m36962a(dVar, (AbstractMapBasedMultiset) dVar2);
        }
        if (dVar2.isEmpty()) {
            return false;
        }
        for (C4623d.C4624a next : dVar2.entrySet()) {
            dVar.add(next.getElement(), next.getCount());
        }
        return true;
    }

    /* renamed from: c */
    public static <E> boolean m36964c(C4623d<E> dVar, Collection<? extends E> collection) {
        du4.m43691k(dVar);
        du4.m43691k(collection);
        if (collection instanceof C4623d) {
            return m36963b(dVar, m36965d(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.m36764a(dVar, collection.iterator());
    }

    /* renamed from: d */
    public static <T> C4623d<T> m36965d(Iterable<T> iterable) {
        return (C4623d) iterable;
    }

    /* renamed from: e */
    public static boolean m36966e(C4623d<?> dVar, Object obj) {
        if (obj == dVar) {
            return true;
        }
        if (obj instanceof C4623d) {
            C4623d dVar2 = (C4623d) obj;
            if (dVar.size() == dVar2.size() && dVar.entrySet().size() == dVar2.entrySet().size()) {
                for (C4623d.C4624a aVar : dVar2.entrySet()) {
                    if (dVar.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static <E> C4623d.C4624a<E> m36967f(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    /* renamed from: g */
    public static int m36968g(Iterable<?> iterable) {
        if (iterable instanceof C4623d) {
            return ((C4623d) iterable).elementSet().size();
        }
        return 11;
    }

    /* renamed from: h */
    public static <E> Iterator<E> m36969h(C4623d<E> dVar) {
        return new C4609d(dVar, dVar.entrySet().iterator());
    }

    /* renamed from: i */
    public static boolean m36970i(C4623d<?> dVar, Collection<?> collection) {
        if (collection instanceof C4623d) {
            collection = ((C4623d) collection).elementSet();
        }
        return dVar.elementSet().removeAll(collection);
    }

    /* renamed from: j */
    public static boolean m36971j(C4623d<?> dVar, Collection<?> collection) {
        du4.m43691k(collection);
        if (collection instanceof C4623d) {
            collection = ((C4623d) collection).elementSet();
        }
        return dVar.elementSet().retainAll(collection);
    }

    /* renamed from: k */
    public static <E> int m36972k(C4623d<E> dVar, E e, int i) {
        ki0.m47100b(i, "count");
        int count = dVar.count(e);
        int i2 = i - count;
        if (i2 > 0) {
            dVar.add(e, i2);
        } else if (i2 < 0) {
            dVar.remove(e, -i2);
        }
        return count;
    }

    /* renamed from: l */
    public static <E> boolean m36973l(C4623d<E> dVar, E e, int i, int i2) {
        ki0.m47100b(i, "oldCount");
        ki0.m47100b(i2, "newCount");
        if (dVar.count(e) != i) {
            return false;
        }
        dVar.setCount(e, i2);
        return true;
    }
}
