package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* renamed from: c86 */
/* compiled from: StandardClassIds.kt */
public final class c86 {

    /* renamed from: a */
    public static final u82 f37090a;

    /* renamed from: b */
    public static final u82 f37091b;

    static {
        u82 u82 = new u82("java.lang");
        f37090a = u82;
        u82 c = u82.mo66196c(r24.m71445h("annotation"));
        vx2.m53590f(c, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f37091b = c;
    }

    /* renamed from: j */
    public static final nf0 m56350j(String str) {
        return new nf0(b86.f36738a.mo50531b(), r24.m71445h(str));
    }

    /* renamed from: k */
    public static final nf0 m56351k(String str) {
        return new nf0(b86.f36738a.mo50534e(), r24.m71445h(str));
    }

    /* renamed from: l */
    public static final nf0 m56352l(String str) {
        return new nf0(b86.f36738a.mo50532c(), r24.m71445h(str));
    }

    /* renamed from: m */
    public static final nf0 m56353m(String str) {
        return new nf0(b86.f36738a.mo50533d(), r24.m71445h(str));
    }

    /* renamed from: n */
    public static final <K, V> Map<V, K> m56354n(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair a = wy6.m54142a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a.getFirst(), a.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: o */
    public static final nf0 m56355o(r24 r24) {
        b86 b86 = b86.f36738a;
        u82 h = b86.mo50530a().mo62678h();
        return new nf0(h, r24.m71445h(r24.mo65597f() + b86.mo50530a().mo62681j().mo65597f()));
    }

    /* renamed from: p */
    public static final nf0 m56356p(String str) {
        return new nf0(b86.f36738a.mo50535f(), r24.m71445h(str));
    }

    /* renamed from: q */
    public static final nf0 m56357q(String str) {
        return new nf0(b86.f36738a.mo50536g(), r24.m71445h(str));
    }

    /* renamed from: r */
    public static final nf0 m56358r(nf0 nf0) {
        u82 e = b86.f36738a.mo50534e();
        return new nf0(e, r24.m71445h('U' + nf0.mo62681j().mo65597f()));
    }
}
