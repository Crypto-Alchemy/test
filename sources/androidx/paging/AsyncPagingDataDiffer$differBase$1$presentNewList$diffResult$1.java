package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Lhu0;", "Lub4;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", mo48632f = "AsyncPagingDataDiffer.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 extends SuspendLambda implements fd2<hu0, ns0<? super ub4>, Object> {
    public final /* synthetic */ vb4 $newList;
    public final /* synthetic */ vb4 $previousList;
    public int label;
    public final /* synthetic */ AsyncPagingDataDiffer$differBase$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, vb4 vb4, vb4 vb42, ns0 ns0) {
        super(2, ns0);
        this.this$0 = asyncPagingDataDiffer$differBase$1;
        this.$previousList = vb4;
        this.$newList = vb42;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(this.this$0, this.$previousList, this.$newList, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            return wb4.m29435a(this.$previousList, this.$newList, this.this$0.f6108l.f6103f);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
