package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ba8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ba8 extends Binder implements IInterface {
    public ba8(String str) {
        attachInterface(this, str);
    }

    /* renamed from: E0 */
    public boolean mo29513E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
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
        return mo29513E0(i, parcel, parcel2, i2);
    }
}
