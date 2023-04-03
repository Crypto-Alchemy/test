package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new vx7();

    /* renamed from: a */
    public final int f22084a;

    /* renamed from: d */
    public int f22085d;

    /* renamed from: e */
    public Bundle f22086e;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f22084a = i;
        this.f22085d = i2;
        this.f22086e = bundle;
    }

    /* renamed from: r1 */
    public int mo30417r1() {
        return this.f22085d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22084a);
        rk5.m51137m(parcel, 2, mo30417r1());
        rk5.m51129e(parcel, 3, this.f22086e, false);
        rk5.m51126b(parcel, a);
    }
}
