package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Recomposer.kt */
public final class Recomposer$broadcastFrameClock$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    public final void invoke() {
        ma0 r;
        Object E = this.this$0.f1543e;
        Recomposer recomposer = this.this$0;
        synchronized (E) {
            r = recomposer.mo3091U();
            if (((Recomposer.State) recomposer.f1558t.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                throw pu1.m71118a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f1545g);
            }
        }
        if (r != null) {
            Result.C6167a aVar = Result.Companion;
            r.resumeWith(Result.m75635constructorimpl(r37.f33317a));
        }
    }
}
