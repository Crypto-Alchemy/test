package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import java.util.ArrayList;

/* renamed from: f38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class f38 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        int i = 0;
        ArrayList<zam> arrayList = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                arrayList = SafeParcelReader.m33752t(parcel, C, zam.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zal(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
