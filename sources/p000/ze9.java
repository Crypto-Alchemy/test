package p000;

import java.util.concurrent.Executor;

/* renamed from: ze9 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class ze9<TResult, TContinuationResult> implements uh4<TContinuationResult>, hh4, ah4, sg9 {

    /* renamed from: a */
    public final Executor f36137a;

    /* renamed from: b */
    public final kd6 f36138b;

    /* renamed from: c */
    public final uj9 f36139c;

    public ze9(Executor executor, kd6 kd6, uj9 uj9) {
        this.f36137a = executor;
        this.f36138b = kd6;
        this.f36139c = uj9;
    }

    /* renamed from: a */
    public final void mo42787a(Exception exc) {
        this.f36139c.mo48402s(exc);
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        this.f36137a.execute(new bd9(this, tl6));
    }

    /* renamed from: c */
    public final void mo28978c() {
        this.f36139c.mo48404u();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f36139c.mo48403t(tcontinuationresult);
    }
}
