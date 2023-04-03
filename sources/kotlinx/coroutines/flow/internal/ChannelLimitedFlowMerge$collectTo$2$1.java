package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", mo48632f = "Merge.kt", mo48633l = {96}, mo48634m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ gv5<T> $collector;
    public final /* synthetic */ z42<T> $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge$collectTo$2$1(z42<? extends T> z42, gv5<T> gv5, ns0<? super ChannelLimitedFlowMerge$collectTo$2$1> ns0) {
        super(2, ns0);
        this.$flow = z42;
        this.$collector = gv5;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.$flow, this.$collector, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42<T> z42 = this.$flow;
            gv5<T> gv5 = this.$collector;
            this.label = 1;
            if (z42.mo8646a(gv5, this) == d) {
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
