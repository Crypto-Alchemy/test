package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new ug9();

    /* renamed from: a */
    public final double f22792a;

    /* renamed from: d */
    public final double f22793d;

    public zzpl(double d, double d2) {
        this.f22792a = d;
        this.f22793d = d2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51132h(parcel, 1, this.f22792a);
        rk5.m51132h(parcel, 2, this.f22793d);
        rk5.m51126b(parcel, a);
    }
}
