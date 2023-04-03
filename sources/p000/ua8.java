package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ua8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ua8 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m33747o(parcel, C, PendingIntent.CREATOR);
            } else if (v == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m33747o(parcel, C, ConnectionResult.CREATOR);
            } else if (v != 1000) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
