package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new q58();

    /* renamed from: A */
    public final long f23062A;

    /* renamed from: B */
    public final zzas f23063B;

    /* renamed from: a */
    public String f23064a;

    /* renamed from: d */
    public String f23065d;

    /* renamed from: e */
    public zzkq f23066e;

    /* renamed from: g */
    public long f23067g;

    /* renamed from: k */
    public boolean f23068k;

    /* renamed from: r */
    public String f23069r;

    /* renamed from: s */
    public final zzas f23070s;

    /* renamed from: x */
    public long f23071x;

    /* renamed from: y */
    public zzas f23072y;

    public zzaa(zzaa zzaa) {
        cu4.m43221k(zzaa);
        this.f23064a = zzaa.f23064a;
        this.f23065d = zzaa.f23065d;
        this.f23066e = zzaa.f23066e;
        this.f23067g = zzaa.f23067g;
        this.f23068k = zzaa.f23068k;
        this.f23069r = zzaa.f23069r;
        this.f23070s = zzaa.f23070s;
        this.f23071x = zzaa.f23071x;
        this.f23072y = zzaa.f23072y;
        this.f23062A = zzaa.f23062A;
        this.f23063B = zzaa.f23063B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f23064a, false);
        rk5.m51143s(parcel, 3, this.f23065d, false);
        rk5.m51142r(parcel, 4, this.f23066e, i, false);
        rk5.m51139o(parcel, 5, this.f23067g);
        rk5.m51127c(parcel, 6, this.f23068k);
        rk5.m51143s(parcel, 7, this.f23069r, false);
        rk5.m51142r(parcel, 8, this.f23070s, i, false);
        rk5.m51139o(parcel, 9, this.f23071x);
        rk5.m51142r(parcel, 10, this.f23072y, i, false);
        rk5.m51139o(parcel, 11, this.f23062A);
        rk5.m51142r(parcel, 12, this.f23063B, i, false);
        rk5.m51126b(parcel, a);
    }

    public zzaa(String str, String str2, zzkq zzkq, long j, boolean z, String str3, zzas zzas, long j2, zzas zzas2, long j3, zzas zzas3) {
        this.f23064a = str;
        this.f23065d = str2;
        this.f23066e = zzkq;
        this.f23067g = j;
        this.f23068k = z;
        this.f23069r = str3;
        this.f23070s = zzas;
        this.f23071x = j2;
        this.f23072y = zzas2;
        this.f23062A = j3;
        this.f23063B = zzas3;
    }
}
