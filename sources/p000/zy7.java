package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;

/* renamed from: zy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zy7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 1) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m33747o(parcel, C, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallIntentResponse[i];
    }
}
