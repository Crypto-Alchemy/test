package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"V", "Lfx4;", "kotlin.jvm.PlatformType", "invoke", "()Lfx4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$_descriptor$1 extends Lambda implements pc2<fx4> {
    public final /* synthetic */ KPropertyImpl<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$_descriptor$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.this$0 = kPropertyImpl;
    }

    public final fx4 invoke() {
        return this.this$0.mo52982v().mo53028v(this.this$0.getName(), this.this$0.mo53080G());
    }
}
