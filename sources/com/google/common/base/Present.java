package com.google.common.base;

import java.util.Collections;
import java.util.Set;

final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    public Present(T t) {
        this.reference = t;
    }

    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    public T get() {
        return this.reference;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    /* renamed from: or */
    public T mo34300or(T t) {
        du4.m43692l(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    public T orNull() {
        return this.reference;
    }

    public String toString() {
        String valueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public <V> Optional<V> transform(hd2<? super T, V> hd2) {
        return new Present(du4.m43692l(hd2.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    /* renamed from: or */
    public Optional<T> mo34299or(Optional<? extends T> optional) {
        du4.m43691k(optional);
        return this;
    }

    /* renamed from: or */
    public T mo34301or(rd6<? extends T> rd6) {
        du4.m43691k(rd6);
        return this.reference;
    }
}
