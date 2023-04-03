package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: StaticScopeForKotlinEnum.kt */
public final class StaticScopeForKotlinEnum extends qs3 {

    /* renamed from: d */
    public static final /* synthetic */ i93<Object>[] f40118d = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    public final if0 f40119b;

    /* renamed from: c */
    public final q84 f40120c;

    public StaticScopeForKotlinEnum(da6 da6, if0 if0) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(if0, "containingClass");
        this.f40119b = if0;
        if0.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f40120c = da6.mo51164i(new StaticScopeForKotlinEnum$functions$2(this));
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ eg0 mo50864e(r24 r24, ul3 ul3) {
        return (eg0) mo55097i(r24, ul3);
    }

    /* renamed from: i */
    public Void mo55097i(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        return null;
    }

    /* renamed from: j */
    public List<C7428e> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        return mo55100l();
    }

    /* renamed from: k */
    public v46<C7428e> mo50862c(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        List<C7428e> l = mo55100l();
        v46<C7428e> v46 = new v46<>();
        for (T next : l) {
            if (vx2.m53586b(((C7428e) next).getName(), r24)) {
                v46.add(next);
            }
        }
        return v46;
    }

    /* renamed from: l */
    public final List<C7428e> mo55100l() {
        return (List) ca6.m56364a(this.f40120c, this, f40118d[0]);
    }
}
