package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new ji9();

    /* renamed from: a */
    public int f22689a;

    /* renamed from: d */
    public int f22690d;

    /* renamed from: e */
    public int f22691e;

    /* renamed from: g */
    public int f22692g;

    /* renamed from: k */
    public int f22693k;

    /* renamed from: r */
    public int f22694r;

    /* renamed from: s */
    public boolean f22695s;

    /* renamed from: x */
    public String f22696x;

    public zzf() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22689a);
        rk5.m51137m(parcel, 3, this.f22690d);
        rk5.m51137m(parcel, 4, this.f22691e);
        rk5.m51137m(parcel, 5, this.f22692g);
        rk5.m51137m(parcel, 6, this.f22693k);
        rk5.m51137m(parcel, 7, this.f22694r);
        rk5.m51127c(parcel, 8, this.f22695s);
        rk5.m51143s(parcel, 9, this.f22696x, false);
        rk5.m51126b(parcel, a);
    }

    public zzf(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f22689a = i;
        this.f22690d = i2;
        this.f22691e = i3;
        this.f22692g = i4;
        this.f22693k = i5;
        this.f22694r = i6;
        this.f22695s = z;
        this.f22696x = str;
    }
}
