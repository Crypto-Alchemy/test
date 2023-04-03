package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", mo48632f = "Merge.kt", mo48633l = {30}, mo48634m = "emit")
/* compiled from: Merge.kt */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C77921<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C77921<? super T> r1, ns0<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> ns0) {
        super(ns0);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
