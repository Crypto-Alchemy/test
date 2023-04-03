package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpj> CREATOR = new ig9();

    /* renamed from: A */
    public final String f22774A;

    /* renamed from: B */
    public final String f22775B;

    /* renamed from: C */
    public final String f22776C;

    /* renamed from: H */
    public final String f22777H;

    /* renamed from: I */
    public final String f22778I;

    /* renamed from: a */
    public final String f22779a;

    /* renamed from: d */
    public final String f22780d;

    /* renamed from: e */
    public final String f22781e;

    /* renamed from: g */
    public final String f22782g;

    /* renamed from: k */
    public final String f22783k;

    /* renamed from: r */
    public final String f22784r;

    /* renamed from: s */
    public final String f22785s;

    /* renamed from: x */
    public final String f22786x;

    /* renamed from: y */
    public final String f22787y;

    public zzpj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f22779a = str;
        this.f22780d = str2;
        this.f22781e = str3;
        this.f22782g = str4;
        this.f22783k = str5;
        this.f22784r = str6;
        this.f22785s = str7;
        this.f22786x = str8;
        this.f22787y = str9;
        this.f22774A = str10;
        this.f22775B = str11;
        this.f22776C = str12;
        this.f22777H = str13;
        this.f22778I = str14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22779a, false);
        rk5.m51143s(parcel, 2, this.f22780d, false);
        rk5.m51143s(parcel, 3, this.f22781e, false);
        rk5.m51143s(parcel, 4, this.f22782g, false);
        rk5.m51143s(parcel, 5, this.f22783k, false);
        rk5.m51143s(parcel, 6, this.f22784r, false);
        rk5.m51143s(parcel, 7, this.f22785s, false);
        rk5.m51143s(parcel, 8, this.f22786x, false);
        rk5.m51143s(parcel, 9, this.f22787y, false);
        rk5.m51143s(parcel, 10, this.f22774A, false);
        rk5.m51143s(parcel, 11, this.f22775B, false);
        rk5.m51143s(parcel, 12, this.f22776C, false);
        rk5.m51143s(parcel, 13, this.f22777H, false);
        rk5.m51143s(parcel, 14, this.f22778I, false);
        rk5.m51126b(parcel, a);
    }
}
