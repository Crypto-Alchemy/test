package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "La52;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.Multicaster$flow$1", mo48632f = "Multicaster.kt", mo48633l = {100}, mo48634m = "invokeSuspend")
/* compiled from: Multicaster.kt */
public final class Multicaster$flow$1 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Multicaster this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1(Multicaster multicaster, ns0 ns0) {
        super(2, ns0);
        this.this$0 = multicaster;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        Multicaster$flow$1 multicaster$flow$1 = new Multicaster$flow$1(this.this$0, ns0);
        multicaster$flow$1.L$0 = obj;
        return multicaster$flow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Multicaster$flow$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            fd0 b = od0.m70236b(Integer.MAX_VALUE, (BufferOverflow) null, (rc2) null, 6, (Object) null);
            z42 B = e52.m57201B(e52.m57228t(new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(e52.m57203D(e52.m57220l(b), new Multicaster$flow$1$subFlow$1(this, b, (ns0) null)), (ns0) null)), new Multicaster$flow$1$subFlow$3(this, b, (ns0) null));
            this.label = 1;
            if (B.mo8646a((a52) this.L$0, this) == d) {
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
