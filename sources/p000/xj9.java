package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.ro2;

/* renamed from: xj9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class xj9 extends g48 implements mk9 {
    public xj9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final ro2 mo45816b() throws RemoteException {
        Parcel E0 = mo42748E0(1, mo42750q1());
        ro2 q1 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q1;
    }

    public final int zzc() throws RemoteException {
        Parcel E0 = mo42748E0(2, mo42750q1());
        int readInt = E0.readInt();
        E0.recycle();
        return readInt;
    }
}
