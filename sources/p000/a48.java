package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: a48 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a48 implements b08 {

    /* renamed from: a */
    public final /* synthetic */ wx7 f20813a;

    public /* synthetic */ a48(wx7 wx7, y38 y38) {
        this.f20813a = wx7;
    }

    /* renamed from: a */
    public final void mo28875a(Bundle bundle) {
        this.f20813a.f35480m.lock();
        try {
            this.f20813a.f35478k = ConnectionResult.f22149k;
            wx7.m54119v(this.f20813a);
        } finally {
            this.f20813a.f35480m.unlock();
        }
    }

    /* renamed from: b */
    public final void mo28876b(int i, boolean z) {
        Lock p;
        this.f20813a.f35480m.lock();
        try {
            wx7 wx7 = this.f20813a;
            if (wx7.f35479l) {
                wx7.f35479l = false;
                wx7.m54117t(this.f20813a, i, z);
                p = this.f20813a.f35480m;
            } else {
                wx7.f35479l = true;
                this.f20813a.f35471d.onConnectionSuspended(i);
                p = this.f20813a.f35480m;
            }
            p.unlock();
        } catch (Throwable th) {
            this.f20813a.f35480m.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo28877c(ConnectionResult connectionResult) {
        this.f20813a.f35480m.lock();
        try {
            this.f20813a.f35478k = connectionResult;
            wx7.m54119v(this.f20813a);
        } finally {
            this.f20813a.f35480m.unlock();
        }
    }
}
