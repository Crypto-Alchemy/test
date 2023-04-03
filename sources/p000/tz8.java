package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: tz8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class tz8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f34431a;

    /* renamed from: d */
    public final /* synthetic */ g29 f34432d;

    public tz8(g29 g29, zzp zzp) {
        this.f34432d = g29;
        this.f34431a = zzp;
    }

    public final void run() {
        am8 z = this.f34432d.f29060d;
        if (z == null) {
            this.f34432d.f34342a.mo45237A().mo29670l().mo48769a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            cu4.m43221k(this.f34431a);
            z.mo29010D0(this.f34431a);
        } catch (RemoteException e) {
            this.f34432d.f34342a.mo45237A().mo29670l().mo48770b("Failed to reset data on the service: remote exception", e);
        }
        this.f34432d.mo42710D();
    }
}
