package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zag extends AbstractSafeParcelable implements eg5 {
    public static final Parcelable.Creator<zag> CREATOR = new e28();

    /* renamed from: a */
    public final List f23137a;

    /* renamed from: d */
    public final String f23138d;

    public zag(List list, String str) {
        this.f23137a = list;
        this.f23138d = str;
    }

    /* renamed from: e */
    public final Status mo30519e() {
        if (this.f23138d != null) {
            return Status.f22191s;
        }
        return Status.f22187B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51145u(parcel, 1, this.f23137a, false);
        rk5.m51143s(parcel, 2, this.f23138d, false);
        rk5.m51126b(parcel, a);
    }
}
