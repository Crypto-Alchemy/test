package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Key", "Value", "Ldl4;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.Pager$flow$2", mo48632f = "Pager.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: Pager.kt */
public final class Pager$flow$2 extends SuspendLambda implements rc2<ns0<? super dl4<Key, Value>>, Object> {
    public final /* synthetic */ pc2 $pagingSourceFactory;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pager$flow$2(pc2 pc2, ns0 ns0) {
        super(1, ns0);
        this.$pagingSourceFactory = pc2;
    }

    public final ns0<r37> create(ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new Pager$flow$2(this.$pagingSourceFactory, ns0);
    }

    public final Object invoke(Object obj) {
        return ((Pager$flow$2) create((ns0) obj)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            return this.$pagingSourceFactory.invoke();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
