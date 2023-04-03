package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "R", "La52;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.FlowExtKt$simpleScan$1", mo48632f = "FlowExt.kt", mo48633l = {42, 102}, mo48634m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$simpleScan$1 extends SuspendLambda implements fd2<a52<? super R>, ns0<? super r37>, Object> {
    public final /* synthetic */ Object $initial;
    public final /* synthetic */ id2 $operation;
    public final /* synthetic */ z42 $this_simpleScan;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1(z42 z42, Object obj, id2 id2, ns0 ns0) {
        super(2, ns0);
        this.$this_simpleScan = z42;
        this.$initial = obj;
        this.$operation = id2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.$this_simpleScan, this.$initial, this.$operation, ns0);
        flowExtKt$simpleScan$1.L$0 = obj;
        return flowExtKt$simpleScan$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleScan$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        a52 a52;
        Ref$ObjectRef ref$ObjectRef;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            a52 a522 = (a52) this.L$0;
            ref$ObjectRef = new Ref$ObjectRef();
            T t = this.$initial;
            ref$ObjectRef.element = t;
            this.L$0 = a522;
            this.L$1 = ref$ObjectRef;
            this.label = 1;
            if (a522.emit(t, this) == d) {
                return d;
            }
            a52 = a522;
        } else if (i == 1) {
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            a52 = (a52) this.L$0;
            hg5.m45199b(obj);
        } else if (i == 2) {
            hg5.m45199b(obj);
            return r37.f33317a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z42 z42 = this.$this_simpleScan;
        FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1(this, a52, ref$ObjectRef);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (z42.mo8646a(flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1, this) == d) {
            return d;
        }
        return r37.f33317a;
    }
}
