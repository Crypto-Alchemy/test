package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.collect.b */
/* compiled from: AbstractMultiset */
public abstract class C4618b<E> extends AbstractCollection<E> implements C4623d<E> {
    @LazyInit

    /* renamed from: a */
    public transient Set<E> f25003a;
    @LazyInit

    /* renamed from: d */
    public transient Set<C4623d.C4624a<E>> f25004d;

    /* renamed from: com.google.common.collect.b$a */
    /* compiled from: AbstractMultiset */
    public class C4619a extends Multisets.C4607b<E> {
        public C4619a() {
        }

        /* renamed from: e */
        public C4623d<E> mo35075e() {
            return C4618b.this;
        }

        public Iterator<E> iterator() {
            return C4618b.this.elementIterator();
        }
    }

    /* renamed from: com.google.common.collect.b$b */
    /* compiled from: AbstractMultiset */
    public class C4620b extends Multisets.C4608c<E> {
        public C4620b() {
        }

        /* renamed from: e */
        public C4623d<E> mo35081e() {
            return C4618b.this;
        }

        public Iterator<C4623d.C4624a<E>> iterator() {
            return C4618b.this.entryIterator();
        }

        public int size() {
            return C4618b.this.distinctElements();
        }
    }

    @CanIgnoreReturnValue
    public final boolean add(E e) {
        add(e, 1);
        return true;
    }

    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.m36964c(this, collection);
    }

    public abstract void clear();

    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public Set<E> createElementSet() {
        return new C4619a();
    }

    public Set<C4623d.C4624a<E>> createEntrySet() {
        return new C4620b();
    }

    public abstract int distinctElements();

    public abstract Iterator<E> elementIterator();

    public Set<E> elementSet() {
        Set<E> set = this.f25003a;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.f25003a = createElementSet;
        return createElementSet;
    }

    public abstract Iterator<C4623d.C4624a<E>> entryIterator();

    public Set<C4623d.C4624a<E>> entrySet() {
        Set<C4623d.C4624a<E>> set = this.f25004d;
        if (set != null) {
            return set;
        }
        Set<C4623d.C4624a<E>> createEntrySet = createEntrySet();
        this.f25004d = createEntrySet;
        return createEntrySet;
    }

    public final boolean equals(Object obj) {
        return Multisets.m36966e(this, obj);
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @CanIgnoreReturnValue
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.m36970i(this, collection);
    }

    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.m36971j(this, collection);
    }

    @CanIgnoreReturnValue
    public int setCount(E e, int i) {
        return Multisets.m36972k(this, e, i);
    }

    public final String toString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public boolean setCount(E e, int i, int i2) {
        return Multisets.m36973l(this, e, i, i2);
    }
}
