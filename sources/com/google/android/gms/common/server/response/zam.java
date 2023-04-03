package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C4039b();

    /* renamed from: a */
    public final int f22383a;

    /* renamed from: d */
    public final String f22384d;

    /* renamed from: e */
    public final FastJsonResponse.Field f22385e;

    public zam(int i, String str, FastJsonResponse.Field field) {
        this.f22383a = i;
        this.f22384d = str;
        this.f22385e = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22383a);
        rk5.m51143s(parcel, 2, this.f22384d, false);
        rk5.m51142r(parcel, 3, this.f22385e, i, false);
        rk5.m51126b(parcel, a);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f22383a = 1;
        this.f22384d = str;
        this.f22385e = field;
    }
}
