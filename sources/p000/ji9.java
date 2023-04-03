package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzf;

/* renamed from: ji9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ji9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    i = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 3:
                    i2 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 4:
                    i3 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 5:
                    i4 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 6:
                    i5 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 7:
                    i6 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 8:
                    z = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 9:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzf(i, i2, i3, i4, i5, i6, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
