package p000;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: sn2 */
/* compiled from: ICustomTabsCallback */
public interface sn2 extends IInterface {

    /* renamed from: sn2$a */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C3291a extends Binder implements sn2 {

        /* renamed from: sn2$a$a */
        /* compiled from: ICustomTabsCallback */
        public static class C3292a implements sn2 {

            /* renamed from: b */
            public static sn2 f17751b;

            /* renamed from: a */
            public IBinder f17752a;

            public C3292a(IBinder iBinder) {
                this.f17752a = iBinder;
            }

            /* renamed from: O */
            public void mo24287O(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f17752a.transact(3, obtain, obtain2, 0) || C3291a.m27029q1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3291a.m27029q1().mo24287O(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f17752a;
            }

            /* renamed from: c1 */
            public void mo24288c1(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f17752a.transact(2, obtain, obtain2, 0) || C3291a.m27029q1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3291a.m27029q1().mo24288c1(i, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i1 */
            public void mo24289i1(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f17752a.transact(5, obtain, obtain2, 0) || C3291a.m27029q1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3291a.m27029q1().mo24289i1(str, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j1 */
            public void mo24290j1(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f17752a.transact(4, obtain, obtain2, 0) || C3291a.m27029q1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3291a.m27029q1().mo24290j1(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m1 */
            public void mo24291m1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f17752a.transact(6, obtain, obtain2, 0) || C3291a.m27029q1() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3291a.m27029q1().mo24291m1(i, uri, z, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public Bundle mo24292q(String str, Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f17752a.transact(7, obtain, obtain2, 0) && C3291a.m27029q1() != null) {
                        return C3291a.m27029q1().mo24292q(str, bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3291a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        /* renamed from: E0 */
        public static sn2 m27028E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof sn2)) {
                return new C3292a(iBinder);
            }
            return (sn2) queryLocalInterface;
        }

        /* renamed from: q1 */
        public static sn2 m27029q1() {
            return C3292a.f17751b;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.ICustomTabsCallback"
                if (r5 == r0) goto L_0x00e0
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 2: goto L_0x00c3;
                    case 3: goto L_0x00a6;
                    case 4: goto L_0x008d;
                    case 5: goto L_0x0070;
                    case 6: goto L_0x003c;
                    case 7: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0028
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0028:
                android.os.Bundle r5 = r4.mo24292q(r5, r3)
                r7.writeNoException()
                if (r5 == 0) goto L_0x0038
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x003b
            L_0x0038:
                r7.writeInt(r0)
            L_0x003b:
                return r1
            L_0x003c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0052
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x0053
            L_0x0052:
                r8 = r3
            L_0x0053:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x005a
                r0 = r1
            L_0x005a:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0069
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r2.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0069:
                r4.mo24291m1(r5, r8, r0, r3)
                r7.writeNoException()
                return r1
            L_0x0070:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0086
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0086:
                r4.mo24289i1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x009f
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x009f:
                r4.mo24290j1(r3)
                r7.writeNoException()
                return r1
            L_0x00a6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00bc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00bc:
                r4.mo24287O(r5, r3)
                r7.writeNoException()
                return r1
            L_0x00c3:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00d9
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00d9:
                r4.mo24288c1(r5, r3)
                r7.writeNoException()
                return r1
            L_0x00e0:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.sn2.C3291a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: O */
    void mo24287O(String str, Bundle bundle) throws RemoteException;

    /* renamed from: c1 */
    void mo24288c1(int i, Bundle bundle) throws RemoteException;

    /* renamed from: i1 */
    void mo24289i1(String str, Bundle bundle) throws RemoteException;

    /* renamed from: j1 */
    void mo24290j1(Bundle bundle) throws RemoteException;

    /* renamed from: m1 */
    void mo24291m1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: q */
    Bundle mo24292q(String str, Bundle bundle) throws RemoteException;
}
