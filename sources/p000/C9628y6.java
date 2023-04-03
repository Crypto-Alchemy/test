package p000;

import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: y6 */
/* compiled from: AbstractScopeAdapter.kt */
public abstract class C9628y6 implements MemberScope {
    /* renamed from: a */
    public Set<r24> mo50860a() {
        return mo55094i().mo50860a();
    }

    /* renamed from: b */
    public Collection<fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return mo55094i().mo50861b(r24, ul3);
    }

    /* renamed from: c */
    public Collection<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return mo55094i().mo50862c(r24, ul3);
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        return mo55094i().mo50863d();
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return mo55094i().mo50864e(r24, ul3);
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        return mo55094i().mo50865f(yc1, rc2);
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return mo55094i().mo50866g();
    }

    /* renamed from: h */
    public final MemberScope mo67039h() {
        if (!(mo55094i() instanceof C9628y6)) {
            return mo55094i();
        }
        MemberScope i = mo55094i();
        vx2.m53589e(i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C9628y6) i).mo67039h();
    }

    /* renamed from: i */
    public abstract MemberScope mo55094i();
}
