package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: ad9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class ad9 implements ju8 {

    /* renamed from: a */
    public final tf8 f20916a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f20917b;

    public ad9(AppMeasurementDynamiteService appMeasurementDynamiteService, tf8 tf8) {
        this.f20917b = appMeasurementDynamiteService;
        this.f20916a = tf8;
    }

    /* renamed from: a */
    public final void mo28920a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f20916a.mo43637k(str, str2, bundle, j);
        } catch (RemoteException e) {
            kr8 kr8 = this.f20917b.f23060a;
            if (kr8 != null) {
                kr8.mo45237A().mo29673o().mo48770b("Event listener threw exception", e);
            }
        }
    }
}
