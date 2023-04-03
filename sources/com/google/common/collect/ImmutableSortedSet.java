package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, x56<E> {
    public final transient Comparator<? super E> comparator;
    @LazyInit
    public transient ImmutableSortedSet<E> descendingSet;

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator<? super E> comparator;
        public final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }

        public Object readResolve() {
            return new C4552a(this.comparator).mo34831o(this.elements).mo34798m();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableSortedSet$a */
    public static final class C4552a<E> extends ImmutableSet.C4549a<E> {

        /* renamed from: f */
        public final Comparator<? super E> f24909f;

        public C4552a(Comparator<? super E> comparator) {
            this.f24909f = (Comparator) du4.m43691k(comparator);
        }

        @CanIgnoreReturnValue
        /* renamed from: n */
        public C4552a<E> mo34794i(E e) {
            super.mo34667a(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: o */
        public C4552a<E> mo34831o(E... eArr) {
            super.mo34795j(eArr);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: p */
        public C4552a<E> mo34796k(Iterator<? extends E> it) {
            super.mo34796k(it);
            return this;
        }

        /* renamed from: q */
        public ImmutableSortedSet<E> mo34798m() {
            ImmutableSortedSet<E> construct = ImmutableSortedSet.construct(this.f24909f, this.f24861b, this.f24860a);
            this.f24861b = construct.size();
            this.f24862c = true;
            return construct;
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator2);
        }
        ve4.m53365c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e = eArr[i3];
            if (comparator2.compare(e, eArr[i2 - 1]) != 0) {
                eArr[i2] = e;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.asImmutableList(eArr, i2), comparator2);
    }

    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> copyOf(E[] eArr) {
        return construct(Ordering.natural(), eArr.length, (Comparable[]) eArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator<? super E> a = y56.m54625a(sortedSet);
        ImmutableList<E> copyOf = ImmutableList.copyOf(sortedSet);
        if (copyOf.isEmpty()) {
            return emptySet(a);
        }
        return new RegularImmutableSortedSet(copyOf, a);
    }

    public static <E> RegularImmutableSortedSet<E> emptySet(Comparator<? super E> comparator2) {
        if (Ordering.natural().equals(comparator2)) {
            return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
        }
        return new RegularImmutableSortedSet<>(ImmutableList.m36627of(), comparator2);
    }

    public static <E extends Comparable<?>> C4552a<E> naturalOrder() {
        return new C4552a<>(Ordering.natural());
    }

    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m36743of() {
        return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    }

    public static <E> C4552a<E> orderedBy(Comparator<E> comparator2) {
        return new C4552a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> C4552a<E> reverseOrder() {
        return new C4552a<>(Collections.reverseOrder());
    }

    public E ceiling(E e) {
        return qz2.m50912c(tailSet(e, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public abstract ImmutableSortedSet<E> createDescendingSet();

    public abstract c47<E> descendingIterator();

    public E first() {
        return iterator().next();
    }

    public E floor(E e) {
        return Iterators.m36775l(headSet(e, true).descendingIterator(), null);
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    public E higher(E e) {
        return qz2.m50912c(tailSet(e, false), null);
    }

    public abstract int indexOf(Object obj);

    public abstract c47<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e) {
        return Iterators.m36775l(headSet(e, false).descendingIterator(), null);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    public Object writeReplace() {
        return new SerializedForm(this.comparator, toArray());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m36744of(E e) {
        return new RegularImmutableSortedSet(ImmutableList.m36628of(e), Ordering.natural());
    }

    public static int unsafeCompare(Comparator<?> comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> createDescendingSet = createDescendingSet();
        this.descendingSet = createDescendingSet;
        createDescendingSet.descendingSet = this;
        return createDescendingSet;
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m36745of(E e, E e2) {
        return construct(Ordering.natural(), 2, e, e2);
    }

    public ImmutableSortedSet<E> headSet(E e) {
        return headSet(e, false);
    }

    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet(e, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf(Ordering.natural(), collection);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m36746of(E e, E e2, E e3) {
        return construct(Ordering.natural(), 3, e, e2, e3);
    }

    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return headSetImpl(du4.m43691k(e), z);
    }

    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        du4.m43691k(e);
        du4.m43691k(e2);
        du4.m43684d(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, z, e2, z2);
    }

    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return tailSetImpl(du4.m43691k(e), z);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m36747of(E e, E e2, E e3, E e4) {
        return construct(Ordering.natural(), 4, e, e2, e3, e4);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m36748of(E e, E e2, E e3, E e4, E e5) {
        return construct(Ordering.natural(), 5, e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m36749of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        Comparable[] comparableArr = new Comparable[length];
        comparableArr[0] = e;
        comparableArr[1] = e2;
        comparableArr[2] = e3;
        comparableArr[3] = e4;
        comparableArr[4] = e5;
        comparableArr[5] = e6;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return construct(Ordering.natural(), length, comparableArr);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        return new C4552a(comparator2).mo34796k(it).mo34798m();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        du4.m43691k(comparator2);
        if (y56.m54626b(comparator2, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] i = qz2.m50918i(iterable);
        return construct(comparator2, i.length, i);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf(comparator2, collection);
    }
}
