package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpm> CREATOR = new ah9();

    /* renamed from: a */
    public final String f22794a;

    /* renamed from: d */
    public final String f22795d;

    /* renamed from: e */
    public final String f22796e;

    /* renamed from: g */
    public final String f22797g;

    /* renamed from: k */
    public final String f22798k;

    /* renamed from: r */
    public final String f22799r;

    /* renamed from: s */
    public final String f22800s;

    public zzpm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22794a = str;
        this.f22795d = str2;
        this.f22796e = str3;
        this.f22797g = str4;
        this.f22798k = str5;
        this.f22799r = str6;
        this.f22800s = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22794a, false);
        rk5.m51143s(parcel, 2, this.f22795d, false);
        rk5.m51143s(parcel, 3, this.f22796e, false);
        rk5.m51143s(parcel, 4, this.f22797g, false);
        rk5.m51143s(parcel, 5, this.f22798k, false);
        rk5.m51143s(parcel, 6, this.f22799r, false);
        rk5.m51143s(parcel, 7, this.f22800s, false);
        rk5.m51126b(parcel, a);
    }
}
