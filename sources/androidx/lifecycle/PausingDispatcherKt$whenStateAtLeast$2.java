package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"T", "Lhu0;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo48632f = "PausingDispatcher.kt", mo48633l = {162}, mo48634m = "invokeSuspend")
/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements fd2<hu0, ns0<? super T>, Object> {
    public final /* synthetic */ fd2<hu0, ns0<? super T>, Object> $block;
    public final /* synthetic */ Lifecycle.State $minState;
    public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, fd2<? super hu0, ? super ns0<? super T>, ? extends Object> fd2, ns0<? super PausingDispatcherKt$whenStateAtLeast$2> ns0) {
        super(2, ns0);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = fd2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, ns0);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(hu0 hu0, ns0<? super T> ns0) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        og3 og3;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            y23 y23 = (y23) ((hu0) this.L$0).mo6303A().get(y23.f46117l);
            if (y23 != null) {
                zm4 zm4 = new zm4();
                og3 og32 = new og3(this.$this_whenStateAtLeast, this.$minState, zm4.f20609e, y23);
                try {
                    fd2<hu0, ns0<? super T>, Object> fd2 = this.$block;
                    this.L$0 = og32;
                    this.label = 1;
                    obj = b50.m55768e(zm4, fd2, this);
                    if (obj == d) {
                        return d;
                    }
                    og3 = og32;
                } catch (Throwable th) {
                    th = th;
                    og3 = og32;
                    og3.mo23948b();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            og3 = (og3) this.L$0;
            try {
                hg5.m45199b(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        og3.mo23948b();
        return obj;
    }
}
