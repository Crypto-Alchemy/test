package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfz> CREATOR = new vr8();

    /* renamed from: a */
    public final int f22942a;

    /* renamed from: d */
    public final int f22943d;

    /* renamed from: e */
    public final int f22944e;

    /* renamed from: g */
    public final int f22945g;

    /* renamed from: k */
    public final long f22946k;

    public zzfz(int i, int i2, int i3, int i4, long j) {
        this.f22942a = i;
        this.f22943d = i2;
        this.f22944e = i3;
        this.f22945g = i4;
        this.f22946k = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22942a);
        rk5.m51137m(parcel, 2, this.f22943d);
        rk5.m51137m(parcel, 3, this.f22944e);
        rk5.m51137m(parcel, 4, this.f22945g);
        rk5.m51139o(parcel, 5, this.f22946k);
        rk5.m51126b(parcel, a);
    }
}
