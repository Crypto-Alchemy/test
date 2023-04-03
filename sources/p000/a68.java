package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: a68 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class a68 implements fo2 {

    /* renamed from: a */
    public final IBinder f20820a;

    public a68(IBinder iBinder) {
        this.f20820a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f20820a;
    }

    /* renamed from: x0 */
    public final void mo28884x0(eo2 eo2, GetServiceRequest getServiceRequest) throws RemoteException {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (eo2 != null) {
                iBinder = eo2.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                c99.m32876a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f20820a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
