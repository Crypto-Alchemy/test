package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000.ko2;

/* renamed from: lo2 */
/* compiled from: IMultiInstanceInvalidationService */
public interface lo2 extends IInterface {

    /* renamed from: lo2$a */
    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class C2773a extends Binder implements lo2 {

        /* renamed from: lo2$a$a */
        /* compiled from: IMultiInstanceInvalidationService */
        public static class C2774a implements lo2 {

            /* renamed from: a */
            public IBinder f14619a;

            public C2774a(IBinder iBinder) {
                this.f14619a = iBinder;
            }

            /* renamed from: X */
            public void mo10109X(int i, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f14619a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f14619a;
            }

            /* renamed from: o */
            public int mo10111o(ko2 ko2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(ko2);
                    obtain.writeString(str);
                    this.f14619a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C2773a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: E0 */
        public static lo2 m21640E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof lo2)) {
                return new C2774a(iBinder);
            }
            return (lo2) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i != 1598968902) {
                if (i == 1) {
                    int o = mo10111o(ko2.C2720a.m20939E0(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(o);
                } else if (i == 2) {
                    mo10110d1(ko2.C2720a.m20939E0(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                } else if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    mo10109X(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    /* renamed from: X */
    void mo10109X(int i, String[] strArr) throws RemoteException;

    /* renamed from: d1 */
    void mo10110d1(ko2 ko2, int i) throws RemoteException;

    /* renamed from: o */
    int mo10111o(ko2 ko2, String str) throws RemoteException;
}
