package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: y90 */
/* compiled from: CallerThreadExecutor */
public class y90 extends AbstractExecutorService {

    /* renamed from: a */
    public static final y90 f20098a = new y90();

    /* renamed from: a */
    public static y90 m30486a() {
        return f20098a;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return true;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
    }

    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
