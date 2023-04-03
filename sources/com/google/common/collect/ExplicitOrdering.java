package com.google.common.collect;

import com.google.common.collect.Ordering;
import java.io.Serializable;
import java.util.List;

final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final ImmutableMap<T, Integer> rankMap;

    public ExplicitOrdering(List<T> list) {
        this(Maps.m36925f(list));
    }

    /* renamed from: a */
    public final int mo34641a(T t) {
        Integer num = this.rankMap.get(t);
        if (num != null) {
            return num.intValue();
        }
        throw new Ordering.IncomparableValueException(t);
    }

    public int compare(T t, T t2) {
        return mo34641a(t) - mo34641a(t2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExplicitOrdering) {
            return this.rankMap.equals(((ExplicitOrdering) obj).rankMap);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.rankMap.keySet());
        StringBuilder sb = new StringBuilder(valueOf.length() + 19);
        sb.append("Ordering.explicit(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public ExplicitOrdering(ImmutableMap<T, Integer> immutableMap) {
        this.rankMap = immutableMap;
    }
}
