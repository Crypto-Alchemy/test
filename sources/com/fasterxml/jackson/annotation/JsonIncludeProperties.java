package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIncludeProperties {

    public static class Value implements Serializable {
        public static final Value ALL = new Value((Set<String>) null);
        private static final long serialVersionUID = 1;
        public final Set<String> _included;

        public Value(Set<String> set) {
            this._included = set;
        }

        /* renamed from: a */
        public static Set<String> m13771a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String add : strArr) {
                hashSet.add(add);
            }
            return hashSet;
        }

        public static Value all() {
            return ALL;
        }

        /* renamed from: b */
        public static boolean m13772b(Set<String> set, Set<String> set2) {
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
            return false;
        }

        public static Value from(JsonIncludeProperties jsonIncludeProperties) {
            if (jsonIncludeProperties == null) {
                return ALL;
            }
            return new Value(m13771a(jsonIncludeProperties.value()));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() != getClass() || !m13772b(this._included, ((Value) obj)._included)) {
                return false;
            }
            return true;
        }

        public Set<String> getIncluded() {
            return this._included;
        }

        public int hashCode() {
            Set<String> set = this._included;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", new Object[]{this._included});
        }

        public Class<JsonIncludeProperties> valueFor() {
            return JsonIncludeProperties.class;
        }

        public Value withOverrides(Value value) {
            Set<String> included;
            if (value == null || (included = value.getIncluded()) == null) {
                return this;
            }
            if (this._included == null) {
                return value;
            }
            HashSet hashSet = new HashSet();
            for (String next : included) {
                if (this._included.contains(next)) {
                    hashSet.add(next);
                }
            }
            return new Value(hashSet);
        }
    }

    String[] value() default {};
}
