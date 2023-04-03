package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Lambda;

/* compiled from: resolvers.kt */
public final class LazyJavaTypeParameterResolver$resolve$1 extends Lambda implements rc2<h23, rf3> {
    public final /* synthetic */ LazyJavaTypeParameterResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterResolver$resolve$1(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver) {
        super(1);
        this.this$0 = lazyJavaTypeParameterResolver;
    }

    public final rf3 invoke(h23 h23) {
        vx2.m53591g(h23, "typeParameter");
        Integer num = (Integer) this.this$0.f39459d.get(h23);
        if (num == null) {
            return null;
        }
        LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.this$0;
        return new rf3(ContextKt.m60740h(ContextKt.m60734b(lazyJavaTypeParameterResolver.f39456a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f39457b.getAnnotations()), h23, lazyJavaTypeParameterResolver.f39458c + num.intValue(), lazyJavaTypeParameterResolver.f39457b);
    }
}
