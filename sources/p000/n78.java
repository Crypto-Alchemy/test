package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: n78 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class n78 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 3) {
                z2 = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 4) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i3 = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
