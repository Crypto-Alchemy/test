package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zax;

/* renamed from: x38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class x38 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                i3 = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 3) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.m33751s(parcel, C, Scope.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zax(i, i3, i2, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
