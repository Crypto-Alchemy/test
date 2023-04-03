package p000;

import android.os.RemoteException;

/* renamed from: d09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class d09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ty8 f28006a;

    /* renamed from: d */
    public final /* synthetic */ g29 f28007d;

    public d09(g29 g29, ty8 ty8) {
        this.f28007d = g29;
        this.f28006a = ty8;
    }

    public final void run() {
        am8 z = this.f28007d.f29060d;
        if (z == null) {
            this.f28007d.f34342a.mo45237A().mo29670l().mo48769a("Failed to send current screen to service");
            return;
        }
        try {
            ty8 ty8 = this.f28006a;
            if (ty8 == null) {
                z.mo29024v0(0, (String) null, (String) null, this.f28007d.f34342a.mo45271q().getPackageName());
            } else {
                z.mo29024v0(ty8.f34424c, ty8.f34422a, ty8.f34423b, this.f28007d.f34342a.mo45271q().getPackageName());
            }
            this.f28007d.mo42710D();
        } catch (RemoteException e) {
            this.f28007d.f34342a.mo45237A().mo29670l().mo48770b("Failed to send current screen to the service", e);
        }
    }
}
