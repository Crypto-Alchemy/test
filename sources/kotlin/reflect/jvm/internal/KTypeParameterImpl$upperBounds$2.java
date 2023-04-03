package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "kotlin.jvm.PlatformType", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KTypeParameterImpl.kt */
public final class KTypeParameterImpl$upperBounds$2 extends Lambda implements pc2<List<? extends KTypeImpl>> {
    public final /* synthetic */ KTypeParameterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeParameterImpl$upperBounds$2(KTypeParameterImpl kTypeParameterImpl) {
        super(0);
        this.this$0 = kTypeParameterImpl;
    }

    public final List<KTypeImpl> invoke() {
        List<xc3> upperBounds = this.this$0.mo53099b().getUpperBounds();
        vx2.m53590f(upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(dk0.m43495u(upperBounds, 10));
        for (xc3 kTypeImpl : upperBounds) {
            arrayList.add(new KTypeImpl(kTypeImpl, (pc2) null, 2, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}
