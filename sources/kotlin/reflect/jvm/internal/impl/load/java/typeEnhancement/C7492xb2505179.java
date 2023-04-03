package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import p000.s16;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9 */
/* compiled from: predefinedEnhancementInfo.kt */
public final class C7492xb2505179 extends Lambda implements rc2<s16.C9297a.C9298a, r37> {
    public final /* synthetic */ String $JFBiFunction;
    public final /* synthetic */ String $JLObject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7492xb2505179(String str, String str2) {
        super(1);
        this.$JLObject = str;
        this.$JFBiFunction = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((s16.C9297a.C9298a) obj);
        return r37.f33317a;
    }

    public final void invoke(s16.C9297a.C9298a aVar) {
        vx2.m53591g(aVar, "$this$function");
        aVar.mo65800b(this.$JLObject, PredefinedEnhancementInfoKt.f39580b);
        aVar.mo65800b(this.$JLObject, PredefinedEnhancementInfoKt.f39581c);
        aVar.mo65800b(this.$JFBiFunction, PredefinedEnhancementInfoKt.f39580b, PredefinedEnhancementInfoKt.f39581c, PredefinedEnhancementInfoKt.f39581c, PredefinedEnhancementInfoKt.f39579a);
        aVar.mo65801c(this.$JLObject, PredefinedEnhancementInfoKt.f39579a);
    }
}
