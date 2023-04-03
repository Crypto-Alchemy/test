package p000;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C4468a;

/* renamed from: mq7 */
public final class mq7 extends rq7 {

    /* renamed from: d */
    public final /* synthetic */ int f31757d;

    /* renamed from: e */
    public final /* synthetic */ String f31758e;

    /* renamed from: g */
    public final /* synthetic */ String f31759g;

    /* renamed from: k */
    public final /* synthetic */ int f31760k;

    /* renamed from: r */
    public final /* synthetic */ nv7 f31761r;

    /* renamed from: s */
    public final /* synthetic */ C4468a f31762s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mq7(C4468a aVar, nv7 nv7, int i, String str, String str2, int i2, nv7 nv72) {
        super(nv7);
        this.f31762s = aVar;
        this.f31757d = i;
        this.f31758e = str;
        this.f31759g = str2;
        this.f31760k = i2;
        this.f31761r = nv72;
    }

    /* renamed from: a */
    public final void mo29043a() {
        try {
            ((zw7) this.f31762s.f24705c.mo42954c()).mo48241V(this.f31762s.f24703a, C4468a.m36359q(this.f31757d, this.f31758e, this.f31759g, this.f31760k), C4468a.m36352j(), new qq7(this.f31762s, this.f31761r));
        } catch (RemoteException e) {
            C4468a.f24701f.mo46853b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f31758e, this.f31759g, Integer.valueOf(this.f31760k), Integer.valueOf(this.f31757d));
            this.f31761r.mo46238d(new RuntimeException(e));
        }
    }
}
