package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new w58();

    /* renamed from: a */
    public String f22747a;

    /* renamed from: d */
    public String f22748d;

    /* renamed from: e */
    public int f22749e;

    public zzp() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22747a, false);
        rk5.m51143s(parcel, 3, this.f22748d, false);
        rk5.m51137m(parcel, 4, this.f22749e);
        rk5.m51126b(parcel, a);
    }

    public zzp(String str, String str2, int i) {
        this.f22747a = str;
        this.f22748d = str2;
        this.f22749e = i;
    }
}
