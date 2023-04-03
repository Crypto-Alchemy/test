package p000;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzp;

/* renamed from: xz8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class xz8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzp f35739a;

    /* renamed from: d */
    public final /* synthetic */ lf8 f35740d;

    /* renamed from: e */
    public final /* synthetic */ g29 f35741e;

    public xz8(g29 g29, zzp zzp, lf8 lf8) {
        this.f35741e = g29;
        this.f35739a = zzp;
        this.f35740d = lf8;
    }

    public final void run() {
        kr8 kr8;
        String str = null;
        try {
            if (!this.f35741e.f34342a.mo45275z().mo45483r().mo48331h()) {
                this.f35741e.f34342a.mo45237A().mo29675r().mo48769a("Analytics storage consent denied; will not get app instance id");
                this.f35741e.f34342a.mo45242F().mo47926o((String) null);
                this.f35741e.f34342a.mo45275z().f31358g.mo43885b((String) null);
                kr8 = this.f35741e.f34342a;
            } else {
                am8 z = this.f35741e.f29060d;
                if (z == null) {
                    this.f35741e.f34342a.mo45237A().mo29670l().mo48769a("Failed to get app instance id");
                    kr8 = this.f35741e.f34342a;
                } else {
                    cu4.m43221k(this.f35739a);
                    str = z.mo29021i(this.f35739a);
                    if (str != null) {
                        this.f35741e.f34342a.mo45242F().mo47926o(str);
                        this.f35741e.f34342a.mo45275z().f31358g.mo43885b(str);
                    }
                    this.f35741e.mo42710D();
                    kr8 = this.f35741e.f34342a;
                }
            }
        } catch (RemoteException e) {
            this.f35741e.f34342a.mo45237A().mo29670l().mo48770b("Failed to get app instance id", e);
            kr8 = this.f35741e.f34342a;
        } catch (Throwable th) {
            this.f35741e.f34342a.mo45243G().mo42801R(this.f35740d, (String) null);
            throw th;
        }
        kr8.mo45243G().mo42801R(this.f35740d, str);
    }
}
