package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzaq;

/* renamed from: x88 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class x88 implements Parcelable.Creator<zzaq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                bundle = SafeParcelReader.m33738f(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzaq(bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }
}
