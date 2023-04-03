package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpn;

/* renamed from: gg9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class gg9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        zzpm zzpm = null;
        String str = null;
        String str2 = null;
        zzpn[] zzpnArr = null;
        zzpk[] zzpkArr = null;
        String[] strArr = null;
        zzpf[] zzpfArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    zzpm = (zzpm) SafeParcelReader.m33747o(parcel, C, zzpm.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 4:
                    zzpnArr = (zzpn[]) SafeParcelReader.m33751s(parcel, C, zzpn.CREATOR);
                    break;
                case 5:
                    zzpkArr = (zzpk[]) SafeParcelReader.m33751s(parcel, C, zzpk.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.m33749q(parcel, C);
                    break;
                case 7:
                    zzpfArr = (zzpf[]) SafeParcelReader.m33751s(parcel, C, zzpf.CREATOR);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzpi(zzpm, str, str2, zzpnArr, zzpkArr, strArr, zzpfArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpi[i];
    }
}
