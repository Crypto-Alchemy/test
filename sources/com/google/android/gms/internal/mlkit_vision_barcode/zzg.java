package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new ti9();

    /* renamed from: a */
    public String f22697a;

    /* renamed from: d */
    public String f22698d;

    /* renamed from: e */
    public String f22699e;

    /* renamed from: g */
    public String f22700g;

    /* renamed from: k */
    public String f22701k;

    /* renamed from: r */
    public zzf f22702r;

    /* renamed from: s */
    public zzf f22703s;

    public zzg() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22697a, false);
        rk5.m51143s(parcel, 3, this.f22698d, false);
        rk5.m51143s(parcel, 4, this.f22699e, false);
        rk5.m51143s(parcel, 5, this.f22700g, false);
        rk5.m51143s(parcel, 6, this.f22701k, false);
        rk5.m51142r(parcel, 7, this.f22702r, i, false);
        rk5.m51142r(parcel, 8, this.f22703s, i, false);
        rk5.m51126b(parcel, a);
    }

    public zzg(String str, String str2, String str3, String str4, String str5, zzf zzf, zzf zzf2) {
        this.f22697a = str;
        this.f22698d = str2;
        this.f22699e = str3;
        this.f22700g = str4;
        this.f22701k = str5;
        this.f22702r = zzf;
        this.f22703s = zzf2;
    }
}
