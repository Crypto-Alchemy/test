package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6177b;

/* renamed from: xy1 */
/* compiled from: FakePureImplementationsProvider.kt */
public final class xy1 {

    /* renamed from: a */
    public static final xy1 f46060a;

    /* renamed from: b */
    public static final Map<nf0, nf0> f46061b;

    /* renamed from: c */
    public static final Map<u82, u82> f46062c;

    static {
        xy1 xy1 = new xy1();
        f46060a = xy1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f46061b = linkedHashMap;
        b86 b86 = b86.f36738a;
        xy1.mo66983c(b86.mo50539j(), xy1.mo66981a("java.util.ArrayList", "java.util.LinkedList"));
        xy1.mo66983c(b86.mo50541l(), xy1.mo66981a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        xy1.mo66983c(b86.mo50540k(), xy1.mo66981a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        nf0 m = nf0.m69751m(new u82("java.util.function.Function"));
        vx2.m53590f(m, "topLevel(FqName(\"java.util.function.Function\"))");
        xy1.mo66983c(m, xy1.mo66981a("java.util.function.UnaryOperator"));
        nf0 m2 = nf0.m69751m(new u82("java.util.function.BiFunction"));
        vx2.m53590f(m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        xy1.mo66983c(m2, xy1.mo66981a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(wy6.m54142a(((nf0) entry.getKey()).mo62673b(), ((nf0) entry.getValue()).mo62673b()));
        }
        f46062c = C6177b.m47369q(arrayList);
    }

    /* renamed from: a */
    public final List<nf0> mo66981a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String u82 : strArr) {
            arrayList.add(nf0.m69751m(new u82(u82)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final u82 mo66982b(u82 u82) {
        vx2.m53591g(u82, "classFqName");
        return f46062c.get(u82);
    }

    /* renamed from: c */
    public final void mo66983c(nf0 nf0, List<nf0> list) {
        Map<nf0, nf0> map = f46061b;
        for (T next : list) {
            nf0 nf02 = (nf0) next;
            map.put(next, nf0);
        }
    }
}
