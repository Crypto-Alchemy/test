package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bs8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class bs8 implements po8 {
    public bs8() {
    }

    /* renamed from: j */
    public final ExecutorService mo29730j(int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
