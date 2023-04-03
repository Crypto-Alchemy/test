package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;

/* renamed from: sj9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class sj9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 3) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 4) {
                str3 = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str2 = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzj(i, str, str3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
