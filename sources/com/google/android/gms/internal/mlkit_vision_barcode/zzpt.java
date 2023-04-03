package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpt> CREATOR = new ag9();

    /* renamed from: a */
    public final int f22825a;

    public zzpt(int i) {
        this.f22825a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22825a);
        rk5.m51126b(parcel, a);
    }
}
