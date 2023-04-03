package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "T", "Lr37;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PagingDataDiffer$collectFrom$2", mo48632f = "PagingDataDiffer.kt", mo48633l = {390}, mo48634m = "invokeSuspend")
/* compiled from: PagingDataDiffer.kt */
public final class PagingDataDiffer$collectFrom$2 extends SuspendLambda implements rc2<ns0<? super r37>, Object> {
    public final /* synthetic */ cl4 $pagingData;
    public int label;
    public final /* synthetic */ PagingDataDiffer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataDiffer$collectFrom$2(PagingDataDiffer pagingDataDiffer, cl4 cl4, ns0 ns0) {
        super(1, ns0);
        this.this$0 = pagingDataDiffer;
        this.$pagingData = cl4;
    }

    public final ns0<r37> create(ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new PagingDataDiffer$collectFrom$2(this.this$0, this.$pagingData, ns0);
    }

    public final Object invoke(Object obj) {
        return ((PagingDataDiffer$collectFrom$2) create((ns0) obj)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            this.this$0.f6223b = this.$pagingData.mo12108b();
            z42 a = this.$pagingData.mo12107a();
            PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 = new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(this);
            this.label = 1;
            if (a.mo8646a(pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
