package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpg> CREATOR = new cg9();

    /* renamed from: a */
    public final int f22752a;

    /* renamed from: d */
    public final int f22753d;

    /* renamed from: e */
    public final int f22754e;

    /* renamed from: g */
    public final int f22755g;

    /* renamed from: k */
    public final int f22756k;

    /* renamed from: r */
    public final int f22757r;

    /* renamed from: s */
    public final boolean f22758s;

    /* renamed from: x */
    public final String f22759x;

    public zzpg(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f22752a = i;
        this.f22753d = i2;
        this.f22754e = i3;
        this.f22755g = i4;
        this.f22756k = i5;
        this.f22757r = i6;
        this.f22758s = z;
        this.f22759x = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22752a);
        rk5.m51137m(parcel, 2, this.f22753d);
        rk5.m51137m(parcel, 3, this.f22754e);
        rk5.m51137m(parcel, 4, this.f22755g);
        rk5.m51137m(parcel, 5, this.f22756k);
        rk5.m51137m(parcel, 6, this.f22757r);
        rk5.m51127c(parcel, 7, this.f22758s);
        rk5.m51143s(parcel, 8, this.f22759x, false);
        rk5.m51126b(parcel, a);
    }
}
