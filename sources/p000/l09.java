package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzas;

/* renamed from: l09 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class l09 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzas f31143a;

    /* renamed from: d */
    public final /* synthetic */ String f31144d;

    /* renamed from: e */
    public final /* synthetic */ lf8 f31145e;

    /* renamed from: g */
    public final /* synthetic */ g29 f31146g;

    public l09(g29 g29, zzas zzas, String str, lf8 lf8) {
        this.f31146g = g29;
        this.f31143a = zzas;
        this.f31144d = str;
        this.f31145e = lf8;
    }

    public final void run() {
        kr8 kr8;
        byte[] bArr = null;
        try {
            am8 z = this.f31146g.f29060d;
            if (z == null) {
                this.f31146g.f34342a.mo45237A().mo29670l().mo48769a("Discarding data. Failed to send event to service to bundle");
                kr8 = this.f31146g.f34342a;
            } else {
                bArr = z.mo29014H0(this.f31143a, this.f31144d);
                this.f31146g.mo42710D();
                kr8 = this.f31146g.f34342a;
            }
        } catch (RemoteException e) {
            this.f31146g.f34342a.mo45237A().mo29670l().mo48770b("Failed to send event to the service to bundle", e);
            kr8 = this.f31146g.f34342a;
        } catch (Throwable th) {
            this.f31146g.f34342a.mo45243G().mo42804U(this.f31145e, bArr);
            throw th;
        }
        kr8.mo45243G().mo42804U(this.f31145e, bArr);
    }
}
