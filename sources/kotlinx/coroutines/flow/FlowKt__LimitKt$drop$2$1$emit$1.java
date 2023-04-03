package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", mo48632f = "Limit.kt", mo48633l = {25}, mo48634m = "emit")
/* compiled from: Limit.kt */
public final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__LimitKt$drop$2$1<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$drop$2$1$emit$1(FlowKt__LimitKt$drop$2$1<? super T> flowKt__LimitKt$drop$2$1, ns0<? super FlowKt__LimitKt$drop$2$1$emit$1> ns0) {
        super(ns0);
        this.this$0 = flowKt__LimitKt$drop$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
