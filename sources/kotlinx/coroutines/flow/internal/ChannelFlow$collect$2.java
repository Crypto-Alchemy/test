package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo48632f = "ChannelFlow.kt", mo48633l = {123}, mo48634m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class ChannelFlow$collect$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ a52<T> $collector;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(a52<? super T> a52, ChannelFlow<T> channelFlow, ns0<? super ChannelFlow$collect$2> ns0) {
        super(2, ns0);
        this.$collector = a52;
        this.this$0 = channelFlow;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, ns0);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ChannelFlow$collect$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            a52<T> a52 = this.$collector;
            z75<T> n = this.this$0.mo51902n((hu0) this.L$0);
            this.label = 1;
            if (e52.m57224p(a52, n, this) == d) {
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
