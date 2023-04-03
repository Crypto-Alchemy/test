package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new eh9();

    /* renamed from: a */
    public final String f22803a;

    /* renamed from: d */
    public final String f22804d;

    public zzpo(String str, String str2) {
        this.f22803a = str;
        this.f22804d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22803a, false);
        rk5.m51143s(parcel, 2, this.f22804d, false);
        rk5.m51126b(parcel, a);
    }
}
