package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new k28();

    /* renamed from: a */
    public final int f23139a;

    /* renamed from: d */
    public final zat f23140d;

    public zai(int i, zat zat) {
        this.f23139a = i;
        this.f23140d = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f23139a);
        rk5.m51142r(parcel, 2, this.f23140d, i, false);
        rk5.m51126b(parcel, a);
    }
}
