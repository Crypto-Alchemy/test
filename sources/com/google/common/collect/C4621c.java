package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.collect.c */
/* compiled from: Collections2 */
public final class C4621c {

    /* renamed from: com.google.common.collect.c$a */
    /* compiled from: Collections2 */
    public static class C4622a<E> extends AbstractCollection<E> {

        /* renamed from: a */
        public final Collection<E> f25007a;

        /* renamed from: d */
        public final ku4<? super E> f25008d;

        public C4622a(Collection<E> collection, ku4<? super E> ku4) {
            this.f25007a = collection;
            this.f25008d = ku4;
        }

        public boolean add(E e) {
            du4.m43684d(this.f25008d.apply(e));
            return this.f25007a.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                du4.m43684d(this.f25008d.apply(apply));
            }
            return this.f25007a.addAll(collection);
        }

        public void clear() {
            qz2.m50915f(this.f25007a, this.f25008d);
        }

        public boolean contains(Object obj) {
            if (C4621c.m36985c(this.f25007a, obj)) {
                return this.f25008d.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return C4621c.m36983a(this, collection);
        }

        public boolean isEmpty() {
            return !qz2.m50910a(this.f25007a, this.f25008d);
        }

        public Iterator<E> iterator() {
            return Iterators.m36772i(this.f25007a.iterator(), this.f25008d);
        }

        public boolean remove(Object obj) {
            if (!contains(obj) || !this.f25007a.remove(obj)) {
                return false;
            }
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f25007a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f25008d.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f25007a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f25008d.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            int i = 0;
            for (E apply : this.f25007a) {
                if (this.f25008d.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public Object[] toArray() {
            return Lists.m36793j(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return Lists.m36793j(iterator()).toArray(tArr);
        }
    }

    /* renamed from: a */
    public static boolean m36983a(Collection<?> collection, Collection<?> collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static StringBuilder m36984b(int i) {
        ki0.m47100b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: c */
    public static boolean m36985c(Collection<?> collection, Object obj) {
        du4.m43691k(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
