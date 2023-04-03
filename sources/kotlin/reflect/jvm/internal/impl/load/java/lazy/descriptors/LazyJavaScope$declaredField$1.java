package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$declaredField$1 extends Lambda implements rc2<r24, fx4> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredField$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final fx4 invoke(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        if (this.this$0.mo53606B() != null) {
            return (fx4) this.this$0.mo53606B().f39536g.invoke(r24);
        }
        f13 b = ((l31) this.this$0.mo53620y().invoke()).mo53495b(r24);
        if (b == null || b.mo50846H()) {
            return null;
        }
        return this.this$0.mo53611J(b);
    }
}
