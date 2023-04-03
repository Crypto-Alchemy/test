package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4033b;

/* renamed from: xz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class xz7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConnectionResult f35737a;

    /* renamed from: d */
    public final /* synthetic */ yz7 f35738d;

    public xz7(yz7 yz7, ConnectionResult connectionResult) {
        this.f35738d = yz7;
        this.f35737a = connectionResult;
    }

    public final void run() {
        yz7 yz7 = this.f35738d;
        uz7 uz7 = (uz7) yz7.f35973f.f21330C.get(yz7.f35969b);
        if (uz7 != null) {
            if (this.f35737a.mo30462v1()) {
                this.f35738d.f35972e = true;
                if (this.f35738d.f35968a.mo30551j()) {
                    this.f35738d.mo49766h();
                    return;
                }
                try {
                    yz7 yz72 = this.f35738d;
                    yz72.f35968a.mo30553m((C4033b) null, yz72.f35968a.mo30552l());
                } catch (SecurityException unused) {
                    this.f35738d.f35968a.mo30546d("Failed to get service from broker.");
                    uz7.mo48594E(new ConnectionResult(10), (Exception) null);
                }
            } else {
                uz7.mo48594E(this.f35737a, (Exception) null);
            }
        }
    }
}
