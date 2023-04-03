package p000;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ii */
/* compiled from: AndroidExecutors */
public final class C2543ii {

    /* renamed from: b */
    public static final C2543ii f13265b = new C2543ii();

    /* renamed from: c */
    public static final int f13266c;

    /* renamed from: d */
    public static final int f13267d;

    /* renamed from: e */
    public static final int f13268e;

    /* renamed from: a */
    public final Executor f13269a = new C2545b();

    /* renamed from: ii$b */
    /* compiled from: AndroidExecutors */
    public static class C2545b implements Executor {
        public C2545b() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f13266c = availableProcessors;
        f13267d = availableProcessors + 1;
        f13268e = (availableProcessors * 2) + 1;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m19632a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    /* renamed from: b */
    public static ExecutorService m19633b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f13267d, f13268e, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m19632a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static Executor m19634c() {
        return f13265b.f13269a;
    }
}
