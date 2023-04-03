package androidx.paging;

import androidx.paging.ActiveFlowTracker;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@¢\u0006\u0004\b\u0007\u0010\b"}, mo44877d2 = {"", "T", "La52;", "Lcl4;", "", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$5", mo48632f = "CachedPagingData.kt", mo48633l = {100}, mo48634m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt$cachedIn$multicastedFlow$5 extends SuspendLambda implements id2<a52<? super cl4<T>>, Throwable, ns0<? super r37>, Object> {
    public final /* synthetic */ ActiveFlowTracker $tracker;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$multicastedFlow$5(ActiveFlowTracker activeFlowTracker, ns0 ns0) {
        super(3, ns0);
        this.$tracker = activeFlowTracker;
    }

    public final ns0<r37> create(a52<? super cl4<T>> a52, Throwable th, ns0<? super r37> ns0) {
        vx2.m53591g(a52, "$this$create");
        vx2.m53591g(ns0, "continuation");
        return new CachedPagingDataKt$cachedIn$multicastedFlow$5(this.$tracker, ns0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((CachedPagingDataKt$cachedIn$multicastedFlow$5) create((a52) obj, (Throwable) obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ActiveFlowTracker activeFlowTracker = this.$tracker;
            if (activeFlowTracker != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                this.label = 1;
                if (activeFlowTracker.mo8625a(flowType, this) == d) {
                    return d;
                }
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
