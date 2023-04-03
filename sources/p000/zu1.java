package p000;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zu1 */
/* compiled from: ExecutorUtils */
public final class zu1 {

    /* renamed from: zu1$a */
    /* compiled from: ExecutorUtils */
    public class C6776a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f36269a;

        /* renamed from: d */
        public final /* synthetic */ AtomicLong f36270d;

        /* renamed from: zu1$a$a */
        /* compiled from: ExecutorUtils */
        public class C6777a extends C6711xw {

            /* renamed from: a */
            public final /* synthetic */ Runnable f36271a;

            public C6777a(Runnable runnable) {
                this.f36271a = runnable;
            }

            /* renamed from: a */
            public void mo49558a() {
                this.f36271a.run();
            }
        }

        public C6776a(String str, AtomicLong atomicLong) {
            this.f36269a = str;
            this.f36270d = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C6777a(runnable));
            newThread.setName(this.f36269a + this.f36270d.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: zu1$b */
    /* compiled from: ExecutorUtils */
    public class C6778b extends C6711xw {

        /* renamed from: a */
        public final /* synthetic */ String f36273a;

        /* renamed from: d */
        public final /* synthetic */ ExecutorService f36274d;

        /* renamed from: e */
        public final /* synthetic */ long f36275e;

        /* renamed from: g */
        public final /* synthetic */ TimeUnit f36276g;

        public C6778b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f36273a = str;
            this.f36274d = executorService;
            this.f36275e = j;
            this.f36276g = timeUnit;
        }

        /* renamed from: a */
        public void mo49558a() {
            try {
                rk3 f = rk3.m51112f();
                f.mo47423b("Executing shutdown hook for " + this.f36273a);
                this.f36274d.shutdown();
                if (!this.f36274d.awaitTermination(this.f36275e, this.f36276g)) {
                    rk3 f2 = rk3.m51112f();
                    f2.mo47423b(this.f36273a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f36274d.shutdownNow();
                }
            } catch (InterruptedException unused) {
                rk3.m51112f().mo47423b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f36273a}));
                this.f36274d.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static void m55258a(String str, ExecutorService executorService) {
        m55259b(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static void m55259b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C6778b bVar = new C6778b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m55260c(String str) {
        ExecutorService e = m55262e(m55261d(str), new ThreadPoolExecutor.DiscardPolicy());
        m55258a(str, e);
        return e;
    }

    /* renamed from: d */
    public static ThreadFactory m55261d(String str) {
        return new C6776a(str, new AtomicLong(1));
    }

    /* renamed from: e */
    public static ExecutorService m55262e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
