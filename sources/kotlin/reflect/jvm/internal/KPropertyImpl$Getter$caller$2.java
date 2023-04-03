package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"V", "Lu90;", "kotlin.jvm.PlatformType", "invoke", "()Lu90;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$Getter$caller$2 extends Lambda implements pc2<u90<?>> {
    public final /* synthetic */ KPropertyImpl.Getter<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$Getter$caller$2(KPropertyImpl.Getter<? extends V> getter) {
        super(0);
        this.this$0 = getter;
    }

    public final u90<?> invoke() {
        return l93.m63735b(this.this$0, true);
    }
}
