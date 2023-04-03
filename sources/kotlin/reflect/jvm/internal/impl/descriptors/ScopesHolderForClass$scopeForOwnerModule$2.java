package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: ScopesHolderForClass.kt */
public final class ScopesHolderForClass$scopeForOwnerModule$2 extends Lambda implements pc2<T> {
    public final /* synthetic */ ScopesHolderForClass<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass<T> scopesHolderForClass) {
        super(0);
        this.this$0 = scopesHolderForClass;
    }

    public final T invoke() {
        return (MemberScope) this.this$0.f39257b.invoke(this.this$0.f39258c);
    }
}
