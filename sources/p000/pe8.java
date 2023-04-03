package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: pe8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class pe8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f32688a;

    /* renamed from: d */
    public final /* synthetic */ String f32689d;

    /* renamed from: e */
    public final /* synthetic */ xh8 f32690e;

    public pe8(xh8 xh8, LifecycleCallback lifecycleCallback, String str) {
        this.f32690e = xh8;
        this.f32688a = lifecycleCallback;
        this.f32689d = str;
    }

    public final void run() {
        Bundle bundle;
        xh8 xh8 = this.f32690e;
        if (xh8.f35637d > 0) {
            LifecycleCallback lifecycleCallback = this.f32688a;
            if (xh8.f35638e != null) {
                bundle = xh8.f35638e.getBundle(this.f32689d);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo30591f(bundle);
        }
        if (this.f32690e.f35637d >= 2) {
            this.f32688a.mo30595j();
        }
        if (this.f32690e.f35637d >= 3) {
            this.f32688a.mo30593h();
        }
        if (this.f32690e.f35637d >= 4) {
            this.f32688a.mo30596k();
        }
        if (this.f32690e.f35637d >= 5) {
            this.f32688a.mo30592g();
        }
    }
}
