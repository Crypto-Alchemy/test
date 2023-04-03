package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaClassDescriptor.kt */
public final class LazyJavaClassDescriptor$scopeHolder$1 extends Lambda implements rc2<bd3, LazyJavaClassMemberScope> {
    public final /* synthetic */ LazyJavaClassDescriptor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor$scopeHolder$1(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(1);
        this.this$0 = lazyJavaClassDescriptor;
    }

    public final LazyJavaClassMemberScope invoke(bd3 bd3) {
        vx2.m53591g(bd3, "it");
        pf3 F0 = this.this$0.f39485C;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.this$0;
        return new LazyJavaClassMemberScope(F0, lazyJavaClassDescriptor, lazyJavaClassDescriptor.mo53517J0(), this.this$0.f39484B != null, this.this$0.f39492U);
    }
}
