package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: q09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class q09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f32902a;

    /* renamed from: d */
    public final /* synthetic */ g29 f32903d;

    public q09(g29 g29, zzp zzp) {
        this.f32903d = g29;
        this.f32902a = zzp;
    }

    public final void run() {
        am8 z = this.f32903d.f29060d;
        if (z == null) {
            this.f32903d.f34342a.mo45237A().mo29670l().mo48769a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            cu4.m43221k(this.f32902a);
            z.mo29016V0(this.f32902a);
            this.f32903d.mo42710D();
        } catch (RemoteException e) {
            this.f32903d.f34342a.mo45237A().mo29670l().mo48770b("Failed to send measurementEnabled to the service", e);
        }
    }
}
