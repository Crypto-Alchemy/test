package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new t69();

    /* renamed from: a */
    public final RootTelemetryConfiguration f22275a;

    /* renamed from: d */
    public final boolean f22276d;

    /* renamed from: e */
    public final boolean f22277e;

    /* renamed from: g */
    public final int[] f22278g;

    /* renamed from: k */
    public final int f22279k;

    /* renamed from: r */
    public final int[] f22280r;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f22275a = rootTelemetryConfiguration;
        this.f22276d = z;
        this.f22277e = z2;
        this.f22278g = iArr;
        this.f22279k = i;
        this.f22280r = iArr2;
    }

    /* renamed from: r1 */
    public int mo30641r1() {
        return this.f22279k;
    }

    /* renamed from: s1 */
    public int[] mo30642s1() {
        return this.f22278g;
    }

    /* renamed from: t1 */
    public int[] mo30643t1() {
        return this.f22280r;
    }

    /* renamed from: u1 */
    public boolean mo30644u1() {
        return this.f22276d;
    }

    /* renamed from: v1 */
    public boolean mo30645v1() {
        return this.f22277e;
    }

    /* renamed from: w1 */
    public final RootTelemetryConfiguration mo30646w1() {
        return this.f22275a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 1, this.f22275a, i, false);
        rk5.m51127c(parcel, 2, mo30644u1());
        rk5.m51127c(parcel, 3, mo30645v1());
        rk5.m51138n(parcel, 4, mo30642s1(), false);
        rk5.m51137m(parcel, 5, mo30641r1());
        rk5.m51138n(parcel, 6, mo30643t1(), false);
        rk5.m51126b(parcel, a);
    }
}
