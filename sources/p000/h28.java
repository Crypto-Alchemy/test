package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;

/* renamed from: h28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class h28 extends tx7 {
    public h28(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: t1 */
    public final void mo43066t1(TelemetryData telemetryData) throws RemoteException {
        Parcel E0 = mo48261E0();
        h08.m45001d(E0, telemetryData);
        mo48265s1(1, E0);
    }
}
