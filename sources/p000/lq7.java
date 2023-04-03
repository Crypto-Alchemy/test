package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: lq7 */
public final class lq7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ int f31380d;

    /* renamed from: e */
    public final /* synthetic */ nv7 f31381e;

    /* renamed from: g */
    public final /* synthetic */ C4468a f31382g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lq7(C4468a aVar, nv7 nv7, int i, nv7 nv72) {
        super(nv7);
        this.f31382g = aVar;
        this.f31380d = i;
        this.f31381e = nv72;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f31382g.f24705c.mo42954c()).mo48243g(this.f31382g.f24703a, C4468a.m36351i(this.f31380d), C4468a.m36352j(), new oq7(this.f31382g, this.f31381e, (int[]) null));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46854c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
