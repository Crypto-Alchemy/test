package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: pv7 */
public class pv7 implements IInterface {

    /* renamed from: a */
    public final IBinder f32847a;

    /* renamed from: b */
    public final String f32848b;

    public pv7(IBinder iBinder, String str) {
        this.f32847a = iBinder;
        this.f32848b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo46902E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32848b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f32847a;
    }

    /* renamed from: q1 */
    public final void mo46904q1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f32847a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
