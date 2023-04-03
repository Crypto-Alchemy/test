package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: kq7 */
public final class kq7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ int f31004d;

    /* renamed from: e */
    public final /* synthetic */ String f31005e;

    /* renamed from: g */
    public final /* synthetic */ nv7 f31006g;

    /* renamed from: k */
    public final /* synthetic */ int f31007k;

    /* renamed from: r */
    public final /* synthetic */ C4468a f31008r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq7(C4468a aVar, nv7 nv7, int i, String str, nv7 nv72, int i2) {
        super(nv7);
        this.f31008r = aVar;
        this.f31004d = i;
        this.f31005e = str;
        this.f31006g = nv72;
        this.f31007k = i2;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f31008r.f24705c.mo42954c()).mo48239D(this.f31008r.f24703a, C4468a.m36350h(this.f31004d, this.f31005e), C4468a.m36352j(), new wq7(this.f31008r, this.f31006g, this.f31004d, this.f31005e, this.f31007k));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46854c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
