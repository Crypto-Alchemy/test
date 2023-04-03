package com.google.common.base;

import java.io.Serializable;

final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final hd2<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    public FunctionalEquivalence(hd2<? super F, ? extends T> hd2, Equivalence<T> equivalence) {
        this.function = (hd2) du4.m43691k(hd2);
        this.resultEquivalence = (Equivalence) du4.m43691k(equivalence);
    }

    public boolean doEquivalent(F f, F f2) {
        return this.resultEquivalence.equivalent(this.function.apply(f), this.function.apply(f2));
    }

    public int doHash(F f) {
        return this.resultEquivalence.hash(this.function.apply(f));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
        if (!this.function.equals(functionalEquivalence.function) || !this.resultEquivalence.equals(functionalEquivalence.resultEquivalence)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return jf4.m46497b(this.function, this.resultEquivalence);
    }

    public String toString() {
        String valueOf = String.valueOf(this.resultEquivalence);
        String valueOf2 = String.valueOf(this.function);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
