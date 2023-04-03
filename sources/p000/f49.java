package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.phenotype.zzi;

/* renamed from: f49 */
public final class f49 implements Parcelable.Creator<zzi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        long j = 0;
        double d = 0.0d;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 3:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 4:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 5:
                    d = SafeParcelReader.m33757y(parcel2, C);
                    break;
                case 6:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 7:
                    bArr = SafeParcelReader.m33739g(parcel2, C);
                    break;
                case 8:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 9:
                    i2 = SafeParcelReader.m33725E(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzi(str, j, z, d, str2, bArr, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
