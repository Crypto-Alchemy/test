package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: nq7 */
public final class nq7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ nv7 f32168d;

    /* renamed from: e */
    public final /* synthetic */ C4468a f32169e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nq7(C4468a aVar, nv7 nv7, nv7 nv72) {
        super(nv7);
        this.f32169e = aVar;
        this.f32168d = nv72;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f32169e.f24706d.mo42954c()).mo48242e(this.f32169e.f24703a, C4468a.m36352j(), new uq7(this.f32169e, this.f32168d));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46854c(e, "keepAlive", new Object[0]);
        }
    }
}
