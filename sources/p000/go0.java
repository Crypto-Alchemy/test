package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.nm5;
import p018io.reactivex.internal.disposables.EmptyDisposable;
import p018io.reactivex.internal.schedulers.C5991a;
import p018io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: go0 */
/* compiled from: ComputationScheduler */
public final class go0 extends nm5 {

    /* renamed from: d */
    public static final C5874b f29308d;

    /* renamed from: e */
    public static final RxThreadFactory f29309e;

    /* renamed from: f */
    public static final int f29310f = m44796d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    public static final C5875c f29311g;

    /* renamed from: b */
    public final ThreadFactory f29312b;

    /* renamed from: c */
    public final AtomicReference<C5874b> f29313c;

    /* renamed from: go0$a */
    /* compiled from: ComputationScheduler */
    public static final class C5873a extends nm5.C6288b {

        /* renamed from: a */
        public final yh3 f29314a;

        /* renamed from: d */
        public final pn0 f29315d;

        /* renamed from: e */
        public final yh3 f29316e;

        /* renamed from: g */
        public final C5875c f29317g;

        /* renamed from: k */
        public volatile boolean f29318k;

        public C5873a(C5875c cVar) {
            this.f29317g = cVar;
            yh3 yh3 = new yh3();
            this.f29314a = yh3;
            pn0 pn0 = new pn0();
            this.f29315d = pn0;
            yh3 yh32 = new yh3();
            this.f29316e = yh32;
            yh32.mo46787a(yh3);
            yh32.mo46787a(pn0);
        }

        /* renamed from: b */
        public th1 mo42930b(Runnable runnable) {
            if (this.f29318k) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f29317g.mo43839d(runnable, 0, TimeUnit.MILLISECONDS, this.f29314a);
        }

        /* renamed from: c */
        public th1 mo42931c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f29318k) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f29317g.mo43839d(runnable, j, timeUnit, this.f29315d);
        }

        public void dispose() {
            if (!this.f29318k) {
                this.f29318k = true;
                this.f29316e.dispose();
            }
        }
    }

    /* renamed from: go0$b */
    /* compiled from: ComputationScheduler */
    public static final class C5874b {

        /* renamed from: a */
        public final int f29319a;

        /* renamed from: b */
        public final C5875c[] f29320b;

        /* renamed from: c */
        public long f29321c;

        public C5874b(int i, ThreadFactory threadFactory) {
            this.f29319a = i;
            this.f29320b = new C5875c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f29320b[i2] = new C5875c(threadFactory);
            }
        }

        /* renamed from: a */
        public C5875c mo42932a() {
            int i = this.f29319a;
            if (i == 0) {
                return go0.f29311g;
            }
            C5875c[] cVarArr = this.f29320b;
            long j = this.f29321c;
            this.f29321c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo42933b() {
            for (C5875c dispose : this.f29320b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: go0$c */
    /* compiled from: ComputationScheduler */
    public static final class C5875c extends C5991a {
        public C5875c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C5875c cVar = new C5875c(new RxThreadFactory("RxComputationShutdown"));
        f29311g = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f29309e = rxThreadFactory;
        C5874b bVar = new C5874b(0, rxThreadFactory);
        f29308d = bVar;
        bVar.mo42933b();
    }

    public go0() {
        this(f29309e);
    }

    /* renamed from: d */
    public static int m44796d(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public nm5.C6288b mo42927a() {
        return new C5873a(this.f29313c.get().mo42932a());
    }

    /* renamed from: c */
    public th1 mo42928c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f29313c.get().mo42932a().mo43840e(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public void mo42929e() {
        C5874b bVar = new C5874b(f29310f, this.f29312b);
        if (!ao0.m10672a(this.f29313c, f29308d, bVar)) {
            bVar.mo42933b();
        }
    }

    public go0(ThreadFactory threadFactory) {
        this.f29312b = threadFactory;
        this.f29313c = new AtomicReference<>(f29308d);
        mo42929e();
    }
}
