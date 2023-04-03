package p000;

import java.util.concurrent.TimeUnit;
import p018io.reactivex.internal.schedulers.C5991a;

/* renamed from: nm5 */
/* compiled from: Scheduler */
public abstract class nm5 {

    /* renamed from: a */
    public static final long f32150a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: nm5$a */
    /* compiled from: Scheduler */
    public static final class C6287a implements th1, Runnable {

        /* renamed from: a */
        public final Runnable f32151a;

        /* renamed from: d */
        public final C6288b f32152d;

        /* renamed from: e */
        public Thread f32153e;

        public C6287a(Runnable runnable, C6288b bVar) {
            this.f32151a = runnable;
            this.f32152d = bVar;
        }

        public void dispose() {
            if (this.f32153e == Thread.currentThread()) {
                C6288b bVar = this.f32152d;
                if (bVar instanceof C5991a) {
                    ((C5991a) bVar).mo43841f();
                    return;
                }
            }
            this.f32152d.dispose();
        }

        public void run() {
            this.f32153e = Thread.currentThread();
            try {
                this.f32151a.run();
            } finally {
                dispose();
                this.f32153e = null;
            }
        }
    }

    /* renamed from: nm5$b */
    /* compiled from: Scheduler */
    public static abstract class C6288b implements th1 {
        /* renamed from: a */
        public long mo46107a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public th1 mo42930b(Runnable runnable) {
            return mo42931c(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit);
    }

    /* renamed from: a */
    public abstract C6288b mo42927a();

    /* renamed from: b */
    public long mo46105b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public th1 mo42928c(Runnable runnable, long j, TimeUnit timeUnit) {
        C6288b a = mo42927a();
        C6287a aVar = new C6287a(ti5.m52313n(runnable), a);
        a.mo42931c(aVar, j, timeUnit);
        return aVar;
    }
}
