package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;

/* renamed from: ai9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ai9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzj zzj = null;
        zzm zzm = null;
        zzn zzn = null;
        zzp zzp = null;
        zzo zzo = null;
        zzk zzk = null;
        zzg zzg = null;
        zzh zzh = null;
        zzi zzi = null;
        byte[] bArr = null;
        double d = 0.0d;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 3:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 4:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    i2 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.m33751s(parcel2, C, Point.CREATOR);
                    break;
                case 7:
                    zzj = (zzj) SafeParcelReader.m33747o(parcel2, C, zzj.CREATOR);
                    break;
                case 8:
                    zzm = (zzm) SafeParcelReader.m33747o(parcel2, C, zzm.CREATOR);
                    break;
                case 9:
                    zzn = (zzn) SafeParcelReader.m33747o(parcel2, C, zzn.CREATOR);
                    break;
                case 10:
                    zzp = (zzp) SafeParcelReader.m33747o(parcel2, C, zzp.CREATOR);
                    break;
                case 11:
                    zzo = (zzo) SafeParcelReader.m33747o(parcel2, C, zzo.CREATOR);
                    break;
                case 12:
                    zzk = (zzk) SafeParcelReader.m33747o(parcel2, C, zzk.CREATOR);
                    break;
                case 13:
                    zzg = (zzg) SafeParcelReader.m33747o(parcel2, C, zzg.CREATOR);
                    break;
                case 14:
                    zzh = (zzh) SafeParcelReader.m33747o(parcel2, C, zzh.CREATOR);
                    break;
                case 15:
                    zzi = (zzi) SafeParcelReader.m33747o(parcel2, C, zzi.CREATOR);
                    break;
                case 16:
                    bArr = SafeParcelReader.m33739g(parcel2, C);
                    break;
                case 17:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 18:
                    d = SafeParcelReader.m33757y(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzq(i, str, str2, i2, pointArr, zzj, zzm, zzn, zzp, zzo, zzk, zzg, zzh, zzi, bArr, z, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
