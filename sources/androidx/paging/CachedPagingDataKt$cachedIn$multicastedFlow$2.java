package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {1, 0, 3}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"<anonymous>", "Landroidx/paging/MulticastedPagingData;", "T", "", "prev", "next", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$2", mo48632f = "CachedPagingData.kt", mo48633l = {93}, mo48634m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt$cachedIn$multicastedFlow$2 extends SuspendLambda implements id2<MulticastedPagingData<T>, MulticastedPagingData<T>, ns0<? super MulticastedPagingData<T>>, Object> {
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    public int label;

    public CachedPagingDataKt$cachedIn$multicastedFlow$2(ns0 ns0) {
        super(3, ns0);
    }

    public final ns0<r37> create(MulticastedPagingData<T> multicastedPagingData, MulticastedPagingData<T> multicastedPagingData2, ns0<? super MulticastedPagingData<T>> ns0) {
        vx2.m53591g(multicastedPagingData, "prev");
        vx2.m53591g(multicastedPagingData2, "next");
        vx2.m53591g(ns0, "continuation");
        CachedPagingDataKt$cachedIn$multicastedFlow$2 cachedPagingDataKt$cachedIn$multicastedFlow$2 = new CachedPagingDataKt$cachedIn$multicastedFlow$2(ns0);
        cachedPagingDataKt$cachedIn$multicastedFlow$2.L$0 = multicastedPagingData;
        cachedPagingDataKt$cachedIn$multicastedFlow$2.L$1 = multicastedPagingData2;
        return cachedPagingDataKt$cachedIn$multicastedFlow$2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((CachedPagingDataKt$cachedIn$multicastedFlow$2) create((MulticastedPagingData) obj, (MulticastedPagingData) obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$1;
            this.L$0 = multicastedPagingData;
            this.label = 1;
            if (((MulticastedPagingData) this.L$0).mo8661b(this) == d) {
                return d;
            }
            return multicastedPagingData;
        } else if (i == 1) {
            MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
            hg5.m45199b(obj);
            return multicastedPagingData2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
