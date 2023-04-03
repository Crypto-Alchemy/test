package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;

/* renamed from: q58 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class q58 implements Parcelable.Creator<zzaa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzkq zzkq = null;
        String str3 = null;
        zzas zzas = null;
        zzas zzas2 = null;
        zzas zzas3 = null;
        boolean z = false;
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
                    zzkq = (zzkq) SafeParcelReader.m33747o(parcel2, C, zzkq.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 6:
                    z = SafeParcelReader.m33755w(parcel2, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 8:
                    zzas = (zzas) SafeParcelReader.m33747o(parcel2, C, zzas.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 10:
                    zzas2 = (zzas) SafeParcelReader.m33747o(parcel2, C, zzas.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 12:
                    zzas3 = (zzas) SafeParcelReader.m33747o(parcel2, C, zzas.CREATOR);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzaa(str, str2, zzkq, j, z, str3, zzas, j2, zzas2, j3, zzas3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzaa[i];
    }
}
