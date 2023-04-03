package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"T", "La52;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", mo48632f = "FlowExt.kt", mo48633l = {102}, mo48634m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleRunningReduce$1 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    public final /* synthetic */ id2 $operation;
    public final /* synthetic */ z42 $this_simpleRunningReduce;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleRunningReduce$1(z42 z42, id2 id2, ns0 ns0) {
        super(2, ns0);
        this.$this_simpleRunningReduce = z42;
        this.$operation = id2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.$this_simpleRunningReduce, this.$operation, ns0);
        flowExtKt$simpleRunningReduce$1.L$0 = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleRunningReduce$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = FlowExtKt.f6131a;
            z42 z42 = this.$this_simpleRunningReduce;
            FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(this, (a52) this.L$0, ref$ObjectRef);
            this.label = 1;
            if (z42.mo8646a(flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1, this) == d) {
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
