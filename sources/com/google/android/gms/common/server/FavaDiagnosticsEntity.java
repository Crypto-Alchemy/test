package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new sx7();

    /* renamed from: a */
    public final int f22351a;

    /* renamed from: d */
    public final String f22352d;

    /* renamed from: e */
    public final int f22353e;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f22351a = i;
        this.f22352d = str;
        this.f22353e = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22351a);
        rk5.m51143s(parcel, 2, this.f22352d, false);
        rk5.m51137m(parcel, 3, this.f22353e);
        rk5.m51126b(parcel, a);
    }
}
