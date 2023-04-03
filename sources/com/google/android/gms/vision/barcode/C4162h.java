package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.h */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4162h implements Parcelable.Creator<Barcode.PersonName> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    str = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 4:
                    str3 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 5:
                    str4 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 6:
                    str5 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 7:
                    str6 = SafeParcelReader.m33748p(parcel, C);
                    break;
                case 8:
                    str7 = SafeParcelReader.m33748p(parcel, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Barcode.PersonName(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.PersonName[i];
    }
}
