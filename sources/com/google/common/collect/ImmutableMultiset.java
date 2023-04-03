package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements C4623d<E> {
    @LazyInit

    /* renamed from: d */
    public transient ImmutableList<E> f24893d;
    @LazyInit

    /* renamed from: e */
    public transient ImmutableSet<C4623d.C4624a<E>> f24894e;

    public final class EntrySet extends IndexedImmutableSet<C4623d.C4624a<E>> {
        private static final long serialVersionUID = 0;

        public EntrySet() {
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof C4623d.C4624a)) {
                return false;
            }
            C4623d.C4624a aVar = (C4623d.C4624a) obj;
            if (aVar.getCount() > 0 && ImmutableMultiset.this.count(aVar.getElement()) == aVar.getCount()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        public boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        public /* synthetic */ EntrySet(ImmutableMultiset immutableMultiset, C4547a aVar) {
            this();
        }

        public C4623d.C4624a<E> get(int i) {
            return ImmutableMultiset.this.getEntry(i);
        }
    }

    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset<E> multiset;

        public EntrySetSerializedForm(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public Object readResolve() {
            return this.multiset.entrySet();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$a */
    public class C4547a extends c47<E> {

        /* renamed from: a */
        public int f24895a;

        /* renamed from: d */
        public E f24896d;

        /* renamed from: e */
        public final /* synthetic */ Iterator f24897e;

        public C4547a(ImmutableMultiset immutableMultiset, Iterator it) {
            this.f24897e = it;
        }

        public boolean hasNext() {
            if (this.f24895a > 0 || this.f24897e.hasNext()) {
                return true;
            }
            return false;
        }

        public E next() {
            if (this.f24895a <= 0) {
                C4623d.C4624a aVar = (C4623d.C4624a) this.f24897e.next();
                this.f24896d = aVar.getElement();
                this.f24895a = aVar.getCount();
            }
            this.f24895a--;
            E e = this.f24896d;
            Objects.requireNonNull(e);
            return e;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMultiset$b */
    public static class C4548b<E> extends ImmutableCollection.C4533b<E> {

        /* renamed from: a */
        public C4625e<E> f24898a;

        /* renamed from: b */
        public boolean f24899b;

        /* renamed from: c */
        public boolean f24900c;

        public C4548b() {
            this(4);
        }

        /* renamed from: l */
        public static <T> C4625e<T> m36702l(Iterable<T> iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).contents;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).backingMap;
            }
            return null;
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public C4548b<E> mo34667a(E e) {
            return mo34789j(e, 1);
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public C4548b<E> mo34786g(E... eArr) {
            super.mo34662b(eArr);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: h */
        public C4548b<E> mo34787h(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f24898a);
            if (iterable instanceof C4623d) {
                C4623d<? extends E> d = Multisets.m36965d(iterable);
                C4625e<T> l = m36702l(d);
                if (l != null) {
                    C4625e<E> eVar = this.f24898a;
                    eVar.mo35188d(Math.max(eVar.mo35186C(), l.mo35186C()));
                    for (int e = l.mo35189e(); e >= 0; e = l.mo35199s(e)) {
                        mo34789j(l.mo35192i(e), l.mo35193k(e));
                    }
                } else {
                    Set<C4623d.C4624a<? extends E>> entrySet = d.entrySet();
                    C4625e<E> eVar2 = this.f24898a;
                    eVar2.mo35188d(Math.max(eVar2.mo35186C(), entrySet.size()));
                    for (C4623d.C4624a next : d.entrySet()) {
                        mo34789j(next.getElement(), next.getCount());
                    }
                }
            } else {
                super.mo34663c(iterable);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        public C4548b<E> mo34788i(Iterator<? extends E> it) {
            super.mo34668d(it);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: j */
        public C4548b<E> mo34789j(E e, int i) {
            Objects.requireNonNull(this.f24898a);
            if (i == 0) {
                return this;
            }
            if (this.f24899b) {
                this.f24898a = new C4625e<>(this.f24898a);
                this.f24900c = false;
            }
            this.f24899b = false;
            du4.m43691k(e);
            C4625e<E> eVar = this.f24898a;
            eVar.mo35201u(e, i + eVar.mo35190f(e));
            return this;
        }

        /* renamed from: k */
        public ImmutableMultiset<E> mo34790k() {
            Objects.requireNonNull(this.f24898a);
            if (this.f24898a.mo35186C() == 0) {
                return ImmutableMultiset.m36695of();
            }
            if (this.f24900c) {
                this.f24898a = new C4625e<>(this.f24898a);
                this.f24900c = false;
            }
            this.f24899b = true;
            return new RegularImmutableMultiset(this.f24898a);
        }

        public C4548b(int i) {
            this.f24899b = false;
            this.f24900c = false;
            this.f24898a = C4625e.m36988c(i);
        }
    }

    public static <E> C4548b<E> builder() {
        return new C4548b<>();
    }

    public static <E> ImmutableMultiset<E> copyFromEntries(Collection<? extends C4623d.C4624a<? extends E>> collection) {
        C4548b bVar = new C4548b(collection.size());
        for (C4623d.C4624a aVar : collection) {
            bVar.mo34789j(aVar.getElement(), aVar.getCount());
        }
        return bVar.mo34790k();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return m36693e(eArr);
    }

    /* renamed from: e */
    public static <E> ImmutableMultiset<E> m36693e(E... eArr) {
        return new C4548b().mo34786g(eArr).mo34790k();
    }

    /* renamed from: j */
    private ImmutableSet<C4623d.C4624a<E>> m36694j() {
        if (isEmpty()) {
            return ImmutableSet.m36712of();
        }
        return new EntrySet(this, (C4547a) null);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36695of() {
        return RegularImmutableMultiset.EMPTY;
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f24893d;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> asList = super.asList();
        this.f24893d = asList;
        return asList;
    }

    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        c47 it = entrySet().iterator();
        while (it.hasNext()) {
            C4623d.C4624a aVar = (C4623d.C4624a) it.next();
            Arrays.fill(objArr, i, aVar.getCount() + i, aVar.getElement());
            i += aVar.getCount();
        }
        return i;
    }

    public abstract /* synthetic */ int count(@CompatibleWith("E") Object obj);

    public abstract ImmutableSet<E> elementSet();

    public boolean equals(Object obj) {
        return Multisets.m36966e(this, obj);
    }

    public abstract C4623d.C4624a<E> getEntry(int i);

    public int hashCode() {
        return C4632i.m37033d(entrySet());
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return entrySet().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        C4548b bVar = new C4548b(Multisets.m36968g(iterable));
        bVar.mo34787h(iterable);
        return bVar.mo34790k();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36696of(E e) {
        return m36693e(e);
    }

    public ImmutableSet<C4623d.C4624a<E>> entrySet() {
        ImmutableSet<C4623d.C4624a<E>> immutableSet = this.f24894e;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<C4623d.C4624a<E>> j = m36694j();
        this.f24894e = j;
        return j;
    }

    public c47<E> iterator() {
        return new C4547a(this, entrySet().iterator());
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36697of(E e, E e2) {
        return m36693e(e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36698of(E e, E e2, E e3) {
        return m36693e(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36699of(E e, E e2, E e3, E e4) {
        return m36693e(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36700of(E e, E e2, E e3, E e4, E e5) {
        return m36693e(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m36701of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new C4548b().mo34667a(e).mo34667a(e2).mo34667a(e3).mo34667a(e4).mo34667a(e5).mo34667a(e6).mo34786g(eArr).mo34790k();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new C4548b().mo34788i(it).mo34790k();
    }
}
