package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpq;

/* renamed from: ih9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ih9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 2) {
                str2 = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzpq(str, str2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpq[i];
    }
}
