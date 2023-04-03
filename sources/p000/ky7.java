package p000;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4013a;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p000.C6462ry;

/* renamed from: ky7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ky7 implements C6462ry.C6465c {

    /* renamed from: a */
    public final WeakReference f31125a;

    /* renamed from: b */
    public final C4013a f31126b;

    /* renamed from: c */
    public final boolean f31127c;

    public ky7(vy7 vy7, C4013a aVar, boolean z) {
        this.f31125a = new WeakReference(vy7);
        this.f31126b = aVar;
        this.f31127c = z;
    }

    /* renamed from: a */
    public final void mo45313a(ConnectionResult connectionResult) {
        boolean z;
        Lock y;
        vy7 vy7 = (vy7) this.f31125a.get();
        if (vy7 != null) {
            if (Looper.myLooper() == vy7.f35193a.f31924n.mo30501f()) {
                z = true;
            } else {
                z = false;
            }
            cu4.m43226p(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            vy7.f35194b.lock();
            try {
                if (!vy7.mo48867n(0)) {
                    y = vy7.f35194b;
                } else {
                    if (!connectionResult.mo30462v1()) {
                        vy7.mo48865l(connectionResult, this.f31126b, this.f31127c);
                    }
                    if (vy7.mo48868o()) {
                        vy7.mo48866m();
                    }
                    y = vy7.f35194b;
                }
                y.unlock();
            } catch (Throwable th) {
                vy7.f35194b.unlock();
                throw th;
            }
        }
    }
}
