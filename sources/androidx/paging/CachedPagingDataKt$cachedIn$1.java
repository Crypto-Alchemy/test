package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "T", "Lcl4;", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CachedPagingDataKt$cachedIn$1", mo48632f = "CachedPagingData.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt$cachedIn$1 extends SuspendLambda implements fd2<cl4<T>, ns0<? super r37>, Object> {
    public int label;

    public CachedPagingDataKt$cachedIn$1(ns0 ns0) {
        super(2, ns0);
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new CachedPagingDataKt$cachedIn$1(ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPagingDataKt$cachedIn$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
