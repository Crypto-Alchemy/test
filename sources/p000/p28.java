package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* renamed from: p28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class p28 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zav zav = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m33747o(parcel, C, ConnectionResult.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                zav = (zav) SafeParcelReader.m33747o(parcel, C, zav.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
