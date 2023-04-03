package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: qf8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class qf8 extends oc8 implements tf8 {
    public qf8() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: E0 */
    public final boolean mo29962E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo43637k(parcel.readString(), parcel.readString(), (Bundle) pc8.m49856c(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int c = mo43636c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
