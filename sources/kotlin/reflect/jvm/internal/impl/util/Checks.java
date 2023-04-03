package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.text.Regex;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.ee0;

/* compiled from: modifierChecks.kt */
public final class Checks {

    /* renamed from: a */
    public final r24 f40307a;

    /* renamed from: b */
    public final Regex f40308b;

    /* renamed from: c */
    public final Collection<r24> f40309c;

    /* renamed from: d */
    public final rc2<C7425c, String> f40310d;

    /* renamed from: e */
    public final de0[] f40311e;

    public Checks(r24 r24, Regex regex, Collection<r24> collection, rc2<? super C7425c, String> rc2, de0... de0Arr) {
        this.f40307a = r24;
        this.f40308b = regex;
        this.f40309c = collection;
        this.f40310d = rc2;
        this.f40311e = de0Arr;
    }

    /* renamed from: a */
    public final ee0 mo55385a(C7425c cVar) {
        vx2.m53591g(cVar, "functionDescriptor");
        for (de0 a : this.f40311e) {
            String a2 = a.mo51175a(cVar);
            if (a2 != null) {
                return new ee0.C7043b(a2);
            }
        }
        String invoke = this.f40310d.invoke(cVar);
        if (invoke != null) {
            return new ee0.C7043b(invoke);
        }
        return ee0.C7044c.f37526b;
    }

    /* renamed from: b */
    public final boolean mo55386b(C7425c cVar) {
        vx2.m53591g(cVar, "functionDescriptor");
        if (this.f40307a != null && !vx2.m53586b(cVar.getName(), this.f40307a)) {
            return false;
        }
        if (this.f40308b != null) {
            String d = cVar.getName().mo65594d();
            vx2.m53590f(d, "functionDescriptor.name.asString()");
            if (!this.f40308b.matches(d)) {
                return false;
            }
        }
        Collection<r24> collection = this.f40309c;
        if (collection == null || collection.contains(cVar.getName())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Checks(r24 r24, de0[] de0Arr, rc2 rc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r24, de0Arr, (rc2<? super C7425c, String>) (i & 4) != 0 ? C77352.INSTANCE : rc2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Checks(r24 r24, de0[] de0Arr, rc2<? super C7425c, String> rc2) {
        this(r24, (Regex) null, (Collection<r24>) null, rc2, (de0[]) Arrays.copyOf(de0Arr, de0Arr.length));
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(de0Arr, "checks");
        vx2.m53591g(rc2, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Checks(Regex regex, de0[] de0Arr, rc2 rc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, de0Arr, (rc2<? super C7425c, String>) (i & 4) != 0 ? C77363.INSTANCE : rc2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Checks(Regex regex, de0[] de0Arr, rc2<? super C7425c, String> rc2) {
        this((r24) null, regex, (Collection<r24>) null, rc2, (de0[]) Arrays.copyOf(de0Arr, de0Arr.length));
        vx2.m53591g(regex, "regex");
        vx2.m53591g(de0Arr, "checks");
        vx2.m53591g(rc2, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Checks(Collection collection, de0[] de0Arr, rc2 rc2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<r24>) collection, de0Arr, (rc2<? super C7425c, String>) (i & 4) != 0 ? C77374.INSTANCE : rc2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Checks(Collection<r24> collection, de0[] de0Arr, rc2<? super C7425c, String> rc2) {
        this((r24) null, (Regex) null, collection, rc2, (de0[]) Arrays.copyOf(de0Arr, de0Arr.length));
        vx2.m53591g(collection, "nameList");
        vx2.m53591g(de0Arr, "checks");
        vx2.m53591g(rc2, "additionalChecks");
    }
}
