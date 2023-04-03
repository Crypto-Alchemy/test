package p018io.reactivex.internal.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.nm5;
import p018io.reactivex.internal.disposables.DisposableHelper;
import p018io.reactivex.internal.disposables.EmptyDisposable;
import p018io.reactivex.internal.disposables.SequentialDisposable;
import p018io.reactivex.internal.queue.MpscLinkedQueue;

/* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler */
public final class ExecutorScheduler extends nm5 {

    /* renamed from: c */
    public static final nm5 f30047c = sm5.m51862c();

    /* renamed from: b */
    public final Executor f30048b;

    /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$DelayedRunnable */
    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, th1 {
        private static final long serialVersionUID = -4101336210206799084L;
        public final SequentialDisposable direct = new SequentialDisposable();
        public final SequentialDisposable timed = new SequentialDisposable();

        public DelayedRunnable(Runnable runnable) {
            super(runnable);
        }

        public void dispose() {
            if (getAndSet((Object) null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        public Runnable getWrappedRunnable() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                return runnable;
            }
            return ee2.f28594b;
        }

        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet((Object) null);
                    SequentialDisposable sequentialDisposable = this.timed;
                    DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                    sequentialDisposable.lazySet(disposableHelper);
                    this.direct.lazySet(disposableHelper);
                } catch (Throwable th) {
                    lazySet((Object) null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker */
    public static final class ExecutorWorker extends nm5.C6288b implements Runnable {

        /* renamed from: a */
        public final Executor f30049a;

        /* renamed from: d */
        public final MpscLinkedQueue<Runnable> f30050d;

        /* renamed from: e */
        public volatile boolean f30051e;

        /* renamed from: g */
        public final AtomicInteger f30052g = new AtomicInteger();

        /* renamed from: k */
        public final pn0 f30053k = new pn0();

        /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$BooleanRunnable */
        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, th1 {
            private static final long serialVersionUID = -2421395018820541164L;
            public final Runnable actual;

            public BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }

            public void dispose() {
                lazySet(true);
            }

            public boolean isDisposed() {
                return get();
            }

            public void run() {
                if (!get()) {
                    try {
                        this.actual.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$a */
        public final class C5988a implements Runnable {

            /* renamed from: a */
            public final SequentialDisposable f30054a;

            /* renamed from: d */
            public final Runnable f30055d;

            public C5988a(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f30054a = sequentialDisposable;
                this.f30055d = runnable;
            }

            public void run() {
                this.f30054a.replace(ExecutorWorker.this.mo42930b(this.f30055d));
            }
        }

        public ExecutorWorker(Executor executor) {
            this.f30049a = executor;
            this.f30050d = new MpscLinkedQueue<>();
        }

        /* renamed from: b */
        public th1 mo42930b(Runnable runnable) {
            if (this.f30051e) {
                return EmptyDisposable.INSTANCE;
            }
            BooleanRunnable booleanRunnable = new BooleanRunnable(ti5.m52313n(runnable));
            this.f30050d.offer(booleanRunnable);
            if (this.f30052g.getAndIncrement() == 0) {
                try {
                    this.f30049a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f30051e = true;
                    this.f30050d.clear();
                    ti5.m52312m(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return booleanRunnable;
        }

        /* renamed from: c */
        public th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo42930b(runnable);
            }
            if (this.f30051e) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new C5988a(sequentialDisposable2, ti5.m52313n(runnable)), this.f30053k);
            this.f30053k.mo46787a(scheduledRunnable);
            Executor executor = this.f30049a;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule(scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f30051e = true;
                    ti5.m52312m(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new di1(ExecutorScheduler.f30047c.mo42928c(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }

        public void dispose() {
            if (!this.f30051e) {
                this.f30051e = true;
                this.f30053k.dispose();
                if (this.f30052g.getAndIncrement() == 0) {
                    this.f30050d.clear();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.f30052g.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f30051e == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Runnable> r0 = r3.f30050d
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f30051e
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f30051e
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f30052g
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f30051e
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.internal.schedulers.ExecutorScheduler.ExecutorWorker.run():void");
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$a */
    public final class C5989a implements Runnable {

        /* renamed from: a */
        public final DelayedRunnable f30057a;

        public C5989a(DelayedRunnable delayedRunnable) {
            this.f30057a = delayedRunnable;
        }

        public void run() {
            DelayedRunnable delayedRunnable = this.f30057a;
            delayedRunnable.direct.replace(ExecutorScheduler.this.mo43823d(delayedRunnable));
        }
    }

    public ExecutorScheduler(Executor executor) {
        this.f30048b = executor;
    }

    /* renamed from: a */
    public nm5.C6288b mo42927a() {
        return new ExecutorWorker(this.f30048b);
    }

    /* renamed from: c */
    public th1 mo42928c(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable n = ti5.m52313n(runnable);
        if (this.f30048b instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(n);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) this.f30048b).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e) {
                ti5.m52312m(e);
                return EmptyDisposable.INSTANCE;
            }
        } else {
            DelayedRunnable delayedRunnable = new DelayedRunnable(n);
            delayedRunnable.timed.replace(f30047c.mo42928c(new C5989a(delayedRunnable), j, timeUnit));
            return delayedRunnable;
        }
    }

    /* renamed from: d */
    public th1 mo43823d(Runnable runnable) {
        Runnable n = ti5.m52313n(runnable);
        try {
            if (this.f30048b instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(n);
                scheduledDirectTask.setFuture(((ExecutorService) this.f30048b).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(n);
            this.f30048b.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e) {
            ti5.m52312m(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
