package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.zzf;

/* renamed from: cl8 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class cl8 implements Parcelable.Creator<zzf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    i = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 3:
                    i2 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 4:
                    i3 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 5:
                    z = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 6:
                    z2 = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 7:
                    f = SafeParcelReader.m33721A(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzf(i, i2, i3, z, z2, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
