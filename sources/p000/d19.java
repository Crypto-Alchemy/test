package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzk;

/* renamed from: d19 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class d19 implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                z = SafeParcelReader.m33755w(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzk(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
