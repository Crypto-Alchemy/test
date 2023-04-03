package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"R", "", "it", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: BroadcastFrameClock.kt */
public final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ Ref$ObjectRef<BroadcastFrameClock.C0336a<R>> $awaiter;
    public final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, Ref$ObjectRef<BroadcastFrameClock.C0336a<R>> ref$ObjectRef) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        BroadcastFrameClock.C0336a aVar;
        Object o = this.this$0.f1436d;
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        Ref$ObjectRef<BroadcastFrameClock.C0336a<R>> ref$ObjectRef = this.$awaiter;
        synchronized (o) {
            List i = broadcastFrameClock.f1438g;
            T t = ref$ObjectRef.element;
            if (t == null) {
                vx2.m53605u("awaiter");
                aVar = null;
            } else {
                aVar = (BroadcastFrameClock.C0336a) t;
            }
            i.remove(aVar);
            r37 r37 = r37.f33317a;
        }
    }
}
