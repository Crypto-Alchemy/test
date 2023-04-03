package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public final class Predicates {

    public static class AndPredicate<T> implements ku4<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends ku4<? super T>> components;

        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((ku4) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.m36523d("and", this.components);
        }

        public AndPredicate(List<? extends ku4<? super T>> list) {
            this.components = list;
        }
    }

    /* renamed from: b */
    public static <T> ku4<T> m36521b(ku4<? super T> ku4, ku4<? super T> ku42) {
        return new AndPredicate(m36522c((ku4) du4.m43691k(ku4), (ku4) du4.m43691k(ku42)));
    }

    /* renamed from: c */
    public static <T> List<ku4<? super T>> m36522c(ku4<? super T> ku4, ku4<? super T> ku42) {
        return Arrays.asList(new ku4[]{ku4, ku42});
    }

    /* renamed from: d */
    public static String m36523d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
