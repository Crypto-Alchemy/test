package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new cj9();

    /* renamed from: a */
    public zzl f22704a;

    /* renamed from: d */
    public String f22705d;

    /* renamed from: e */
    public String f22706e;

    /* renamed from: g */
    public zzm[] f22707g;

    /* renamed from: k */
    public zzj[] f22708k;

    /* renamed from: r */
    public String[] f22709r;

    /* renamed from: s */
    public zze[] f22710s;

    public zzh() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51142r(parcel, 2, this.f22704a, i, false);
        rk5.m51143s(parcel, 3, this.f22705d, false);
        rk5.m51143s(parcel, 4, this.f22706e, false);
        rk5.m51146v(parcel, 5, this.f22707g, i, false);
        rk5.m51146v(parcel, 6, this.f22708k, i, false);
        rk5.m51144t(parcel, 7, this.f22709r, false);
        rk5.m51146v(parcel, 8, this.f22710s, i, false);
        rk5.m51126b(parcel, a);
    }

    public zzh(zzl zzl, String str, String str2, zzm[] zzmArr, zzj[] zzjArr, String[] strArr, zze[] zzeArr) {
        this.f22704a = zzl;
        this.f22705d = str;
        this.f22706e = str2;
        this.f22707g = zzmArr;
        this.f22708k = zzjArr;
        this.f22709r = strArr;
        this.f22710s = zzeArr;
    }
}
