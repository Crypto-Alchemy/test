package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

/* compiled from: GivenFunctionsMemberScope.kt */
public final class GivenFunctionsMemberScope$allDescriptors$2 extends Lambda implements pc2<List<? extends d31>> {
    public final /* synthetic */ GivenFunctionsMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        super(0);
        this.this$0 = givenFunctionsMemberScope;
    }

    public final List<d31> invoke() {
        List<C7425c> i = this.this$0.mo51467i();
        return CollectionsKt___CollectionsKt.m47350u0(i, this.this$0.mo55091j(i));
    }
}
