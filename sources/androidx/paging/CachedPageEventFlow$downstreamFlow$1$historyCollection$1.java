package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Lhu0;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1", mo48632f = "CachedPageEventFlow.kt", mo48633l = {292}, mo48634m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow$downstreamFlow$1$historyCollection$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Ref$IntRef $lastReceivedHistoryIndex;
    public final /* synthetic */ TemporaryDownstream $snapshot;
    public final /* synthetic */ s26 $this_simpleChannelFlow;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, mo44877d2 = {"androidx/paging/CachedPageEventFlow$downstreamFlow$1$historyCollection$1$a", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$historyCollection$1$a */
    /* compiled from: Collect.kt */
    public static final class C1139a implements a52<wt2<? extends vk4<T>>> {

        /* renamed from: a */
        public final /* synthetic */ CachedPageEventFlow$downstreamFlow$1$historyCollection$1 f6114a;

        public C1139a(CachedPageEventFlow$downstreamFlow$1$historyCollection$1 cachedPageEventFlow$downstreamFlow$1$historyCollection$1) {
            this.f6114a = cachedPageEventFlow$downstreamFlow$1$historyCollection$1;
        }

        public Object emit(Object obj, ns0 ns0) {
            wt2 wt2 = (wt2) obj;
            this.f6114a.$lastReceivedHistoryIndex.element = wt2.mo49265c();
            Object u = this.f6114a.$this_simpleChannelFlow.mo26027u(wt2.mo49266d(), ns0);
            if (u == wx2.m54101d()) {
                return u;
            }
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1$historyCollection$1(s26 s26, TemporaryDownstream temporaryDownstream, Ref$IntRef ref$IntRef, ns0 ns0) {
        super(2, ns0);
        this.$this_simpleChannelFlow = s26;
        this.$snapshot = temporaryDownstream;
        this.$lastReceivedHistoryIndex = ref$IntRef;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(this.$this_simpleChannelFlow, this.$snapshot, this.$lastReceivedHistoryIndex, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$downstreamFlow$1$historyCollection$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42 b = this.$snapshot.mo8761b();
            C1139a aVar = new C1139a(this);
            this.label = 1;
            if (b.mo8646a(aVar, this) == d) {
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
