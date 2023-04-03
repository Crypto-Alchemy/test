package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.SharedFlowProducer$start$1", mo48632f = "SharedFlowProducer.kt", mo48633l = {75, 80, 80}, mo48634m = "invokeSuspend")
/* compiled from: SharedFlowProducer.kt */
public final class SharedFlowProducer$start$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ SharedFlowProducer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowProducer$start$1(SharedFlowProducer sharedFlowProducer, ns0 ns0) {
        super(2, ns0);
        this.this$0 = sharedFlowProducer;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new SharedFlowProducer$start$1(this.this$0, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SharedFlowProducer$start$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            y23 a = this.this$0.f6276a;
            this.label = 1;
            if (a.mo55508g(this) == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (Throwable th2) {
                try {
                    fd2 b = this.this$0.f6279d;
                    ChannelManager.C1194b.C1196b.C1198b bVar = new ChannelManager.C1194b.C1196b.C1198b(this.this$0);
                    this.L$0 = th2;
                    this.label = 3;
                    if (b.invoke(bVar, this) == d) {
                        return d;
                    }
                } catch (ClosedSendChannelException unused) {
                }
                th = th2;
            }
        } else if (i == 2) {
            try {
                hg5.m45199b(obj);
            } catch (ClosedSendChannelException unused2) {
            }
            return r37.f33317a;
        } else if (i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.L$0;
            try {
                hg5.m45199b(obj);
            } catch (ClosedSendChannelException unused3) {
            }
            throw th;
        }
        fd2 b2 = this.this$0.f6279d;
        ChannelManager.C1194b.C1196b.C1198b bVar2 = new ChannelManager.C1194b.C1196b.C1198b(this.this$0);
        this.label = 2;
        if (b2.invoke(bVar2, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
