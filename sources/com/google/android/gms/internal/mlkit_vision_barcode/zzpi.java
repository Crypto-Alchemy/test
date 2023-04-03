package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzpi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpi> CREATOR = new gg9();

    /* renamed from: a */
    public final zzpm f22767a;

    /* renamed from: d */
    public final String f22768d;

    /* renamed from: e */
    public final String f22769e;

    /* renamed from: g */
    public final zzpn[] f22770g;

    /* renamed from: k */
    public final zzpk[] f22771k;

    /* renamed from: r */
    public final String[] f22772r;

    /* renamed from: s */
    public final zzpf[] f22773s;

    public zzpi(zzpm zzpm, String str, String str2, zzpn[] zzpnArr, zzpk[] zzpkArr, String[] strArr, zzpf[] zzpfArr) {
        this.f22767a = zzpm;
        this.f22768d = str;
        this.f22769e = str2;
        this.f22770g = zzpnArr;
        this.f22771k = zzpkArr;
        this.f22772r = strArr;
        this.f22773s = zzpfArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 1, this.f22767a, i, false);
        rk5.m51143s(parcel, 2, this.f22768d, false);
        rk5.m51143s(parcel, 3, this.f22769e, false);
        rk5.m51146v(parcel, 4, this.f22770g, i, false);
        rk5.m51146v(parcel, 5, this.f22771k, i, false);
        rk5.m51144t(parcel, 6, this.f22772r, false);
        rk5.m51146v(parcel, 7, this.f22773s, i, false);
        rk5.m51126b(parcel, a);
    }
}
