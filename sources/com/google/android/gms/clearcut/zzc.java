package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new ei8();

    /* renamed from: a */
    public final boolean f22121a;

    /* renamed from: d */
    public final long f22122d;

    /* renamed from: e */
    public final long f22123e;

    public zzc(boolean z, long j, long j2) {
        this.f22121a = z;
        this.f22122d = j;
        this.f22123e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzc = (zzc) obj;
            return this.f22121a == zzc.f22121a && this.f22122d == zzc.f22122d && this.f22123e == zzc.f22123e;
        }
    }

    public final int hashCode() {
        return if4.m45710b(Boolean.valueOf(this.f22121a), Long.valueOf(this.f22122d), Long.valueOf(this.f22123e));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f22121a + ",collectForDebugStartTimeMillis: " + this.f22122d + ",collectForDebugExpiryTimeMillis: " + this.f22123e + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51127c(parcel, 1, this.f22121a);
        rk5.m51139o(parcel, 2, this.f22123e);
        rk5.m51139o(parcel, 3, this.f22122d);
        rk5.m51126b(parcel, a);
    }
}
