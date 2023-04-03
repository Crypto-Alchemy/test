package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;

class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(C4625e.m36987b());
    public final transient C4625e<E> contents;

    /* renamed from: g */
    public final transient int f24990g;
    @LazyInit

    /* renamed from: k */
    public transient ImmutableSet<E> f24991k;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        public E get(int i) {
            return RegularImmutableMultiset.this.contents.mo35192i(i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return RegularImmutableMultiset.this.contents.mo35186C();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        public SerializedForm(C4623d<? extends Object> dVar) {
            int size = dVar.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (C4623d.C4624a next : dVar.entrySet()) {
                this.elements[i] = next.getElement();
                this.counts[i] = next.getCount();
                i++;
            }
        }

        public Object readResolve() {
            ImmutableMultiset.C4548b bVar = new ImmutableMultiset.C4548b(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return bVar.mo34790k();
                }
                bVar.mo34789j(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    public RegularImmutableMultiset(C4625e<E> eVar) {
        this.contents = eVar;
        long j = 0;
        for (int i = 0; i < eVar.mo35186C(); i++) {
            j += (long) eVar.mo35193k(i);
        }
        this.f24990g = Ints.m37051j(j);
    }

    public int count(Object obj) {
        return this.contents.mo35190f(obj);
    }

    public C4623d.C4624a<E> getEntry(int i) {
        return this.contents.mo35191g(i);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f24990g;
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f24991k;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.f24991k = elementSet;
        return elementSet;
    }
}
