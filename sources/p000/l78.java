package p000;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzaj;

/* renamed from: l78 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class l78 implements Parcelable.Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        Rect rect = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            if (SafeParcelReader.m33754v(C) != 2) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                rect = (Rect) SafeParcelReader.m33747o(parcel, C, Rect.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzaj(rect);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
