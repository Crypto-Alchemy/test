package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\fH@"}, mo44877d2 = {"", "T", "Lvb4;", "previousList", "newList", "Lil0;", "newCombinedLoadStates", "", "lastAccessedIndex", "Lkotlin/Function0;", "Lr37;", "onListPresentable", "Lns0;", "continuation", "presentNewList"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", mo48632f = "AsyncPagingDataDiffer.kt", mo48633l = {99}, mo48634m = "presentNewList")
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncPagingDataDiffer$differBase$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1$presentNewList$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, ns0 ns0) {
        super(ns0);
        this.this$0 = asyncPagingDataDiffer$differBase$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8640w((vb4) null, (vb4) null, (il0) null, 0, (pc2<r37>) null, this);
    }
}
