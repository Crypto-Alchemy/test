package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.xc1;

/* renamed from: kc6 */
/* compiled from: SubpackagesScope.kt */
public class kc6 extends qs3 {

    /* renamed from: b */
    public final mx3 f38880b;

    /* renamed from: c */
    public final u82 f38881c;

    public kc6(mx3 mx3, u82 u82) {
        vx2.m53591g(mx3, "moduleDescriptor");
        vx2.m53591g(u82, "fqName");
        this.f38880b = mx3;
        this.f38881c = u82;
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        if (!yc1.mo67068a(yc1.f46165c.mo67079f())) {
            return ck0.m33062j();
        }
        if (this.f38881c.mo66197d() && yc1.mo67071l().contains(xc1.C9594b.f45869a)) {
            return ck0.m33062j();
        }
        Collection<u82> l = this.f38880b.mo51536l(this.f38881c, rc2);
        ArrayList arrayList = new ArrayList(l.size());
        for (u82 g : l) {
            r24 g2 = g.mo66201g();
            vx2.m53590f(g2, "subFqName.shortName()");
            if (rc2.invoke(g2).booleanValue()) {
                ak0.m55531a(arrayList, mo52890h(g2));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return ny5.m49095e();
    }

    /* renamed from: h */
    public final tk4 mo52890h(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        if (r24.mo65599i()) {
            return null;
        }
        mx3 mx3 = this.f38880b;
        u82 c = this.f38881c.mo66196c(r24);
        vx2.m53590f(c, "fqName.child(name)");
        tk4 N = mx3.mo51532N(c);
        if (N.isEmpty()) {
            return null;
        }
        return N;
    }

    public String toString() {
        return "subpackages of " + this.f38881c + " from " + this.f38880b;
    }
}
