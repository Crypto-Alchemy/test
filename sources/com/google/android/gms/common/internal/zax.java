package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new x38();

    /* renamed from: a */
    public final int f22324a;

    /* renamed from: d */
    public final int f22325d;

    /* renamed from: e */
    public final int f22326e;
    @Deprecated

    /* renamed from: g */
    public final Scope[] f22327g;

    public zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.f22324a = i;
        this.f22325d = i2;
        this.f22326e = i3;
        this.f22327g = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22324a);
        rk5.m51137m(parcel, 2, this.f22325d);
        rk5.m51137m(parcel, 3, this.f22326e);
        rk5.m51146v(parcel, 4, this.f22327g, i, false);
        rk5.m51126b(parcel, a);
    }
}
