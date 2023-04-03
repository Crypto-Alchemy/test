package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.l */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4166l implements Parcelable.Creator<Barcode.WiFi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v == 3) {
                str2 = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 4) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                i = SafeParcelReader.m33725E(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Barcode.WiFi(str, str2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.WiFi[i];
    }
}
