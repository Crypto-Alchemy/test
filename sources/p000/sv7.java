package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: sv7 */
public class sv7 extends Binder implements IInterface {
    public sv7(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E0 */
    public boolean mo29799E0(int i, Parcel parcel) throws RemoteException {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo29799E0(i, parcel);
    }
}
