package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;

/* compiled from: overridingUtils.kt */
public final class OverridingUtilsKt {
    /* renamed from: a */
    public static final <H> Collection<H> m62408a(Collection<? extends H> collection, rc2<? super H, ? extends C7420a> rc2) {
        vx2.m53591g(collection, "<this>");
        vx2.m53591g(rc2, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        w46 a = w46.f45438e.mo66631a();
        while (!linkedList.isEmpty()) {
            Object Z = CollectionsKt___CollectionsKt.m47329Z(linkedList);
            w46 a2 = w46.f45438e.mo66631a();
            Collection<H> p = OverridingUtil.m62379p(Z, linkedList, rc2, new C7660x410e6287(a2));
            vx2.m53590f(p, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (p.size() != 1 || !a2.isEmpty()) {
                Object L = OverridingUtil.m62365L(p, rc2);
                vx2.m53590f(L, "selectMostSpecificMember…roup, descriptorByHandle)");
                C7420a aVar = (C7420a) rc2.invoke(L);
                for (T next : p) {
                    vx2.m53590f(next, "it");
                    if (!OverridingUtil.m62358B(aVar, (C7420a) rc2.invoke(next))) {
                        a2.add(next);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
                a.add(L);
            } else {
                Object y0 = CollectionsKt___CollectionsKt.m47354y0(p);
                vx2.m53590f(y0, "overridableGroup.single()");
                a.add(y0);
            }
        }
        return a;
    }
}
