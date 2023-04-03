package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.Lambda;

/* compiled from: LazyScopeAdapter.kt */
public final class LazyScopeAdapter$lazyScope$1 extends Lambda implements pc2<MemberScope> {
    public final /* synthetic */ pc2<MemberScope> $getScope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter$lazyScope$1(pc2<? extends MemberScope> pc2) {
        super(0);
        this.$getScope = pc2;
    }

    public final MemberScope invoke() {
        MemberScope invoke = this.$getScope.invoke();
        return invoke instanceof C9628y6 ? ((C9628y6) invoke).mo67039h() : invoke;
    }
}
