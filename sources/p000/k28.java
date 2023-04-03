package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;

/* renamed from: k28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class k28 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                zat = (zat) SafeParcelReader.m33747o(parcel, C, zat.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zai(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
