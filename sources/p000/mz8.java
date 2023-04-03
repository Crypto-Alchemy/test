package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

/* renamed from: mz8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class mz8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31926a;

    /* renamed from: d */
    public final /* synthetic */ String f31927d;

    /* renamed from: e */
    public final /* synthetic */ zzp f31928e;

    /* renamed from: g */
    public final /* synthetic */ boolean f31929g;

    /* renamed from: k */
    public final /* synthetic */ lf8 f31930k;

    /* renamed from: r */
    public final /* synthetic */ g29 f31931r;

    public mz8(g29 g29, String str, String str2, zzp zzp, boolean z, lf8 lf8) {
        this.f31931r = g29;
        this.f31926a = str;
        this.f31927d = str2;
        this.f31928e = zzp;
        this.f31929g = z;
        this.f31930k = lf8;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            am8 z = this.f31931r.f29060d;
            if (z == null) {
                this.f31931r.f34342a.mo45237A().mo29670l().mo48771c("Failed to get user properties; not connected to service", this.f31926a, this.f31927d);
                this.f31931r.f34342a.mo45243G().mo42806W(this.f31930k, bundle2);
                return;
            }
            cu4.m43221k(this.f31928e);
            List<zzkq> A = z.mo29008A(this.f31926a, this.f31927d, this.f31929g, this.f31928e);
            bundle = new Bundle();
            if (A != null) {
                for (zzkq next : A) {
                    String str = next.f23082k;
                    if (str != null) {
                        bundle.putString(next.f23079d, str);
                    } else {
                        Long l = next.f23081g;
                        if (l != null) {
                            bundle.putLong(next.f23079d, l.longValue());
                        } else {
                            Double d = next.f23084s;
                            if (d != null) {
                                bundle.putDouble(next.f23079d, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f31931r.mo42710D();
                this.f31931r.f34342a.mo45243G().mo42806W(this.f31930k, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f31931r.f34342a.mo45237A().mo29670l().mo48771c("Failed to get user properties; remote exception", this.f31926a, e);
                    this.f31931r.f34342a.mo45243G().mo42806W(this.f31930k, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f31931r.f34342a.mo45243G().mo42806W(this.f31930k, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f31931r.f34342a.mo45237A().mo29670l().mo48771c("Failed to get user properties; remote exception", this.f31926a, e);
            this.f31931r.f34342a.mo45243G().mo42806W(this.f31930k, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f31931r.f34342a.mo45243G().mo42806W(this.f31930k, bundle2);
            throw th;
        }
    }
}
