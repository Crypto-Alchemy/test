package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zan;
import java.util.ArrayList;

/* renamed from: b38 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b38 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        ArrayList<zal> arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                arrayList = SafeParcelReader.m33752t(parcel, C, zal.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zan(i, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zan[i];
    }
}
