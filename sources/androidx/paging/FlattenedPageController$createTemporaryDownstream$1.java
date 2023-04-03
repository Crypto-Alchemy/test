package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@"}, mo44877d2 = {"", "T", "Lns0;", "Landroidx/paging/TemporaryDownstream;", "continuation", "createTemporaryDownstream"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.FlattenedPageController", mo48632f = "CachedPageEventFlow.kt", mo48633l = {310, 188}, mo48634m = "createTemporaryDownstream")
/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageController$createTemporaryDownstream$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlattenedPageController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$createTemporaryDownstream$1(FlattenedPageController flattenedPageController, ns0 ns0) {
        super(ns0);
        this.this$0 = flattenedPageController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8652a(this);
    }
}
