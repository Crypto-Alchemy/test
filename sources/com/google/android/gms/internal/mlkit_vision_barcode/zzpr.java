package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpr> CREATOR = new xf9();

    /* renamed from: A */
    public final zzpq f22810A;

    /* renamed from: B */
    public final zzpp f22811B;

    /* renamed from: C */
    public final zzpl f22812C;

    /* renamed from: H */
    public final zzph f22813H;

    /* renamed from: I */
    public final zzpi f22814I;

    /* renamed from: L */
    public final zzpj f22815L;

    /* renamed from: a */
    public final int f22816a;

    /* renamed from: d */
    public final String f22817d;

    /* renamed from: e */
    public final String f22818e;

    /* renamed from: g */
    public final byte[] f22819g;

    /* renamed from: k */
    public final Point[] f22820k;

    /* renamed from: r */
    public final int f22821r;

    /* renamed from: s */
    public final zzpk f22822s;

    /* renamed from: x */
    public final zzpn f22823x;

    /* renamed from: y */
    public final zzpo f22824y;

    public zzpr(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, zzpk zzpk, zzpn zzpn, zzpo zzpo, zzpq zzpq, zzpp zzpp, zzpl zzpl, zzph zzph, zzpi zzpi, zzpj zzpj) {
        this.f22816a = i;
        this.f22817d = str;
        this.f22818e = str2;
        this.f22819g = bArr;
        this.f22820k = pointArr;
        this.f22821r = i2;
        this.f22822s = zzpk;
        this.f22823x = zzpn;
        this.f22824y = zzpo;
        this.f22810A = zzpq;
        this.f22811B = zzpp;
        this.f22812C = zzpl;
        this.f22813H = zzph;
        this.f22814I = zzpi;
        this.f22815L = zzpj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22816a);
        rk5.m51143s(parcel, 2, this.f22817d, false);
        rk5.m51143s(parcel, 3, this.f22818e, false);
        rk5.m51130f(parcel, 4, this.f22819g, false);
        rk5.m51146v(parcel, 5, this.f22820k, i, false);
        rk5.m51137m(parcel, 6, this.f22821r);
        rk5.m51142r(parcel, 7, this.f22822s, i, false);
        rk5.m51142r(parcel, 8, this.f22823x, i, false);
        rk5.m51142r(parcel, 9, this.f22824y, i, false);
        rk5.m51142r(parcel, 10, this.f22810A, i, false);
        rk5.m51142r(parcel, 11, this.f22811B, i, false);
        rk5.m51142r(parcel, 12, this.f22812C, i, false);
        rk5.m51142r(parcel, 13, this.f22813H, i, false);
        rk5.m51142r(parcel, 14, this.f22814I, i, false);
        rk5.m51142r(parcel, 15, this.f22815L, i, false);
        rk5.m51126b(parcel, a);
    }
}
