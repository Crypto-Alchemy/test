package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* renamed from: u38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class u38 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                iBinder = SafeParcelReader.m33724D(parcel, C);
            } else if (v == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m33747o(parcel, C, ConnectionResult.CREATOR);
            } else if (v == 4) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                z2 = SafeParcelReader.m33755w(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
