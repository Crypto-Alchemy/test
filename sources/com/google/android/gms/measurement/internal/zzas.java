package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new d98();

    /* renamed from: a */
    public final String f23074a;

    /* renamed from: d */
    public final zzaq f23075d;

    /* renamed from: e */
    public final String f23076e;

    /* renamed from: g */
    public final long f23077g;

    public zzas(zzas zzas, long j) {
        cu4.m43221k(zzas);
        this.f23074a = zzas.f23074a;
        this.f23075d = zzas.f23075d;
        this.f23076e = zzas.f23076e;
        this.f23077g = j;
    }

    public final String toString() {
        String str = this.f23076e;
        String str2 = this.f23074a;
        String valueOf = String.valueOf(this.f23075d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        d98.m43414a(this, parcel, i);
    }

    public zzas(String str, zzaq zzaq, String str2, long j) {
        this.f23074a = str;
        this.f23075d = zzaq;
        this.f23076e = str2;
        this.f23077g = j;
    }
}
