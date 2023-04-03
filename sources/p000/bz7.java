package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

/* renamed from: bz7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class bz7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                stringToIntConverter = (StringToIntConverter) SafeParcelReader.m33747o(parcel, C, StringToIntConverter.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zaa(i, stringToIntConverter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
