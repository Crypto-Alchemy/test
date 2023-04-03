package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;

/* renamed from: m19 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class m19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31481a;

    /* renamed from: d */
    public final /* synthetic */ String f31482d;

    /* renamed from: e */
    public final /* synthetic */ zzp f31483e;

    /* renamed from: g */
    public final /* synthetic */ lf8 f31484g;

    /* renamed from: k */
    public final /* synthetic */ g29 f31485k;

    public m19(g29 g29, String str, String str2, zzp zzp, lf8 lf8) {
        this.f31485k = g29;
        this.f31481a = str;
        this.f31482d = str2;
        this.f31483e = zzp;
        this.f31484g = lf8;
    }

    public final void run() {
        kr8 kr8;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            am8 z = this.f31485k.f29060d;
            if (z == null) {
                this.f31485k.f34342a.mo45237A().mo29670l().mo48771c("Failed to get conditional properties; not connected to service", this.f31481a, this.f31482d);
                kr8 = this.f31485k.f34342a;
            } else {
                cu4.m43221k(this.f31483e);
                arrayList = g69.m44580Y(z.mo29018d(this.f31481a, this.f31482d, this.f31483e));
                this.f31485k.mo42710D();
                kr8 = this.f31485k.f34342a;
            }
        } catch (RemoteException e) {
            this.f31485k.f34342a.mo45237A().mo29670l().mo48772d("Failed to get conditional properties; remote exception", this.f31481a, this.f31482d, e);
            kr8 = this.f31485k.f34342a;
        } catch (Throwable th) {
            this.f31485k.f34342a.mo45243G().mo42807X(this.f31484g, arrayList);
            throw th;
        }
        kr8.mo45243G().mo42807X(this.f31484g, arrayList);
    }
}
