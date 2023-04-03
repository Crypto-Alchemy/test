package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Lif0;", "kotlin.jvm.PlatformType", "invoke", "()Lif0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$descriptor$2 extends Lambda implements pc2<if0> {
    public final /* synthetic */ KClassImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$descriptor$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    public final if0 invoke() {
        if0 if0;
        nf0 I = this.this$0.mo52989K();
        oi5 a = this.this$0.mo52991M().invoke().mo53030a();
        if (I.mo62682k()) {
            if0 = a.mo62927a().mo52435b(I);
        } else {
            if0 = FindClassInModuleKt.m60278a(a.mo62928b(), I);
        }
        if (if0 != null) {
            return if0;
        }
        Void unused = this.this$0.mo52995Q();
        throw null;
    }
}
