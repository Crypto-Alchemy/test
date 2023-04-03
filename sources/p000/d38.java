package p000;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: d38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class d38 implements Runnable {

    /* renamed from: a */
    public final u28 f28016a;

    /* renamed from: d */
    public final /* synthetic */ h38 f28017d;

    public d38(h38 h38, u28 u28) {
        this.f28017d = h38;
        this.f28016a = u28;
    }

    public final void run() {
        if (this.f28017d.f29425d) {
            ConnectionResult b = this.f28016a.mo48285b();
            if (b.mo30461u1()) {
                h38 h38 = this.f28017d;
                h38.f22232a.startActivityForResult(GoogleApiActivity.m33580a(h38.mo30589b(), (PendingIntent) cu4.m43221k(b.mo30459t1()), this.f28016a.mo48284a(), false), 1);
                return;
            }
            h38 h382 = this.f28017d;
            if (h382.f29428k.mo49666d(h382.mo30589b(), b.mo30457r1(), (String) null) != null) {
                h38 h383 = this.f28017d;
                h383.f29428k.mo49682y(h383.mo30589b(), this.f28017d.f22232a, b.mo30457r1(), 2, this.f28017d);
            } else if (b.mo30457r1() == 18) {
                h38 h384 = this.f28017d;
                Dialog t = h384.f29428k.mo49677t(h384.mo30589b(), this.f28017d);
                h38 h385 = this.f28017d;
                h385.f29428k.mo49678u(h385.mo30589b().getApplicationContext(), new y28(this, t));
            } else {
                this.f28017d.mo43068l(b, this.f28016a.mo48284a());
            }
        }
    }
}
