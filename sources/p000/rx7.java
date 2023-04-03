package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

/* renamed from: rx7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class rx7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new ModuleAvailabilityResponse(z, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleAvailabilityResponse[i];
    }
}
