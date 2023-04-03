package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.u */
/* compiled from: LazyField */
public class C5021u extends C5025v {

    /* renamed from: f */
    public final C4956c0 f25753f;

    /* renamed from: com.google.protobuf.u$b */
    /* compiled from: LazyField */
    public static class C5023b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C5021u> f25754a;

        /* renamed from: a */
        public C5021u mo37531a() {
            return this.f25754a.getValue();
        }

        public K getKey() {
            return this.f25754a.getKey();
        }

        public Object getValue() {
            C5021u value = this.f25754a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo37528f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C4956c0) {
                return this.f25754a.getValue().mo37542d((C4956c0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C5023b(Map.Entry<K, C5021u> entry) {
            this.f25754a = entry;
        }
    }

    /* renamed from: com.google.protobuf.u$c */
    /* compiled from: LazyField */
    public static class C5024c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f25755a;

        public C5024c(Iterator<Map.Entry<K, Object>> it) {
            this.f25755a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f25755a.next();
            if (next.getValue() instanceof C5021u) {
                return new C5023b(next);
            }
            return next;
        }

        public boolean hasNext() {
            return this.f25755a.hasNext();
        }

        public void remove() {
            this.f25755a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo37528f().equals(obj);
    }

    /* renamed from: f */
    public C4956c0 mo37528f() {
        return mo37541c(this.f25753f);
    }

    public int hashCode() {
        return mo37528f().hashCode();
    }

    public String toString() {
        return mo37528f().toString();
    }
}
