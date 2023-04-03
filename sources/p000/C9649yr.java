package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java8.util.concurrent.CompletableFuture;

/* renamed from: yr */
/* compiled from: Async */
public class C9649yr {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new C9469vr()));
    }

    public static ScheduledExecutorService defaultExecutorService() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(getCpuCount());
        Runtime.getRuntime().addShutdownHook(new Thread(new C9608xr(newScheduledThreadPool)));
        return newScheduledThreadPool;
    }

    private static int getCpuCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$run$1(CompletableFuture completableFuture, Callable callable) {
        try {
            completableFuture.mo44152e(callable.call());
        } catch (Throwable th) {
            completableFuture.mo44153f(th);
        }
    }

    public static <T> CompletableFuture<T> run(Callable<T> callable) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        CompletableFuture.m46213r(new C9560wr(completableFuture, callable), executor);
        return completableFuture;
    }

    /* access modifiers changed from: private */
    public static void shutdown(ExecutorService executorService) {
        executorService.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(60, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(60, timeUnit)) {
                    System.err.println("Thread pool did not terminate");
                }
            }
        } catch (InterruptedException unused) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
