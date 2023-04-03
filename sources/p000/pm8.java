package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p000.C6462ry;

/* renamed from: pm8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class pm8 extends C6462ry<am8> {
    public pm8(Context context, Looper looper, C6462ry.C6463a aVar, C6462ry.C6464b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* renamed from: J */
    public final String mo28792J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: K */
    public final String mo28793K() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: p */
    public final int mo28794p() {
        return mi2.f31711a;
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo28795x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof am8) {
            return (am8) queryLocalInterface;
        }
        return new ul8(iBinder);
    }
}
