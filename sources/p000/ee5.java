package p000;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ee5 */
/* compiled from: RequestExecutor */
public class ee5 {

    /* renamed from: ee5$a */
    /* compiled from: RequestExecutor */
    public static class C2222a implements ThreadFactory {

        /* renamed from: a */
        public String f11131a;

        /* renamed from: d */
        public int f11132d;

        /* renamed from: ee5$a$a */
        /* compiled from: RequestExecutor */
        public static class C2223a extends Thread {

            /* renamed from: a */
            public final int f11133a;

            public C2223a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f11133a = i;
            }

            public void run() {
                Process.setThreadPriority(this.f11133a);
                super.run();
            }
        }

        public C2222a(String str, int i) {
            this.f11131a = str;
            this.f11132d = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C2223a(runnable, this.f11131a, this.f11132d);
        }
    }

    /* renamed from: ee5$b */
    /* compiled from: RequestExecutor */
    public static class C2224b<T> implements Runnable {

        /* renamed from: a */
        public Callable<T> f11134a;

        /* renamed from: d */
        public yq0<T> f11135d;

        /* renamed from: e */
        public Handler f11136e;

        /* renamed from: ee5$b$a */
        /* compiled from: RequestExecutor */
        public class C2225a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ yq0 f11137a;

            /* renamed from: d */
            public final /* synthetic */ Object f11138d;

            public C2225a(yq0 yq0, Object obj) {
                this.f11137a = yq0;
                this.f11138d = obj;
            }

            public void run() {
                this.f11137a.accept(this.f11138d);
            }
        }

        public C2224b(Handler handler, Callable<T> callable, yq0<T> yq0) {
            this.f11134a = callable;
            this.f11135d = yq0;
            this.f11136e = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f11134a.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f11136e.post(new C2225a(this.f11135d, t));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m16080a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C2222a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static <T> void m16081b(Executor executor, Callable<T> callable, yq0<T> yq0) {
        executor.execute(new C2224b(t90.m27646a(), callable, yq0));
    }

    /* renamed from: c */
    public static <T> T m16082c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
