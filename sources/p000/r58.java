package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzj;

/* renamed from: r58 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class r58 extends ba8 implements eo2 {
    public r58() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: E0 */
    public final boolean mo29513E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            yd8.m54721b(parcel);
            mo42333G(parcel.readInt(), parcel.readStrongBinder(), (Bundle) yd8.m54720a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            yd8.m54721b(parcel);
            mo42335u0(parcel.readInt(), (Bundle) yd8.m54720a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            yd8.m54721b(parcel);
            mo42334O0(parcel.readInt(), parcel.readStrongBinder(), (zzj) yd8.m54720a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
