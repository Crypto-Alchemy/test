package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: tw7 */
public final class tw7 extends pv7 implements zw7 {
    public tw7(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: D */
    public final void mo48239D(String str, Bundle bundle, Bundle bundle2, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        xv7.m54567b(E0, bundle);
        xv7.m54567b(E0, bundle2);
        xv7.m54568c(E0, gx7);
        mo46904q1(7, E0);
    }

    /* renamed from: S0 */
    public final void mo48240S0(String str, Bundle bundle, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        xv7.m54567b(E0, bundle);
        xv7.m54568c(E0, gx7);
        mo46904q1(5, E0);
    }

    /* renamed from: V */
    public final void mo48241V(String str, Bundle bundle, Bundle bundle2, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        xv7.m54567b(E0, bundle);
        xv7.m54567b(E0, bundle2);
        xv7.m54568c(E0, gx7);
        mo46904q1(11, E0);
    }

    /* renamed from: e */
    public final void mo48242e(String str, Bundle bundle, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        xv7.m54567b(E0, bundle);
        xv7.m54568c(E0, gx7);
        mo46904q1(10, E0);
    }

    /* renamed from: g */
    public final void mo48243g(String str, Bundle bundle, Bundle bundle2, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        xv7.m54567b(E0, bundle);
        xv7.m54567b(E0, bundle2);
        xv7.m54568c(E0, gx7);
        mo46904q1(9, E0);
    }

    /* renamed from: m0 */
    public final void mo48244m0(String str, List<Bundle> list, Bundle bundle, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        E0.writeTypedList(list);
        xv7.m54567b(E0, bundle);
        xv7.m54568c(E0, gx7);
        mo46904q1(14, E0);
    }

    /* renamed from: u */
    public final void mo48245u(String str, Bundle bundle, Bundle bundle2, gx7 gx7) throws RemoteException {
        Parcel E0 = mo46902E0();
        E0.writeString(str);
        xv7.m54567b(E0, bundle);
        xv7.m54567b(E0, bundle2);
        xv7.m54568c(E0, gx7);
        mo46904q1(6, E0);
    }
}
