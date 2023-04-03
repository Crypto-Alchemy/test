package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", mo48632f = "Emitters.kt", mo48633l = {216}, mo48634m = "invokeSafely$FlowKt__EmittersKt")
/* compiled from: Emitters.kt */
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__EmittersKt$invokeSafely$1(ns0<? super FlowKt__EmittersKt$invokeSafely$1> ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.m63345c((a52) null, (id2) null, (Throwable) null, this);
    }
}
