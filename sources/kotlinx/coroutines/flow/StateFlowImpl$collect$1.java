package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.StateFlowImpl", mo48632f = "StateFlow.kt", mo48633l = {386, 398, 403}, mo48634m = "collect")
/* compiled from: StateFlow.kt */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StateFlowImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, ns0<? super StateFlowImpl$collect$1> ns0) {
        super(ns0);
        this.this$0 = stateFlowImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8646a((a52) null, this);
    }
}
