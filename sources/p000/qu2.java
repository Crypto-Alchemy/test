package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: qu2 */
/* compiled from: InnerClassesScopeWrapper.kt */
public final class qu2 extends qs3 {

    /* renamed from: b */
    public final MemberScope f44242b;

    public qu2(MemberScope memberScope) {
        vx2.m53591g(memberScope, "workerScope");
        this.f44242b = memberScope;
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        return this.f44242b.mo50860a();
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        return this.f44242b.mo50863d();
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        if0 if0;
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        eg0 e = this.f44242b.mo50864e(r24, ul3);
        if (e == null) {
            return null;
        }
        if (e instanceof if0) {
            if0 = (if0) e;
        } else {
            if0 = null;
        }
        if (if0 != null) {
            return if0;
        }
        if (e instanceof hz6) {
            return (hz6) e;
        }
        return null;
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return this.f44242b.mo50866g();
    }

    /* renamed from: h */
    public List<eg0> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        yc1 n = yc1.mo67073n(yc1.f46165c.mo67076c());
        if (n == null) {
            return ck0.m33062j();
        }
        Collection<d31> f = this.f44242b.mo50865f(n, rc2);
        ArrayList arrayList = new ArrayList();
        for (T next : f) {
            if (next instanceof fg0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f44242b;
    }
}
