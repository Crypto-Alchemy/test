package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new bz7();

    /* renamed from: a */
    public final int f22357a;

    /* renamed from: d */
    public final StringToIntConverter f22358d;

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f22357a = i;
        this.f22358d = stringToIntConverter;
    }

    /* renamed from: r1 */
    public static zaa m33775r1(FastJsonResponse.C4037a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: s1 */
    public final FastJsonResponse.C4037a mo30693s1() {
        StringToIntConverter stringToIntConverter = this.f22358d;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22357a);
        rk5.m51142r(parcel, 2, this.f22358d, i, false);
        rk5.m51126b(parcel, a);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f22357a = 1;
        this.f22358d = stringToIntConverter;
    }
}
