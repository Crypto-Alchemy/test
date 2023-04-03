package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new lh8();

    /* renamed from: a */
    public int f22687a;

    /* renamed from: d */
    public String[] f22688d;

    public zze() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22687a);
        rk5.m51144t(parcel, 3, this.f22688d, false);
        rk5.m51126b(parcel, a);
    }

    public zze(int i, String[] strArr) {
        this.f22687a = i;
        this.f22688d = strArr;
    }
}
