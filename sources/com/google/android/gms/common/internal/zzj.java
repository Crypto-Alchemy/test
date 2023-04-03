package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new z39();

    /* renamed from: a */
    public Bundle f22329a;

    /* renamed from: d */
    public Feature[] f22330d;

    /* renamed from: e */
    public int f22331e;

    /* renamed from: g */
    public ConnectionTelemetryConfiguration f22332g;

    public zzj() {
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f22329a = bundle;
        this.f22330d = featureArr;
        this.f22331e = i;
        this.f22332g = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51129e(parcel, 1, this.f22329a, false);
        rk5.m51146v(parcel, 2, this.f22330d, i, false);
        rk5.m51137m(parcel, 3, this.f22331e);
        rk5.m51142r(parcel, 4, this.f22332g, i, false);
        rk5.m51126b(parcel, a);
    }
}
