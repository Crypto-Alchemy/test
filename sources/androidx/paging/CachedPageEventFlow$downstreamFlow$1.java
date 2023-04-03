package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "T", "Ls26;", "Lvk4;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", mo48632f = "CachedPageEventFlow.kt", mo48633l = {83, 117}, mo48634m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow$downstreamFlow$1 extends SuspendLambda implements fd2<s26<vk4<T>>, ns0<? super r37>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CachedPageEventFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1(CachedPageEventFlow cachedPageEventFlow, ns0 ns0) {
        super(2, ns0);
        this.this$0 = cachedPageEventFlow;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new CachedPageEventFlow$downstreamFlow$1(this.this$0, ns0);
        cachedPageEventFlow$downstreamFlow$1.L$0 = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$downstreamFlow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        s26 s26;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            s26 = (s26) this.L$0;
            FlattenedPageController c = this.this$0.f6109a;
            this.L$0 = s26;
            this.label = 1;
            obj2 = c.mo8652a(this);
            if (obj2 == d) {
                return d;
            }
        } else if (i == 1) {
            s26 = (s26) this.L$0;
            hg5.m45199b(obj);
            obj2 = obj;
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s26 s262 = s26;
        TemporaryDownstream temporaryDownstream = (TemporaryDownstream) obj2;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = Integer.MIN_VALUE;
        y23 b = d50.m56748b(s262, (CoroutineContext) null, (CoroutineStart) null, new CachedPageEventFlow$downstreamFlow$1$historyCollection$1(s262, temporaryDownstream, ref$IntRef, (ns0) null), 3, (Object) null);
        y23[] y23Arr = {d50.m56748b(s262, (CoroutineContext) null, (CoroutineStart) null, new CachedPageEventFlow$downstreamFlow$1$activeStreamCollection$1(this, s262, temporaryDownstream, b, ref$IntRef, (ns0) null), 3, (Object) null), b};
        this.L$0 = null;
        this.label = 2;
        if (AwaitKt.m63129a(y23Arr, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
