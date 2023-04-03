package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: LazyJavaScope.kt */
public final class LazyJavaScope$allDescriptors$1 extends Lambda implements pc2<Collection<? extends d31>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$allDescriptors$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.this$0 = lazyJavaScope;
    }

    public final Collection<d31> invoke() {
        return this.this$0.mo53614m(yc1.f46177o, MemberScope.f40114a.mo55095a());
    }
}
