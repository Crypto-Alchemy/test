package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new qk9();

    /* renamed from: a */
    public int f22740a;

    /* renamed from: d */
    public String f22741d;

    public zzm() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22740a);
        rk5.m51143s(parcel, 3, this.f22741d, false);
        rk5.m51126b(parcel, a);
    }

    public zzm(int i, String str) {
        this.f22740a = i;
        this.f22741d = str;
    }
}
