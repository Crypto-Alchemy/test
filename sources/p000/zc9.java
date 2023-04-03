package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: zc9 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zc9 extends ia8 implements x69 {
    public zc9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: i0 */
    public final Barcode[] mo49397i0(ro2 ro2, zzs zzs) throws RemoteException {
        Parcel E0 = mo43528E0();
        nh8.m48799a(E0, ro2);
        nh8.m48800b(E0, zzs);
        Parcel q1 = mo43530q1(1, E0);
        Barcode[] barcodeArr = (Barcode[]) q1.createTypedArray(Barcode.CREATOR);
        q1.recycle();
        return barcodeArr;
    }

    /* renamed from: z0 */
    public final Barcode[] mo49398z0(ro2 ro2, zzs zzs) throws RemoteException {
        Parcel E0 = mo43528E0();
        nh8.m48799a(E0, ro2);
        nh8.m48800b(E0, zzs);
        Parcel q1 = mo43530q1(2, E0);
        Barcode[] barcodeArr = (Barcode[]) q1.createTypedArray(Barcode.CREATOR);
        q1.recycle();
        return barcodeArr;
    }

    public final void zza() throws RemoteException {
        mo43531r1(3, mo43528E0());
    }
}
