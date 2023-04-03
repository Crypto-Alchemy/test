package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: kc8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public class kc8 implements IInterface {

    /* renamed from: a */
    public final IBinder f30807a;

    /* renamed from: b */
    public final String f30808b;

    public kc8(IBinder iBinder, String str) {
        this.f30807a = iBinder;
        this.f30808b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo44743E0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f30807a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f30807a;
    }

    /* renamed from: q1 */
    public final Parcel mo44745q1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30808b);
        return obtain;
    }

    /* renamed from: r1 */
    public final void mo44746r1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30807a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
