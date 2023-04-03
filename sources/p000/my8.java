package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzas;

/* renamed from: my8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class my8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lf8 f31903a;

    /* renamed from: d */
    public final /* synthetic */ zzas f31904d;

    /* renamed from: e */
    public final /* synthetic */ String f31905e;

    /* renamed from: g */
    public final /* synthetic */ AppMeasurementDynamiteService f31906g;

    public my8(AppMeasurementDynamiteService appMeasurementDynamiteService, lf8 lf8, zzas zzas, String str) {
        this.f31906g = appMeasurementDynamiteService;
        this.f31903a = lf8;
        this.f31904d = zzas;
        this.f31905e = str;
    }

    public final void run() {
        this.f31906g.f23060a.mo45254R().mo42736t(this.f31903a, this.f31904d, this.f31905e);
    }
}
