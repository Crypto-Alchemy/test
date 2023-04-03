package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new x78();

    /* renamed from: a */
    public final int f22328a;

    public zzaj(int i) {
        this.f22328a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22328a);
        rk5.m51126b(parcel, a);
    }
}
