package p000;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: qs3 */
/* compiled from: MemberScopeImpl.kt */
public abstract class qs3 implements MemberScope {
    /* renamed from: a */
    public Set<r24> mo50860a() {
        Collection<d31> f = mo50865f(yc1.f46184v, FunctionsKt.m62992a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : f) {
            if (next instanceof C7428e) {
                r24 name = ((C7428e) next).getName();
                vx2.m53590f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Collection<? extends fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return ck0.m33062j();
    }

    /* renamed from: c */
    public Collection<? extends C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return ck0.m33062j();
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        Collection<d31> f = mo50865f(yc1.f46185w, FunctionsKt.m62992a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : f) {
            if (next instanceof C7428e) {
                r24 name = ((C7428e) next).getName();
                vx2.m53590f(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return null;
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        return ck0.m33062j();
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return null;
    }
}
