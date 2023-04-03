package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: w48 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class w48 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
