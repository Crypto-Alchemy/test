package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "R", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_typeParameters$1 extends Lambda implements pc2<List<? extends KTypeParameterImpl>> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_typeParameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final List<KTypeParameterImpl> invoke() {
        List<a17> typeParameters = this.this$0.mo52984x().getTypeParameters();
        vx2.m53590f(typeParameters, "descriptor.typeParameters");
        KCallableImpl<R> kCallableImpl = this.this$0;
        ArrayList arrayList = new ArrayList(dk0.m43495u(typeParameters, 10));
        for (a17 a17 : typeParameters) {
            vx2.m53590f(a17, "descriptor");
            arrayList.add(new KTypeParameterImpl(kCallableImpl, a17));
        }
        return arrayList;
    }
}
