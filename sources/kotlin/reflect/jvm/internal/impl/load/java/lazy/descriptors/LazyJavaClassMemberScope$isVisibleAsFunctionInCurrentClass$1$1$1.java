package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 extends Lambda implements rc2<r24, Collection<? extends C7428e>> {
    public final /* synthetic */ C7428e $function;
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1(C7428e eVar, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.$function = eVar;
        this.this$0 = lazyJavaClassMemberScope;
    }

    public final Collection<C7428e> invoke(r24 r24) {
        vx2.m53591g(r24, "accessorName");
        if (vx2.m53586b(this.$function.getName(), r24)) {
            return bk0.m32598e(this.$function);
        }
        return CollectionsKt___CollectionsKt.m47350u0(this.this$0.mo53540I0(r24), this.this$0.mo53541J0(r24));
    }
}
