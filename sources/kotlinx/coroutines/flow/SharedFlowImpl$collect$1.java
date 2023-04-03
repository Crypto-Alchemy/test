package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.SharedFlowImpl", mo48632f = "SharedFlow.kt", mo48633l = {373, 380, 383}, mo48634m = "collect$suspendImpl")
/* compiled from: SharedFlow.kt */
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SharedFlowImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(SharedFlowImpl<T> sharedFlowImpl, ns0<? super SharedFlowImpl$collect$1> ns0) {
        super(ns0);
        this.this$0 = sharedFlowImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SharedFlowImpl.m63382B(this.this$0, (a52) null, this);
    }
}
