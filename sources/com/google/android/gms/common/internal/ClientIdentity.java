package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new qx7();

    /* renamed from: a */
    public final int f22273a;

    /* renamed from: d */
    public final String f22274d;

    public ClientIdentity(int i, String str) {
        this.f22273a = i;
        this.f22274d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.f22273a != this.f22273a || !if4.m45709a(clientIdentity.f22274d, this.f22274d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22273a;
    }

    public final String toString() {
        int i = this.f22273a;
        String str = this.f22274d;
        return i + ":" + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22273a);
        rk5.m51143s(parcel, 2, this.f22274d, false);
        rk5.m51126b(parcel, a);
    }
}
