package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, mo44877d2 = {"", "Key", "Value", "Lns0;", "Lr37;", "continuation", "doInitialLoad"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {611, 272, 275, 623, 635, 647, 304, 659, 671, 329}, mo48634m = "doInitialLoad")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$doInitialLoad$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doInitialLoad$1(PageFetcherSnapshot pageFetcherSnapshot, ns0 ns0) {
        super(ns0);
        this.this$0 = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8681p(this);
    }
}
