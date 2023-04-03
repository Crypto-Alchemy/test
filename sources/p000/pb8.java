package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pb8 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public abstract class pb8 extends z68 implements ExecutorService {
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo41738b().awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public abstract ExecutorService mo41738b();

    public final List invokeAll(Collection collection) throws InterruptedException {
        return mo41738b().invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) throws InterruptedException, ExecutionException {
        return mo41738b().invokeAny(collection);
    }

    public final boolean isShutdown() {
        return mo41738b().isShutdown();
    }

    public final boolean isTerminated() {
        return mo41738b().isTerminated();
    }

    public final void shutdown() {
        mo41738b().shutdown();
    }

    public final List shutdownNow() {
        return mo41738b().shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return mo41738b().submit(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo41738b().invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo41738b().invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return mo41738b().submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return mo41738b().submit(callable);
    }
}
