package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import p000.C6983dm;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"V", "Llx4;", "kotlin.jvm.PlatformType", "invoke", "()Llx4;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$Setter$descriptor$2 extends Lambda implements pc2<lx4> {
    public final /* synthetic */ KPropertyImpl.Setter<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Setter$descriptor$2(KPropertyImpl.Setter<V> setter) {
        super(0);
        this.this$0 = setter;
    }

    public final lx4 invoke() {
        lx4 setter = this.this$0.mo53049B().mo52984x().getSetter();
        if (setter != null) {
            return setter;
        }
        fx4 D = this.this$0.mo53049B().mo52984x();
        C6983dm.C6984a aVar = C6983dm.f37317b;
        return wc1.m73545e(D, aVar.mo51228b(), aVar.mo51228b());
    }
}
