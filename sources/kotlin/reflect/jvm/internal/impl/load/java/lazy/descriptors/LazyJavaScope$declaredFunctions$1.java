package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import org.web3j.ens.contracts.generated.PublicResolver;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$declaredFunctions$1 extends Lambda implements rc2<r24, Collection<? extends C7428e>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredFunctions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final Collection<C7428e> invoke(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        if (this.this$0.mo53606B() != null) {
            return (Collection) this.this$0.mo53606B().f39535f.invoke(r24);
        }
        ArrayList arrayList = new ArrayList();
        for (m13 next : ((l31) this.this$0.mo53620y().invoke()).mo53499f(r24)) {
            JavaMethodDescriptor I = this.this$0.mo53610I(next);
            if (this.this$0.mo53536G(I)) {
                this.this$0.mo53618w().mo65296a().mo67005h().mo66817a(next, I);
                arrayList.add(I);
            }
        }
        this.this$0.mo53564o(arrayList, r24);
        return arrayList;
    }
}
