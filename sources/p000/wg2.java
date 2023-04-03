package p000;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wg2 */
/* compiled from: GlideExecutor */
public final class wg2 implements ExecutorService {

    /* renamed from: d */
    public static final long f19106d = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: e */
    public static volatile int f19107e;

    /* renamed from: a */
    public final ExecutorService f19108a;

    /* renamed from: wg2$b */
    /* compiled from: GlideExecutor */
    public static final class C3540b {

        /* renamed from: a */
        public final boolean f19109a;

        /* renamed from: b */
        public int f19110b;

        /* renamed from: c */
        public int f19111c;

        /* renamed from: d */
        public final ThreadFactory f19112d = new C3541c();

        /* renamed from: e */
        public C3545e f19113e = C3545e.f19127d;

        /* renamed from: f */
        public String f19114f;

        /* renamed from: g */
        public long f19115g;

        public C3540b(boolean z) {
            this.f19109a = z;
        }

        /* renamed from: a */
        public wg2 mo27529a() {
            if (!TextUtils.isEmpty(this.f19114f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f19110b, this.f19111c, this.f19115g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C3543d(this.f19112d, this.f19114f, this.f19113e, this.f19109a));
                if (this.f19115g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new wg2(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f19114f);
        }

        /* renamed from: b */
        public C3540b mo27530b(String str) {
            this.f19114f = str;
            return this;
        }

        /* renamed from: c */
        public C3540b mo27531c(int i) {
            this.f19110b = i;
            this.f19111c = i;
            return this;
        }
    }

    /* renamed from: wg2$c */
    /* compiled from: GlideExecutor */
    public static final class C3541c implements ThreadFactory {

        /* renamed from: wg2$c$a */
        /* compiled from: GlideExecutor */
        public class C3542a extends Thread {
            public C3542a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public C3541c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C3542a(runnable);
        }
    }

    /* renamed from: wg2$d */
    /* compiled from: GlideExecutor */
    public static final class C3543d implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f19117a;

        /* renamed from: d */
        public final String f19118d;

        /* renamed from: e */
        public final C3545e f19119e;

        /* renamed from: g */
        public final boolean f19120g;

        /* renamed from: k */
        public final AtomicInteger f19121k = new AtomicInteger();

        /* renamed from: wg2$d$a */
        /* compiled from: GlideExecutor */
        public class C3544a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f19122a;

            public C3544a(Runnable runnable) {
                this.f19122a = runnable;
            }

            public void run() {
                if (C3543d.this.f19120g) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f19122a.run();
                } catch (Throwable th) {
                    C3543d.this.f19119e.mo27536a(th);
                }
            }
        }

        public C3543d(ThreadFactory threadFactory, String str, C3545e eVar, boolean z) {
            this.f19117a = threadFactory;
            this.f19118d = str;
            this.f19119e = eVar;
            this.f19120g = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f19117a.newThread(new C3544a(runnable));
            newThread.setName("glide-" + this.f19118d + "-thread-" + this.f19121k.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: wg2$e */
    /* compiled from: GlideExecutor */
    public interface C3545e {

        /* renamed from: a */
        public static final C3545e f19124a = new C3546a();

        /* renamed from: b */
        public static final C3545e f19125b;

        /* renamed from: c */
        public static final C3545e f19126c = new C3548c();

        /* renamed from: d */
        public static final C3545e f19127d;

        /* renamed from: wg2$e$a */
        /* compiled from: GlideExecutor */
        public class C3546a implements C3545e {
            /* renamed from: a */
            public void mo27536a(Throwable th) {
            }
        }

        /* renamed from: wg2$e$b */
        /* compiled from: GlideExecutor */
        public class C3547b implements C3545e {
            /* renamed from: a */
            public void mo27536a(Throwable th) {
            }
        }

        /* renamed from: wg2$e$c */
        /* compiled from: GlideExecutor */
        public class C3548c implements C3545e {
            /* renamed from: a */
            public void mo27536a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C3547b bVar = new C3547b();
            f19125b = bVar;
            f19127d = bVar;
        }

        /* renamed from: a */
        void mo27536a(Throwable th);
    }

    public wg2(ExecutorService executorService) {
        this.f19108a = executorService;
    }

    /* renamed from: a */
    public static int m29570a() {
        if (f19107e == 0) {
            f19107e = Math.min(4, mi5.m22320a());
        }
        return f19107e;
    }

    /* renamed from: b */
    public static C3540b m29571b() {
        int i;
        if (m29570a() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        return new C3540b(true).mo27531c(i).mo27530b("animation");
    }

    /* renamed from: c */
    public static wg2 m29572c() {
        return m29571b().mo27529a();
    }

    /* renamed from: d */
    public static C3540b m29573d() {
        return new C3540b(true).mo27531c(1).mo27530b("disk-cache");
    }

    /* renamed from: e */
    public static wg2 m29574e() {
        return m29573d().mo27529a();
    }

    /* renamed from: f */
    public static C3540b m29575f() {
        return new C3540b(false).mo27531c(m29570a()).mo27530b("source");
    }

    /* renamed from: g */
    public static wg2 m29576g() {
        return m29575f().mo27529a();
    }

    /* renamed from: h */
    public static wg2 m29577h() {
        return new wg2(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f19106d, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C3543d(new C3541c(), "source-unlimited", C3545e.f19127d, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f19108a.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f19108a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f19108a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f19108a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f19108a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f19108a.isTerminated();
    }

    public void shutdown() {
        this.f19108a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f19108a.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f19108a.submit(runnable);
    }

    public String toString() {
        return this.f19108a.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f19108a.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f19108a.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f19108a.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f19108a.submit(callable);
    }
}
