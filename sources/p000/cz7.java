package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: cz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class cz7 extends Binder implements IInterface {
    public cz7(String str) {
        attachInterface(this, str);
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
        return mo41793q1(i, parcel, parcel2, i2);
    }

    /* renamed from: q1 */
    public boolean mo41793q1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
