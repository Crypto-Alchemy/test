package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.ro2;

/* renamed from: ng9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ng9 extends g48 {
    public ng9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: c */
    public final int mo46076c() throws RemoteException {
        Parcel E0 = mo42748E0(6, mo42750q1());
        int readInt = E0.readInt();
        E0.recycle();
        return readInt;
    }

    /* renamed from: r1 */
    public final int mo46077r1(ro2 ro2, String str, boolean z) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        yd8.m54722c(q1, z);
        Parcel E0 = mo42748E0(3, q1);
        int readInt = E0.readInt();
        E0.recycle();
        return readInt;
    }

    /* renamed from: s1 */
    public final int mo46078s1(ro2 ro2, String str, boolean z) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        yd8.m54722c(q1, z);
        Parcel E0 = mo42748E0(5, q1);
        int readInt = E0.readInt();
        E0.recycle();
        return readInt;
    }

    /* renamed from: t1 */
    public final ro2 mo46079t1(ro2 ro2, String str, int i) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        q1.writeInt(i);
        Parcel E0 = mo42748E0(2, q1);
        ro2 q12 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q12;
    }

    /* renamed from: u1 */
    public final ro2 mo46080u1(ro2 ro2, String str, int i, ro2 ro22) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        q1.writeInt(i);
        yd8.m54724e(q1, ro22);
        Parcel E0 = mo42748E0(8, q1);
        ro2 q12 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q12;
    }

    /* renamed from: v1 */
    public final ro2 mo46081v1(ro2 ro2, String str, int i) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        q1.writeInt(i);
        Parcel E0 = mo42748E0(4, q1);
        ro2 q12 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q12;
    }

    /* renamed from: w1 */
    public final ro2 mo46082w1(ro2 ro2, String str, boolean z, long j) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        yd8.m54722c(q1, z);
        q1.writeLong(j);
        Parcel E0 = mo42748E0(7, q1);
        ro2 q12 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q12;
    }
}
