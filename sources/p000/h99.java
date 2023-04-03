package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

/* renamed from: h99 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class h99 extends vi9<x69> {

    /* renamed from: i */
    public final zzk f29481i;

    public h99(Context context, zzk zzk) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f29481i = zzk;
        mo48753e();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo43108a(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        ob9 ob9;
        IBinder c = dynamiteModule.mo30743c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (c == null) {
            ob9 = null;
        } else {
            IInterface queryLocalInterface = c.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            if (queryLocalInterface instanceof ob9) {
                ob9 = (ob9) queryLocalInterface;
            } else {
                ob9 = new ye9(c);
            }
        }
        if (ob9 == null) {
            return null;
        }
        return ob9.mo46370E(gf4.m44716s1(context), (zzk) cu4.m43221k(this.f29481i));
    }

    /* renamed from: b */
    public final void mo43109b() throws RemoteException {
        if (mo48751c()) {
            ((x69) cu4.m43221k((x69) mo48753e())).zza();
        }
    }

    /* renamed from: f */
    public final Barcode[] mo43110f(Bitmap bitmap, zzs zzs) {
        if (!mo48751c()) {
            return new Barcode[0];
        }
        try {
            return ((x69) cu4.m43221k((x69) mo48753e())).mo49398z0(gf4.m44716s1(bitmap), zzs);
        } catch (RemoteException unused) {
            return new Barcode[0];
        }
    }

    /* renamed from: g */
    public final Barcode[] mo43111g(ByteBuffer byteBuffer, zzs zzs) {
        if (!mo48751c()) {
            return new Barcode[0];
        }
        try {
            return ((x69) cu4.m43221k((x69) mo48753e())).mo49397i0(gf4.m44716s1(byteBuffer), zzs);
        } catch (RemoteException unused) {
            return new Barcode[0];
        }
    }
}
