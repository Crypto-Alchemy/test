package p000;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: dy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class dy7 extends h38 {

    /* renamed from: r */
    public final C3162qq f28342r = new C3162qq();

    /* renamed from: s */
    public final bi2 f28343s;

    public dy7(qg3 qg3, bi2 bi2, yh2 yh2) {
        super(qg3, yh2);
        this.f28343s = bi2;
        this.f22232a.mo30607b("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m43736u(Activity activity, bi2 bi2, C6286nm nmVar) {
        qg3 d = LifecycleCallback.m33664d(activity);
        dy7 dy7 = (dy7) d.mo30608d("ConnectionlessLifecycleHelper", dy7.class);
        if (dy7 == null) {
            dy7 = new dy7(d, bi2, yh2.m54754p());
        }
        cu4.m43222l(nmVar, "ApiKey cannot be null");
        dy7.f28342r.add(nmVar);
        bi2.mo29599c(dy7);
    }

    /* renamed from: h */
    public final void mo30593h() {
        super.mo30593h();
        mo42094v();
    }

    /* renamed from: j */
    public final void mo30595j() {
        super.mo30595j();
        mo42094v();
    }

    /* renamed from: k */
    public final void mo30596k() {
        super.mo30596k();
        this.f28343s.mo29600d(this);
    }

    /* renamed from: m */
    public final void mo42091m(ConnectionResult connectionResult, int i) {
        this.f28343s.mo29596G(connectionResult, i);
    }

    /* renamed from: n */
    public final void mo42092n() {
        this.f28343s.mo29597a();
    }

    /* renamed from: t */
    public final C3162qq mo42093t() {
        return this.f28342r;
    }

    /* renamed from: v */
    public final void mo42094v() {
        if (!this.f28342r.isEmpty()) {
            this.f28343s.mo29599c(this);
        }
    }
}
