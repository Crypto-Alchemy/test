package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new eg8();

    /* renamed from: a */
    public final long f22621a;

    /* renamed from: d */
    public final long f22622d;

    /* renamed from: e */
    public final boolean f22623e;

    /* renamed from: g */
    public final String f22624g;

    /* renamed from: k */
    public final String f22625k;

    /* renamed from: r */
    public final String f22626r;

    /* renamed from: s */
    public final Bundle f22627s;

    /* renamed from: x */
    public final String f22628x;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f22621a = j;
        this.f22622d = j2;
        this.f22623e = z;
        this.f22624g = str;
        this.f22625k = str2;
        this.f22626r = str3;
        this.f22627s = bundle;
        this.f22628x = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51139o(parcel, 1, this.f22621a);
        rk5.m51139o(parcel, 2, this.f22622d);
        rk5.m51127c(parcel, 3, this.f22623e);
        rk5.m51143s(parcel, 4, this.f22624g, false);
        rk5.m51143s(parcel, 5, this.f22625k, false);
        rk5.m51143s(parcel, 6, this.f22626r, false);
        rk5.m51129e(parcel, 7, this.f22627s, false);
        rk5.m51143s(parcel, 8, this.f22628x, false);
        rk5.m51126b(parcel, a);
    }
}
