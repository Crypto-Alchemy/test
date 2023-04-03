package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$properties$1 extends Lambda implements rc2<r24, List<? extends fx4>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final List<fx4> invoke(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        ArrayList arrayList = new ArrayList();
        ak0.m55531a(arrayList, this.this$0.f39536g.invoke(r24));
        this.this$0.mo53571s(r24, arrayList);
        if (dd1.m56828t(this.this$0.mo53531C())) {
            return CollectionsKt___CollectionsKt.m47311K0(arrayList);
        }
        return CollectionsKt___CollectionsKt.m47311K0(this.this$0.mo53618w().mo65296a().mo67015r().mo53747g(this.this$0.mo53618w(), arrayList));
    }
}
