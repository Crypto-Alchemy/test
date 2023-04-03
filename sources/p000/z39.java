package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zzj;

/* renamed from: z39 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class z39 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                bundle = SafeParcelReader.m33738f(parcel, C);
            } else if (v == 2) {
                featureArr = (Feature[]) SafeParcelReader.m33751s(parcel, C, Feature.CREATOR);
            } else if (v == 3) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m33747o(parcel, C, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
