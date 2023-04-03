package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4033b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new u38();

    /* renamed from: a */
    public final int f22319a;

    /* renamed from: d */
    public final IBinder f22320d;

    /* renamed from: e */
    public final ConnectionResult f22321e;

    /* renamed from: g */
    public final boolean f22322g;

    /* renamed from: k */
    public final boolean f22323k;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f22319a = i;
        this.f22320d = iBinder;
        this.f22321e = connectionResult;
        this.f22322g = z;
        this.f22323k = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        if (!this.f22321e.equals(zav.f22321e) || !if4.m45709a(mo30667s1(), zav.mo30667s1())) {
            return false;
        }
        return true;
    }

    /* renamed from: r1 */
    public final ConnectionResult mo30666r1() {
        return this.f22321e;
    }

    /* renamed from: s1 */
    public final C4033b mo30667s1() {
        IBinder iBinder = this.f22320d;
        if (iBinder == null) {
            return null;
        }
        return C4033b.C4034a.m33720q1(iBinder);
    }

    /* renamed from: t1 */
    public final boolean mo30668t1() {
        return this.f22322g;
    }

    /* renamed from: u1 */
    public final boolean mo30669u1() {
        return this.f22323k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22319a);
        rk5.m51136l(parcel, 2, this.f22320d, false);
        rk5.m51142r(parcel, 3, this.f22321e, i, false);
        rk5.m51127c(parcel, 4, this.f22322g);
        rk5.m51127c(parcel, 5, this.f22323k);
        rk5.m51126b(parcel, a);
    }
}
