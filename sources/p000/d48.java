package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: d48 */
public class d48 implements IInterface {

    /* renamed from: a */
    public final IBinder f28028a;

    /* renamed from: b */
    public final String f28029b;

    public d48(IBinder iBinder, String str) {
        this.f28028a = iBinder;
        this.f28029b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo41846E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f28029b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f28028a;
    }

    /* renamed from: q1 */
    public final Parcel mo41848q1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f28028a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
