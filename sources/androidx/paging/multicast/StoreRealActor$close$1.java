package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H@"}, mo44877d2 = {"T", "Lns0;", "Lr37;", "continuation", "", "close"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.StoreRealActor", mo48632f = "StoreRealActor.kt", mo48633l = {74, 76}, mo48634m = "close")
/* compiled from: StoreRealActor.kt */
public final class StoreRealActor$close$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StoreRealActor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreRealActor$close$1(StoreRealActor storeRealActor, ns0 ns0) {
        super(ns0);
        this.this$0 = storeRealActor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8801c(this);
    }
}
