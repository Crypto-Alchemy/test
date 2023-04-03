package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", mo48632f = "Channels.kt", mo48633l = {51, 62}, mo48634m = "emitAllImpl$FlowKt__ChannelsKt")
/* compiled from: Channels.kt */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ChannelsKt$emitAllImpl$1(ns0<? super FlowKt__ChannelsKt$emitAllImpl$1> ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.m63337d((a52) null, (z75) null, false, this);
    }
}
