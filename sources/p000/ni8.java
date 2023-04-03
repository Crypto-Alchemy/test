package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: ni8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class ni8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ ud8 f32136k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f32137r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ni8(cm8 cm8, ud8 ud8) {
        super(cm8, true);
        this.f32137r = cm8;
        this.f32136k = ud8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f32137r.f21816i)).generateEventId(this.f32136k);
    }

    /* renamed from: b */
    public final void mo42597b() {
        this.f32136k.mo43180X0((Bundle) null);
    }
}
