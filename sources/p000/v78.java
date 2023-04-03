package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.vision.zzal;

/* renamed from: v78 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class v78 implements Parcelable.Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            SafeParcelReader.m33754v(C);
            SafeParcelReader.m33729I(parcel, C);
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzal();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
