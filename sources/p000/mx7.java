package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;
import java.util.Map;

/* renamed from: mx7 */
public final class mx7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ Map f31881d;

    /* renamed from: e */
    public final /* synthetic */ nv7 f31882e;

    /* renamed from: g */
    public final /* synthetic */ C4468a f31883g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mx7(C4468a aVar, nv7 nv7, Map map, nv7 nv72) {
        super(nv7);
        this.f31883g = aVar;
        this.f31881d = map;
        this.f31882e = nv72;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f31883g.f24705c.mo42954c()).mo48240S0(this.f31883g.f24703a, C4468a.m36355m(this.f31881d), new sq7(this.f31883g, this.f31882e));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46854c(e, "syncPacks", new Object[0]);
            this.f31882e.mo46238d(new RuntimeException(e));
        }
    }
}
