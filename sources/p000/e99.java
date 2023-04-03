package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: e99 */
public abstract class e99 extends z98 implements u69 {
    public e99() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* renamed from: E0 */
    public final boolean mo42171E0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo43427Q((Status) ve8.m53369a(parcel, Status.CREATOR));
                return true;
            case 2:
                mo45889U((Status) ve8.m53369a(parcel, Status.CREATOR));
                return true;
            case 3:
                mo45893h((Status) ve8.m53369a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                mo45890Y((Status) ve8.m53369a(parcel, Status.CREATOR));
                return true;
            case 5:
                mo45892d0((Status) ve8.m53369a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                mo45888Q0((Status) ve8.m53369a(parcel, Status.CREATOR), (zze[]) parcel.createTypedArray(zze.CREATOR));
                return true;
            case 7:
                mo45894j((DataHolder) ve8.m53369a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                mo45887N((Status) ve8.m53369a(parcel, Status.CREATOR), (zzc) ve8.m53369a(parcel, zzc.CREATOR));
                return true;
            case 9:
                mo45891b0((Status) ve8.m53369a(parcel, Status.CREATOR), (zzc) ve8.m53369a(parcel, zzc.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
