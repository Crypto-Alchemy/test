package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo44877d2 = {"T", "Lcw4;", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo48632f = "ChannelFlow.kt", mo48633l = {60}, mo48634m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements fd2<cw4<? super T>, ns0<? super r37>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow<T> channelFlow, ns0<? super ChannelFlow$collectToFun$1> ns0) {
        super(2, ns0);
        this.this$0 = channelFlow;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, ns0);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    public final Object invoke(cw4<? super T> cw4, ns0<? super r37> ns0) {
        return ((ChannelFlow$collectToFun$1) create(cw4, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ChannelFlow<T> channelFlow = this.this$0;
            this.label = 1;
            if (channelFlow.mo51899i((cw4) this.L$0, this) == d) {
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
