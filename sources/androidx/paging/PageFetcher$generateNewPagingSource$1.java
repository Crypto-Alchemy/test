package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0005H@"}, mo44877d2 = {"", "Key", "Value", "Ldl4;", "previousPagingSource", "Lns0;", "continuation", "generateNewPagingSource"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcher", mo48632f = "PageFetcher.kt", mo48633l = {211}, mo48634m = "generateNewPagingSource")
/* compiled from: PageFetcher.kt */
public final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcher$generateNewPagingSource$1(PageFetcher pageFetcher, ns0 ns0) {
        super(ns0);
        this.this$0 = pageFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8664h((dl4) null, this);
    }
}
