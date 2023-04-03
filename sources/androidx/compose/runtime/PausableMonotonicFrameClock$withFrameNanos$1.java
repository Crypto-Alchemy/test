package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "androidx.compose.runtime.PausableMonotonicFrameClock", mo48632f = "PausableMonotonicFrameClock.kt", mo48633l = {62, 63}, mo48634m = "withFrameNanos")
/* compiled from: PausableMonotonicFrameClock.kt */
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, ns0<? super PausableMonotonicFrameClock$withFrameNanos$1> ns0) {
        super(ns0);
        this.this$0 = pausableMonotonicFrameClock;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2869d((rc2) null, this);
    }
}
