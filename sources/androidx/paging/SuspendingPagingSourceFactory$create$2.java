package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Key", "Value", "Lhu0;", "Ldl4;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SuspendingPagingSourceFactory$create$2", mo48632f = "SuspendingPagingSourceFactory.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SuspendingPagingSourceFactory.kt */
public final class SuspendingPagingSourceFactory$create$2 extends SuspendLambda implements fd2<hu0, ns0<? super dl4<Key, Value>>, Object> {
    public int label;
    public final /* synthetic */ SuspendingPagingSourceFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPagingSourceFactory$create$2(SuspendingPagingSourceFactory suspendingPagingSourceFactory, ns0 ns0) {
        super(2, ns0);
        this.this$0 = suspendingPagingSourceFactory;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new SuspendingPagingSourceFactory$create$2(this.this$0, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SuspendingPagingSourceFactory$create$2) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            return this.this$0.f6244d.invoke();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
