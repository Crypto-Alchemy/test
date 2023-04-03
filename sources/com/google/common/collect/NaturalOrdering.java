package com.google.common.collect;

import java.io.Serializable;

final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {
    public static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public transient Ordering<Comparable<?>> f24973a;

    /* renamed from: d */
    public transient Ordering<Comparable<?>> f24974d;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public <S extends Comparable<?>> Ordering<S> nullsFirst() {
        Ordering<Comparable<?>> ordering = this.f24973a;
        if (ordering != null) {
            return ordering;
        }
        Ordering<Comparable<?>> nullsFirst = super.nullsFirst();
        this.f24973a = nullsFirst;
        return nullsFirst;
    }

    public <S extends Comparable<?>> Ordering<S> nullsLast() {
        Ordering<Comparable<?>> ordering = this.f24974d;
        if (ordering != null) {
            return ordering;
        }
        Ordering<Comparable<?>> nullsLast = super.nullsLast();
        this.f24974d = nullsLast;
        return nullsLast;
    }

    public <S extends Comparable<?>> Ordering<S> reverse() {
        return ReverseNaturalOrdering.INSTANCE;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        du4.m43691k(comparable);
        du4.m43691k(comparable2);
        return comparable.compareTo(comparable2);
    }
}
