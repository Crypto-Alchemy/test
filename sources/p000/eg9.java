package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzph;

/* renamed from: eg9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class eg9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzpg zzpg = null;
        zzpg zzpg2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 2:
                    str2 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 3:
                    str3 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 4:
                    str4 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 5:
                    str5 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 6:
                    zzpg = (zzpg) SafeParcelReader.m33747o(parcel, C, zzpg.CREATOR);
                    break;
                case 7:
                    zzpg2 = (zzpg) SafeParcelReader.m33747o(parcel, C, zzpg.CREATOR);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzph(str, str2, str3, str4, str5, zzpg, zzpg2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzph[i];
    }
}
