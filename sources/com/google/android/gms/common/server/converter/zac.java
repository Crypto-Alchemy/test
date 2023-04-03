package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new p18();

    /* renamed from: a */
    public final int f22359a;

    /* renamed from: d */
    public final String f22360d;

    /* renamed from: e */
    public final int f22361e;

    public zac(int i, String str, int i2) {
        this.f22359a = i;
        this.f22360d = str;
        this.f22361e = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22359a);
        rk5.m51143s(parcel, 2, this.f22360d, false);
        rk5.m51137m(parcel, 3, this.f22361e);
        rk5.m51126b(parcel, a);
    }

    public zac(String str, int i) {
        this.f22359a = 1;
        this.f22360d = str;
        this.f22361e = i;
    }
}
