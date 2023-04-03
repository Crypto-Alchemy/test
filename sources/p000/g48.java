package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g48 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class g48 implements IInterface {

    /* renamed from: a */
    public final IBinder f29071a;

    /* renamed from: b */
    public final String f29072b;

    public g48(IBinder iBinder, String str) {
        this.f29071a = iBinder;
        this.f29072b = str;
    }

    /* renamed from: E0 */
    public final Parcel mo42748E0(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f29071a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f29071a;
    }

    /* renamed from: q1 */
    public final Parcel mo42750q1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29072b);
        return obtain;
    }
}
