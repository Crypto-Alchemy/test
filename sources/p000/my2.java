package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.nm5;
import p018io.reactivex.internal.disposables.EmptyDisposable;
import p018io.reactivex.internal.schedulers.C5991a;
import p018io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: my2 */
/* compiled from: IoScheduler */
public final class my2 extends nm5 {

    /* renamed from: d */
    public static final RxThreadFactory f31884d;

    /* renamed from: e */
    public static final RxThreadFactory f31885e;

    /* renamed from: f */
    public static final TimeUnit f31886f = TimeUnit.SECONDS;

    /* renamed from: g */
    public static final C6270c f31887g;

    /* renamed from: h */
    public static final C6268a f31888h;

    /* renamed from: b */
    public final ThreadFactory f31889b;

    /* renamed from: c */
    public final AtomicReference<C6268a> f31890c;

    /* renamed from: my2$a */
    /* compiled from: IoScheduler */
    public static final class C6268a implements Runnable {

        /* renamed from: a */
        public final long f31891a;

        /* renamed from: d */
        public final ConcurrentLinkedQueue<C6270c> f31892d;

        /* renamed from: e */
        public final pn0 f31893e;

        /* renamed from: g */
        public final ScheduledExecutorService f31894g;

        /* renamed from: k */
        public final Future<?> f31895k;

        /* renamed from: r */
        public final ThreadFactory f31896r;

        public C6268a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f31891a = j3;
            this.f31892d = new ConcurrentLinkedQueue<>();
            this.f31893e = new pn0();
            this.f31896r = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, my2.f31885e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f31894g = scheduledExecutorService;
            this.f31895k = scheduledFuture;
        }

        /* renamed from: a */
        public void mo45924a() {
            if (!this.f31892d.isEmpty()) {
                long c = mo45926c();
                Iterator<C6270c> it = this.f31892d.iterator();
                while (it.hasNext()) {
                    C6270c next = it.next();
                    if (next.mo45930g() > c) {
                        return;
                    }
                    if (this.f31892d.remove(next)) {
                        this.f31893e.mo46788b(next);
                    }
                }
            }
        }

        /* renamed from: b */
        public C6270c mo45925b() {
            if (this.f31893e.mo46791e()) {
                return my2.f31887g;
            }
            while (!this.f31892d.isEmpty()) {
                C6270c poll = this.f31892d.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C6270c cVar = new C6270c(this.f31896r);
            this.f31893e.mo46787a(cVar);
            return cVar;
        }

        /* renamed from: c */
        public long mo45926c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void mo45927d(C6270c cVar) {
            cVar.mo45931h(mo45926c() + this.f31891a);
            this.f31892d.offer(cVar);
        }

        /* renamed from: e */
        public void mo45928e() {
            this.f31893e.dispose();
            Future<?> future = this.f31895k;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f31894g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo45924a();
        }
    }

    /* renamed from: my2$b */
    /* compiled from: IoScheduler */
    public static final class C6269b extends nm5.C6288b {

        /* renamed from: a */
        public final pn0 f31897a;

        /* renamed from: d */
        public final C6268a f31898d;

        /* renamed from: e */
        public final C6270c f31899e;

        /* renamed from: g */
        public final AtomicBoolean f31900g = new AtomicBoolean();

        public C6269b(C6268a aVar) {
            this.f31898d = aVar;
            this.f31897a = new pn0();
            this.f31899e = aVar.mo45925b();
        }

        /* renamed from: c */
        public th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f31897a.mo46791e()) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f31899e.mo43839d(runnable, j, timeUnit, this.f31897a);
        }

        public void dispose() {
            if (this.f31900g.compareAndSet(false, true)) {
                this.f31897a.dispose();
                this.f31898d.mo45927d(this.f31899e);
            }
        }
    }

    /* renamed from: my2$c */
    /* compiled from: IoScheduler */
    public static final class C6270c extends C5991a {

        /* renamed from: e */
        public long f31901e = 0;

        public C6270c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: g */
        public long mo45930g() {
            return this.f31901e;
        }

        /* renamed from: h */
        public void mo45931h(long j) {
            this.f31901e = j;
        }
    }

    static {
        C6270c cVar = new C6270c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f31887g = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max);
        f31884d = rxThreadFactory;
        f31885e = new RxThreadFactory("RxCachedWorkerPoolEvictor", max);
        C6268a aVar = new C6268a(0, (TimeUnit) null, rxThreadFactory);
        f31888h = aVar;
        aVar.mo45928e();
    }

    public my2() {
        this(f31884d);
    }

    /* renamed from: a */
    public nm5.C6288b mo42927a() {
        return new C6269b(this.f31890c.get());
    }

    /* renamed from: d */
    public void mo45923d() {
        C6268a aVar = new C6268a(60, f31886f, this.f31889b);
        if (!ao0.m10672a(this.f31890c, f31888h, aVar)) {
            aVar.mo45928e();
        }
    }

    public my2(ThreadFactory threadFactory) {
        this.f31889b = threadFactory;
        this.f31890c = new AtomicReference<>(f31888h);
        mo45923d();
    }
}
