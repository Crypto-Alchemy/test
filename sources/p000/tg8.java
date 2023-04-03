package p000;

import java.util.Map;

/* renamed from: tg8 */
public final class tg8<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    public Map.Entry<K, pg8> f34260a;

    public tg8(Map.Entry<K, pg8> entry) {
        this.f34260a = entry;
    }

    /* renamed from: a */
    public final pg8 mo48108a() {
        return this.f34260a.getValue();
    }

    public final K getKey() {
        return this.f34260a.getKey();
    }

    public final Object getValue() {
        if (this.f34260a.getValue() == null) {
            return null;
        }
        return pg8.m49949e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof tj8) {
            return this.f34260a.getValue().mo49481c((tj8) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
