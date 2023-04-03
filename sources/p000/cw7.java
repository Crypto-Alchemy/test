package p000;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

/* renamed from: cw7 */
public final class cw7<ResultT> extends ul6<ResultT> {

    /* renamed from: a */
    public final Object f27969a = new Object();

    /* renamed from: b */
    public final kv7<ResultT> f27970b = new kv7<>();

    /* renamed from: c */
    public boolean f27971c;

    /* renamed from: d */
    public ResultT f27972d;

    /* renamed from: e */
    public Exception f27973e;

    /* renamed from: a */
    public final ul6<ResultT> mo41740a(Executor executor, gh4 gh4) {
        this.f27970b.mo45301a(new ru7(executor, gh4));
        mo41752m();
        return this;
    }

    /* renamed from: b */
    public final ul6<ResultT> mo41741b(Executor executor, th4<? super ResultT> th4) {
        this.f27970b.mo45301a(new dv7(executor, th4));
        mo41752m();
        return this;
    }

    /* renamed from: c */
    public final Exception mo41742c() {
        Exception exc;
        synchronized (this.f27969a) {
            exc = this.f27973e;
        }
        return exc;
    }

    /* renamed from: d */
    public final ResultT mo41743d() {
        ResultT resultt;
        synchronized (this.f27969a) {
            mo41750k();
            Exception exc = this.f27973e;
            if (exc == null) {
                resultt = this.f27972d;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return resultt;
    }

    /* renamed from: e */
    public final boolean mo41744e() {
        boolean z;
        synchronized (this.f27969a) {
            z = this.f27971c;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo41745f() {
        boolean z;
        synchronized (this.f27969a) {
            z = false;
            if (this.f27971c && this.f27973e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: g */
    public final void mo41746g(ResultT resultt) {
        synchronized (this.f27969a) {
            mo41751l();
            this.f27971c = true;
            this.f27972d = resultt;
        }
        this.f27970b.mo45302b(this);
    }

    /* renamed from: h */
    public final boolean mo41747h(ResultT resultt) {
        synchronized (this.f27969a) {
            if (this.f27971c) {
                return false;
            }
            this.f27971c = true;
            this.f27972d = resultt;
            this.f27970b.mo45302b(this);
            return true;
        }
    }

    /* renamed from: i */
    public final void mo41748i(Exception exc) {
        synchronized (this.f27969a) {
            mo41751l();
            this.f27971c = true;
            this.f27973e = exc;
        }
        this.f27970b.mo45302b(this);
    }

    /* renamed from: j */
    public final boolean mo41749j(Exception exc) {
        synchronized (this.f27969a) {
            if (this.f27971c) {
                return false;
            }
            this.f27971c = true;
            this.f27973e = exc;
            this.f27970b.mo45302b(this);
            return true;
        }
    }

    /* renamed from: k */
    public final void mo41750k() {
        rr7.m51234c(this.f27971c, "Task is not yet complete");
    }

    /* renamed from: l */
    public final void mo41751l() {
        rr7.m51234c(!this.f27971c, "Task is already complete");
    }

    /* renamed from: m */
    public final void mo41752m() {
        synchronized (this.f27969a) {
            if (this.f27971c) {
                this.f27970b.mo45302b(this);
            }
        }
    }
}
