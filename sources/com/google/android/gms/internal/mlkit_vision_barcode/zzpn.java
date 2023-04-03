package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpn> CREATOR = new ch9();

    /* renamed from: a */
    public final int f22801a;

    /* renamed from: d */
    public final String f22802d;

    public zzpn(int i, String str) {
        this.f22801a = i;
        this.f22802d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22801a);
        rk5.m51143s(parcel, 2, this.f22802d, false);
        rk5.m51126b(parcel, a);
    }
}
