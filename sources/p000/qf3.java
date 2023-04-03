package p000;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: qf3 */
/* compiled from: LazyJavaStaticScope.kt */
public abstract class qf3 extends LazyJavaScope {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qf3(pf3 pf3) {
        super(pf3, (LazyJavaScope) null, 2, (DefaultConstructorMarker) null);
        vx2.m53591g(pf3, "c");
    }

    /* renamed from: H */
    public LazyJavaScope.C7462a mo53538H(m13 m13, List<? extends a17> list, xc3 xc3, List<? extends n87> list2) {
        vx2.m53591g(m13, "method");
        vx2.m53591g(list, "methodTypeParameters");
        vx2.m53591g(xc3, "returnType");
        vx2.m53591g(list2, "valueParameters");
        return new LazyJavaScope.C7462a(xc3, (xc3) null, list2, list, false, ck0.m33062j());
    }

    /* renamed from: s */
    public void mo53571s(r24 r24, Collection<fx4> collection) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(collection, "result");
    }

    /* renamed from: z */
    public h85 mo53581z() {
        return null;
    }
}
