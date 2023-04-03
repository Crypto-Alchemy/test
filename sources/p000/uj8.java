package p000;

import android.os.RemoteException;

/* renamed from: uj8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@19.0.0 */
public final class uj8 extends fk8 {

    /* renamed from: k */
    public final /* synthetic */ ik8 f34609k;

    /* renamed from: r */
    public final /* synthetic */ cm8 f34610r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uj8(cm8 cm8, ik8 ik8) {
        super(cm8, true);
        this.f34610r = cm8;
        this.f34609k = ik8;
    }

    /* renamed from: a */
    public final void mo28979a() throws RemoteException {
        ((ef8) cu4.m43221k(this.f34610r.f21816i)).registerOnMeasurementEventListener(this.f34609k);
    }
}
