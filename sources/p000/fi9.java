package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.clearcut.zzr;

/* renamed from: fi9 */
public final class fi9 implements Parcelable.Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = true;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 3:
                    i = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 4:
                    i2 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 5:
                    str2 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 7:
                    z2 = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 8:
                    str4 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 9:
                    z = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 10:
                    i3 = SafeParcelReader.m33725E(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzr(str, i, i2, str2, str3, z2, str4, z, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
