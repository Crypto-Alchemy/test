package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new fi9();

    /* renamed from: a */
    public final String f22599a;

    /* renamed from: d */
    public final int f22600d;

    /* renamed from: e */
    public final int f22601e;

    /* renamed from: g */
    public final String f22602g;

    /* renamed from: k */
    public final String f22603k;

    /* renamed from: r */
    public final boolean f22604r;

    /* renamed from: s */
    public final String f22605s;

    /* renamed from: x */
    public final boolean f22606x;

    /* renamed from: y */
    public final int f22607y;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, zzge$zzv$zzb zzge_zzv_zzb) {
        this.f22599a = (String) cu4.m43221k(str);
        this.f22600d = i;
        this.f22601e = i2;
        this.f22605s = str2;
        this.f22602g = str3;
        this.f22603k = str4;
        this.f22604r = !z;
        this.f22606x = z;
        this.f22607y = zzge_zzv_zzb.zzc();
    }

    public zzr(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f22599a = str;
        this.f22600d = i;
        this.f22601e = i2;
        this.f22602g = str2;
        this.f22603k = str3;
        this.f22604r = z;
        this.f22605s = str4;
        this.f22606x = z2;
        this.f22607y = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzr = (zzr) obj;
            return if4.m45709a(this.f22599a, zzr.f22599a) && this.f22600d == zzr.f22600d && this.f22601e == zzr.f22601e && if4.m45709a(this.f22605s, zzr.f22605s) && if4.m45709a(this.f22602g, zzr.f22602g) && if4.m45709a(this.f22603k, zzr.f22603k) && this.f22604r == zzr.f22604r && this.f22606x == zzr.f22606x && this.f22607y == zzr.f22607y;
        }
    }

    public final int hashCode() {
        return if4.m45710b(this.f22599a, Integer.valueOf(this.f22600d), Integer.valueOf(this.f22601e), this.f22605s, this.f22602g, this.f22603k, Boolean.valueOf(this.f22604r), Boolean.valueOf(this.f22606x), Integer.valueOf(this.f22607y));
    }

    public final String toString() {
        return "PlayLoggerContext[" + "package=" + this.f22599a + ',' + "packageVersionCode=" + this.f22600d + ',' + "logSource=" + this.f22601e + ',' + "logSourceName=" + this.f22605s + ',' + "uploadAccount=" + this.f22602g + ',' + "loggingId=" + this.f22603k + ',' + "logAndroidId=" + this.f22604r + ',' + "isAnonymous=" + this.f22606x + ',' + "qosTier=" + this.f22607y + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f22599a, false);
        rk5.m51137m(parcel, 3, this.f22600d);
        rk5.m51137m(parcel, 4, this.f22601e);
        rk5.m51143s(parcel, 5, this.f22602g, false);
        rk5.m51143s(parcel, 6, this.f22603k, false);
        rk5.m51127c(parcel, 7, this.f22604r);
        rk5.m51143s(parcel, 8, this.f22605s, false);
        rk5.m51127c(parcel, 9, this.f22606x);
        rk5.m51137m(parcel, 10, this.f22607y);
        rk5.m51126b(parcel, a);
    }
}
