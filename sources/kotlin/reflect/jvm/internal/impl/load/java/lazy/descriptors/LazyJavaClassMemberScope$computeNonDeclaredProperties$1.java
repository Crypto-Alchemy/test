package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$computeNonDeclaredProperties$1 extends Lambda implements rc2<r24, Collection<? extends C7428e>> {
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$computeNonDeclaredProperties$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
    }

    public final Collection<C7428e> invoke(r24 r24) {
        vx2.m53591g(r24, "it");
        return this.this$0.mo53540I0(r24);
    }
}
