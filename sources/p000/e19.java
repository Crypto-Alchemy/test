package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: e19 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@19.0.0 */
public final class e19 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ lf8 f28365a;

    /* renamed from: d */
    public final /* synthetic */ String f28366d;

    /* renamed from: e */
    public final /* synthetic */ String f28367e;

    /* renamed from: g */
    public final /* synthetic */ boolean f28368g;

    /* renamed from: k */
    public final /* synthetic */ AppMeasurementDynamiteService f28369k;

    public e19(AppMeasurementDynamiteService appMeasurementDynamiteService, lf8 lf8, String str, String str2, boolean z) {
        this.f28369k = appMeasurementDynamiteService;
        this.f28365a = lf8;
        this.f28366d = str;
        this.f28367e = str2;
        this.f28368g = z;
    }

    public final void run() {
        this.f28369k.f23060a.mo45254R().mo42723Q(this.f28365a, this.f28366d, this.f28367e, this.f28368g);
    }
}
