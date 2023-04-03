package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.c */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4157c implements Parcelable.Creator<Barcode.CalendarDateTime> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    i = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 3:
                    i2 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 4:
                    i3 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 5:
                    i4 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 6:
                    i5 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 7:
                    i6 = SafeParcelReader.m33725E(parcel, C);
                    break;
                case 8:
                    z = SafeParcelReader.m33755w(parcel, C);
                    break;
                case 9:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Barcode.CalendarDateTime(i, i2, i3, i4, i5, i6, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }
}
