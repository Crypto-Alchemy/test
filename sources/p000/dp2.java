package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: dp2 */
/* compiled from: ITrustedWebActivityService */
public interface dp2 extends IInterface {

    /* renamed from: dp2$a */
    /* compiled from: ITrustedWebActivityService */
    public static abstract class C2189a extends Binder implements dp2 {
        public C2189a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 9
                r1 = 0
                r2 = 0
                r3 = 1
                java.lang.String r4 = "android.support.customtabs.trusted.ITrustedWebActivityService"
                if (r6 == r0) goto L_0x00bb
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r6 == r0) goto L_0x00b7
                switch(r6) {
                    case 2: goto L_0x0091;
                    case 3: goto L_0x0078;
                    case 4: goto L_0x006a;
                    case 5: goto L_0x0053;
                    case 6: goto L_0x002d;
                    case 7: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r6 = super.onTransact(r6, r7, r8, r9)
                return r6
            L_0x0016:
                r7.enforceInterface(r4)
                android.os.Bundle r6 = r5.mo2815J()
                r8.writeNoException()
                if (r6 == 0) goto L_0x0029
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x002c
            L_0x0029:
                r8.writeInt(r2)
            L_0x002c:
                return r3
            L_0x002d:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x003f
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x003f:
                android.os.Bundle r6 = r5.mo2817P0(r1)
                r8.writeNoException()
                if (r6 == 0) goto L_0x004f
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x0052
            L_0x004f:
                r8.writeInt(r2)
            L_0x0052:
                return r3
            L_0x0053:
                r7.enforceInterface(r4)
                android.os.Bundle r6 = r5.mo2820p0()
                r8.writeNoException()
                if (r6 == 0) goto L_0x0066
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x0069
            L_0x0066:
                r8.writeInt(r2)
            L_0x0069:
                return r3
            L_0x006a:
                r7.enforceInterface(r4)
                int r6 = r5.mo2816M0()
                r8.writeNoException()
                r8.writeInt(r6)
                return r3
            L_0x0078:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x008a
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x008a:
                r5.mo2819Y0(r1)
                r8.writeNoException()
                return r3
            L_0x0091:
                r7.enforceInterface(r4)
                int r6 = r7.readInt()
                if (r6 == 0) goto L_0x00a3
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r7)
                r1 = r6
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00a3:
                android.os.Bundle r6 = r5.mo2818R(r1)
                r8.writeNoException()
                if (r6 == 0) goto L_0x00b3
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x00b6
            L_0x00b3:
                r8.writeInt(r2)
            L_0x00b6:
                return r3
            L_0x00b7:
                r8.writeString(r4)
                return r3
            L_0x00bb:
                r7.enforceInterface(r4)
                java.lang.String r6 = r7.readString()
                int r9 = r7.readInt()
                if (r9 == 0) goto L_0x00d1
                android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
                java.lang.Object r9 = r9.createFromParcel(r7)
                r1 = r9
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x00d1:
                android.os.IBinder r7 = r7.readStrongBinder()
                android.os.Bundle r6 = r5.mo2821z(r6, r1, r7)
                r8.writeNoException()
                if (r6 == 0) goto L_0x00e5
                r8.writeInt(r3)
                r6.writeToParcel(r8, r3)
                goto L_0x00e8
            L_0x00e5:
                r8.writeInt(r2)
            L_0x00e8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dp2.C2189a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: J */
    Bundle mo2815J() throws RemoteException;

    /* renamed from: M0 */
    int mo2816M0() throws RemoteException;

    /* renamed from: P0 */
    Bundle mo2817P0(Bundle bundle) throws RemoteException;

    /* renamed from: R */
    Bundle mo2818R(Bundle bundle) throws RemoteException;

    /* renamed from: Y0 */
    void mo2819Y0(Bundle bundle) throws RemoteException;

    /* renamed from: p0 */
    Bundle mo2820p0() throws RemoteException;

    /* renamed from: z */
    Bundle mo2821z(String str, Bundle bundle, IBinder iBinder) throws RemoteException;
}
