package p000;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, mo44877d2 = {"Lph1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "execute", "", "toString", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ph1 */
/* compiled from: Executors.kt */
public final class ph1 implements Executor {

    /* renamed from: a */
    public final CoroutineDispatcher f44050a;

    public void execute(Runnable runnable) {
        this.f44050a.mo3894m(EmptyCoroutineContext.INSTANCE, runnable);
    }

    public String toString() {
        return this.f44050a.toString();
    }
}
