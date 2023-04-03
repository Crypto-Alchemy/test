package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzab;

/* renamed from: j58 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class j58 implements Parcelable.Creator<zzab> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 3) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 4) {
                i3 = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 5) {
                i4 = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 6) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                f = SafeParcelReader.m33721A(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzab(i, i2, i3, i4, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzab[i];
    }
}
