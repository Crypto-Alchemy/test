package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: hf8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class hf8 extends kc8 implements lf8 {
    public hf8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: X0 */
    public final void mo43180X0(Bundle bundle) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, bundle);
        mo44746r1(1, q1);
    }
}
