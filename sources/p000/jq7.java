package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: jq7 */
public final class jq7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ int f30564d;

    /* renamed from: e */
    public final /* synthetic */ String f30565e;

    /* renamed from: g */
    public final /* synthetic */ String f30566g;

    /* renamed from: k */
    public final /* synthetic */ int f30567k;

    /* renamed from: r */
    public final /* synthetic */ nv7 f30568r;

    /* renamed from: s */
    public final /* synthetic */ C4468a f30569s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jq7(C4468a aVar, nv7 nv7, int i, String str, String str2, int i2, nv7 nv72) {
        super(nv7);
        this.f30569s = aVar;
        this.f30564d = i;
        this.f30565e = str;
        this.f30566g = str2;
        this.f30567k = i2;
        this.f30568r = nv72;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f30569s.f24705c.mo42954c()).mo48245u(this.f30569s.f24703a, C4468a.m36359q(this.f30564d, this.f30565e, this.f30566g, this.f30567k), C4468a.m36352j(), new oq7(this.f30569s, this.f30568r, (char[]) null));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46854c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
