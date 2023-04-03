package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.zzi;

/* renamed from: ee8 */
public final class ee8 implements Parcelable.Creator<Configuration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        zzi[] zziArr = null;
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 3) {
                zziArr = (zzi[]) SafeParcelReader.m33751s(parcel, C, zzi.CREATOR);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                strArr = SafeParcelReader.m33749q(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Configuration(i, zziArr, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
