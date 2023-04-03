package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"T", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo48632f = "Collect.kt", mo48633l = {50}, mo48634m = "invokeSuspend")
/* compiled from: Collect.kt */
public final class FlowKt__CollectKt$launchIn$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ z42<T> $this_launchIn;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(z42<? extends T> z42, ns0<? super FlowKt__CollectKt$launchIn$1> ns0) {
        super(2, ns0);
        this.$this_launchIn = z42;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new FlowKt__CollectKt$launchIn$1(this.$this_launchIn, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((FlowKt__CollectKt$launchIn$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42<T> z42 = this.$this_launchIn;
            this.label = 1;
            if (e52.m57216h(z42, this) == d) {
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
