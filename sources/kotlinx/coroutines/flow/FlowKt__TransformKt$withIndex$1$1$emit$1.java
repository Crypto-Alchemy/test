package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", mo48632f = "Transform.kt", mo48633l = {65}, mo48634m = "emit")
/* compiled from: Transform.kt */
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowKt__TransformKt$withIndex$1$1<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1<? super T> flowKt__TransformKt$withIndex$1$1, ns0<? super FlowKt__TransformKt$withIndex$1$1$emit$1> ns0) {
        super(ns0);
        this.this$0 = flowKt__TransformKt$withIndex$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
