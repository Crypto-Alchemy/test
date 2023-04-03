package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: jo0 */
/* compiled from: ConcurrencyHelpers */
public class jo0 {

    /* renamed from: jo0$a */
    /* compiled from: ConcurrencyHelpers */
    public static class C2623a {
        /* renamed from: a */
        public static Handler m20289a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m20286b(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new io0(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m20287c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    public static Handler m20288d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2623a.m20289a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
