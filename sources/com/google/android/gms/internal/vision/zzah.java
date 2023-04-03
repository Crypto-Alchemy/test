package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new a78();

    /* renamed from: A */
    public final int f22895A;

    /* renamed from: B */
    public final int f22896B;

    /* renamed from: a */
    public final zzao[] f22897a;

    /* renamed from: d */
    public final zzab f22898d;

    /* renamed from: e */
    public final zzab f22899e;

    /* renamed from: g */
    public final zzab f22900g;

    /* renamed from: k */
    public final String f22901k;

    /* renamed from: r */
    public final float f22902r;

    /* renamed from: s */
    public final String f22903s;

    /* renamed from: x */
    public final int f22904x;

    /* renamed from: y */
    public final boolean f22905y;

    public zzah(zzao[] zzaoArr, zzab zzab, zzab zzab2, zzab zzab3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.f22897a = zzaoArr;
        this.f22898d = zzab;
        this.f22899e = zzab2;
        this.f22900g = zzab3;
        this.f22901k = str;
        this.f22902r = f;
        this.f22903s = str2;
        this.f22904x = i;
        this.f22905y = z;
        this.f22895A = i2;
        this.f22896B = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51146v(parcel, 2, this.f22897a, i, false);
        rk5.m51142r(parcel, 3, this.f22898d, i, false);
        rk5.m51142r(parcel, 4, this.f22899e, i, false);
        rk5.m51142r(parcel, 5, this.f22900g, i, false);
        rk5.m51143s(parcel, 6, this.f22901k, false);
        rk5.m51134j(parcel, 7, this.f22902r);
        rk5.m51143s(parcel, 8, this.f22903s, false);
        rk5.m51137m(parcel, 9, this.f22904x);
        rk5.m51127c(parcel, 10, this.f22905y);
        rk5.m51137m(parcel, 11, this.f22895A);
        rk5.m51137m(parcel, 12, this.f22896B);
        rk5.m51126b(parcel, a);
    }
}
