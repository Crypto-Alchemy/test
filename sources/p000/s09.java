package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: s09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class s09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f33706a;

    /* renamed from: d */
    public final /* synthetic */ g29 f33707d;

    public s09(g29 g29, zzp zzp) {
        this.f33707d = g29;
        this.f33706a = zzp;
    }

    public final void run() {
        am8 z = this.f33707d.f29060d;
        if (z == null) {
            this.f33707d.f34342a.mo45237A().mo29670l().mo48769a("Failed to send consent settings to service");
            return;
        }
        try {
            cu4.m43221k(this.f33706a);
            z.mo29022l0(this.f33706a);
            this.f33707d.mo42710D();
        } catch (RemoteException e) {
            this.f33707d.f34342a.mo45237A().mo29670l().mo48770b("Failed to send consent settings to the service", e);
        }
    }
}
