package android.support.p002v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: IMediaSession */
public interface C0082b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* compiled from: IMediaSession */
    public static abstract class C0083a extends Binder implements C0082b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* compiled from: IMediaSession */
        public static class C0084a implements C0082b {

            /* renamed from: b */
            public static C0082b f332b;

            /* renamed from: a */
            public IBinder f333a;

            public C0084a(IBinder iBinder) {
                this.f333a = iBinder;
            }

            public IBinder asBinder() {
                return this.f333a;
            }

            /* renamed from: k0 */
            public void mo791k0(C0080a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.f333a.transact(3, obtain, obtain2, 0) || C0083a.m602q1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C0083a.m602q1().mo791k0(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: E0 */
        public static C0082b m601E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0082b)) {
                return new C0084a(iBinder);
            }
            return (C0082b) queryLocalInterface;
        }

        /* renamed from: q1 */
        public static C0082b m602q1() {
            return C0084a.f332b;
        }
    }

    /* renamed from: k0 */
    void mo791k0(C0080a aVar) throws RemoteException;
}
