package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$members$2 extends Lambda implements pc2<Collection<? extends KCallableImpl<?>>> {
    public final /* synthetic */ KPackageImpl this$0;
    public final /* synthetic */ KPackageImpl.Data this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$members$2(KPackageImpl kPackageImpl, KPackageImpl.Data data) {
        super(0);
        this.this$0 = kPackageImpl;
        this.this$1 = data;
    }

    public final Collection<KCallableImpl<?>> invoke() {
        return this.this$0.mo53029z(this.this$1.mo53062f(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
    }
}
