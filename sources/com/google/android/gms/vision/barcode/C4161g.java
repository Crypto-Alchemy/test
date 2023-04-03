package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.g */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4161g implements Parcelable.Creator<Barcode.DriverLicense> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            switch (SafeParcelReader.m33754v(C)) {
                case 2:
                    str = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 4:
                    str3 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 5:
                    str4 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 6:
                    str5 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 7:
                    str6 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 8:
                    str7 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 9:
                    str8 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 10:
                    str9 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 11:
                    str10 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 12:
                    str11 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 13:
                    str12 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 14:
                    str13 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                case 15:
                    str14 = SafeParcelReader.m33748p(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m33729I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m33753u(parcel2, J);
        return new Barcode.DriverLicense(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.DriverLicense[i];
    }
}
