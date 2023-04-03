package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ru0 */
/* compiled from: CrashlyticsBackgroundWorker */
public class ru0 {

    /* renamed from: a */
    public final Executor f33592a;

    /* renamed from: b */
    public tl6<Void> f33593b = jm6.m46619e(null);

    /* renamed from: c */
    public final Object f33594c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f33595d = new ThreadLocal<>();

    /* renamed from: ru0$a */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6454a implements Runnable {
        public C6454a() {
        }

        public void run() {
            ru0.this.f33595d.set(Boolean.TRUE);
        }
    }

    /* renamed from: ru0$b */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6455b implements ms0<Void, T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f33597a;

        public C6455b(Callable callable) {
            this.f33597a = callable;
        }

        /* renamed from: a */
        public T mo41856a(tl6<Void> tl6) throws Exception {
            return this.f33597a.call();
        }
    }

    /* renamed from: ru0$c */
    /* compiled from: CrashlyticsBackgroundWorker */
    public class C6456c implements ms0<T, Void> {
        public C6456c() {
        }

        /* renamed from: b */
        public Void mo41856a(tl6<T> tl6) throws Exception {
            return null;
        }
    }

    public ru0(Executor executor) {
        this.f33592a = executor;
        executor.execute(new C6454a());
    }

    /* renamed from: b */
    public void mo47497b() {
        if (!mo47500e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo47498c() {
        return this.f33592a;
    }

    /* renamed from: d */
    public final <T> tl6<Void> mo47499d(tl6<T> tl6) {
        return tl6.mo48138i(this.f33592a, new C6456c());
    }

    /* renamed from: e */
    public final boolean mo47500e() {
        return Boolean.TRUE.equals(this.f33595d.get());
    }

    /* renamed from: f */
    public final <T> ms0<Void, T> mo47501f(Callable<T> callable) {
        return new C6455b(callable);
    }

    /* renamed from: g */
    public <T> tl6<T> mo47502g(Callable<T> callable) {
        tl6<TContinuationResult> i;
        synchronized (this.f33594c) {
            i = this.f33593b.mo48138i(this.f33592a, mo47501f(callable));
            this.f33593b = mo47499d(i);
        }
        return i;
    }

    /* renamed from: h */
    public <T> tl6<T> mo47503h(Callable<tl6<T>> callable) {
        tl6<TContinuationResult> j;
        synchronized (this.f33594c) {
            j = this.f33593b.mo48139j(this.f33592a, mo47501f(callable));
            this.f33593b = mo47499d(j);
        }
        return j;
    }
}
