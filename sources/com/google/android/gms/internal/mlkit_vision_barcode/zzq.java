package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new ai9();

    /* renamed from: A */
    public zzo f22826A;

    /* renamed from: B */
    public zzk f22827B;

    /* renamed from: C */
    public zzg f22828C;

    /* renamed from: H */
    public zzh f22829H;

    /* renamed from: I */
    public zzi f22830I;

    /* renamed from: L */
    public byte[] f22831L;

    /* renamed from: M */
    public boolean f22832M;

    /* renamed from: P */
    public double f22833P;

    /* renamed from: a */
    public int f22834a;

    /* renamed from: d */
    public String f22835d;

    /* renamed from: e */
    public String f22836e;

    /* renamed from: g */
    public int f22837g;

    /* renamed from: k */
    public Point[] f22838k;

    /* renamed from: r */
    public zzj f22839r;

    /* renamed from: s */
    public zzm f22840s;

    /* renamed from: x */
    public zzn f22841x;

    /* renamed from: y */
    public zzp f22842y;

    public zzq() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f22834a);
        rk5.m51143s(parcel, 3, this.f22835d, false);
        rk5.m51143s(parcel, 4, this.f22836e, false);
        rk5.m51137m(parcel, 5, this.f22837g);
        rk5.m51146v(parcel, 6, this.f22838k, i, false);
        rk5.m51142r(parcel, 7, this.f22839r, i, false);
        rk5.m51142r(parcel, 8, this.f22840s, i, false);
        rk5.m51142r(parcel, 9, this.f22841x, i, false);
        rk5.m51142r(parcel, 10, this.f22842y, i, false);
        rk5.m51142r(parcel, 11, this.f22826A, i, false);
        rk5.m51142r(parcel, 12, this.f22827B, i, false);
        rk5.m51142r(parcel, 13, this.f22828C, i, false);
        rk5.m51142r(parcel, 14, this.f22829H, i, false);
        rk5.m51142r(parcel, 15, this.f22830I, i, false);
        rk5.m51130f(parcel, 16, this.f22831L, false);
        rk5.m51127c(parcel, 17, this.f22832M);
        rk5.m51132h(parcel, 18, this.f22833P);
        rk5.m51126b(parcel, a);
    }

    public zzq(int i, String str, String str2, int i2, Point[] pointArr, zzj zzj, zzm zzm, zzn zzn, zzp zzp, zzo zzo, zzk zzk, zzg zzg, zzh zzh, zzi zzi, byte[] bArr, boolean z, double d) {
        this.f22834a = i;
        this.f22835d = str;
        this.f22831L = bArr;
        this.f22836e = str2;
        this.f22837g = i2;
        this.f22838k = pointArr;
        this.f22832M = z;
        this.f22833P = d;
        this.f22839r = zzj;
        this.f22840s = zzm;
        this.f22841x = zzn;
        this.f22842y = zzp;
        this.f22826A = zzo;
        this.f22827B = zzk;
        this.f22828C = zzg;
        this.f22829H = zzh;
        this.f22830I = zzi;
    }
}
