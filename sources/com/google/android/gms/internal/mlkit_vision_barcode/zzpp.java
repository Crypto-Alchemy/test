package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpp> CREATOR = new gh9();

    /* renamed from: a */
    public final String f22805a;

    /* renamed from: d */
    public final String f22806d;

    public zzpp(String str, String str2) {
        this.f22805a = str;
        this.f22806d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22805a, false);
        rk5.m51143s(parcel, 2, this.f22806d, false);
        rk5.m51126b(parcel, a);
    }
}
