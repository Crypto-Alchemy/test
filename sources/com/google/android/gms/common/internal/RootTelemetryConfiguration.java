package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new n78();

    /* renamed from: a */
    public final int f22308a;

    /* renamed from: d */
    public final boolean f22309d;

    /* renamed from: e */
    public final boolean f22310e;

    /* renamed from: g */
    public final int f22311g;

    /* renamed from: k */
    public final int f22312k;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f22308a = i;
        this.f22309d = z;
        this.f22310e = z2;
        this.f22311g = i2;
        this.f22312k = i3;
    }

    /* renamed from: r1 */
    public int mo30651r1() {
        return this.f22311g;
    }

    /* renamed from: s1 */
    public int mo30652s1() {
        return this.f22312k;
    }

    /* renamed from: t1 */
    public boolean mo30653t1() {
        return this.f22309d;
    }

    /* renamed from: u1 */
    public boolean mo30654u1() {
        return this.f22310e;
    }

    /* renamed from: v1 */
    public int mo30655v1() {
        return this.f22308a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, mo30655v1());
        rk5.m51127c(parcel, 2, mo30653t1());
        rk5.m51127c(parcel, 3, mo30654u1());
        rk5.m51137m(parcel, 4, mo30651r1());
        rk5.m51137m(parcel, 5, mo30652s1());
        rk5.m51126b(parcel, a);
    }
}
