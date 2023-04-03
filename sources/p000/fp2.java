package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.ep2;

/* renamed from: fp2 */
/* compiled from: IUnusedAppRestrictionsBackportService */
public interface fp2 extends IInterface {

    /* renamed from: fp2$a */
    /* compiled from: IUnusedAppRestrictionsBackportService */
    public static abstract class C2315a extends Binder implements fp2 {
        public C2315a() {
            attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo5358m(ep2.C2244a.m16272E0(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    /* renamed from: m */
    void mo5358m(ep2 ep2) throws RemoteException;
}
