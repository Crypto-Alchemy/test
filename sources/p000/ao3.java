package p000;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001a \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u001a(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001\u001a4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0001\u001a@\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\r\u001a2\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0001¨\u0006\u0014"}, mo44877d2 = {"K", "V", "Lkotlin/Pair;", "pair", "", "f", "", "c", "", "capacity", "d", "builder", "b", "Ljava/util/Comparator;", "comparator", "Ljava/util/SortedMap;", "h", "g", "expectedSize", "e", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/MapsKt")
/* renamed from: ao3 */
/* compiled from: MapsJVM.kt */
public class ao3 extends zn3 {
    /* renamed from: b */
    public static final <K, V> Map<K, V> m31890b(Map<K, V> map) {
        vx2.m53591g(map, "builder");
        return ((MapBuilder) map).build();
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m31891c() {
        return new MapBuilder();
    }

    /* renamed from: d */
    public static final <K, V> Map<K, V> m31892d(int i) {
        return new MapBuilder(i);
    }

    /* renamed from: e */
    public static final int m31893e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f */
    public static final <K, V> Map<K, V> m31894f(Pair<? extends K, ? extends V> pair) {
        vx2.m53591g(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        vx2.m53590f(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: g */
    public static final <K, V> Map<K, V> m31895g(Map<? extends K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        vx2.m53590f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: h */
    public static final <K, V> SortedMap<K, V> m31896h(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        vx2.m53591g(map, "<this>");
        vx2.m53591g(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
