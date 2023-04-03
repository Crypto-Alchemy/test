package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\u001a6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001a6\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\t"}, mo44877d2 = {"K", "V", "", "", "Lkotlin/Pair;", "w", "Lhw5;", "", "v", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/collections/MapsKt")
/* renamed from: co3 */
/* compiled from: _Maps.kt */
public class co3 extends bo3 {
    /* renamed from: v */
    public static final <K, V> hw5<Map.Entry<K, V>> m33133v(Map<? extends K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        return CollectionsKt___CollectionsKt.m47318Q(map.entrySet());
    }

    /* renamed from: w */
    public static final <K, V> List<Pair<K, V>> m33134w(Map<? extends K, ? extends V> map) {
        vx2.m53591g(map, "<this>");
        if (map.size() == 0) {
            return ck0.m33062j();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ck0.m33062j();
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return bk0.m32598e(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
