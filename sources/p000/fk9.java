package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: fk9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class fk9 extends ba8 implements mk9 {
    public fk9() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: q1 */
    public static mk9 m44333q1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof mk9) {
            return (mk9) queryLocalInterface;
        }
        return new xj9(iBinder);
    }

    /* renamed from: E0 */
    public final boolean mo29513E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ro2 b = mo45816b();
            parcel2.writeNoException();
            yd8.m54724e(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
