package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: oe8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class oe8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                j = SafeParcelReader.m33726F(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
