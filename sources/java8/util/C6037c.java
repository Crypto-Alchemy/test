package java8.util;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java8.util.ImmutableCollections;

/* renamed from: java8.util.c */
/* compiled from: Maps */
public final class C6037c {
    /* renamed from: a */
    public static <K, V> Map<K, V> m46206a(Map.Entry<? extends K, ? extends V>... entryArr) {
        if (entryArr.length == 0) {
            return ImmutableCollections.m46192c();
        }
        if (entryArr.length == 1) {
            return new ImmutableCollections.Map1(entryArr[0].getKey(), entryArr[0].getValue());
        }
        Object[] objArr = new Object[(entryArr.length << 1)];
        int i = 0;
        for (Map.Entry<? extends K, ? extends V> entry : entryArr) {
            int i2 = i + 1;
            objArr[i] = entry.getKey();
            i = i2 + 1;
            objArr[i2] = entry.getValue();
        }
        return new ImmutableCollections.MapN(objArr);
    }

    /* renamed from: b */
    public static <K, V> V m46207b(Map<K, V> map, K k, V v) {
        kf4.m47057e(map);
        if (map instanceof ConcurrentMap) {
            return ((ConcurrentMap) map).putIfAbsent(k, v);
        }
        V v2 = map.get(k);
        if (v2 == null) {
            return map.put(k, v);
        }
        return v2;
    }
}
