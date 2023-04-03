package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u000e\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aa\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00102\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0015\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u00102\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0014\u001a4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0014\u001aQ\u0010\u0019\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0017*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0010*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00142\u0006\u0010\u0018\u001a\u00028\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aS\u0010\u001b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0017*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\u0010*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u0006\u0010\u0018\u001a\u00028\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a2\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a2\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aI\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010\u001f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0002\u001a0\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¨\u0006\""}, mo44877d2 = {"K", "V", "", "i", "", "Lkotlin/Pair;", "pairs", "l", "([Lkotlin/Pair;)Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "k", "([Lkotlin/Pair;)Ljava/util/HashMap;", "key", "j", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lr37;", "p", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "o", "q", "M", "destination", "r", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "t", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "s", "u", "map", "n", "m", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/MapsKt")
/* renamed from: kotlin.collections.b */
/* compiled from: Maps.kt */
public class C6177b extends ao3 {
    /* renamed from: i */
    public static final <K, V> Map<K, V> m47361i() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        vx2.m53589e(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* renamed from: j */
    public static final <K, V> V m47362j(Map<K, ? extends V> map, K k) {
        vx2.m53591g(map, "<this>");
        return zn3.m55157a(map, k);
    }

    /* renamed from: k */
    public static final <K, V> HashMap<K, V> m47363k(Pair<? extends K, ? extends V>... pairArr) {
        vx2.m53591g(pairArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(ao3.m31893e(pairArr.length));
        m47368p(hashMap, pairArr);
        return hashMap;
    }

    /* renamed from: l */
    public static final <K, V> Map<K, V> m47364l(Pair<? extends K, ? extends V>... pairArr) {
        vx2.m53591g(pairArr, "pairs");
        if (pairArr.length > 0) {
            return m47372t(pairArr, new LinkedHashMap(ao3.m31893e(pairArr.length)));
        }
        return m47361i();
    }

    /* renamed from: m */
    public static final <K, V> Map<K, V> m47365m(Map<K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m47361i();
        }
        if (size != 1) {
            return map;
        }
        return ao3.m31895g(map);
    }

    /* renamed from: n */
    public static final <K, V> Map<K, V> m47366n(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        vx2.m53591g(map, "<this>");
        vx2.m53591g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static final <K, V> void m47367o(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        vx2.m53591g(map, "<this>");
        vx2.m53591g(iterable, "pairs");
        for (Pair pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: p */
    public static final <K, V> void m47368p(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        vx2.m53591g(map, "<this>");
        vx2.m53591g(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.component1(), pair.component2());
        }
    }

    /* renamed from: q */
    public static final <K, V> Map<K, V> m47369q(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Object obj;
        vx2.m53591g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m47365m(m47370r(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m47361i();
        }
        if (size != 1) {
            return m47370r(iterable, new LinkedHashMap(ao3.m31893e(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return ao3.m31894f((Pair) obj);
    }

    /* renamed from: r */
    public static final <K, V, M extends Map<? super K, ? super V>> M m47370r(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        vx2.m53591g(iterable, "<this>");
        vx2.m53591g(m, "destination");
        m47367o(m, iterable);
        return m;
    }

    /* renamed from: s */
    public static final <K, V> Map<K, V> m47371s(Map<? extends K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m47361i();
        }
        if (size != 1) {
            return m47373u(map);
        }
        return ao3.m31895g(map);
    }

    /* renamed from: t */
    public static final <K, V, M extends Map<? super K, ? super V>> M m47372t(Pair<? extends K, ? extends V>[] pairArr, M m) {
        vx2.m53591g(pairArr, "<this>");
        vx2.m53591g(m, "destination");
        m47368p(m, pairArr);
        return m;
    }

    /* renamed from: u */
    public static final <K, V> Map<K, V> m47373u(Map<? extends K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
