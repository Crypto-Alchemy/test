package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C7758b;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010%\u001a\u00020 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, mo44877d2 = {"Lwu1;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lib1;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "m", "", "timeMillis", "Lma0;", "continuation", "f", "Lzh1;", "i", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "N", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "K", "Ljava/util/concurrent/Executor;", "g", "Ljava/util/concurrent/Executor;", "L", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: wu1 */
/* compiled from: Executors.kt */
public final class wu1 extends ExecutorCoroutineDispatcher implements ib1 {

    /* renamed from: g */
    public final Executor f45765g;

    public wu1(Executor executor) {
        this.f45765g = executor;
        ko0.m59863a(mo66771L());
    }

    /* renamed from: K */
    public final void mo66770K(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        g33.m58007d(coroutineContext, pu1.m71118a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: L */
    public Executor mo66771L() {
        return this.f45765g;
    }

    /* renamed from: N */
    public final ScheduledFuture<?> mo66772N(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            mo66770K(coroutineContext, e);
            return null;
        }
    }

    public void close() {
        ExecutorService executorService;
        Executor L = mo66771L();
        if (L instanceof ExecutorService) {
            executorService = (ExecutorService) L;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wu1) || ((wu1) obj).mo66771L() != mo66771L()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo51194f(long j, ma0<? super r37> ma0) {
        ScheduledExecutorService scheduledExecutorService;
        Executor L = mo66771L();
        ScheduledFuture<?> scheduledFuture = null;
        if (L instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) L;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = mo66772N(scheduledExecutorService, new mg5(this, ma0), ma0.getContext(), j);
        }
        if (scheduledFuture != null) {
            g33.m58011h(ma0, scheduledFuture);
        } else {
            C7758b.f40363x.mo51194f(j, ma0);
        }
    }

    public int hashCode() {
        return System.identityHashCode(mo66771L());
    }

    /* renamed from: i */
    public zh1 mo51195i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        Executor L = mo66771L();
        ScheduledFuture<?> scheduledFuture = null;
        if (L instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) L;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            scheduledFuture = mo66772N(scheduledExecutorService, runnable, coroutineContext, j);
        }
        if (scheduledFuture != null) {
            return new yh1(scheduledFuture);
        }
        return C7758b.f40363x.mo51195i(j, runnable, coroutineContext);
    }

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor L = mo66771L();
            C7208i7.m58864a();
            L.execute(runnable);
        } catch (RejectedExecutionException e) {
            C7208i7.m58864a();
            mo66770K(coroutineContext, e);
            qh1.m71265b().mo3894m(coroutineContext, runnable);
        }
    }

    public String toString() {
        return mo66771L().toString();
    }
}
