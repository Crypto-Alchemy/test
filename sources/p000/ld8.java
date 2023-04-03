package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ld8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class ld8 implements gd8 {
    public /* synthetic */ ld8(kd8 kd8) {
    }

    /* renamed from: b */
    public static final ExecutorService m47778b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: a */
    public final ExecutorService mo42874a(ThreadFactory threadFactory, int i) {
        return m47778b(1, threadFactory, 1);
    }
}
