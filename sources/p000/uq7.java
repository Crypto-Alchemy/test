package p000;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: uq7 */
public final class uq7 extends oq7<Void> {

    /* renamed from: c */
    public final /* synthetic */ C4468a f34681c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uq7(C4468a aVar, nv7<Void> nv7) {
        super(aVar, nv7);
        this.f34681c = aVar;
    }

    /* renamed from: Z0 */
    public final void mo43030Z0(Bundle bundle, Bundle bundle2) {
        super.mo43030Z0(bundle, bundle2);
        if (!this.f34681c.f24707e.compareAndSet(true, false)) {
            C4468a.f24701f.mo46856e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f34681c.mo29741a();
        }
    }
}
