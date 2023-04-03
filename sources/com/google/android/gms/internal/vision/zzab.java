package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new j58();

    /* renamed from: a */
    public final int f22890a;

    /* renamed from: d */
    public final int f22891d;

    /* renamed from: e */
    public final int f22892e;

    /* renamed from: g */
    public final int f22893g;

    /* renamed from: k */
    public final float f22894k;

    public zzab(int i, int i2, int i3, int i4, float f) {
        this.f22890a = i;
        this.f22891d = i2;
        this.f22892e = i3;
        this.f22893g = i4;
        this.f22894k = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22890a);
        rk5.m51137m(parcel, 3, this.f22891d);
        rk5.m51137m(parcel, 4, this.f22892e);
        rk5.m51137m(parcel, 5, this.f22893g);
        rk5.m51134j(parcel, 6, this.f22894k);
        rk5.m51126b(parcel, a);
    }
}
