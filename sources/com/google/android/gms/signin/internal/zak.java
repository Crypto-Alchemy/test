package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new p28();

    /* renamed from: a */
    public final int f23141a;

    /* renamed from: d */
    public final ConnectionResult f23142d;

    /* renamed from: e */
    public final zav f23143e;

    public zak(int i, ConnectionResult connectionResult, zav zav) {
        this.f23141a = i;
        this.f23142d = connectionResult;
        this.f23143e = zav;
    }

    /* renamed from: r1 */
    public final ConnectionResult mo31440r1() {
        return this.f23142d;
    }

    /* renamed from: s1 */
    public final zav mo31441s1() {
        return this.f23143e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f23141a);
        rk5.m51142r(parcel, 2, this.f23142d, i, false);
        rk5.m51142r(parcel, 3, this.f23143e, i, false);
        rk5.m51126b(parcel, a);
    }
}
