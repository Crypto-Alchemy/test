package com.google.protobuf;

import com.google.protobuf.C5011t;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public static final MapFieldLite<?, ?> f25566a;
    private boolean isMutable = true;

    static {
        MapFieldLite<?, ?> mapFieldLite = new MapFieldLite<>();
        f25566a = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    private MapFieldLite() {
    }

    /* renamed from: a */
    public static int m38956a(Object obj) {
        if (obj instanceof byte[]) {
            return C5011t.m39930d((byte[]) obj);
        }
        if (!(obj instanceof C5011t.C5014c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public static void m38957b(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C5011t.m39927a(next);
            C5011t.m39927a(map.get(next));
        }
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m38956a(next.getValue()) ^ m38956a(next.getKey());
        }
        return i;
    }

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), m38958d(next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static Object m38958d(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return f25566a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> boolean equals(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m38959g(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapFieldLite.equals(java.util.Map, java.util.Map):boolean");
    }

    /* renamed from: g */
    public static boolean m38959g(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    public void clear() {
        mo36941f();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* renamed from: f */
    public final void mo36941f() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(MapFieldLite<K, V> mapFieldLite) {
        mo36941f();
        if (!mapFieldLite.isEmpty()) {
            putAll(mapFieldLite);
        }
    }

    public MapFieldLite<K, V> mutableCopy() {
        if (isEmpty()) {
            return new MapFieldLite<>();
        }
        return new MapFieldLite<>(this);
    }

    public V put(K k, V v) {
        mo36941f();
        C5011t.m39927a(k);
        C5011t.m39927a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo36941f();
        m38957b(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        mo36941f();
        return super.remove(obj);
    }

    public MapFieldLite(Map<K, V> map) {
        super(map);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && equals(this, (Map) obj);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
