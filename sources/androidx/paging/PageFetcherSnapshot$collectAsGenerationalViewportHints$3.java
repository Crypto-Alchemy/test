package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "Key", "Value", "Lcf2;", "previous", "next", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", mo48632f = "PageFetcherSnapshot.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements id2<cf2, cf2, ns0<? super cf2>, Object> {
    public final /* synthetic */ LoadType $loadType;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, ns0 ns0) {
        super(3, ns0);
        this.$loadType = loadType;
    }

    public final ns0<r37> create(cf2 cf2, cf2 cf22, ns0<? super cf2> ns0) {
        vx2.m53591g(cf2, "previous");
        vx2.m53591g(cf22, "next");
        vx2.m53591g(ns0, "continuation");
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.$loadType, ns0);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$0 = cf2;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.L$1 = cf22;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PageFetcherSnapshot$collectAsGenerationalViewportHints$3) create((cf2) obj, (cf2) obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            cf2 cf2 = (cf2) this.L$0;
            cf2 cf22 = (cf2) this.L$1;
            if (xk4.m30154a(cf22, cf2, this.$loadType)) {
                return cf22;
            }
            return cf2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
