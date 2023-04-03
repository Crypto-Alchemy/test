package p000;

import java.util.Map;

/* renamed from: kb3 */
/* compiled from: KeyValueHolder */
public final class kb3<K, V> implements Map.Entry<K, V> {

    /* renamed from: a */
    public final K f30795a;

    /* renamed from: d */
    public final V f30796d;

    public kb3(K k, V v) {
        this.f30795a = kf4.m47057e(k);
        this.f30796d = kf4.m47057e(v);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!this.f30795a.equals(entry.getKey()) || !this.f30796d.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public K getKey() {
        return this.f30795a;
    }

    public V getValue() {
        return this.f30796d;
    }

    public int hashCode() {
        return this.f30795a.hashCode() ^ this.f30796d.hashCode();
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException("not supported");
    }

    public String toString() {
        return this.f30795a + "=" + this.f30796d;
    }
}
