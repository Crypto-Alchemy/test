package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p000.a07;

/* renamed from: yn3 */
/* compiled from: mappingUtil.kt */
public final class yn3 {
    /* renamed from: a */
    public static final a07 m74479a(if0 if0, if0 if02) {
        vx2.m53591g(if0, "from");
        vx2.m53591g(if02, "to");
        if0.mo51670o().size();
        if02.mo51670o().size();
        a07.C6787a aVar = a07.f36338c;
        List<a17> o = if0.mo51670o();
        vx2.m53590f(o, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(dk0.m43495u(o, 10));
        for (a17 g : o) {
            arrayList.add(g.mo50046g());
        }
        List<a17> o2 = if02.mo51670o();
        vx2.m53590f(o2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(o2, 10));
        for (a17 n : o2) {
            d36 n2 = n.mo51464n();
            vx2.m53590f(n2, "it.defaultType");
            arrayList2.add(TypeUtilsKt.m62945a(n2));
        }
        return a07.C6787a.m55340e(aVar, C6177b.m47369q(CollectionsKt___CollectionsKt.m47321R0(arrayList, arrayList2)), false, 2, (Object) null);
    }
}
