package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: lx7 */
public final class lx7 extends pv7 implements nx7 {
    public lx7(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: R0 */
    public final void mo45546R0(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel E0 = mo46902E0();
        xv7.m54567b(E0, bundle);
        xv7.m54567b(E0, bundle2);
        mo46904q1(2, E0);
    }

    /* renamed from: U0 */
    public final void mo45547U0(Bundle bundle) throws RemoteException {
        Parcel E0 = mo46902E0();
        xv7.m54567b(E0, bundle);
        mo46904q1(4, E0);
    }

    /* renamed from: a1 */
    public final void mo45548a1(Bundle bundle) throws RemoteException {
        Parcel E0 = mo46902E0();
        xv7.m54567b(E0, bundle);
        mo46904q1(3, E0);
    }
}
