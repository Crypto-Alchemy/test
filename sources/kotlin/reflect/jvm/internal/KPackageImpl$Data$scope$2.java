package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo44877d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$scope$2 extends Lambda implements pc2<MemberScope> {
    public final /* synthetic */ KPackageImpl.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$scope$2(KPackageImpl.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final MemberScope invoke() {
        pa5 b = this.this$0.mo53059c();
        if (b != null) {
            return this.this$0.mo53030a().mo62929c().mo62938a(b);
        }
        return MemberScope.C7667a.f40117b;
    }
}
