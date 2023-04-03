package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzq;

/* renamed from: vh9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class vh9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 3) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzq(z, str, i2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
