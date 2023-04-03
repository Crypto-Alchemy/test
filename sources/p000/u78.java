package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;

/* renamed from: u78 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class u78 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
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
                j = SafeParcelReader.m33726F(parcel, C);
            } else if (v != 6) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i4 = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzaj(i, i2, i3, j, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
