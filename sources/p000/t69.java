package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: t69 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class t69 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) SafeParcelReader.m33747o(parcel, C, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 3:
                    z2 = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 4:
                    iArr = SafeParcelReader.m33743k(parcel, C);
                    break;
                case 5:
                    i = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m33743k(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
