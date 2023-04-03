package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaa extends AbstractSafeParcelable implements eg5 {
    public static final Parcelable.Creator<zaa> CREATOR = new ez7();

    /* renamed from: a */
    public final int f23134a;

    /* renamed from: d */
    public int f23135d;

    /* renamed from: e */
    public Intent f23136e;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    /* renamed from: e */
    public final Status mo30519e() {
        if (this.f23135d == 0) {
            return Status.f22191s;
        }
        return Status.f22187B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f23134a);
        rk5.m51137m(parcel, 2, this.f23135d);
        rk5.m51142r(parcel, 3, this.f23136e, i, false);
        rk5.m51126b(parcel, a);
    }

    public zaa(int i, int i2, Intent intent) {
        this.f23134a = i;
        this.f23135d = i2;
        this.f23136e = intent;
    }
}
