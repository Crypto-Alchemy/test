package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "Key", "Value", "La52;", "", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", mo48632f = "PageFetcherSnapshotState.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: PageFetcherSnapshotState.kt */
public final class PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1 extends SuspendLambda implements fd2<a52<? super Integer>, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ PageFetcherSnapshotState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(PageFetcherSnapshotState pageFetcherSnapshotState, ns0 ns0) {
        super(2, ns0);
        this.this$0 = pageFetcherSnapshotState;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(this.this$0, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            this.this$0.f6200i.offer(a40.m31673d(this.this$0.f6198g));
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
