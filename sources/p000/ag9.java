package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpt;

/* renamed from: ag9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ag9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 1) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzpt(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpt[i];
    }
}
