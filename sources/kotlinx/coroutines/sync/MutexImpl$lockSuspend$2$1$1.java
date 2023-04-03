package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "it", "Lr37;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
/* compiled from: Mutex.kt */
public final class MutexImpl$lockSuspend$2$1$1 extends Lambda implements rc2<Throwable, r37> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ MutexImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutexImpl$lockSuspend$2$1$1(MutexImpl mutexImpl, Object obj) {
        super(1);
        this.this$0 = mutexImpl;
        this.$owner = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return r37.f33317a;
    }

    public final void invoke(Throwable th) {
        this.this$0.mo55747b(this.$owner);
    }
}
