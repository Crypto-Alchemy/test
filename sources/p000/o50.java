package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: o50 */
/* compiled from: BuiltinSpecialProperties.kt */
public final class o50 {

    /* renamed from: a */
    public static final o50 f43586a = new o50();

    /* renamed from: b */
    public static final Map<u82, r24> f43587b;

    /* renamed from: c */
    public static final Map<r24, List<r24>> f43588c;

    /* renamed from: d */
    public static final Set<u82> f43589d;

    /* renamed from: e */
    public static final Set<r24> f43590e;

    static {
        v82 v82 = C7395c.C7396a.f39192s;
        u82 u82 = C7395c.C7396a.f39154Y;
        Map<u82, r24> l = C6177b.m47364l(wy6.m54142a(p50.m70926d(v82, PublicResolver.FUNC_NAME), r24.m71445h(PublicResolver.FUNC_NAME)), wy6.m54142a(p50.m70926d(v82, "ordinal"), r24.m71445h("ordinal")), wy6.m54142a(p50.m70925c(C7395c.C7396a.f39150U, "size"), r24.m71445h("size")), wy6.m54142a(p50.m70925c(u82, "size"), r24.m71445h("size")), wy6.m54142a(p50.m70926d(C7395c.C7396a.f39168g, "length"), r24.m71445h("length")), wy6.m54142a(p50.m70925c(u82, "keys"), r24.m71445h("keySet")), wy6.m54142a(p50.m70925c(u82, "values"), r24.m71445h("values")), wy6.m54142a(p50.m70925c(u82, "entries"), r24.m71445h("entrySet")));
        f43587b = l;
        Set<Map.Entry<u82, r24>> entrySet = l.entrySet();
        ArrayList<Pair> arrayList = new ArrayList<>(dk0.m43495u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((u82) entry.getKey()).mo66201g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            r24 r24 = (r24) pair.getSecond();
            Object obj = linkedHashMap.get(r24);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(r24, obj);
            }
            ((List) obj).add((r24) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ao3.m31893e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt___CollectionsKt.m47322S((Iterable) entry2.getValue()));
        }
        f43588c = linkedHashMap2;
        Set<u82> keySet = f43587b.keySet();
        f43589d = keySet;
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(keySet, 10));
        for (u82 g : keySet) {
            arrayList2.add(g.mo66201g());
        }
        f43590e = CollectionsKt___CollectionsKt.m47315O0(arrayList2);
    }

    /* renamed from: a */
    public final Map<u82, r24> mo62833a() {
        return f43587b;
    }

    /* renamed from: b */
    public final List<r24> mo62834b(r24 r24) {
        vx2.m53591g(r24, "name1");
        List<r24> list = f43588c.get(r24);
        if (list == null) {
            return ck0.m33062j();
        }
        return list;
    }

    /* renamed from: c */
    public final Set<u82> mo62835c() {
        return f43589d;
    }

    /* renamed from: d */
    public final Set<r24> mo62836d() {
        return f43590e;
    }
}
