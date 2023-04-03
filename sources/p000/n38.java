package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: n38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class n38 implements j38 {
    public /* synthetic */ n38(l38 l38) {
    }

    /* renamed from: a */
    public final ExecutorService mo44046a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo44047b(ThreadFactory threadFactory, int i) {
        return mo44046a(1, threadFactory, 1);
    }
}
