package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4033b;
import com.google.android.gms.signin.internal.zai;

/* renamed from: x18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class x18 extends tx7 {
    public x18(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: t1 */
    public final void mo49332t1(int i) throws RemoteException {
        Parcel E0 = mo48261E0();
        E0.writeInt(i);
        mo48264r1(7, E0);
    }

    /* renamed from: u1 */
    public final void mo49333u1(C4033b bVar, int i, boolean z) throws RemoteException {
        Parcel E0 = mo48261E0();
        h08.m45002e(E0, bVar);
        E0.writeInt(i);
        h08.m45000c(E0, z);
        mo48264r1(9, E0);
    }

    /* renamed from: v1 */
    public final void mo49334v1(zai zai, s18 s18) throws RemoteException {
        Parcel E0 = mo48261E0();
        h08.m45001d(E0, zai);
        h08.m45002e(E0, s18);
        mo48264r1(12, E0);
    }
}
