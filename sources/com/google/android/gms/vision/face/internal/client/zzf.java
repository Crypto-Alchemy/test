package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new cl8();

    /* renamed from: a */
    public int f23241a;

    /* renamed from: d */
    public int f23242d;

    /* renamed from: e */
    public int f23243e;

    /* renamed from: g */
    public boolean f23244g;

    /* renamed from: k */
    public boolean f23245k;

    /* renamed from: r */
    public float f23246r;

    public zzf() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f23241a);
        rk5.m51137m(parcel, 3, this.f23242d);
        rk5.m51137m(parcel, 4, this.f23243e);
        rk5.m51127c(parcel, 5, this.f23244g);
        rk5.m51127c(parcel, 6, this.f23245k);
        rk5.m51134j(parcel, 7, this.f23246r);
        rk5.m51126b(parcel, a);
    }

    public zzf(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.f23241a = i;
        this.f23242d = i2;
        this.f23243e = i3;
        this.f23244g = z;
        this.f23245k = z2;
        this.f23246r = f;
    }
}
