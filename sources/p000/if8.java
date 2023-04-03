package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: if8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class if8 extends oc8 implements lf8 {
    public if8() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* renamed from: E0 */
    public final boolean mo29962E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo43180X0((Bundle) pc8.m49856c(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
