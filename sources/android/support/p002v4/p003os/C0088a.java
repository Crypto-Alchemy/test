package android.support.p002v4.p003os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* compiled from: IResultReceiver */
public interface C0088a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0089a extends Binder implements C0088a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* compiled from: IResultReceiver */
        public static class C0090a implements C0088a {

            /* renamed from: a */
            public IBinder f341a;

            public C0090a(IBinder iBinder) {
                this.f341a = iBinder;
            }

            public IBinder asBinder() {
                return this.f341a;
            }

            /* renamed from: g0 */
            public void mo800g0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    C0091b.m615d(obtain, bundle, 0);
                    this.f341a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0089a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: E0 */
        public static C0088a m610E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0088a)) {
                return new C0090a(iBinder);
            }
            return (C0088a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo800g0(parcel.readInt(), (Bundle) C0091b.m614c(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    /* compiled from: IResultReceiver */
    public static class C0091b {
        /* renamed from: c */
        public static <T> T m614c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static <T extends Parcelable> void m615d(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: g0 */
    void mo800g0(int i, Bundle bundle) throws RemoteException;
}
