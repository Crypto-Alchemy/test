package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new kj9();

    /* renamed from: A */
    public String f22711A;

    /* renamed from: B */
    public String f22712B;

    /* renamed from: C */
    public String f22713C;

    /* renamed from: H */
    public String f22714H;

    /* renamed from: I */
    public String f22715I;

    /* renamed from: a */
    public String f22716a;

    /* renamed from: d */
    public String f22717d;

    /* renamed from: e */
    public String f22718e;

    /* renamed from: g */
    public String f22719g;

    /* renamed from: k */
    public String f22720k;

    /* renamed from: r */
    public String f22721r;

    /* renamed from: s */
    public String f22722s;

    /* renamed from: x */
    public String f22723x;

    /* renamed from: y */
    public String f22724y;

    public zzi() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22716a, false);
        rk5.m51143s(parcel, 3, this.f22717d, false);
        rk5.m51143s(parcel, 4, this.f22718e, false);
        rk5.m51143s(parcel, 5, this.f22719g, false);
        rk5.m51143s(parcel, 6, this.f22720k, false);
        rk5.m51143s(parcel, 7, this.f22721r, false);
        rk5.m51143s(parcel, 8, this.f22722s, false);
        rk5.m51143s(parcel, 9, this.f22723x, false);
        rk5.m51143s(parcel, 10, this.f22724y, false);
        rk5.m51143s(parcel, 11, this.f22711A, false);
        rk5.m51143s(parcel, 12, this.f22712B, false);
        rk5.m51143s(parcel, 13, this.f22713C, false);
        rk5.m51143s(parcel, 14, this.f22714H, false);
        rk5.m51143s(parcel, 15, this.f22715I, false);
        rk5.m51126b(parcel, a);
    }

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f22716a = str;
        this.f22717d = str2;
        this.f22718e = str3;
        this.f22719g = str4;
        this.f22720k = str5;
        this.f22721r = str6;
        this.f22722s = str7;
        this.f22723x = str8;
        this.f22724y = str9;
        this.f22711A = str10;
        this.f22712B = str11;
        this.f22713C = str12;
        this.f22714H = str13;
        this.f22715I = str14;
    }
}
