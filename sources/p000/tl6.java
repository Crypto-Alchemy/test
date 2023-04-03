package p000;

import java.util.concurrent.Executor;

/* renamed from: tl6 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public abstract class tl6<TResult> {
    /* renamed from: a */
    public tl6<TResult> mo48130a(Executor executor, ah4 ah4) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public tl6<TResult> mo48131b(bh4<TResult> bh4) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public tl6<TResult> mo48132c(Executor executor, bh4<TResult> bh4) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract tl6<TResult> mo48133d(hh4 hh4);

    /* renamed from: e */
    public abstract tl6<TResult> mo48134e(Executor executor, hh4 hh4);

    /* renamed from: f */
    public abstract tl6<TResult> mo48135f(uh4<? super TResult> uh4);

    /* renamed from: g */
    public abstract tl6<TResult> mo48136g(Executor executor, uh4<? super TResult> uh4);

    /* renamed from: h */
    public <TContinuationResult> tl6<TContinuationResult> mo48137h(ms0<TResult, TContinuationResult> ms0) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> tl6<TContinuationResult> mo48138i(Executor executor, ms0<TResult, TContinuationResult> ms0) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: j */
    public <TContinuationResult> tl6<TContinuationResult> mo48139j(Executor executor, ms0<TResult, tl6<TContinuationResult>> ms0) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: k */
    public abstract Exception mo48140k();

    /* renamed from: l */
    public abstract TResult mo48141l();

    /* renamed from: m */
    public abstract <X extends Throwable> TResult mo48142m(Class<X> cls) throws Throwable;

    /* renamed from: n */
    public abstract boolean mo48143n();

    /* renamed from: o */
    public abstract boolean mo48144o();

    /* renamed from: p */
    public abstract boolean mo48145p();

    /* renamed from: q */
    public <TContinuationResult> tl6<TContinuationResult> mo48146q(kd6<TResult, TContinuationResult> kd6) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: r */
    public <TContinuationResult> tl6<TContinuationResult> mo48147r(Executor executor, kd6<TResult, TContinuationResult> kd6) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
