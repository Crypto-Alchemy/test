package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzph extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzph> CREATOR = new eg9();

    /* renamed from: a */
    public final String f22760a;

    /* renamed from: d */
    public final String f22761d;

    /* renamed from: e */
    public final String f22762e;

    /* renamed from: g */
    public final String f22763g;

    /* renamed from: k */
    public final String f22764k;

    /* renamed from: r */
    public final zzpg f22765r;

    /* renamed from: s */
    public final zzpg f22766s;

    public zzph(String str, String str2, String str3, String str4, String str5, zzpg zzpg, zzpg zzpg2) {
        this.f22760a = str;
        this.f22761d = str2;
        this.f22762e = str3;
        this.f22763g = str4;
        this.f22764k = str5;
        this.f22765r = zzpg;
        this.f22766s = zzpg2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22760a, false);
        rk5.m51143s(parcel, 2, this.f22761d, false);
        rk5.m51143s(parcel, 3, this.f22762e, false);
        rk5.m51143s(parcel, 4, this.f22763g, false);
        rk5.m51143s(parcel, 5, this.f22764k, false);
        rk5.m51142r(parcel, 6, this.f22765r, i, false);
        rk5.m51142r(parcel, 7, this.f22766s, i, false);
        rk5.m51126b(parcel, a);
    }
}
