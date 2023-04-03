package p000;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.nm5;
import p018io.reactivex.disposables.C5978a;
import p018io.reactivex.internal.disposables.EmptyDisposable;

/* renamed from: mt6 */
/* compiled from: TrampolineScheduler */
public final class mt6 extends nm5 {

    /* renamed from: b */
    public static final mt6 f31796b = new mt6();

    /* renamed from: mt6$a */
    /* compiled from: TrampolineScheduler */
    public static final class C6258a implements Runnable {

        /* renamed from: a */
        public final Runnable f31797a;

        /* renamed from: d */
        public final C6260c f31798d;

        /* renamed from: e */
        public final long f31799e;

        public C6258a(Runnable runnable, C6260c cVar, long j) {
            this.f31797a = runnable;
            this.f31798d = cVar;
            this.f31799e = j;
        }

        public void run() {
            if (!this.f31798d.f31807g) {
                long a = this.f31798d.mo46107a(TimeUnit.MILLISECONDS);
                long j = this.f31799e;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ti5.m52312m(e);
                        return;
                    }
                }
                if (!this.f31798d.f31807g) {
                    this.f31797a.run();
                }
            }
        }
    }

    /* renamed from: mt6$b */
    /* compiled from: TrampolineScheduler */
    public static final class C6259b implements Comparable<C6259b> {

        /* renamed from: a */
        public final Runnable f31800a;

        /* renamed from: d */
        public final long f31801d;

        /* renamed from: e */
        public final int f31802e;

        /* renamed from: g */
        public volatile boolean f31803g;

        public C6259b(Runnable runnable, Long l, int i) {
            this.f31800a = runnable;
            this.f31801d = l.longValue();
            this.f31802e = i;
        }

        /* renamed from: a */
        public int compareTo(C6259b bVar) {
            int b = af4.m31826b(this.f31801d, bVar.f31801d);
            if (b == 0) {
                return af4.m31825a(this.f31802e, bVar.f31802e);
            }
            return b;
        }
    }

    /* renamed from: mt6$c */
    /* compiled from: TrampolineScheduler */
    public static final class C6260c extends nm5.C6288b {

        /* renamed from: a */
        public final PriorityBlockingQueue<C6259b> f31804a = new PriorityBlockingQueue<>();

        /* renamed from: d */
        public final AtomicInteger f31805d = new AtomicInteger();

        /* renamed from: e */
        public final AtomicInteger f31806e = new AtomicInteger();

        /* renamed from: g */
        public volatile boolean f31807g;

        /* renamed from: mt6$c$a */
        /* compiled from: TrampolineScheduler */
        public final class C6261a implements Runnable {

            /* renamed from: a */
            public final C6259b f31808a;

            public C6261a(C6259b bVar) {
                this.f31808a = bVar;
            }

            public void run() {
                this.f31808a.f31803g = true;
                C6260c.this.f31804a.remove(this.f31808a);
            }
        }

        /* renamed from: b */
        public th1 mo42930b(Runnable runnable) {
            return mo45906d(runnable, mo46107a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: c */
        public th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo46107a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo45906d(new C6258a(runnable, this, a), a);
        }

        /* renamed from: d */
        public th1 mo45906d(Runnable runnable, long j) {
            if (this.f31807g) {
                return EmptyDisposable.INSTANCE;
            }
            C6259b bVar = new C6259b(runnable, Long.valueOf(j), this.f31806e.incrementAndGet());
            this.f31804a.add(bVar);
            if (this.f31805d.getAndIncrement() != 0) {
                return C5978a.m45832b(new C6261a(bVar));
            }
            int i = 1;
            while (!this.f31807g) {
                C6259b poll = this.f31804a.poll();
                if (poll == null) {
                    i = this.f31805d.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.f31803g) {
                    poll.f31800a.run();
                }
            }
            this.f31804a.clear();
            return EmptyDisposable.INSTANCE;
        }

        public void dispose() {
            this.f31807g = true;
        }
    }

    /* renamed from: d */
    public static mt6 m48474d() {
        return f31796b;
    }

    /* renamed from: a */
    public nm5.C6288b mo42927a() {
        return new C6260c();
    }

    /* renamed from: c */
    public th1 mo42928c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            ti5.m52313n(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ti5.m52312m(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
