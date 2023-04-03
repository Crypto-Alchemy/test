package p000;

/* renamed from: yl6 */
/* compiled from: TaskCompletionSource */
public class yl6<TResult> {

    /* renamed from: a */
    public final sl6<TResult> f20288a = new sl6<>();

    /* renamed from: a */
    public sl6<TResult> mo28154a() {
        return this.f20288a;
    }

    /* renamed from: b */
    public void mo28155b() {
        if (!mo28158e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: c */
    public void mo28156c(Exception exc) {
        if (!mo28159f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: d */
    public void mo28157d(TResult tresult) {
        if (!mo28160g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: e */
    public boolean mo28158e() {
        return this.f20288a.mo25862p();
    }

    /* renamed from: f */
    public boolean mo28159f(Exception exc) {
        return this.f20288a.mo25863q(exc);
    }

    /* renamed from: g */
    public boolean mo28160g(TResult tresult) {
        return this.f20288a.mo25864r(tresult);
    }
}
