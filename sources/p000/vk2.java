package p000;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: vk2 */
/* compiled from: HandlerExecutorServiceImpl */
public class vk2 extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a */
    public final Handler f18814a;

    public vk2(Handler handler) {
        this.f18814a = handler;
    }

    /* renamed from: a */
    public boolean mo27157a() {
        if (Thread.currentThread() == this.f18814a.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <T> lm5<T> newTaskFor(Runnable runnable, T t) {
        return new lm5<>(this.f18814a, runnable, t);
    }

    /* renamed from: c */
    public <T> lm5<T> newTaskFor(Callable<T> callable) {
        return new lm5<>(this.f18814a, callable);
    }

    /* renamed from: d */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Object) null);
    }

    /* renamed from: e */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        runnable.getClass();
        lm5 b = newTaskFor(runnable, t);
        execute(b);
        return b;
    }

    public void execute(Runnable runnable) {
        this.f18814a.post(runnable);
    }

    /* renamed from: f */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        lm5<T> c = newTaskFor(callable);
        execute(c);
        return c;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        lm5 b = newTaskFor(runnable, (Object) null);
        this.f18814a.postDelayed(b, timeUnit.toMillis(j));
        return b;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        lm5<T> c = newTaskFor(callable);
        this.f18814a.postDelayed(c, timeUnit.toMillis(j));
        return c;
    }
}
