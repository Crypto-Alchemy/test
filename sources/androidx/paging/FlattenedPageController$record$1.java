package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, mo44877d2 = {"", "T", "Lwt2;", "Lvk4;", "event", "Lns0;", "Lr37;", "continuation", "record"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.FlattenedPageController", mo48632f = "CachedPageEventFlow.kt", mo48633l = {297, 174}, mo48634m = "record")
/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageController$record$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlattenedPageController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$record$1(FlattenedPageController flattenedPageController, ns0 ns0) {
        super(ns0);
        this.this$0 = flattenedPageController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8653b((wt2) null, this);
    }
}
