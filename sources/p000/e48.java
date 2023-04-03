package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: e48 */
public class e48 implements IInterface {

    /* renamed from: a */
    public final IBinder f28377a;

    /* renamed from: b */
    public final String f28378b;

    public e48(IBinder iBinder, String str) {
        this.f28377a = iBinder;
        this.f28378b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo42131E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f28378b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f28377a;
    }

    /* renamed from: q1 */
    public final void mo42133q1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f28377a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
