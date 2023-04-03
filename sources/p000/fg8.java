package p000;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: fg8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class fg8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ Bundle f28874k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f28875r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fg8(cm8 cm8, Bundle bundle) {
        super(cm8, true);
        this.f28875r = cm8;
        this.f28874k = bundle;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f28875r.f21816i)).setConditionalUserProperty(this.f28874k, this.f28894a);
    }
}
