package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;
import java.util.List;

/* renamed from: kx7 */
public final class kx7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ List f31116d;

    /* renamed from: e */
    public final /* synthetic */ nv7 f31117e;

    /* renamed from: g */
    public final /* synthetic */ C4468a f31118g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kx7(C4468a aVar, nv7 nv7, List list, nv7 nv72) {
        super(nv7);
        this.f31118g = aVar;
        this.f31116d = list;
        this.f31117e = nv72;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f31118g.f24705c.mo42954c()).mo48244m0(this.f31118g.f24703a, C4468a.m36353k(this.f31116d), C4468a.m36352j(), new oq7(this.f31118g, this.f31117e, (byte[]) null));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46854c(e, "cancelDownloads(%s)", this.f31116d);
        }
    }
}
