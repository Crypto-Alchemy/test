package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: pf8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class pf8 extends kc8 implements tf8 {
    public pf8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: c */
    public final int mo43636c() throws RemoteException {
        Parcel E0 = mo44743E0(2, mo44745q1());
        int readInt = E0.readInt();
        E0.recycle();
        return readInt;
    }

    /* renamed from: k */
    public final void mo43637k(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49857d(q1, bundle);
        q1.writeLong(j);
        mo44746r1(1, q1);
    }
}
