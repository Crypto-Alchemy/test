package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: y69 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class y69 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lf8 f35779a;

    /* renamed from: d */
    public final /* synthetic */ String f35780d;

    /* renamed from: e */
    public final /* synthetic */ String f35781e;

    /* renamed from: g */
    public final /* synthetic */ AppMeasurementDynamiteService f35782g;

    public y69(AppMeasurementDynamiteService appMeasurementDynamiteService, lf8 lf8, String str, String str2) {
        this.f35782g = appMeasurementDynamiteService;
        this.f35779a = lf8;
        this.f35780d = str;
        this.f35781e = str2;
    }

    public final void run() {
        this.f35782g.f23060a.mo45254R().mo42721O(this.f35779a, this.f35780d, this.f35781e);
    }
}
