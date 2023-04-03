package p000;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: lm5 */
/* compiled from: ScheduledFutureImpl */
public class lm5<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    public final Handler f14588a;

    /* renamed from: d */
    public final FutureTask<V> f14589d;

    public lm5(Handler handler, Callable<V> callable) {
        this.f14588a = handler;
        this.f14589d = new FutureTask<>(callable);
    }

    /* renamed from: a */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public boolean cancel(boolean z) {
        return this.f14589d.cancel(z);
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.f14589d.get();
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.f14589d.isCancelled();
    }

    public boolean isDone() {
        return this.f14589d.isDone();
    }

    public void run() {
        this.f14589d.run();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f14589d.get(j, timeUnit);
    }

    public lm5(Handler handler, Runnable runnable, V v) {
        this.f14588a = handler;
        this.f14589d = new FutureTask<>(runnable, v);
    }
}
