package p000;

import java.util.HashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: rs3 */
/* compiled from: MemberScope.kt */
public final class rs3 {
    /* renamed from: a */
    public static final Set<r24> m71677a(Iterable<? extends MemberScope> iterable) {
        vx2.m53591g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (MemberScope g : iterable) {
            Set<r24> g2 = g.mo50866g();
            if (g2 == null) {
                return null;
            }
            hk0.m45275z(hashSet, g2);
        }
        return hashSet;
    }
}
