package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: e49 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class e49 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ pb9 f28379a;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f28380d;

    public e49(AppMeasurementDynamiteService appMeasurementDynamiteService, pb9 pb9) {
        this.f28380d = appMeasurementDynamiteService;
        this.f28379a = pb9;
    }

    public final void run() {
        this.f28380d.f23060a.mo45242F().mo47930u(this.f28379a);
    }
}
