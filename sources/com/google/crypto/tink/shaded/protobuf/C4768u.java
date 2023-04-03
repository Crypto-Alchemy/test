package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* compiled from: LazyField */
public class C4768u extends C4772v {

    /* renamed from: f */
    public final C4705c0 f25297f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$b */
    /* compiled from: LazyField */
    public static class C4770b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C4768u> f25298a;

        /* renamed from: a */
        public C4768u mo36045a() {
            return this.f25298a.getValue();
        }

        public K getKey() {
            return this.f25298a.getKey();
        }

        public Object getValue() {
            C4768u value = this.f25298a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo36042f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C4705c0) {
                return this.f25298a.getValue().mo36056d((C4705c0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C4770b(Map.Entry<K, C4768u> entry) {
            this.f25298a = entry;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$c */
    /* compiled from: LazyField */
    public static class C4771c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f25299a;

        public C4771c(Iterator<Map.Entry<K, Object>> it) {
            this.f25299a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f25299a.next();
            if (next.getValue() instanceof C4768u) {
                return new C4770b(next);
            }
            return next;
        }

        public boolean hasNext() {
            return this.f25299a.hasNext();
        }

        public void remove() {
            this.f25299a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo36042f().equals(obj);
    }

    /* renamed from: f */
    public C4705c0 mo36042f() {
        return mo36055c(this.f25297f);
    }

    public int hashCode() {
        return mo36042f().hashCode();
    }

    public String toString() {
        return mo36042f().toString();
    }
}
