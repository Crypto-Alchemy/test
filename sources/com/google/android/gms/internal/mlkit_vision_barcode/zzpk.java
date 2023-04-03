package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpk> CREATOR = new kg9();

    /* renamed from: a */
    public final int f22788a;

    /* renamed from: d */
    public final String f22789d;

    /* renamed from: e */
    public final String f22790e;

    /* renamed from: g */
    public final String f22791g;

    public zzpk(int i, String str, String str2, String str3) {
        this.f22788a = i;
        this.f22789d = str;
        this.f22790e = str2;
        this.f22791g = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22788a);
        rk5.m51143s(parcel, 2, this.f22789d, false);
        rk5.m51143s(parcel, 3, this.f22790e, false);
        rk5.m51143s(parcel, 4, this.f22791g, false);
        rk5.m51126b(parcel, a);
    }
}
