package com.google.common.base;

import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;

public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements ku4<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        public EquivalentToPredicate(Equivalence<T> equivalence2, T t) {
            this.equivalence = (Equivalence) du4.m43691k(equivalence2);
            this.target = t;
        }

        public boolean apply(T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            if (!this.equivalence.equals(equivalentToPredicate.equivalence) || !jf4.m46496a(this.target, equivalentToPredicate.target)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return jf4.m46497b(this.equivalence, this.target);
        }

        public String toString() {
            String valueOf = String.valueOf(this.equivalence);
            String valueOf2 = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(valueOf.length() + 15 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".equivalentTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        private final T reference;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            String valueOf = String.valueOf(this.equivalence);
            String valueOf2 = String.valueOf(this.reference);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".wrap(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }

        public Wrapper(Equivalence<? super T> equivalence2, T t) {
            this.equivalence = (Equivalence) du4.m43691k(equivalence2);
            this.reference = t;
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    @ForOverride
    public abstract boolean doEquivalent(T t, T t2);

    @ForOverride
    public abstract int doHash(T t);

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final ku4<T> equivalentTo(T t) {
        return new EquivalentToPredicate(this, t);
    }

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> Equivalence<F> onResultOf(hd2<? super F, ? extends T> hd2) {
        return new FunctionalEquivalence(hd2, this);
    }

    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(S s) {
        return new Wrapper<>(s);
    }
}
