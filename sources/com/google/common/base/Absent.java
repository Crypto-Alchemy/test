package com.google.common.base;

import java.util.Collections;
import java.util.Set;

final class Absent<T> extends Optional<T> {
    public static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    private Absent() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    public Set<T> asSet() {
        return Collections.emptySet();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    /* renamed from: or */
    public T mo34300or(T t) {
        return du4.m43692l(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public <V> Optional<V> transform(hd2<? super T, V> hd2) {
        du4.m43691k(hd2);
        return Optional.absent();
    }

    /* renamed from: or */
    public Optional<T> mo34299or(Optional<? extends T> optional) {
        return (Optional) du4.m43691k(optional);
    }

    /* renamed from: or */
    public T mo34301or(rd6<? extends T> rd6) {
        return du4.m43692l(rd6.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
