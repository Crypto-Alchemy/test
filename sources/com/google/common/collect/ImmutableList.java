package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: d */
    public static final g47<Object> f24863d = new C4535b(RegularImmutableList.EMPTY, 0);

    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: e */
        public final transient ImmutableList<E> f24864e;

        public ReverseImmutableList(ImmutableList<E> immutableList) {
            this.f24864e = immutableList;
        }

        public boolean contains(Object obj) {
            return this.f24864e.contains(obj);
        }

        public E get(int i) {
            du4.m43689i(i, size());
            return this.f24864e.get(mo34683j(i));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f24864e.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return mo34683j(lastIndexOf);
            }
            return -1;
        }

        public boolean isPartialView() {
            return this.f24864e.isPartialView();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        /* renamed from: j */
        public final int mo34683j(int i) {
            return (size() - 1) - i;
        }

        /* renamed from: k */
        public final int mo34684k(int i) {
            return size() - i;
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f24864e.indexOf(obj);
            if (indexOf >= 0) {
                return mo34683j(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public ImmutableList<E> reverse() {
            return this.f24864e;
        }

        public int size() {
            return this.f24864e.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            du4.m43695o(i, i2, size());
            return this.f24864e.subList(mo34684k(i2), mo34684k(i)).reverse();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf((E[]) this.elements);
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int length;
        public final transient int offset;

        public SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        public E get(int i) {
            du4.m43689i(i, this.length);
            return ImmutableList.this.get(i + this.offset);
        }

        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.offset;
        }

        public boolean isPartialView() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public int size() {
            return this.length;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        public ImmutableList<E> subList(int i, int i2) {
            du4.m43695o(i, i2, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$a */
    public static final class C4534a<E> extends ImmutableCollection.C4532a<E> {
        public C4534a() {
            this(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4534a<E> mo34667a(E e) {
            super.mo34664f(e);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public C4534a<E> mo34690j(Iterable<? extends E> iterable) {
            super.mo34663c(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: k */
        public C4534a<E> mo34691k(Iterator<? extends E> it) {
            super.mo34668d(it);
            return this;
        }

        /* renamed from: l */
        public ImmutableList<E> mo34692l() {
            this.f24862c = true;
            return ImmutableList.asImmutableList(this.f24860a, this.f24861b);
        }

        public C4534a(int i) {
            super(i);
        }
    }

    /* renamed from: com.google.common.collect.ImmutableList$b */
    public static class C4535b<E> extends C5857g6<E> {

        /* renamed from: e */
        public final ImmutableList<E> f24865e;

        public C4535b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f24865e = immutableList;
        }

        /* renamed from: a */
        public E mo34693a(int i) {
            return this.f24865e.get(i);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> C4534a<E> builder() {
        return new C4534a<>();
    }

    public static <E> C4534a<E> builderWithExpectedSize(int i) {
        ki0.m47100b(i, "expectedSize");
        return new C4534a<>(i);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        du4.m43691k(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* renamed from: e */
    public static <E> ImmutableList<E> m36626e(Object... objArr) {
        return asImmutableList(ve4.m53364b(objArr));
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36627of() {
        return RegularImmutableList.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) qz2.m50919j(iterable, new Comparable[0]);
        ve4.m53364b(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @InlineMe(replacement = "this")
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return Lists.m36786c(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m36787d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.m36789f(this, obj);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new ReverseImmutableList(this);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return m36627of();
        }
        return new RegularImmutableList(objArr, i);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36628of(E e) {
        return m36626e(e);
    }

    public c47<E> iterator() {
        return listIterator();
    }

    public ImmutableList<E> subList(int i, int i2) {
        du4.m43695o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m36627of();
        }
        return subListUnchecked(i, i2);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36629of(E e, E e2) {
        return m36626e(e, e2);
    }

    public g47<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36630of(E e, E e2, E e3) {
        return m36626e(e, e2, e3);
    }

    public g47<E> listIterator(int i) {
        du4.m43693m(i, size());
        if (isEmpty()) {
            return f24863d;
        }
        return new C4535b(this, i);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return m36626e(collection.toArray());
        }
        ImmutableList<E> asList = ((ImmutableCollection) collection).asList();
        return asList.isPartialView() ? asImmutableList(asList.toArray()) : asList;
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36631of(E e, E e2, E e3, E e4) {
        return m36626e(e, e2, e3, e4);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        du4.m43691k(comparator);
        Object[] i = qz2.m50918i(iterable);
        ve4.m53364b(i);
        Arrays.sort(i, comparator);
        return asImmutableList(i);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36632of(E e, E e2, E e3, E e4, E e5) {
        return m36626e(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36633of(E e, E e2, E e3, E e4, E e5, E e6) {
        return m36626e(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36634of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return m36626e(e, e2, e3, e4, e5, e6, e7);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m36627of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m36628of(next);
        }
        return new C4534a().mo34667a(next).mo34691k(it).mo34692l();
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36635of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return m36626e(e, e2, e3, e4, e5, e6, e7, e8);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36636of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return m36626e(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36637of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return m36626e(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36638of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return m36626e(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m36639of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        E[] eArr2 = eArr;
        du4.m43685e(eArr2.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr2.length + 12)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        return m36626e(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m36627of();
        }
        return m36626e((Object[]) eArr.clone());
    }
}
