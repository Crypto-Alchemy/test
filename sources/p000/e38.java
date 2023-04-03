package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: e38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class e38 extends jh2 {

    /* renamed from: v1 */
    public final pm6 f28375v1;

    public e38(Context context, Looper looper, sg0 sg0, pm6 pm6, np0 np0, dh4 dh4) {
        super(context, looper, 270, sg0, np0, dh4);
        this.f28375v1 = pm6;
    }

    /* renamed from: A */
    public final Feature[] mo42127A() {
        return v18.f34812b;
    }

    /* renamed from: F */
    public final Bundle mo42128F() {
        return this.f28375v1.mo46782b();
    }

    /* renamed from: J */
    public final String mo28792J() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* renamed from: K */
    public final String mo28793K() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* renamed from: N */
    public final boolean mo42129N() {
        return true;
    }

    /* renamed from: p */
    public final int mo28794p() {
        return 203400000;
    }

    /* renamed from: x */
    public final /* synthetic */ IInterface mo28795x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof h28) {
            return (h28) queryLocalInterface;
        }
        return new h28(iBinder);
    }
}
