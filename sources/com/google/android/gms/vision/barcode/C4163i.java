package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* renamed from: com.google.android.gms.vision.barcode.i */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class C4163i implements Parcelable.Creator<Barcode.GeoPoint> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        double d = Utils.DOUBLE_EPSILON;
        double d2 = 0.0d;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 2) {
                d = SafeParcelReader.m33757y(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                d2 = SafeParcelReader.m33757y(parcel, C);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new Barcode.GeoPoint(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.GeoPoint[i];
    }
}
