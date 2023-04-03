package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;

/* renamed from: g08 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class g08 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        ArrayList<Feature> arrayList = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                arrayList = SafeParcelReader.m33752t(parcel, C, Feature.CREATOR);
            } else if (v == 2) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 3) {
                str2 = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new ApiFeatureRequest(arrayList, z, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ApiFeatureRequest[i];
    }
}
