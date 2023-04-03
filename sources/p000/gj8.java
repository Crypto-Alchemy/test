package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: gj8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class gj8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ String f29241k;

    /* renamed from: r */
    public final /* synthetic */ ud8 f29242r;

    /* renamed from: s */
    public final /* synthetic */ cm8 f29243s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj8(cm8 cm8, String str, ud8 ud8) {
        super(cm8, true);
        this.f29243s = cm8;
        this.f29241k = str;
        this.f29242r = ud8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f29243s.f21816i)).getMaxUserProperties(this.f29241k, this.f29242r);
    }

    /* renamed from: b */
    public final void mo42597b() {
        this.f29242r.mo43180X0((Bundle) null);
    }
}
