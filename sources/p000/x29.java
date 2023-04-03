package p000;

import java.util.Map;

/* renamed from: x29 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class x29<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    public Map.Entry<K, r29> f35500a;

    public x29(Map.Entry<K, r29> entry) {
        this.f35500a = entry;
    }

    /* renamed from: a */
    public final r29 mo49341a() {
        return this.f35500a.getValue();
    }

    public final K getKey() {
        return this.f35500a.getKey();
    }

    public final Object getValue() {
        if (this.f35500a.getValue() == null) {
            return null;
        }
        return r29.m50933e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof k59) {
            return this.f35500a.getValue().mo41817a((k59) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
