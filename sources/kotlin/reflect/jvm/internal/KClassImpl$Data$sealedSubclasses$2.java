package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo44877d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$sealedSubclasses$2 extends Lambda implements pc2<List<? extends KClassImpl<? extends T>>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$sealedSubclasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final List<KClassImpl<? extends T>> invoke() {
        Collection<if0> w = this.this$0.mo53009m().mo52354w();
        vx2.m53590f(w, "descriptor.sealedSubclasses");
        ArrayList arrayList = new ArrayList();
        for (if0 if0 : w) {
            vx2.m53589e(if0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> p = y67.m74286p(if0);
            KClassImpl kClassImpl = p != null ? new KClassImpl(p) : null;
            if (kClassImpl != null) {
                arrayList.add(kClassImpl);
            }
        }
        return arrayList;
    }
}
