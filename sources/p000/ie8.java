package p000;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.face.internal.client.zza;

/* renamed from: ie8 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class ie8 implements Parcelable.Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                pointFArr = (PointF[]) SafeParcelReader.m33751s(parcel, C, PointF.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zza(pointFArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
