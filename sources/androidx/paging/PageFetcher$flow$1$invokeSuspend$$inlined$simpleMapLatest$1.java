package androidx.paging;

import androidx.paging.PageFetcher;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "R", "La52;", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", mo48632f = "PageFetcher.kt", mo48633l = {105}, mo48634m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements id2<a52<? super cl4<Value>>, PageFetcher.C1151a<Key, Value>, ns0<? super r37>, Object> {
    public final /* synthetic */ tc5 $remoteMediatorAccessor$inlined;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ PageFetcher$flow$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(ns0 ns0, PageFetcher$flow$1 pageFetcher$flow$1, tc5 tc5) {
        super(3, ns0);
        this.this$0 = pageFetcher$flow$1;
        this.$remoteMediatorAccessor$inlined = tc5;
    }

    public final ns0<r37> create(a52<? super cl4<Value>> a52, PageFetcher.C1151a<Key, Value> aVar, ns0<? super r37> ns0) {
        vx2.m53591g(a52, "$this$create");
        vx2.m53591g(ns0, "continuation");
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(ns0, this.this$0, this.$remoteMediatorAccessor$inlined);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$0 = a52;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$1 = aVar;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1) create((a52) obj, obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            PageFetcher.C1151a aVar = (PageFetcher.C1151a) this.L$1;
            cl4 cl4 = new cl4(this.this$0.this$0.mo8666j(aVar.mo8669a(), this.$remoteMediatorAccessor$inlined), new PageFetcher.C1152b(this.this$0.this$0, aVar.mo8669a(), this.this$0.this$0.f6147b));
            this.label = 1;
            if (((a52) this.L$0).emit(cl4, this) == d) {
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
