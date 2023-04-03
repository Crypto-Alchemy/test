package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Ordering<T> implements Comparator<T> {
    public static final int LEFT_IS_GREATER = 1;
    public static final int RIGHT_IS_GREATER = -1;

    public static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        public final Object value;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IncomparableValueException(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r1 = r0.length()
                int r1 = r1 + 22
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Cannot compare value: "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r3.<init>(r0)
                r3.value = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Ordering.IncomparableValueException.<init>(java.lang.Object):void");
        }
    }

    /* renamed from: com.google.common.collect.Ordering$a */
    public static class C4610a extends Ordering<Object> {

        /* renamed from: a */
        public final AtomicInteger f24975a = new AtomicInteger(0);

        /* renamed from: d */
        public final ConcurrentMap<Object, Integer> f24976d = C4627f.m37022f(new MapMaker()).mo34855i();

        /* renamed from: a */
        public final Integer mo35115a(Object obj) {
            Integer num = this.f24976d.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f24975a.getAndIncrement());
            Integer putIfAbsent = this.f24976d.putIfAbsent(obj, valueOf);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return valueOf;
        }

        /* renamed from: b */
        public int mo35116b(Object obj) {
            return System.identityHashCode(obj);
        }

        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int b = mo35116b(obj);
            int b2 = mo35116b(obj2);
            if (b == b2) {
                int compareTo = mo35115a(obj).compareTo(mo35115a(obj2));
                if (compareTo != 0) {
                    return compareTo;
                }
                throw new AssertionError();
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }

        public String toString() {
            return "Ordering.arbitrary()";
        }
    }

    /* renamed from: com.google.common.collect.Ordering$b */
    public static class C4611b {

        /* renamed from: a */
        public static final Ordering<Object> f24977a = new C4610a();
    }

    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering<Object> arbitrary() {
        return C4611b.f24977a;
    }

    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        if (comparator instanceof Ordering) {
            return (Ordering) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, T t) {
        return Collections.binarySearch(list, t, this);
    }

    @CanIgnoreReturnValue
    public abstract int compare(T t, T t2);

    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Comparator) du4.m43691k(comparator));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.sortedCopyOf(this, iterable);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (((long) collection.size()) <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    public <E extends T> E max(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = max(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(Iterator<E> it) {
        E next = it.next();
        while (it.hasNext()) {
            next = min(next, it.next());
        }
        return next;
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    public <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
        return onResultOf(Maps.m36926g());
    }

    public <F> Ordering<F> onResultOf(hd2<F, ? extends T> hd2) {
        return new ByFunctionOrdering(hd2, this);
    }

    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] i = qz2.m50918i(iterable);
        Arrays.sort(i, this);
        return Lists.m36792i(Arrays.asList(i));
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(Lists.m36784a(t, tArr));
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it, int i) {
        return reverse().leastOf(it, i);
    }

    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) du4.m43691k(ordering);
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return max(iterable.iterator());
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return min(iterable.iterator());
    }

    public <E extends T> E max(E e, E e2) {
        return compare(e, e2) >= 0 ? e : e2;
    }

    public <E extends T> E min(E e, E e2) {
        return compare(e, e2) <= 0 ? e : e2;
    }

    public <E extends T> E max(E e, E e2, E e3, E... eArr) {
        E max = max(max(e, e2), e3);
        for (E max2 : eArr) {
            max = max(max, max2);
        }
        return max;
    }

    public <E extends T> E min(E e, E e2, E e3, E... eArr) {
        E min = min(min(e, e2), e3);
        for (E min2 : eArr) {
            min = min(min, min2);
        }
        return min;
    }

    public <E extends T> List<E> leastOf(Iterator<E> it, int i) {
        du4.m43691k(it);
        ki0.m47100b(i, "k");
        if (i == 0 || !it.hasNext()) {
            return Collections.emptyList();
        }
        if (i >= 1073741823) {
            ArrayList<E> j = Lists.m36793j(it);
            Collections.sort(j, this);
            if (j.size() > i) {
                j.subList(i, j.size()).clear();
            }
            j.trimToSize();
            return Collections.unmodifiableList(j);
        }
        ds6 a = ds6.m43631a(i, this);
        a.mo42037c(it);
        return a.mo42040f();
    }
}
