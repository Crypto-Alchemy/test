package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;

/* renamed from: e28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class e28 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                arrayList = SafeParcelReader.m33750r(parcel, C);
            } else if (v != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zag(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zag[i];
    }
}
