package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"", "T", "La52;", "Lwt2;", "Lvk4;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.CachedPageEventFlow$multicastedSrc$1", mo48632f = "CachedPageEventFlow.kt", mo48633l = {292}, mo48634m = "invokeSuspend")
/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow$multicastedSrc$1 extends SuspendLambda implements fd2<a52<? super wt2<? extends vk4<T>>>, ns0<? super r37>, Object> {
    public final /* synthetic */ z42 $src;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CachedPageEventFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$multicastedSrc$1(CachedPageEventFlow cachedPageEventFlow, z42 z42, ns0 ns0) {
        super(2, ns0);
        this.this$0 = cachedPageEventFlow;
        this.$src = z42;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        CachedPageEventFlow$multicastedSrc$1 cachedPageEventFlow$multicastedSrc$1 = new CachedPageEventFlow$multicastedSrc$1(this.this$0, this.$src, ns0);
        cachedPageEventFlow$multicastedSrc$1.L$0 = obj;
        return cachedPageEventFlow$multicastedSrc$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((CachedPageEventFlow$multicastedSrc$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            a52 a52 = (a52) this.L$0;
            if (this.this$0.f6110b.compareAndSet(false, true)) {
                z42 I = e52.m57208I(this.$src);
                this.label = 1;
                if (I.mo8646a(a52, this) == d) {
                    return d;
                }
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
