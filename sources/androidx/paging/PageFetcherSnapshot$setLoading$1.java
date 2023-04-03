package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, mo44877d2 = {"", "Key", "Value", "Landroidx/paging/PageFetcherSnapshotState;", "Landroidx/paging/LoadType;", "loadType", "Lns0;", "Lr37;", "continuation", "setLoading"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {506}, mo48634m = "setLoading")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$setLoading$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$setLoading$1(PageFetcherSnapshot pageFetcherSnapshot, ns0 ns0) {
        super(ns0);
        this.this$0 = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8689x((PageFetcherSnapshotState) null, (LoadType) null, this);
    }
}
