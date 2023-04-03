package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Iterators {

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            ki0.m47102d(false);
        }
    }

    /* renamed from: com.google.common.collect.Iterators$a */
    public class C4554a extends AbstractIterator<T> {

        /* renamed from: e */
        public final /* synthetic */ Iterator f24911e;

        /* renamed from: g */
        public final /* synthetic */ ku4 f24912g;

        public C4554a(Iterator it, ku4 ku4) {
            this.f24911e = it;
            this.f24912g = ku4;
        }

        /* renamed from: a */
        public T mo34338a() {
            while (this.f24911e.hasNext()) {
                T next = this.f24911e.next();
                if (this.f24912g.apply(next)) {
                    return next;
                }
            }
            return mo34339b();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$b */
    public class C4555b extends c47<T> {

        /* renamed from: a */
        public boolean f24913a;

        /* renamed from: d */
        public final /* synthetic */ Object f24914d;

        public C4555b(Object obj) {
            this.f24914d = obj;
        }

        public boolean hasNext() {
            return !this.f24913a;
        }

        public T next() {
            if (!this.f24913a) {
                this.f24913a = true;
                return this.f24914d;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.common.collect.Iterators$c */
    public static final class C4556c<T> extends C5857g6<T> {

        /* renamed from: k */
        public static final g47<Object> f24915k = new C4556c(new Object[0], 0, 0, 0);

        /* renamed from: e */
        public final T[] f24916e;

        /* renamed from: g */
        public final int f24917g;

        public C4556c(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f24916e = tArr;
            this.f24917g = i;
        }

        /* renamed from: a */
        public T mo34693a(int i) {
            return this.f24916e[this.f24917g + i];
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> boolean m36764a(Collection<T> collection, Iterator<? extends T> it) {
        du4.m43691k(collection);
        du4.m43691k(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static <T> boolean m36765b(Iterator<T> it, ku4<? super T> ku4) {
        if (m36776m(it, ku4) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m36766c(Iterator<?> it) {
        du4.m43691k(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: d */
    public static boolean m36767d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m36768e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p000.jf4.m46496a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.m36768e(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: f */
    public static <T> c47<T> m36769f() {
        return m36770g();
    }

    /* renamed from: g */
    public static <T> g47<T> m36770g() {
        return C4556c.f24915k;
    }

    /* renamed from: h */
    public static <T> Iterator<T> m36771h() {
        return EmptyModifiableIterator.INSTANCE;
    }

    /* renamed from: i */
    public static <T> c47<T> m36772i(Iterator<T> it, ku4<? super T> ku4) {
        du4.m43691k(it);
        du4.m43691k(ku4);
        return new C4554a(it, ku4);
    }

    /* renamed from: j */
    public static <T> T m36773j(Iterator<T> it, ku4<? super T> ku4) {
        du4.m43691k(it);
        du4.m43691k(ku4);
        while (it.hasNext()) {
            T next = it.next();
            if (ku4.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: k */
    public static <T> T m36774k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: l */
    public static <T> T m36775l(Iterator<? extends T> it, T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    /* renamed from: m */
    public static <T> int m36776m(Iterator<T> it, ku4<? super T> ku4) {
        du4.m43692l(ku4, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (ku4.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: n */
    public static <T> T m36777n(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    /* renamed from: o */
    public static boolean m36778o(Iterator<?> it, Collection<?> collection) {
        du4.m43691k(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    /* renamed from: p */
    public static <T> boolean m36779p(Iterator<T> it, ku4<? super T> ku4) {
        du4.m43691k(ku4);
        boolean z = false;
        while (it.hasNext()) {
            if (ku4.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q */
    public static <T> c47<T> m36780q(T t) {
        return new C4555b(t);
    }
}
