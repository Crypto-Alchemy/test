package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: i99 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class i99 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lf8 f29865a;

    /* renamed from: d */
    public final /* synthetic */ AppMeasurementDynamiteService f29866d;

    public i99(AppMeasurementDynamiteService appMeasurementDynamiteService, lf8 lf8) {
        this.f29866d = appMeasurementDynamiteService;
        this.f29865a = lf8;
    }

    public final void run() {
        this.f29866d.f23060a.mo45243G().mo42805V(this.f29865a, this.f29866d.f23060a.mo45261g());
    }
}
