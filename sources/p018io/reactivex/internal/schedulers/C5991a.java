package p018io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000.nm5;
import p018io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: io.reactivex.internal.schedulers.a */
/* compiled from: NewThreadWorker */
public class C5991a extends nm5.C6288b {

    /* renamed from: a */
    public final ScheduledExecutorService f30059a;

    /* renamed from: d */
    public volatile boolean f30060d;

    public C5991a(ThreadFactory threadFactory) {
        this.f30059a = qm5.m50639a(threadFactory);
    }

    /* renamed from: b */
    public th1 mo42930b(Runnable runnable) {
        return mo42931c(runnable, 0, (TimeUnit) null);
    }

    /* renamed from: c */
    public th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f30060d) {
            return EmptyDisposable.INSTANCE;
        }
        return mo43839d(runnable, j, timeUnit, (uh1) null);
    }

    /* renamed from: d */
    public ScheduledRunnable mo43839d(Runnable runnable, long j, TimeUnit timeUnit, uh1 uh1) {
        Future future;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(ti5.m52313n(runnable), uh1);
        if (uh1 != null && !uh1.mo46787a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        if (j <= 0) {
            try {
                future = this.f30059a.submit(scheduledRunnable);
            } catch (RejectedExecutionException e) {
                if (uh1 != null) {
                    uh1.mo46788b(scheduledRunnable);
                }
                ti5.m52312m(e);
            }
        } else {
            future = this.f30059a.schedule(scheduledRunnable, j, timeUnit);
        }
        scheduledRunnable.setFuture(future);
        return scheduledRunnable;
    }

    public void dispose() {
        if (!this.f30060d) {
            this.f30060d = true;
            this.f30059a.shutdownNow();
        }
    }

    /* renamed from: e */
    public th1 mo43840e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(ti5.m52313n(runnable));
        if (j <= 0) {
            try {
                future = this.f30059a.submit(scheduledDirectTask);
            } catch (RejectedExecutionException e) {
                ti5.m52312m(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            future = this.f30059a.schedule(scheduledDirectTask, j, timeUnit);
        }
        scheduledDirectTask.setFuture(future);
        return scheduledDirectTask;
    }

    /* renamed from: f */
    public void mo43841f() {
        if (!this.f30060d) {
            this.f30060d = true;
            this.f30059a.shutdown();
        }
    }
}
