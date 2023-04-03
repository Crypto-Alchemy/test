package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new i58();

    /* renamed from: a */
    public String f22742a;

    /* renamed from: d */
    public String f22743d;

    public zzn() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22742a, false);
        rk5.m51143s(parcel, 3, this.f22743d, false);
        rk5.m51126b(parcel, a);
    }

    public zzn(String str, String str2) {
        this.f22742a = str;
        this.f22743d = str2;
    }
}
