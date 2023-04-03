package p000;

import bolts.ExecutorException;
import bolts.UnobservedTaskException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: sl6 */
/* compiled from: Task */
public class sl6<TResult> {

    /* renamed from: i */
    public static final ExecutorService f17703i = q30.m25352a();

    /* renamed from: j */
    public static final Executor f17704j = q30.m25353b();

    /* renamed from: k */
    public static final Executor f17705k = C2543ii.m19634c();

    /* renamed from: l */
    public static volatile C3282d f17706l;

    /* renamed from: m */
    public static sl6<?> f17707m = new sl6<>((Object) null);

    /* renamed from: n */
    public static sl6<Boolean> f17708n = new sl6<>(Boolean.TRUE);

    /* renamed from: o */
    public static sl6<Boolean> f17709o = new sl6<>(Boolean.FALSE);

    /* renamed from: p */
    public static sl6<?> f17710p = new sl6<>(true);

    /* renamed from: a */
    public final Object f17711a = new Object();

    /* renamed from: b */
    public boolean f17712b;

    /* renamed from: c */
    public boolean f17713c;

    /* renamed from: d */
    public TResult f17714d;

    /* renamed from: e */
    public Exception f17715e;

    /* renamed from: f */
    public boolean f17716f;

    /* renamed from: g */
    public h47 f17717g;

    /* renamed from: h */
    public List<os0<TResult, Void>> f17718h = new ArrayList();

    /* renamed from: sl6$a */
    /* compiled from: Task */
    public class C3279a implements os0<TResult, Void> {

        /* renamed from: a */
        public final /* synthetic */ yl6 f17719a;

        /* renamed from: b */
        public final /* synthetic */ os0 f17720b;

        /* renamed from: c */
        public final /* synthetic */ Executor f17721c;

        public C3279a(yl6 yl6, os0 os0, Executor executor, ua0 ua0) {
            this.f17719a = yl6;
            this.f17720b = os0;
            this.f17721c = executor;
        }

        /* renamed from: b */
        public Void mo24095a(sl6<TResult> sl6) {
            sl6.m26957d(this.f17719a, this.f17720b, sl6, this.f17721c, (ua0) null);
            return null;
        }
    }

    /* renamed from: sl6$b */
    /* compiled from: Task */
    public static class C3280b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ yl6 f17723a;

        /* renamed from: d */
        public final /* synthetic */ os0 f17724d;

        /* renamed from: e */
        public final /* synthetic */ sl6 f17725e;

        public C3280b(ua0 ua0, yl6 yl6, os0 os0, sl6 sl6) {
            this.f17723a = yl6;
            this.f17724d = os0;
            this.f17725e = sl6;
        }

