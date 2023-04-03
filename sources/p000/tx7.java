package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: tx7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class tx7 implements IInterface {

    /* renamed from: a */
    public final IBinder f34413a;

    /* renamed from: b */
    public final String f34414b;

    public tx7(IBinder iBinder, String str) {
        this.f34413a = iBinder;
        this.f34414b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo48261E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34414b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f34413a;
    }

    /* renamed from: q1 */
    public final Parcel mo48263q1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f34413a.transact(2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: r1 */
    public final void mo48264r1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f34413a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: s1 */
    public final void mo48265s1(int i, Parcel parcel) throws RemoteException {
        try {
            this.f34413a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
