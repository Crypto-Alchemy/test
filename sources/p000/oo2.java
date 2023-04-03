package p000;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: oo2 */
/* compiled from: INotificationSideChannel */
public interface oo2 extends IInterface {

    /* renamed from: oo2$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C2975a extends Binder implements oo2 {

        /* renamed from: oo2$a$a */
        /* compiled from: INotificationSideChannel */
        public static class C2976a implements oo2 {

            /* renamed from: a */
            public IBinder f15960a;

            public C2976a(IBinder iBinder) {
                this.f15960a = iBinder;
            }

            public IBinder asBinder() {
                return this.f15960a;
            }

            /* renamed from: l1 */
            public void mo24034l1(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    C2977b.m23931b(obtain, notification, 0);
                    this.f15960a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: E0 */
        public static oo2 m23928E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof oo2)) {
                return new C2976a(iBinder);
            }
            return (oo2) queryLocalInterface;
        }
    }

    /* renamed from: oo2$b */
    /* compiled from: INotificationSideChannel */
    public static class C2977b {
        /* renamed from: b */
        public static <T extends Parcelable> void m23931b(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    /* renamed from: l1 */
    void mo24034l1(String str, int i, String str2, Notification notification) throws RemoteException;
}
