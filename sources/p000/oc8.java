package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: oc8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public class oc8 extends Binder implements IInterface {
    public oc8(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E0 */
    public boolean mo29962E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo29962E0(i, parcel, parcel2, i2);
    }
}
