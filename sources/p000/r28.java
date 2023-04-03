package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zax;
import p000.ro2;

/* renamed from: r28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class r28 extends tx7 {
    public r28(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: t1 */
    public final ro2 mo47324t1(ro2 ro2, zax zax) throws RemoteException {
        Parcel E0 = mo48261E0();
        h08.m45002e(E0, ro2);
        h08.m45001d(E0, zax);
        Parcel q1 = mo48263q1(2, E0);
        ro2 q12 = ro2.C6440a.m51194q1(q1.readStrongBinder());
        q1.recycle();
        return q12;
    }
}
