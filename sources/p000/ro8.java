package p000;

import java.util.concurrent.Executor;

/* renamed from: ro8 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class ro8<TResult, TContinuationResult> implements uh4<TContinuationResult>, hh4, ah4, sg9 {

    /* renamed from: a */
    public final Executor f33553a;

    /* renamed from: b */
    public final ms0 f33554b;

    /* renamed from: c */
    public final uj9 f33555c;

    public ro8(Executor executor, ms0 ms0, uj9 uj9) {
        this.f33553a = executor;
        this.f33554b = ms0;
        this.f33555c = uj9;
    }

    /* renamed from: a */
    public final void mo42787a(Exception exc) {
        this.f33555c.mo48402s(exc);
    }

    /* renamed from: b */
    public final void mo28891b(tl6 tl6) {
        this.f33553a.execute(new bl8(this, tl6));
    }

    /* renamed from: c */
    public final void mo28978c() {
        this.f33555c.mo48404u();
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f33555c.mo48403t(tcontinuationresult);
    }
}
