package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new u78();

    /* renamed from: a */
    public int f22666a;

    /* renamed from: d */
    public int f22667d;

    /* renamed from: e */
    public int f22668e;

    /* renamed from: g */
    public long f22669g;

    /* renamed from: k */
    public int f22670k;

    public zzaj() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22666a);
        rk5.m51137m(parcel, 3, this.f22667d);
        rk5.m51137m(parcel, 4, this.f22668e);
        rk5.m51139o(parcel, 5, this.f22669g);
        rk5.m51137m(parcel, 6, this.f22670k);
        rk5.m51126b(parcel, a);
    }

    public zzaj(int i, int i2, int i3, long j, int i4) {
        this.f22666a = i;
        this.f22667d = i2;
        this.f22668e = i3;
        this.f22669g = j;
        this.f22670k = i4;
    }
}
