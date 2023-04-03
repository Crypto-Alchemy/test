package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p000.ro2;

/* renamed from: xh9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class xh9 extends g48 {
    public xh9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: r1 */
    public final ro2 mo49484r1(ro2 ro2, String str, int i, ro2 ro22) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        q1.writeInt(i);
        yd8.m54724e(q1, ro22);
        Parcel E0 = mo42748E0(2, q1);
        ro2 q12 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q12;
    }

    /* renamed from: s1 */
    public final ro2 mo49485s1(ro2 ro2, String str, int i, ro2 ro22) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54724e(q1, ro2);
        q1.writeString(str);
        q1.writeInt(i);
        yd8.m54724e(q1, ro22);
        Parcel E0 = mo42748E0(3, q1);
        ro2 q12 = ro2.C6440a.m51194q1(E0.readStrongBinder());
        E0.recycle();
        return q12;
    }
}
