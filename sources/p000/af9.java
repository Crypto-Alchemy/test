package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.zzo;

/* renamed from: af9 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class af9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 2) {
                z = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 3) {
                z2 = SafeParcelReader.m33755w(parcel, C);
            } else if (v == 4) {
                iBinder = SafeParcelReader.m33724D(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                z3 = SafeParcelReader.m33755w(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zzo(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
