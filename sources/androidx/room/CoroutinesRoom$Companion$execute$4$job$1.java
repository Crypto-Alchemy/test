package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo44877d2 = {"R", "Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", mo48632f = "CoroutinesRoom.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Callable<R> $callable;
    public final /* synthetic */ ma0<R> $continuation;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, ma0<? super R> ma0, ns0<? super CoroutinesRoom$Companion$execute$4$job$1> ns0) {
        super(2, ns0);
        this.$callable = callable;
        this.$continuation = ma0;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            try {
                this.$continuation.resumeWith(Result.m75635constructorimpl(this.$callable.call()));
            } catch (Throwable th) {
                ma0<R> ma0 = this.$continuation;
                Result.C6167a aVar = Result.Companion;
                ma0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(th)));
            }
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
