package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: eg8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class eg8 implements Parcelable.Creator<zzcl> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 2:
                    j2 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 3:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 6:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 7:
                    bundle = SafeParcelReader.m33738f(parcel2, C);
                    break;
                case 8:
                    str4 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
