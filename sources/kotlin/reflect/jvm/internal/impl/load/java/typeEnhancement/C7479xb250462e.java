package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p000.s16;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$2$1 */
/* compiled from: predefinedEnhancementInfo.kt */
public final class C7479xb250462e extends Lambda implements rc2<s16.C9297a.C9298a, r37> {
    public final /* synthetic */ SignatureBuildingComponents $this_signatures;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7479xb250462e(SignatureBuildingComponents signatureBuildingComponents) {
        super(1);
        this.$this_signatures = signatureBuildingComponents;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((s16.C9297a.C9298a) obj);
        return r37.f33317a;
    }

    public final void invoke(s16.C9297a.C9298a aVar) {
        vx2.m53591g(aVar, "$this$function");
        aVar.mo65801c(this.$this_signatures.mo53816i("Spliterator"), PredefinedEnhancementInfoKt.f39580b, PredefinedEnhancementInfoKt.f39580b);
    }
}
