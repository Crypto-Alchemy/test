package com.google.common.base;

import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

@DoNotMock("Use Optional.of(value) or Optional.absent()")
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$a */
    public class C4499a implements Iterable<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f24786a;

        /* renamed from: com.google.common.base.Optional$a$a */
        public class C4500a extends AbstractIterator<T> {

            /* renamed from: e */
            public final Iterator<? extends Optional<? extends T>> f24787e;

            public C4500a() {
                this.f24787e = (Iterator) du4.m43691k(C4499a.this.f24786a.iterator());
            }

            /* renamed from: a */
            public T mo34305a() {
                while (this.f24787e.hasNext()) {
                    Optional optional = (Optional) this.f24787e.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return mo34306b();
            }
        }

        public C4499a(Iterable iterable) {
            this.f24786a = iterable;
        }

        public Iterator<T> iterator() {
            return new C4500a();
        }
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> fromNullable(T t) {
        if (t == null) {
            return absent();
        }
        return new Present(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m36515of(T t) {
        return new Present(du4.m43691k(t));
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
        du4.m43691k(iterable);
        return new C4499a(iterable);
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo34299or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo34300or(T t);

    /* renamed from: or */
    public abstract T mo34301or(rd6<? extends T> rd6);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(hd2<? super T, V> hd2);
}