        public void run() {
            try {
                this.f17723a.mo28157d(this.f17724d.mo24095a(this.f17725e));
            } catch (CancellationException unused) {
                this.f17723a.mo28155b();
            } catch (Exception e) {
                this.f17723a.mo28156c(e);
            }
        }
    }

    /* renamed from: sl6$c */
    /* compiled from: Task */
    public static class C3281c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ yl6 f17726a;

        /* renamed from: d */
        public final /* synthetic */ Callable f17727d;

        public C3281c(ua0 ua0, yl6 yl6, Callable callable) {
            this.f17726a = yl6;
            this.f17727d = callable;
        }

        public void run() {
            try {
                this.f17726a.mo28157d(this.f17727d.call());
            } catch (CancellationException unused) {
                this.f17726a.mo28155b();
            } catch (Exception e) {
                this.f17726a.mo28156c(e);
            }
        }
    }

    /* renamed from: sl6$d */
    /* compiled from: Task */
    public interface C3282d {
        /* renamed from: a */
        void mo25868a(sl6<?> sl6, UnobservedTaskException unobservedTaskException);
    }

    public sl6() {
    }

    /* renamed from: b */
    public static <TResult> sl6<TResult> m26955b(Callable<TResult> callable, Executor executor) {
        return m26956c(callable, executor, (ua0) null);
    }

    /* renamed from: c */
    public static <TResult> sl6<TResult> m26956c(Callable<TResult> callable, Executor executor, ua0 ua0) {
        yl6 yl6 = new yl6();
        try {
            executor.execute(new C3281c(ua0, yl6, callable));
        } catch (Exception e) {
            yl6.mo28156c(new ExecutorException(e));
        }
        return yl6.mo28154a();
    }

    /* renamed from: d */
    public static <TContinuationResult, TResult> void m26957d(yl6<TContinuationResult> yl6, os0<TResult, TContinuationResult> os0, sl6<TResult> sl6, Executor executor, ua0 ua0) {
        try {
            executor.execute(new C3280b(ua0, yl6, os0, sl6));
        } catch (Exception e) {
            yl6.mo28156c(new ExecutorException(e));
        }
    }

    /* renamed from: g */
    public static <TResult> sl6<TResult> m26958g(Exception exc) {
        yl6 yl6 = new yl6();
        yl6.mo28156c(exc);
        return yl6.mo28154a();
    }

    /* renamed from: h */
    public static <TResult> sl6<TResult> m26959h(TResult tresult) {
        if (tresult == null) {
            return f17707m;
        }
        if (!(tresult instanceof Boolean)) {
            yl6 yl6 = new yl6();
            yl6.mo28157d(tresult);
            return yl6.mo28154a();
        } else if (((Boolean) tresult).booleanValue()) {
            return f17708n;
        } else {
            return f17709o;
        }
    }

    /* renamed from: k */
    public static C3282d m26960k() {
        return f17706l;
    }

    /* renamed from: e */
    public <TContinuationResult> sl6<TContinuationResult> mo25854e(os0<TResult, TContinuationResult> os0) {
        return mo25855f(os0, f17704j, (ua0) null);
    }

    /* renamed from: f */
    public <TContinuationResult> sl6<TContinuationResult> mo25855f(os0<TResult, TContinuationResult> os0, Executor executor, ua0 ua0) {
        boolean m;
        yl6 yl6 = new yl6();
        synchronized (this.f17711a) {
            m = mo25859m();
            if (!m) {
                this.f17718h.add(new C3279a(yl6, os0, executor, ua0));
            }
        }
        if (m) {
            m26957d(yl6, os0, this, executor, ua0);
        }
        return yl6.mo28154a();
    }

    /* renamed from: i */
    public Exception mo25856i() {
        Exception exc;
        synchronized (this.f17711a) {
            if (this.f17715e != null) {
                this.f17716f = true;
                h47 h47 = this.f17717g;
                if (h47 != null) {
                    h47.mo20952a();
                    this.f17717g = null;
                }
            }
            exc = this.f17715e;
        }
        return exc;
    }

    /* renamed from: j */
    public TResult mo25857j() {
        TResult tresult;
        synchronized (this.f17711a) {
            tresult = this.f17714d;
        }
        return tresult;
    }

    /* renamed from: l */
    public boolean mo25858l() {
        boolean z;
        synchronized (this.f17711a) {
            z = this.f17713c;
        }
        return z;
    }

    /* renamed from: m */
    public boolean mo25859m() {
        boolean z;
        synchronized (this.f17711a) {
            z = this.f17712b;
        }
        return z;
    }

    /* renamed from: n */
    public boolean mo25860n() {
        boolean z;
        synchronized (this.f17711a) {
            if (mo25856i() != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: o */
    public final void mo25861o() {
        synchronized (this.f17711a) {
            for (os0 a : this.f17718h) {
                try {
                    a.mo24095a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f17718h = null;
        }
    }

    /* renamed from: p */
    public boolean mo25862p() {
        synchronized (this.f17711a) {
            if (this.f17712b) {
                return false;
            }
            this.f17712b = true;
            this.f17713c = true;
            this.f17711a.notifyAll();
            mo25861o();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25863q(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f17711a
            monitor-enter(r0)
            boolean r1 = r3.f17712b     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f17712b = r1     // Catch:{ all -> 0x002c }
            r3.f17715e = r4     // Catch:{ all -> 0x002c }
            r3.f17716f = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f17711a     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.mo25861o()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f17716f     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            sl6$d r4 = m26960k()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            h47 r4 = new h47     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f17717g = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sl6.mo25863q(java.lang.Exception):boolean");
    }

    /* renamed from: r */
    public boolean mo25864r(TResult tresult) {
        synchronized (this.f17711a) {
            if (this.f17712b) {
                return false;
            }
            this.f17712b = true;
            this.f17714d = tresult;
            this.f17711a.notifyAll();
            mo25861o();
            return true;
        }
    }

    public sl6(TResult tresult) {
        mo25864r(tresult);
    }

    public sl6(boolean z) {
        if (z) {
            mo25862p();
        } else {
            mo25864r((Object) null);
        }
    }
}
