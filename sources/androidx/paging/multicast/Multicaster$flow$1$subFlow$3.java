package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "La52;", "", "it", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$3", mo48632f = "Multicaster.kt", mo48633l = {84}, mo48634m = "invokeSuspend")
/* compiled from: Multicaster.kt */
public final class Multicaster$flow$1$subFlow$3 extends SuspendLambda implements id2<a52<? super T>, Throwable, ns0<? super r37>, Object> {
    public final /* synthetic */ fd0 $channel;
    public int label;
    public final /* synthetic */ Multicaster$flow$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$subFlow$3(Multicaster$flow$1 multicaster$flow$1, fd0 fd0, ns0 ns0) {
        super(3, ns0);
        this.this$0 = multicaster$flow$1;
        this.$channel = fd0;
    }

    public final ns0<r37> create(a52<? super T> a52, Throwable th, ns0<? super r37> ns0) {
        vx2.m53591g(a52, "$this$create");
        vx2.m53591g(ns0, "continuation");
        return new Multicaster$flow$1$subFlow$3(this.this$0, this.$channel, ns0);
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((Multicaster$flow$1$subFlow$3) create((a52) obj, (Throwable) obj2, (ns0) obj3)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            ChannelManager a = this.this$0.this$0.mo8794h();
            fd0 fd0 = this.$channel;
            this.label = 1;
            if (a.mo8765i(fd0, this) == d) {
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
