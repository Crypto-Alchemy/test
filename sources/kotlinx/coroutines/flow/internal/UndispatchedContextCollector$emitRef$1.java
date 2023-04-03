package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, mo44877d2 = {"T", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo48632f = "ChannelFlow.kt", mo48633l = {212}, mo48634m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class UndispatchedContextCollector$emitRef$1 extends SuspendLambda implements fd2<T, ns0<? super r37>, Object> {
    public final /* synthetic */ a52<T> $downstream;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(a52<? super T> a52, ns0<? super UndispatchedContextCollector$emitRef$1> ns0) {
        super(2, ns0);
        this.$downstream = a52;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, ns0);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    public final Object invoke(T t, ns0<? super r37> ns0) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            Object obj2 = this.L$0;
            a52<T> a52 = this.$downstream;
            this.label = 1;
            if (a52.emit(obj2, this) == d) {
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
