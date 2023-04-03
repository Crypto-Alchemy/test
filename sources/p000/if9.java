package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpf;

/* renamed from: if9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class if9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                strArr = SafeParcelReader.m33749q(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzpf(i, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpf[i];
    }
}
