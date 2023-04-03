package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cd3 */
/* compiled from: KotlinTypeRefiner.kt */
public final class cd3 {

    /* renamed from: a */
    public static final hx3<i95<k17>> f37105a = new hx3<>("KotlinTypeRefiner");

    /* renamed from: a */
    public static final hx3<i95<k17>> m56381a() {
        return f37105a;
    }

    /* renamed from: b */
    public static final List<xc3> m56382b(bd3 bd3, Iterable<? extends xc3> iterable) {
        vx2.m53591g(bd3, "<this>");
        vx2.m53591g(iterable, "types");
        ArrayList arrayList = new ArrayList(dk0.m43495u(iterable, 10));
        for (xc3 h : iterable) {
            arrayList.add(bd3.mo50562h(h));
        }
        return arrayList;
    }
}
