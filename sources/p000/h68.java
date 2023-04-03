package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;

/* renamed from: h68 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class h68 extends g48 implements w68 {
    public h68(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: C0 */
    public final zzq mo43095C0(zzo zzo) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54723d(q1, zzo);
        Parcel E0 = mo42748E0(6, q1);
        zzq zzq = (zzq) yd8.m54720a(E0, zzq.CREATOR);
        E0.recycle();
        return zzq;
    }

    /* renamed from: L0 */
    public final zzq mo43096L0(zzo zzo) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54723d(q1, zzo);
        Parcel E0 = mo42748E0(8, q1);
        zzq zzq = (zzq) yd8.m54720a(E0, zzq.CREATOR);
        E0.recycle();
        return zzq;
    }

    /* renamed from: f */
    public final boolean mo43097f() throws RemoteException {
        Parcel E0 = mo42748E0(7, mo42750q1());
        boolean f = yd8.m54725f(E0);
        E0.recycle();
        return f;
    }

    /* renamed from: q0 */
    public final boolean mo43098q0(zzs zzs, ro2 ro2) throws RemoteException {
        Parcel q1 = mo42750q1();
        yd8.m54723d(q1, zzs);
        yd8.m54724e(q1, ro2);
        Parcel E0 = mo42748E0(5, q1);
        boolean f = yd8.m54725f(E0);
        E0.recycle();
        return f;
    }
}
