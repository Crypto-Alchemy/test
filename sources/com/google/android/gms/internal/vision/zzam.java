package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new p88();

    /* renamed from: a */
    public final String f22907a;

    public zzam(String str) {
        this.f22907a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22907a, false);
        rk5.m51126b(parcel, a);
    }

    public zzam() {
        this((String) null);
    }
}
