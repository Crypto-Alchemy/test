package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$typeParameters$2 extends Lambda implements pc2<List<? extends KTypeParameterImpl>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;
    public final /* synthetic */ KClassImpl<T> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$typeParameters$2(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = data;
        this.this$1 = kClassImpl;
    }

    public final List<KTypeParameterImpl> invoke() {
        List<a17> o = this.this$0.mo53009m().mo51670o();
        vx2.m53590f(o, "descriptor.declaredTypeParameters");
        KClassImpl<T> kClassImpl = this.this$1;
        ArrayList arrayList = new ArrayList(dk0.m43495u(o, 10));
        for (a17 a17 : o) {
            vx2.m53590f(a17, "descriptor");
            arrayList.add(new KTypeParameterImpl(kClassImpl, a17));
        }
        return arrayList;
    }
}
