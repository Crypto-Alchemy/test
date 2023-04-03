package p000;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: y18 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class y18 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                strArr = SafeParcelReader.m33749q(parcel, C);
            } else if (v == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m33751s(parcel, C, CursorWindow.CREATOR);
            } else if (v == 3) {
                i2 = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 4) {
                bundle = SafeParcelReader.m33738f(parcel, C);
            } else if (v != 1000) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo30624t1();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
