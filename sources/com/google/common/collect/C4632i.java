package com.google.common.collect;

import com.google.common.base.Predicates;
import com.google.common.collect.C4621c;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.common.collect.i */
/* compiled from: Sets */
public final class C4632i {

    /* renamed from: com.google.common.collect.i$a */
    /* compiled from: Sets */
    public class C4633a extends C4638e<E> {

        /* renamed from: a */
        public final /* synthetic */ Set f25021a;

        /* renamed from: d */
        public final /* synthetic */ Set f25022d;

        /* renamed from: com.google.common.collect.i$a$a */
        /* compiled from: Sets */
        public class C4634a extends AbstractIterator<E> {

            /* renamed from: e */
            public final Iterator<E> f25023e;

            public C4634a() {
                this.f25023e = C4633a.this.f25021a.iterator();
            }

            /* renamed from: a */
            public E mo34338a() {
                while (this.f25023e.hasNext()) {
                    E next = this.f25023e.next();
                    if (C4633a.this.f25022d.contains(next)) {
                        return next;
                    }
                }
                return mo34339b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4633a(Set set, Set set2) {
            super((C4631h) null);
            this.f25021a = set;
            this.f25022d = set2;
        }

        public boolean contains(Object obj) {
            if (!this.f25021a.contains(obj) || !this.f25022d.contains(obj)) {
                return false;
            }
            return true;
        }

        public boolean containsAll(Collection<?> collection) {
            if (!this.f25021a.containsAll(collection) || !this.f25022d.containsAll(collection)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public c47<E> iterator() {
            return new C4634a();
        }

        public boolean isEmpty() {
            return Collections.disjoint(this.f25022d, this.f25021a);
        }

        public int size() {
            int i = 0;
            for (Object contains : this.f25021a) {
                if (this.f25022d.contains(contains)) {
                    i++;
                }
            }
            return i;
        }
    }

    /* renamed from: com.google.common.collect.i$b */
    /* compiled from: Sets */
    public static class C4635b<E> extends C4621c.C4622a<E> implements Set<E> {
        public C4635b(Set<E> set, ku4<? super E> ku4) {
            super(set, ku4);
        }

        public boolean equals(Object obj) {
            return C4632i.m37030a(this, obj);
        }

        public int hashCode() {
            return C4632i.m37033d(this);
        }
    }

    /* renamed from: com.google.common.collect.i$c */
    /* compiled from: Sets */
    public static class C4636c<E> extends C4635b<E> implements SortedSet<E> {
        public C4636c(SortedSet<E> sortedSet, ku4<? super E> ku4) {
            super(sortedSet, ku4);
        }

        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f25007a).comparator();
        }

        public E first() {
            return Iterators.m36773j(this.f25007a.iterator(), this.f25008d);
        }

        public SortedSet<E> headSet(E e) {
            return new C4636c(((SortedSet) this.f25007a).headSet(e), this.f25008d);
        }

        public E last() {
            SortedSet sortedSet = (SortedSet) this.f25007a;
            while (true) {
                E last = sortedSet.last();
                if (this.f25008d.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public SortedSet<E> subSet(E e, E e2) {
            return new C4636c(((SortedSet) this.f25007a).subSet(e, e2), this.f25008d);
        }

        public SortedSet<E> tailSet(E e) {
            return new C4636c(((SortedSet) this.f25007a).tailSet(e), this.f25008d);
        }
    }

    /* renamed from: com.google.common.collect.i$d */
    /* compiled from: Sets */
    public static abstract class C4637d<E> extends AbstractSet<E> {
        public boolean removeAll(Collection<?> collection) {
            return C4632i.m37038i(this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) du4.m43691k(collection));
        }
    }

    /* renamed from: com.google.common.collect.i$e */
    /* compiled from: Sets */
    public static abstract class C4638e<E> extends AbstractSet<E> {
        public /* synthetic */ C4638e(C4631h hVar) {
            this();
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

        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

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

        public C4638e() {
        }
    }

    /* renamed from: a */
    public static boolean m37030a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <E> Set<E> m37031b(Set<E> set, ku4<? super E> ku4) {
        if (set instanceof SortedSet) {
            return m37032c((SortedSet) set, ku4);
        }
        if (!(set instanceof C4635b)) {
            return new C4635b((Set) du4.m43691k(set), (ku4) du4.m43691k(ku4));
        }
        C4635b bVar = (C4635b) set;
        return new C4635b((Set) bVar.f25007a, Predicates.m36521b(bVar.f25008d, ku4));
    }

    /* renamed from: c */
    public static <E> SortedSet<E> m37032c(SortedSet<E> sortedSet, ku4<? super E> ku4) {
        if (!(sortedSet instanceof C4635b)) {
            return new C4636c((SortedSet) du4.m43691k(sortedSet), (ku4) du4.m43691k(ku4));
        }
        C4635b bVar = (C4635b) sortedSet;
        return new C4636c((SortedSet) bVar.f25007a, Predicates.m36521b(bVar.f25008d, ku4));
    }

    /* renamed from: d */
    public static int m37033d(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    /* renamed from: e */
    public static <E> C4638e<E> m37034e(Set<E> set, Set<?> set2) {
        du4.m43692l(set, "set1");
        du4.m43692l(set2, "set2");
        return new C4633a(set, set2);
    }

    /* renamed from: f */
    public static <E> HashSet<E> m37035f() {
        return new HashSet<>();
    }

    /* renamed from: g */
    public static <E> HashSet<E> m37036g(int i) {
        return new HashSet<>(Maps.m36920a(i));
    }

    /* renamed from: h */
    public static <E> Set<E> m37037h() {
        return Collections.newSetFromMap(Maps.m36928i());
    }

    /* renamed from: i */
    public static boolean m37038i(Set<?> set, Collection<?> collection) {
        du4.m43691k(collection);
        if (collection instanceof C4623d) {
            collection = ((C4623d) collection).elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m37039j(set, collection.iterator());
        }
        return Iterators.m36778o(set.iterator(), collection);
    }

    /* renamed from: j */
    public static boolean m37039j(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
