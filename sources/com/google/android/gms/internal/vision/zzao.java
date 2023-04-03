package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.3 */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new w88();

    /* renamed from: a */
    public final zzal[] f22908a;

    /* renamed from: d */
    public final zzab f22909d;

    /* renamed from: e */
    public final zzab f22910e;

    /* renamed from: g */
    public final String f22911g;

    /* renamed from: k */
    public final float f22912k;

    /* renamed from: r */
    public final String f22913r;

    /* renamed from: s */
    public final boolean f22914s;

    public zzao(zzal[] zzalArr, zzab zzab, zzab zzab2, String str, float f, String str2, boolean z) {
        this.f22908a = zzalArr;
        this.f22909d = zzab;
        this.f22910e = zzab2;
        this.f22911g = str;
        this.f22912k = f;
        this.f22913r = str2;
        this.f22914s = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51146v(parcel, 2, this.f22908a, i, false);
        rk5.m51142r(parcel, 3, this.f22909d, i, false);
        rk5.m51142r(parcel, 4, this.f22910e, i, false);
        rk5.m51143s(parcel, 5, this.f22911g, false);
        rk5.m51134j(parcel, 6, this.f22912k);
        rk5.m51143s(parcel, 7, this.f22913r, false);
        rk5.m51127c(parcel, 8, this.f22914s);
        rk5.m51126b(parcel, a);
    }
}
