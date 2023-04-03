package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new v28();

    /* renamed from: a */
    public final int f22299a;

    /* renamed from: d */
    public final int f22300d;

    /* renamed from: e */
    public final int f22301e;

    /* renamed from: g */
    public final long f22302g;

    /* renamed from: k */
    public final long f22303k;

    /* renamed from: r */
    public final String f22304r;

    /* renamed from: s */
    public final String f22305s;

    /* renamed from: x */
    public final int f22306x;

    /* renamed from: y */
    public final int f22307y;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f22299a = i;
        this.f22300d = i2;
        this.f22301e = i3;
        this.f22302g = j;
        this.f22303k = j2;
        this.f22304r = str;
        this.f22305s = str2;
        this.f22306x = i4;
        this.f22307y = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22299a);
        rk5.m51137m(parcel, 2, this.f22300d);
        rk5.m51137m(parcel, 3, this.f22301e);
        rk5.m51139o(parcel, 4, this.f22302g);
        rk5.m51139o(parcel, 5, this.f22303k);
        rk5.m51143s(parcel, 6, this.f22304r, false);
        rk5.m51143s(parcel, 7, this.f22305s, false);
        rk5.m51137m(parcel, 8, this.f22306x);
        rk5.m51137m(parcel, 9, this.f22307y);
        rk5.m51126b(parcel, a);
    }
}
