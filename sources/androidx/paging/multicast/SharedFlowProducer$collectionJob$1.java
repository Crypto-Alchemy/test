package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedSendChannelException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1", mo48632f = "SharedFlowProducer.kt", mo48633l = {97}, mo48634m = "invokeSuspend")
/* compiled from: SharedFlowProducer.kt */
public final class SharedFlowProducer$collectionJob$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SharedFlowProducer this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "La52;", "", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    @v21(mo48631c = "androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1", mo48632f = "SharedFlowProducer.kt", mo48633l = {50}, mo48634m = "invokeSuspend")
    /* renamed from: androidx.paging.multicast.SharedFlowProducer$collectionJob$1$1 */
    /* compiled from: SharedFlowProducer.kt */
    public static final class C12051 extends SuspendLambda implements id2<a52<? super T>, Throwable, ns0<? super r37>, Object> {
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SharedFlowProducer$collectionJob$1 this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(a52<? super T> a52, Throwable th, ns0<? super r37> ns0) {
            vx2.m53591g(a52, "$this$create");
            vx2.m53591g(th, "it");
            vx2.m53591g(ns0, "continuation");
            C12051 r2 = new C12051(this.this$0, ns0);
            r2.L$0 = th;
            return r2;
        }

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ((C12051) create((a52) obj, (Throwable) obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                fd2 b = this.this$0.this$0.f6279d;
                ChannelManager.C1194b.C1196b.C1197a aVar = new ChannelManager.C1194b.C1196b.C1197a((Throwable) this.L$0);
                this.label = 1;
                if (b.invoke(aVar, this) == d) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowProducer$collectionJob$1(SharedFlowProducer sharedFlowProducer, ns0 ns0) {
        super(2, ns0);
        this.this$0 = sharedFlowProducer;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new SharedFlowProducer$collectionJob$1(this.this$0, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SharedFlowProducer$collectionJob$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42 f = e52.m57214f(this.this$0.f6278c, new C12051(this, (ns0) null));
            C1203x5d4b9271 sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1 = new C1203x5d4b9271(this);
            this.label = 1;
            if (f.mo8646a(sharedFlowProducer$collectionJob$1$invokeSuspend$$inlined$collect$1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (ClosedSendChannelException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
