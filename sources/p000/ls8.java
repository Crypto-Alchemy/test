package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ls8 */
public final class ls8 extends d48 implements kl8 {
    public ls8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String getId() throws RemoteException {
        Parcel q1 = mo41848q1(1, mo41846E0());
        String readString = q1.readString();
        q1.recycle();
        return readString;
    }

    /* renamed from: t */
    public final boolean mo44838t(boolean z) throws RemoteException {
        Parcel E0 = mo41846E0();
        ue8.m52813a(E0, true);
        Parcel q1 = mo41848q1(2, E0);
        boolean b = ue8.m52814b(q1);
        q1.recycle();
        return b;
    }
}
