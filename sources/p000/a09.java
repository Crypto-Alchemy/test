package p000;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: a09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class a09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f20740a;

    /* renamed from: d */
    public final /* synthetic */ g29 f20741d;

    public a09(g29 g29, zzp zzp) {
        this.f20741d = g29;
        this.f20740a = zzp;
    }

    public final void run() {
        am8 z = this.f20741d.f29060d;
        if (z == null) {
            this.f20741d.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            cu4.m43221k(this.f20740a);
            z.mo29020g1(this.f20740a);
            this.f20741d.f34342a.mo45245I().mo44520t();
            this.f20741d.mo42717K(z, (AbstractSafeParcelable) null, this.f20740a);
            this.f20741d.mo42710D();
        } catch (RemoteException e) {
            this.f20741d.f34342a.mo45237A().mo29670l().mo48770b("Failed to send app launch to the service", e);
        }
    }
}
