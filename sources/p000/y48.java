package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* renamed from: y48 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class y48 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f35766a;

    /* renamed from: d */
    public final /* synthetic */ String f35767d;

    /* renamed from: e */
    public final /* synthetic */ zzb f35768e;

    public y48(zzb zzb, LifecycleCallback lifecycleCallback, String str) {
        this.f35768e = zzb;
        this.f35766a = lifecycleCallback;
        this.f35767d = str;
    }

    public final void run() {
        Bundle bundle;
        zzb zzb = this.f35768e;
        if (zzb.f22239d > 0) {
            LifecycleCallback lifecycleCallback = this.f35766a;
            if (zzb.f22240e != null) {
                bundle = zzb.f22240e.getBundle(this.f35767d);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo30591f(bundle);
        }
        if (this.f35768e.f22239d >= 2) {
            this.f35766a.mo30595j();
        }
        if (this.f35768e.f22239d >= 3) {
            this.f35766a.mo30593h();
        }
        if (this.f35768e.f22239d >= 4) {
            this.f35766a.mo30596k();
        }
        if (this.f35768e.f22239d >= 5) {
            this.f35766a.mo30592g();
        }
    }
}
