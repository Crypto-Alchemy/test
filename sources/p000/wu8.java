package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: wu8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class wu8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lf8 f35444a;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f35445d;

    public wu8(AppMeasurementDynamiteService appMeasurementDynamiteService, lf8 lf8) {
        this.f35445d = appMeasurementDynamiteService;
        this.f35444a = lf8;
    }

    public final void run() {
        this.f35445d.f23060a.mo45254R().mo42727U(this.f35444a);
    }
}
