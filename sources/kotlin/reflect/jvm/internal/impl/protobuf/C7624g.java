package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* compiled from: LazyField */
public class C7624g extends kf3 {

    /* renamed from: e */
    public final C7628h f39967e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    /* compiled from: LazyField */
    public static class C7626b<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C7624g> f39968a;

        public K getKey() {
            return this.f39968a.getKey();
        }

        public Object getValue() {
            C7624g value = this.f39968a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo54753e();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C7628h) {
                return this.f39968a.getValue().mo52900d((C7628h) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C7626b(Map.Entry<K, C7624g> entry) {
            this.f39968a = entry;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$c */
    /* compiled from: LazyField */
    public static class C7627c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f39969a;

        public C7627c(Iterator<Map.Entry<K, Object>> it) {
            this.f39969a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f39969a.next();
            if (next.getValue() instanceof C7624g) {
                return new C7626b(next);
            }
            return next;
        }

        public boolean hasNext() {
            return this.f39969a.hasNext();
        }

        public void remove() {
            this.f39969a.remove();
        }
    }

    /* renamed from: e */
    public C7628h mo54753e() {
        return mo52899c(this.f39967e);
    }

    public boolean equals(Object obj) {
        return mo54753e().equals(obj);
    }

    public int hashCode() {
        return mo54753e().hashCode();
    }

    public String toString() {
        return mo54753e().toString();
    }
}
