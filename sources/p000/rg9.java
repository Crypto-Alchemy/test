package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rg9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class rg9 implements Parcelable.Creator<zzp> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j6 = -2147483648L;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 4:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    str4 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 6:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 7:
                    j2 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 8:
                    str5 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 9:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 10:
                    z3 = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 11:
                    j6 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 12:
                    str6 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 13:
                    j3 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 14:
                    j4 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 15:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 16:
                    z2 = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 18:
                    z4 = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 19:
                    str7 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 21:
                    bool = SafeParcelReader.m33756x(parcel2, C);
                    break;
                case 22:
                    j5 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m33750r(parcel2, C);
                    break;
                case 24:
                    str8 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 25:
                    str9 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzp(str, str2, str3, str4, j, j2, str5, z, z3, j6, str6, j3, j4, i, z2, z4, str7, bool, j5, (List<String>) arrayList, str8, str9);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
