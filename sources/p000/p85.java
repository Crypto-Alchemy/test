package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\t\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000f"}, mo44877d2 = {"K", "V", "", "", "key", "value", "", "a", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "b", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/Object;", "ProduceAnotherFrame", "FramePending", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: p85 */
/* compiled from: Recomposer.kt */
public final class p85 {

    /* renamed from: a */
    public static final Object f16354a = new Object();

    /* renamed from: b */
    public static final Object f16355b = new Object();

    /* renamed from: a */
    public static final <K, V> boolean m24752a(Map<K, List<V>> map, K k, V v) {
        vx2.m53591g(map, "<this>");
        List<V> list = map.get(k);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k, list);
        }
        return list.add(v);
    }

    /* renamed from: b */
    public static final <K, V> V m24753b(Map<K, List<V>> map, K k) {
        vx2.m53591g(map, "<this>");
        List list = map.get(k);
        if (list == null) {
            return null;
        }
        V F = hk0.m45271F(list);
        if (!list.isEmpty()) {
            return F;
        }
        map.remove(k);
        return F;
    }
}
