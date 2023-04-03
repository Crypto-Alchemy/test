package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzkq;

/* renamed from: x59 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class x59 implements Parcelable.Creator<zzkq> {
    /* renamed from: a */
    public static void m54232a(zzkq zzkq, Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, zzkq.f23078a);
        rk5.m51143s(parcel, 2, zzkq.f23079d, false);
        rk5.m51139o(parcel, 3, zzkq.f23080e);
        rk5.m51140p(parcel, 4, zzkq.f23081g, false);
        rk5.m51135k(parcel, 5, (Float) null, false);
        rk5.m51143s(parcel, 6, zzkq.f23082k, false);
        rk5.m51143s(parcel, 7, zzkq.f23083r, false);
        rk5.m51133i(parcel, 8, zzkq.f23084s, false);
        rk5.m51126b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 1:
                    i = SafeParcelReader.m33725E(parcel2, C);
                    break;
                case 2:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 3:
                    j = SafeParcelReader.m33726F(parcel2, C);
                    break;
                case 4:
                    l = SafeParcelReader.m33727G(parcel2, C);
                    break;
                case 5:
                    f = SafeParcelReader.m33722B(parcel2, C);
                    break;
                case 6:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 7:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 8:
                    d = SafeParcelReader.m33758z(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new zzkq(i, str, j, l, f, str2, str3, d);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzkq[i];
    }
}
