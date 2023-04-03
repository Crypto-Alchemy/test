package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zze;
import com.google.android.gms.internal.mlkit_vision_barcode.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzm;

/* renamed from: cj9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class cj9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        zzl zzl = null;
        String str = null;
        String str2 = null;
        zzm[] zzmArr = null;
        zzj[] zzjArr = null;
        String[] strArr = null;
        zze[] zzeArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    zzl = (zzl) SafeParcelReader.m33747o(parcel, C, zzl.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 4:
                    str2 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 5:
                    zzmArr = (zzm[]) SafeParcelReader.m33751s(parcel, C, zzm.CREATOR);
                    break;
                case 6:
                    zzjArr = (zzj[]) SafeParcelReader.m33751s(parcel, C, zzj.CREATOR);
                    break;
                case 7:
                    strArr = SafeParcelReader.m33749q(parcel, C);
                    break;
                case 8:
                    zzeArr = (zze[]) SafeParcelReader.m33751s(parcel, C, zze.CREATOR);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzh(zzl, str, str2, zzmArr, zzjArr, strArr, zzeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
