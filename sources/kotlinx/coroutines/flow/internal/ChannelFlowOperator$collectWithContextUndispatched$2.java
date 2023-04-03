package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo44877d2 = {"S", "T", "La52;", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo48632f = "ChannelFlow.kt", mo48633l = {152}, mo48634m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlowOperator<S, T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator<S, T> channelFlowOperator, ns0<? super ChannelFlowOperator$collectWithContextUndispatched$2> ns0) {
        super(2, ns0);
        this.this$0 = channelFlowOperator;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, ns0);
        channelFlowOperator$collectWithContextUndispatched$2.L$0 = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    public final Object invoke(a52<? super T> a52, ns0<? super r37> ns0) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(a52, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ChannelFlowOperator<S, T> channelFlowOperator = this.this$0;
            this.label = 1;
            if (channelFlowOperator.mo55670r((a52) this.L$0, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
