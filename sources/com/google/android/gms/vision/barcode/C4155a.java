package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.a */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4155a implements Parcelable.Creator<Barcode.Address> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                strArr = SafeParcelReader.m33749q(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Barcode.Address(i, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.Address[i];
    }
}
