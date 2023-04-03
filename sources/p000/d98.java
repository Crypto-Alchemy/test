package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;

/* renamed from: d98 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class d98 implements Parcelable.Creator<zzas> {
    /* renamed from: a */
    public static void m43414a(zzas zzas, Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, zzas.f23074a, false);
        rk5.m51142r(parcel, 3, zzas.f23075d, i, false);
        rk5.m51143s(parcel, 4, zzas.f23076e, false);
        rk5.m51139o(parcel, 5, zzas.f23077g);
        rk5.m51126b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        zzaq zzaq = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 3) {
                zzaq = (zzaq) SafeParcelReader.m33747o(parcel, C, zzaq.CREATOR);
            } else if (v == 4) {
                str2 = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                j = SafeParcelReader.m33726F(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzas(str, zzaq, str2, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzas[i];
    }
}
