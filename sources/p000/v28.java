package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: v28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class v28 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 2:
                    i2 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 3:
                    i3 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 4:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 5:
                    j2 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 6:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 7:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 8:
                    i4 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 9:
                    i5 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
