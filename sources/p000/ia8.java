package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ia8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class ia8 implements IInterface {

    /* renamed from: a */
    public final IBinder f29867a;

    /* renamed from: b */
    public final String f29868b;

    public ia8(IBinder iBinder, String str) {
        this.f29867a = iBinder;
        this.f29868b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo43528E0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29868b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f29867a;
    }

    /* renamed from: q1 */
    public final Parcel mo43530q1(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f29867a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: r1 */
    public final void mo43531r1(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f29867a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
