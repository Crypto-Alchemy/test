package p000;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0017J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Ls81;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lr37;", "execute", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "m", "y", "close", "", "toString", "Lkotlinx/coroutines/CoroutineDispatcher;", "k", "Lkotlinx/coroutines/CoroutineDispatcher;", "default", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: s81 */
/* compiled from: Dispatcher.kt */
public final class s81 extends ExecutorCoroutineDispatcher implements Executor {

    /* renamed from: g */
    public static final s81 f44540g = new s81();

    /* renamed from: k */
    public static final CoroutineDispatcher f44541k = b47.f36681e.mo55461A(fl6.m57786d("kotlinx.coroutines.io.parallelism", d75.m43382d(64, dl6.m56896a()), 0, 0, 12, (Object) null));

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        mo3894m(EmptyCoroutineContext.INSTANCE, runnable);
    }

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        f44541k.mo3894m(coroutineContext, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }

    /* renamed from: y */
    public void mo50471y(CoroutineContext coroutineContext, Runnable runnable) {
        f44541k.mo50471y(coroutineContext, runnable);
    }
}
