package com.google.common.collect;

import java.io.Serializable;

final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final hd2<F, ? extends T> function;
    public final Ordering<T> ordering;

    public ByFunctionOrdering(hd2<F, ? extends T> hd2, Ordering<T> ordering2) {
        this.function = (hd2) du4.m43691k(hd2);
        this.ordering = (Ordering) du4.m43691k(ordering2);
    }

    public int compare(F f, F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        if (!this.function.equals(byFunctionOrdering.function) || !this.ordering.equals(byFunctionOrdering.ordering)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return jf4.m46497b(this.function, this.ordering);
    }

    public String toString() {
        String valueOf = String.valueOf(this.ordering);
        String valueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
