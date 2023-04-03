package p000;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/MapsKt")
/* renamed from: zn3 */
/* compiled from: MapWithDefault.kt */
public class zn3 {
    /* renamed from: a */
    public static final <K, V> V m55157a(Map<K, ? extends V> map, K k) {
        vx2.m53591g(map, "<this>");
        if (map instanceof un3) {
            return ((un3) map).mo48414o(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
