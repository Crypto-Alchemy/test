package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo48632f = "Lifecycle.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
public final class LifecycleCoroutineScopeImpl$register$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LifecycleCoroutineScopeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, ns0<? super LifecycleCoroutineScopeImpl$register$1> ns0) {
        super(2, ns0);
        this.this$0 = lifecycleCoroutineScopeImpl;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.this$0, ns0);
        lifecycleCoroutineScopeImpl$register$1.L$0 = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((LifecycleCoroutineScopeImpl$register$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            hu0 hu0 = (hu0) this.L$0;
            if (this.this$0.mo6300a().mo6296b().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                this.this$0.mo6300a().mo6295a(this.this$0);
            } else {
                i33.m58818f(hu0.mo6303A(), (CancellationException) null, 1, (Object) null);
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
