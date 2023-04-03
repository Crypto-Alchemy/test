package p018io.reactivex.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.nm5;
import p018io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: io.reactivex.internal.schedulers.b */
/* compiled from: SingleScheduler */
public final class C5992b extends nm5 {

    /* renamed from: d */
    public static final RxThreadFactory f30061d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    public static final ScheduledExecutorService f30062e;

    /* renamed from: b */
    public final ThreadFactory f30063b;

    /* renamed from: c */
    public final AtomicReference<ScheduledExecutorService> f30064c;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    /* compiled from: SingleScheduler */
    public static final class C5993a extends nm5.C6288b {

        /* renamed from: a */
        public final ScheduledExecutorService f30065a;

        /* renamed from: d */
        public final pn0 f30066d = new pn0();

        /* renamed from: e */
        public volatile boolean f30067e;

        public C5993a(ScheduledExecutorService scheduledExecutorService) {
            this.f30065a = scheduledExecutorService;
        }

        /* renamed from: c */
        public th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f30067e) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(ti5.m52313n(runnable), this.f30066d);
            this.f30066d.mo46787a(scheduledRunnable);
            if (j <= 0) {
                try {
                    future = this.f30065a.submit(scheduledRunnable);
                } catch (RejectedExecutionException e) {
                    dispose();
                    ti5.m52312m(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                future = this.f30065a.schedule(scheduledRunnable, j, timeUnit);
            }
            scheduledRunnable.setFuture(future);
            return scheduledRunnable;
        }

        public void dispose() {
            if (!this.f30067e) {
                this.f30067e = true;
                this.f30066d.dispose();
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f30062e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C5992b() {
        this(f30061d);
    }

    /* renamed from: d */
    public static ScheduledExecutorService m45870d(ThreadFactory threadFactory) {
        return qm5.m50639a(threadFactory);
    }

    /* renamed from: a */
    public nm5.C6288b mo42927a() {
        return new C5993a(this.f30064c.get());
    }

    /* renamed from: c */
    public th1 mo42928c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(ti5.m52313n(runnable));
        if (j <= 0) {
            try {
                future = this.f30064c.get().submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                ti5.m52312m(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f30064c.get().schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    public C5992b(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f30064c = atomicReference;
        this.f30063b = threadFactory;
        atomicReference.lazySet(m45870d(threadFactory));
    }
}
