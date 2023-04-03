package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;

/* renamed from: a99 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class a99 implements Parcelable.Creator<LandmarkParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        float f = Utils.FLOAT_EPSILON;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                f = SafeParcelReader.m33721A(parcel, C);
            } else if (v == 3) {
                f2 = SafeParcelReader.m33721A(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i2 = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new LandmarkParcel(i, f, f2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LandmarkParcel[i];
    }
}
