package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@DoNotMock("Use ImmutableList.of or another implementation")
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    public static final Object[] f24859a = new Object[0];

    /* renamed from: com.google.common.collect.ImmutableCollection$a */
    public static abstract class C4532a<E> extends C4533b<E> {

        /* renamed from: a */
        public Object[] f24860a;

        /* renamed from: b */
        public int f24861b = 0;

        /* renamed from: c */
        public boolean f24862c;

        public C4532a(int i) {
            ki0.m47100b(i, "initialCapacity");
            this.f24860a = new Object[i];
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C4533b<E> mo34662b(E... eArr) {
            mo34665g(eArr, eArr.length);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4533b<E> mo34663c(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                mo34666h(this.f24861b + collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f24861b = ((ImmutableCollection) collection).copyIntoArray(this.f24860a, this.f24861b);
                    return this;
                }
            }
            super.mo34663c(iterable);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public C4532a<E> mo34664f(E e) {
            du4.m43691k(e);
            mo34666h(this.f24861b + 1);
            Object[] objArr = this.f24860a;
            int i = this.f24861b;
            this.f24861b = i + 1;
            objArr[i] = e;
            return this;
        }

        /* renamed from: g */
        public final void mo34665g(Object[] objArr, int i) {
            ve4.m53365c(objArr, i);
            mo34666h(this.f24861b + i);
            System.arraycopy(objArr, 0, this.f24860a, this.f24861b, i);
            this.f24861b += i;
        }

        /* renamed from: h */
        public final void mo34666h(int i) {
            Object[] objArr = this.f24860a;
            if (objArr.length < i) {
                this.f24860a = Arrays.copyOf(objArr, C4533b.m36621e(objArr.length, i));
                this.f24862c = false;
            } else if (this.f24862c) {
                this.f24860a = (Object[]) objArr.clone();
                this.f24862c = false;
            }
        }
    }

    @DoNotMock
    /* renamed from: com.google.common.collect.ImmutableCollection$b */
    public static abstract class C4533b<E> {
        /* renamed from: e */
        public static int m36621e(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public abstract C4533b<E> mo34667a(E e);

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C4533b<E> mo34662b(E... eArr) {
            for (E a : eArr) {
                mo34667a(a);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4533b<E> mo34663c(Iterable<? extends E> iterable) {
            for (Object a : iterable) {
                mo34667a(a);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C4533b<E> mo34668d(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo34667a(it.next());
            }
            return this;
        }
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        if (isEmpty()) {
            return ImmutableList.m36627of();
        }
        return ImmutableList.asImmutableList(toArray());
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    @CanIgnoreReturnValue
    public int copyIntoArray(Object[] objArr, int i) {
        c47 it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] internalArray() {
        return null;
    }

    public int internalArrayEnd() {
        throw new UnsupportedOperationException();
    }

    public int internalArrayStart() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    public abstract c47<E> iterator();

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f24859a);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        du4.m43691k(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] internalArray = internalArray();
            if (internalArray != null) {
                return C4627f.m37017a(internalArray, internalArrayStart(), internalArrayEnd(), tArr);
            }
            tArr = ve4.m53366d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        copyIntoArray(tArr, 0);
        return tArr;
    }
}
