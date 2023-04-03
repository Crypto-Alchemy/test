package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: sa8 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class sa8 implements Parcelable.Creator<CloudMessage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 1) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                intent = (Intent) SafeParcelReader.m33747o(parcel, C, Intent.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new CloudMessage(intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CloudMessage[i];
    }
}
