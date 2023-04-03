package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C6169a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: SubstitutingScope.kt */
public final class SubstitutingScope implements MemberScope {

    /* renamed from: b */
    public final MemberScope f40121b;

    /* renamed from: c */
    public final TypeSubstitutor f40122c;

    /* renamed from: d */
    public Map<d31, d31> f40123d;

    /* renamed from: e */
    public final ef3 f40124e = C6169a.m47232a(new SubstitutingScope$_allDescriptors$2(this));

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        vx2.m53591g(memberScope, "workerScope");
        vx2.m53591g(typeSubstitutor, "givenSubstitutor");
        this.f40121b = memberScope;
        p17 j = typeSubstitutor.mo55335j();
        vx2.m53590f(j, "givenSubstitutor.substitution");
        this.f40122c = CapturedTypeConstructorKt.m62414f(j, false, 1, (Object) null).mo65206c();
    }

    /* renamed from: a */
    public Set<r24> mo50860a() {
        return this.f40121b.mo50860a();
    }

    /* renamed from: b */
    public Collection<? extends fx4> mo50861b(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return mo55103l(this.f40121b.mo50861b(r24, ul3));
    }

    /* renamed from: c */
    public Collection<? extends C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return mo55103l(this.f40121b.mo50862c(r24, ul3));
    }

    /* renamed from: d */
    public Set<r24> mo50863d() {
        return this.f40121b.mo50863d();
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        eg0 e = this.f40121b.mo50864e(r24, ul3);
        if (e != null) {
            return (eg0) mo55102k(e);
        }
        return null;
    }

    /* renamed from: f */
    public Collection<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        return mo55101j();
    }

    /* renamed from: g */
    public Set<r24> mo50866g() {
        return this.f40121b.mo50866g();
    }

    /* renamed from: j */
    public final Collection<d31> mo55101j() {
        return (Collection) this.f40124e.getValue();
    }

    /* renamed from: k */
    public final <D extends d31> D mo55102k(D d) {
        if (this.f40122c.mo55336k()) {
            return d;
        }
        if (this.f40123d == null) {
            this.f40123d = new HashMap();
        }
        Map<d31, d31> map = this.f40123d;
        vx2.m53588d(map);
        D d2 = map.get(d);
        if (d2 == null) {
            if (d instanceof tc6) {
                d2 = ((tc6) d).mo50708c(this.f40122c);
                if (d2 != null) {
                    map.put(d, d2);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        D d3 = (d31) d2;
        vx2.m53589e(d3, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d3;
    }

    /* renamed from: l */
    public final <D extends d31> Collection<D> mo55103l(Collection<? extends D> collection) {
        if (this.f40122c.mo55336k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g = ak0.m55537g(collection.size());
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            g.add(mo55102k((d31) it.next()));
        }
        return g;
    }
}
