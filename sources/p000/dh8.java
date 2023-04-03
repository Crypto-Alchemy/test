package p000;

import android.os.RemoteException;

/* renamed from: dh8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class dh8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f28191k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f28192r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dh8(cm8 cm8, String str) {
        super(cm8, true);
        this.f28192r = cm8;
        this.f28191k = str;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f28192r.f21816i)).beginAdUnitExposure(this.f28191k, this.f28895d);
    }
}
