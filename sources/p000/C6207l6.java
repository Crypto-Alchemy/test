package p000;

import java.util.Map;

/* renamed from: l6 */
/* compiled from: AbstractMapEntry */
public abstract class C6207l6<K, V> implements Map.Entry<K, V> {
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!jf4.m46496a(getKey(), entry.getKey()) || !jf4.m46496a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
