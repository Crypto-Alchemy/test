package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.f */
/* compiled from: Platform */
public final class C4627f {
    /* renamed from: a */
    public static <T> T[] m37017a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    public static <T> T[] m37018b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m37019c(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    /* renamed from: d */
    public static <E> Set<E> m37020d() {
        return CompactHashSet.create();
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m37021e() {
        return CompactHashMap.create();
    }

    /* renamed from: f */
    public static MapMaker m37022f(MapMaker mapMaker) {
        return mapMaker.mo34858l();
    }
}
