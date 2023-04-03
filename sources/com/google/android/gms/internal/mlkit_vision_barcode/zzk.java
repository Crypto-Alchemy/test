package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new bk9();

    /* renamed from: a */
    public double f22729a;

    /* renamed from: d */
    public double f22730d;

    public zzk() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51132h(parcel, 2, this.f22729a);
        rk5.m51132h(parcel, 3, this.f22730d);
        rk5.m51126b(parcel, a);
    }

    public zzk(double d, double d2) {
        this.f22729a = d;
        this.f22730d = d2;
    }
}
