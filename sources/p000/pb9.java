package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: pb9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class pb9 implements hu8 {

    /* renamed from: a */
    public final tf8 f32651a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f32652b;

    public pb9(AppMeasurementDynamiteService appMeasurementDynamiteService, tf8 tf8) {
        this.f32652b = appMeasurementDynamiteService;
        this.f32651a = tf8;
    }

    /* renamed from: a */
    public final void mo43396a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f32651a.mo43637k(str, str2, bundle, j);
        } catch (RemoteException e) {
            kr8 kr8 = this.f32652b.f23060a;
            if (kr8 != null) {
                kr8.mo45237A().mo29673o().mo48770b("Event interceptor threw exception", e);
            }
        }
    }
}
