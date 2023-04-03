package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new d19();

    /* renamed from: a */
    public int f23044a;

    /* renamed from: d */
    public boolean f23045d;

    public zzk() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f23044a);
        rk5.m51127c(parcel, 3, this.f23045d);
        rk5.m51126b(parcel, a);
    }

    public zzk(int i, boolean z) {
        this.f23044a = i;
        this.f23045d = z;
    }
}
