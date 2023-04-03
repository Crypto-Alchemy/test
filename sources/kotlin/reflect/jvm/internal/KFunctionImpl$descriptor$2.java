package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KFunctionImpl.kt */
public final class KFunctionImpl$descriptor$2 extends Lambda implements pc2<C7425c> {
    public final /* synthetic */ String $name;
    public final /* synthetic */ KFunctionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$descriptor$2(KFunctionImpl kFunctionImpl, String str) {
        super(0);
        this.this$0 = kFunctionImpl;
        this.$name = str;
    }

    public final C7425c invoke() {
        return this.this$0.mo52982v().mo53026t(this.$name, this.this$0.f38981r);
    }
}
