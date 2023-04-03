package p000;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: uj9 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class uj9<TResult> extends tl6<TResult> {

    /* renamed from: a */
    public final Object f34611a = new Object();

    /* renamed from: b */
    public final ci9 f34612b = new ci9();

    /* renamed from: c */
    public boolean f34613c;

    /* renamed from: d */
    public volatile boolean f34614d;

    /* renamed from: e */
    public Object f34615e;

    /* renamed from: f */
    public Exception f34616f;

    /* renamed from: A */
    public final void mo48401A() {
        synchronized (this.f34611a) {
            if (this.f34613c) {
                this.f34612b.mo30023b(this);
            }
        }
    }

    /* renamed from: a */
    public final tl6<TResult> mo48130a(Executor executor, ah4 ah4) {
        this.f34612b.mo30022a(new yu8(executor, ah4));
        mo48401A();
        return this;
    }

    /* renamed from: b */
    public final tl6<TResult> mo48131b(bh4<TResult> bh4) {
        this.f34612b.mo30022a(new g19(em6.f28634a, bh4));
        mo48401A();
        return this;
    }

    /* renamed from: c */
    public final tl6<TResult> mo48132c(Executor executor, bh4<TResult> bh4) {
        this.f34612b.mo30022a(new g19(executor, bh4));
        mo48401A();
        return this;
    }

    /* renamed from: d */
    public final tl6<TResult> mo48133d(hh4 hh4) {
        mo48134e(em6.f28634a, hh4);
        return this;
    }

    /* renamed from: e */
    public final tl6<TResult> mo48134e(Executor executor, hh4 hh4) {
        this.f34612b.mo30022a(new a79(executor, hh4));
        mo48401A();
        return this;
    }

    /* renamed from: f */
    public final tl6<TResult> mo48135f(uh4<? super TResult> uh4) {
        mo48136g(em6.f28634a, uh4);
        return this;
    }

    /* renamed from: g */
    public final tl6<TResult> mo48136g(Executor executor, uh4<? super TResult> uh4) {
        this.f34612b.mo30022a(new fb9(executor, uh4));
        mo48401A();
        return this;
    }

    /* renamed from: h */
    public final <TContinuationResult> tl6<TContinuationResult> mo48137h(ms0<TResult, TContinuationResult> ms0) {
        return mo48138i(em6.f28634a, ms0);
    }

    /* renamed from: i */
    public final <TContinuationResult> tl6<TContinuationResult> mo48138i(Executor executor, ms0<TResult, TContinuationResult> ms0) {
        uj9 uj9 = new uj9();
        this.f34612b.mo30022a(new ph8(executor, ms0, uj9));
        mo48401A();
        return uj9;
    }

    /* renamed from: j */
    public final <TContinuationResult> tl6<TContinuationResult> mo48139j(Executor executor, ms0<TResult, tl6<TContinuationResult>> ms0) {
        uj9 uj9 = new uj9();
        this.f34612b.mo30022a(new ro8(executor, ms0, uj9));
        mo48401A();
        return uj9;
    }

    /* renamed from: k */
    public final Exception mo48140k() {
        Exception exc;
        synchronized (this.f34611a) {
            exc = this.f34616f;
        }
        return exc;
    }

    /* renamed from: l */
    public final TResult mo48141l() {
        TResult tresult;
        synchronized (this.f34611a) {
            mo48407x();
            mo48408y();
            Exception exc = this.f34616f;
            if (exc == null) {
                tresult = this.f34615e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    /* renamed from: m */
    public final <X extends Throwable> TResult mo48142m(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f34611a) {
            mo48407x();
            mo48408y();
            if (!cls.isInstance(this.f34616f)) {
                Exception exc = this.f34616f;
                if (exc == null) {
                    tresult = this.f34615e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f34616f));
            }
        }
        return tresult;
    }

    /* renamed from: n */
    public final boolean mo48143n() {
        return this.f34614d;
    }

    /* renamed from: o */
    public final boolean mo48144o() {
        boolean z;
        synchronized (this.f34611a) {
            z = this.f34613c;
        }
        return z;
    }

    /* renamed from: p */
    public final boolean mo48145p() {
        boolean z;
        synchronized (this.f34611a) {
            z = false;
            if (this.f34613c && !this.f34614d && this.f34616f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: q */
    public final <TContinuationResult> tl6<TContinuationResult> mo48146q(kd6<TResult, TContinuationResult> kd6) {
        Executor executor = em6.f28634a;
        uj9 uj9 = new uj9();
        this.f34612b.mo30022a(new ze9(executor, kd6, uj9));
        mo48401A();
        return uj9;
    }

    /* renamed from: r */
    public final <TContinuationResult> tl6<TContinuationResult> mo48147r(Executor executor, kd6<TResult, TContinuationResult> kd6) {
        uj9 uj9 = new uj9();
        this.f34612b.mo30022a(new ze9(executor, kd6, uj9));
        mo48401A();
        return uj9;
    }

    /* renamed from: s */
    public final void mo48402s(Exception exc) {
        cu4.m43222l(exc, "Exception must not be null");
        synchronized (this.f34611a) {
            mo48409z();
            this.f34613c = true;
            this.f34616f = exc;
        }
        this.f34612b.mo30023b(this);
    }

    /* renamed from: t */
    public final void mo48403t(Object obj) {
        synchronized (this.f34611a) {
            mo48409z();
            this.f34613c = true;
            this.f34615e = obj;
        }
        this.f34612b.mo30023b(this);
    }

    /* renamed from: u */
    public final boolean mo48404u() {
        synchronized (this.f34611a) {
            if (this.f34613c) {
                return false;
            }
            this.f34613c = true;
            this.f34614d = true;
            this.f34612b.mo30023b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean mo48405v(Exception exc) {
        cu4.m43222l(exc, "Exception must not be null");
        synchronized (this.f34611a) {
            if (this.f34613c) {
                return false;
            }
            this.f34613c = true;
            this.f34616f = exc;
            this.f34612b.mo30023b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo48406w(Object obj) {
        synchronized (this.f34611a) {
            if (this.f34613c) {
                return false;
            }
            this.f34613c = true;
            this.f34615e = obj;
            this.f34612b.mo30023b(this);
            return true;
        }
    }

    /* renamed from: x */
    public final void mo48407x() {
        cu4.m43226p(this.f34613c, "Task is not yet complete");
    }

    /* renamed from: y */
    public final void mo48408y() {
        if (this.f34614d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: z */
    public final void mo48409z() {
        if (this.f34613c) {
            throw DuplicateTaskCompletionException.m34512of(this);
        }
    }
}
