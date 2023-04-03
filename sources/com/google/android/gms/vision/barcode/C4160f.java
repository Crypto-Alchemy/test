package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.f */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4160f implements Parcelable.Creator<Barcode.Email> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 3) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 4) {
                str3 = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 5) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                str2 = SafeParcelReader.m33748p(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Barcode.Email(i, str, str3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.Email[i];
    }
}
