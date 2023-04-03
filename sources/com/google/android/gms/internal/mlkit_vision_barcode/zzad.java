package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new m68();

    /* renamed from: a */
    public int f22664a;

    /* renamed from: d */
    public boolean f22665d;

    public zzad() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzad = (zzad) obj;
        if (this.f22664a != zzad.f22664a || !if4.m45709a(Boolean.valueOf(this.f22665d), Boolean.valueOf(zzad.f22665d))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return if4.m45710b(Integer.valueOf(this.f22664a), Boolean.valueOf(this.f22665d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22664a);
        rk5.m51127c(parcel, 3, this.f22665d);
        rk5.m51126b(parcel, a);
    }

    public zzad(int i, boolean z) {
        this.f22664a = i;
        this.f22665d = z;
    }
}
