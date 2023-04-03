package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new sj9();

    /* renamed from: a */
    public int f22725a;

    /* renamed from: d */
    public String f22726d;

    /* renamed from: e */
    public String f22727e;

    /* renamed from: g */
    public String f22728g;

    public zzj() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22725a);
        rk5.m51143s(parcel, 3, this.f22726d, false);
        rk5.m51143s(parcel, 4, this.f22727e, false);
        rk5.m51143s(parcel, 5, this.f22728g, false);
        rk5.m51126b(parcel, a);
    }

    public zzj(int i, String str, String str2, String str3) {
        this.f22725a = i;
        this.f22726d = str;
        this.f22727e = str2;
        this.f22728g = str3;
    }
}
