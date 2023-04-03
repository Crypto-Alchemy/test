package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: on5 */
/* compiled from: scopeUtils.kt */
public final class on5 {
    /* renamed from: a */
    public static final <T> Collection<T> m70416a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        vx2.m53591g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final v46<MemberScope> m70417b(Iterable<? extends MemberScope> iterable) {
        boolean z;
        vx2.m53591g(iterable, "scopes");
        v46<MemberScope> v46 = new v46<>();
        for (Object next : iterable) {
            MemberScope memberScope = (MemberScope) next;
            if (memberScope == null || memberScope == MemberScope.C7667a.f40117b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                v46.add(next);
            }
        }
        return v46;
    }
}
