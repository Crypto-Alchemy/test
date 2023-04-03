package p000;

import android.os.RemoteException;

/* renamed from: hh8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class hh8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f29644k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f29645r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh8(cm8 cm8, String str) {
        super(cm8, true);
        this.f29645r = cm8;
        this.f29644k = str;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f29645r.f21816i)).endAdUnitExposure(this.f29644k, this.f28895d);
    }
}
