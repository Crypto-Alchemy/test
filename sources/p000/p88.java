package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzam;

/* renamed from: p88 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class p88 implements Parcelable.Creator<zzam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzam(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
