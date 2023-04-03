package p000;

import android.content.Context;
import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4023b;
import com.google.android.gms.common.internal.TelemetryData;
import p000.wl6;

/* renamed from: a38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a38 extends C4023b implements om6 {

    /* renamed from: k */
    public static final C4013a.C4022g f20800k;

    /* renamed from: l */
    public static final C4013a.C4014a f20801l;

    /* renamed from: m */
    public static final C4013a f20802m;

    static {
        C4013a.C4022g gVar = new C4013a.C4022g();
        f20800k = gVar;
        w28 w28 = new w28();
        f20801l = w28;
        f20802m = new C4013a("ClientTelemetry.API", w28, gVar);
    }

    public a38(Context context, pm6 pm6) {
        super(context, f20802m, pm6, C4023b.C4024a.f22212c);
    }

    /* renamed from: a */
    public final tl6<Void> mo28804a(TelemetryData telemetryData) {
        wl6.C6669a a = wl6.m53972a();
        a.mo49237d(v18.f34811a);
        a.mo49236c(false);
        a.mo49235b(new s28(telemetryData));
        return mo30562f(a.mo49234a());
    }
}
