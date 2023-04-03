package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpq> CREATOR = new ih9();

    /* renamed from: a */
    public final String f22807a;

    /* renamed from: d */
    public final String f22808d;

    /* renamed from: e */
    public final int f22809e;

    public zzpq(String str, String str2, int i) {
        this.f22807a = str;
        this.f22808d = str2;
        this.f22809e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22807a, false);
        rk5.m51143s(parcel, 2, this.f22808d, false);
        rk5.m51137m(parcel, 3, this.f22809e);
        rk5.m51126b(parcel, a);
    }
}
