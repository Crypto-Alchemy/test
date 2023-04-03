package p000;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003*\f\b\u0007\u0010\u0005\"\u00020\u00042\u00020\u0004¨\u0006\u0006"}, mo44877d2 = {"Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "(Ljava/util/concurrent/Executor;)Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: bv1 */
/* compiled from: Executors.kt */
public final class bv1 {
    /* renamed from: a */
    public static final CoroutineDispatcher m56171a(Executor executor) {
        ph1 ph1;
        CoroutineDispatcher coroutineDispatcher;
        if (executor instanceof ph1) {
            ph1 = (ph1) executor;
        } else {
            ph1 = null;
        }
        if (ph1 == null || (coroutineDispatcher = ph1.f44050a) == null) {
            return new wu1(executor);
        }
        return coroutineDispatcher;
    }
}
