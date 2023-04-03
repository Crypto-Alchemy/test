package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: sc8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class sc8 extends kc8 implements zc8 {
    public sc8(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: y0 */
    public final Bundle mo47736y0(Bundle bundle) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, bundle);
        Parcel E0 = mo44743E0(1, q1);
        Bundle bundle2 = (Bundle) pc8.m49856c(E0, Bundle.CREATOR);
        E0.recycle();
        return bundle2;
    }
}
