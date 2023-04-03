package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ei8 */
public final class ei8 implements Parcelable.Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 2) {
                j2 = SafeParcelReader.m33726F(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                j = SafeParcelReader.m33726F(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzc(z, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
