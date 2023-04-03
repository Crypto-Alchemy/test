package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;

/* renamed from: ug9 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ug9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        double d = Utils.DOUBLE_EPSILON;
        double d2 = 0.0d;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                d = SafeParcelReader.m33757y(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                d2 = SafeParcelReader.m33757y(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzpl(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}
