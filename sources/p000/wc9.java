package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;

/* renamed from: wc9 */
public final class wc9 extends e48 implements kb9 {
    public wc9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    /* renamed from: p1 */
    public final void mo44741p1(u69 u69, zze zze) throws RemoteException {
        Parcel E0 = mo42131E0();
        ve8.m53370b(E0, u69);
        ve8.m53371c(E0, zze);
        mo42133q1(1, E0);
    }
}
