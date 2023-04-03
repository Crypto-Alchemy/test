package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: rw7 */
public final class rw7 implements qu7 {

    /* renamed from: a */
    public final /* synthetic */ x66 f33624a;

    /* renamed from: b */
    public final /* synthetic */ Intent f33625b;

    /* renamed from: c */
    public final /* synthetic */ Context f33626c;

    /* renamed from: d */
    public final /* synthetic */ xw7 f33627d;

    public rw7(xw7 xw7, x66 x66, Intent intent, Context context) {
        this.f33627d = xw7;
        this.f33624a = x66;
        this.f33625b = intent;
        this.f33626c = context;
    }

    /* renamed from: a */
    public final void mo47278a() {
        this.f33627d.f35711g.post(new uw7(this.f33627d, this.f33624a, 5, 0));
    }

    /* renamed from: b */
    public final void mo47279b() {
        if (!this.f33625b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f33625b.putExtra("triggered_from_app_after_verification", true);
            this.f33626c.sendBroadcast(this.f33625b);
            return;
        }
        this.f33627d.f36220a.mo46853b("Splits copied and verified more than once.", new Object[0]);
    }

    /* renamed from: c */
    public final void mo47280c(int i) {
        this.f33627d.f35711g.post(new uw7(this.f33627d, this.f33624a, 6, i));
    }
}
