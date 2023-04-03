package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: g09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class g09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f29042a;

    /* renamed from: d */
    public final /* synthetic */ Bundle f29043d;

    /* renamed from: e */
    public final /* synthetic */ g29 f29044e;

    public g09(g29 g29, zzp zzp, Bundle bundle) {
        this.f29044e = g29;
        this.f29042a = zzp;
        this.f29043d = bundle;
    }

    public final void run() {
        am8 z = this.f29044e.f29060d;
        if (z == null) {
            this.f29044e.f34342a.mo45237A().mo29670l().mo48769a("Failed to send default event parameters to service");
            return;
        }
        try {
            cu4.m43221k(this.f29042a);
            z.mo29012F0(this.f29043d, this.f29042a);
        } catch (RemoteException e) {
            this.f29044e.f34342a.mo45237A().mo29670l().mo48770b("Failed to send default event parameters to service", e);
        }
    }
}
