package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0007\b'\u0018\u0000 $*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001$B\t\b\u0004¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u00020\u00052\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\bJ\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0002R\u0014\u0010\u0019\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, mo44877d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "value", "", "containsValue", "(Ljava/lang/Object;)Z", "", "entry", "b", "(Ljava/util/Map$Entry;)Z", "", "other", "equals", "", "hashCode", "isEmpty", "", "toString", "h", "o", "g", "e", "()I", "size", "", "d", "()Ljava/util/Set;", "keys", "", "f", "()Ljava/util/Collection;", "values", "<init>", "()V", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AbstractMap.kt */
public abstract class AbstractMap<K, V> implements Map<K, V>, a93 {

    /* renamed from: a */
    public static final C6171a f30961a = new C6171a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lkotlin/collections/AbstractMap$a;", "", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.collections.AbstractMap$a */
    /* compiled from: AbstractMap.kt */
    public static final class C6171a {
        public C6171a() {
        }

        public /* synthetic */ C6171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo44921b(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        vx2.m53589e(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!vx2.m53586b(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        vx2.m53589e(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        if (!containsKey(key)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Set mo24008c();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry value : entrySet) {
            if (vx2.m53586b(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public abstract Set<K> mo24010d();

    /* renamed from: e */
    public abstract int mo24011e();

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo24008c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry b : entrySet) {
            if (!mo44921b(b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Collection<V> mo24012f();

    /* renamed from: g */
    public final String mo44926g(Object obj) {
        if (obj == this) {
            return "(this Map)";
        }
        return String.valueOf(obj);
    }

    /* renamed from: h */
    public final String mo44927h(Map.Entry<? extends K, ? extends V> entry) {
        return mo44926g(entry.getKey()) + '=' + mo44926g(entry.getValue());
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final /* bridge */ Set<K> keySet() {
        return mo24010d();
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo24011e();
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.m47338i0(entrySet(), ", ", "{", "}", 0, (CharSequence) null, new AbstractMap$toString$1(this), 24, (Object) null);
    }

    public final /* bridge */ Collection<V> values() {
        return mo24012f();
    }
}
