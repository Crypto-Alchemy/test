package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class Lists {

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        public final E first;
        public final E[] rest;

        public OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (Object[]) du4.m43691k(eArr);
        }

        public E get(int i) {
            du4.m43689i(i, size());
            if (i == 0) {
                return this.first;
            }
            return this.rest[i - 1];
        }

        public int size() {
            return mw2.m48520e(this.rest.length, 1);
        }
    }

    /* renamed from: a */
    public static <E> List<E> m36784a(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    /* renamed from: b */
    public static int m36785b(int i) {
        ki0.m47100b(i, "arraySize");
        return Ints.m37051j(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: c */
    public static boolean m36786c(List<?> list, Object obj) {
        if (obj == du4.m43691k(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.m36768e(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!jf4.m46496a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static int m36787d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m36788e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (jf4.m46496a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static int m36788e(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public static int m36789f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m36790g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (jf4.m46496a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static int m36790g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m36791h() {
        return new ArrayList<>();
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m36792i(Iterable<? extends E> iterable) {
        du4.m43691k(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return m36793j(iterable.iterator());
    }

    /* renamed from: j */
    public static <E> ArrayList<E> m36793j(Iterator<? extends E> it) {
        ArrayList<E> h = m36791h();
        Iterators.m36764a(h, it);
        return h;
    }

    /* renamed from: k */
    public static <E> ArrayList<E> m36794k(E... eArr) {
        du4.m43691k(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m36785b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
