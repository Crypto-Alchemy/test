package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$functions$1 extends Lambda implements rc2<r24, Collection<? extends C7428e>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final Collection<C7428e> invoke(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) this.this$0.f39535f.invoke(r24));
        this.this$0.mo53613L(linkedHashSet);
        this.this$0.mo53569r(linkedHashSet, r24);
        return CollectionsKt___CollectionsKt.m47311K0(this.this$0.mo53618w().mo65296a().mo67015r().mo53747g(this.this$0.mo53618w(), linkedHashSet));
    }
}
