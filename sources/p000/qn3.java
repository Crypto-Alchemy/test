package p000;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0010\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, mo44877d2 = {"Lqn3;", "K", "V", "", "", "hashCode", "", "other", "", "equals", "", "toString", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "d", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qn3 */
/* compiled from: PersistentHashMapContentIterators.kt */
public class qn3<K, V> implements Map.Entry<K, V>, a93 {

    /* renamed from: a */
    public final K f16980a;

    /* renamed from: d */
    public final V f16981d;

    public qn3(K k, V v) {
        this.f16980a = k;
        this.f16981d = v;
    }

    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !vx2.m53586b(entry.getKey(), getKey()) || !vx2.m53586b(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    public K getKey() {
        return this.f16980a;
    }

    public V getValue() {
        return this.f16981d;
    }

    public int hashCode() {
        int i;
        Object key = getKey();
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        Object value = getValue();
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
