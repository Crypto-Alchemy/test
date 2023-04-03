package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzqk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqk> CREATOR = new lh9();

    /* renamed from: a */
    public final int f22843a;

    /* renamed from: d */
    public final int f22844d;

    /* renamed from: e */
    public final int f22845e;

    /* renamed from: g */
    public final int f22846g;

    /* renamed from: k */
    public final long f22847k;

    public zzqk(int i, int i2, int i3, int i4, long j) {
        this.f22843a = i;
        this.f22844d = i2;
        this.f22845e = i3;
        this.f22846g = i4;
        this.f22847k = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22843a);
        rk5.m51137m(parcel, 2, this.f22844d);
        rk5.m51137m(parcel, 3, this.f22845e);
        rk5.m51137m(parcel, 4, this.f22846g);
        rk5.m51139o(parcel, 5, this.f22847k);
        rk5.m51126b(parcel, a);
    }
}
