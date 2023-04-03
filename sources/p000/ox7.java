package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ox7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ox7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m33747o(parcel, C, ParcelFileDescriptor.CREATOR);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i2 = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
