package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new jk9();

    /* renamed from: a */
    public String f22731a;

    /* renamed from: d */
    public String f22732d;

    /* renamed from: e */
    public String f22733e;

    /* renamed from: g */
    public String f22734g;

    /* renamed from: k */
    public String f22735k;

    /* renamed from: r */
    public String f22736r;

    /* renamed from: s */
    public String f22737s;

    public zzl() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22731a, false);
        rk5.m51143s(parcel, 3, this.f22732d, false);
        rk5.m51143s(parcel, 4, this.f22733e, false);
        rk5.m51143s(parcel, 5, this.f22734g, false);
        rk5.m51143s(parcel, 6, this.f22735k, false);
        rk5.m51143s(parcel, 7, this.f22736r, false);
        rk5.m51143s(parcel, 8, this.f22737s, false);
        rk5.m51126b(parcel, a);
    }

    public zzl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22731a = str;
        this.f22732d = str2;
        this.f22733e = str3;
        this.f22734g = str4;
        this.f22735k = str5;
        this.f22736r = str6;
        this.f22737s = str7;
    }
}
