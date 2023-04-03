package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.b */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class C4039b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m33730J(parcel);
        String str = null;
        int i = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            int v = SafeParcelReader.m33754v(C);
            if (v == 1) {
                i = SafeParcelReader.m33725E(parcel, C);
            } else if (v == 2) {
                str = SafeParcelReader.m33748p(parcel, C);
            } else if (v != 3) {
                SafeParcelReader.m33729I(parcel, C);
            } else {
                field = (FastJsonResponse.Field) SafeParcelReader.m33747o(parcel, C, FastJsonResponse.Field.CREATOR);
            }
        }
        SafeParcelReader.m33753u(parcel, J);
        return new zam(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
