package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* renamed from: o18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class o18 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        Long l = null;
        Long l2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 3) {
                l = SafeParcelReader.m33727G(parcel, C);
            } else if (v == 4) {
                l2 = SafeParcelReader.m33727G(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i3 = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new ModuleInstallStatusUpdate(i, i2, l, l2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallStatusUpdate[i];
    }
}
