package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: w38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class w38 implements b08 {

    /* renamed from: a */
    public final /* synthetic */ wx7 f35231a;

    public /* synthetic */ w38(wx7 wx7, v38 v38) {
        this.f35231a = wx7;
    }

    /* renamed from: a */
    public final void mo28875a(Bundle bundle) {
        this.f35231a.f35480m.lock();
        try {
            wx7.m54118u(this.f35231a, bundle);
            this.f35231a.f35477j = ConnectionResult.f22149k;
            wx7.m54119v(this.f35231a);
        } finally {
            this.f35231a.f35480m.unlock();
        }
    }

    /* renamed from: b */
    public final void mo28876b(int i, boolean z) {
        Lock p;
        this.f35231a.f35480m.lock();
        try {
            wx7 wx7 = this.f35231a;
            if (!wx7.f35479l && wx7.f35478k != null) {
                if (wx7.f35478k.mo30462v1()) {
                    this.f35231a.f35479l = true;
                    this.f35231a.f35472e.onConnectionSuspended(i);
                    p = this.f35231a.f35480m;
                    p.unlock();
                }
            }
            this.f35231a.f35479l = false;
            wx7.m54117t(this.f35231a, i, z);
            p = this.f35231a.f35480m;
            p.unlock();
        } catch (Throwable th) {
            this.f35231a.f35480m.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo28877c(ConnectionResult connectionResult) {
        this.f35231a.f35480m.lock();
        try {
            this.f35231a.f35477j = connectionResult;
            wx7.m54119v(this.f35231a);
        } finally {
            this.f35231a.f35480m.unlock();
        }
    }
}
