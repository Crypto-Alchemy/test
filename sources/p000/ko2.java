package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ko2 */
/* compiled from: IMultiInstanceInvalidationCallback */
public interface ko2 extends IInterface {

    /* renamed from: ko2$a */
    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class C2720a extends Binder implements ko2 {

        /* renamed from: ko2$a$a */
        /* compiled from: IMultiInstanceInvalidationCallback */
        public static class C2721a implements ko2 {

            /* renamed from: a */
            public IBinder f14238a;

            public C2721a(IBinder iBinder) {
                this.f14238a = iBinder;
            }

            public IBinder asBinder() {
                return this.f14238a;
            }

            /* renamed from: l */
            public void mo22423l(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f14238a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C2720a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: E0 */
        public static ko2 m20939E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ko2)) {
                return new C2721a(iBinder);
            }
            return (ko2) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo22423l(parcel.createStringArray());
                return true;
            }
        }
    }

    /* renamed from: l */
    void mo22423l(String[] strArr) throws RemoteException;
}
