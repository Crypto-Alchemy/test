package java8.util;

import java.util.Iterator;

/* renamed from: java8.util.a */
/* compiled from: Iterators */
public final class C6034a {

    /* renamed from: java8.util.a$a */
    /* compiled from: Iterators */
    public static abstract class C6035a<T> implements Iterator<T> {
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* renamed from: a */
    public static <E> void m46204a(Iterator<E> it, xq0<? super E> xq0) {
        kf4.m47057e(it);
        kf4.m47057e(xq0);
        while (it.hasNext()) {
            xq0.accept(it.next());
        }
    }
}
