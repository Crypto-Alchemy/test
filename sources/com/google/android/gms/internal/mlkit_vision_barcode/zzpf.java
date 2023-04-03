package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpf> CREATOR = new if9();

    /* renamed from: a */
    public final int f22750a;

    /* renamed from: d */
    public final String[] f22751d;

    public zzpf(int i, String[] strArr) {
        this.f22750a = i;
        this.f22751d = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22750a);
        rk5.m51144t(parcel, 2, this.f22751d, false);
        rk5.m51126b(parcel, a);
    }
}
