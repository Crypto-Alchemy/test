package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: so2 */
/* compiled from: IPostMessageService */
public interface so2 extends IInterface {

    /* renamed from: so2$a */
    /* compiled from: IPostMessageService */
    public static abstract class C3293a extends Binder implements so2 {
        public C3293a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 2
                r1 = 0
                r2 = 1
                java.lang.String r3 = "android.support.customtabs.IPostMessageService"
                if (r5 == r0) goto L_0x003d
                r0 = 3
                if (r5 == r0) goto L_0x0018
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0014
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0014:
                r7.writeString(r3)
                return r2
            L_0x0018:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                sn2 r5 = p000.sn2.C3291a.m27028E0(r5)
                java.lang.String r8 = r6.readString()
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x0036
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0036:
                r4.mo2801b1(r5, r8, r1)
                r7.writeNoException()
                return r2
            L_0x003d:
                r6.enforceInterface(r3)
                android.os.IBinder r5 = r6.readStrongBinder()
                sn2 r5 = p000.sn2.C3291a.m27028E0(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0057
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0057:
                r4.mo2800Z(r5, r1)
                r7.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.so2.C3293a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: Z */
    void mo2800Z(sn2 sn2, Bundle bundle) throws RemoteException;

    /* renamed from: b1 */
    void mo2801b1(sn2 sn2, String str, Bundle bundle) throws RemoteException;
}
