package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new rg9();

    /* renamed from: A */
    public final long f23085A;

    /* renamed from: B */
    public final String f23086B;

    /* renamed from: C */
    public final long f23087C;

    /* renamed from: H */
    public final long f23088H;

    /* renamed from: I */
    public final int f23089I;

    /* renamed from: L */
    public final boolean f23090L;

    /* renamed from: M */
    public final boolean f23091M;

    /* renamed from: P */
    public final String f23092P;

    /* renamed from: Q */
    public final Boolean f23093Q;

    /* renamed from: U */
    public final long f23094U;

    /* renamed from: X */
    public final List<String> f23095X;

    /* renamed from: Y */
    public final String f23096Y;

    /* renamed from: Z */
    public final String f23097Z;

    /* renamed from: a */
    public final String f23098a;

    /* renamed from: d */
    public final String f23099d;

    /* renamed from: e */
    public final String f23100e;

    /* renamed from: g */
    public final String f23101g;

    /* renamed from: k */
    public final long f23102k;

    /* renamed from: r */
    public final long f23103r;

    /* renamed from: s */
    public final String f23104s;

    /* renamed from: x */
    public final boolean f23105x;

    /* renamed from: y */
    public final boolean f23106y;

    public zzp(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        cu4.m43217g(str);
        this.f23098a = str;
        this.f23099d = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f23100e = str3;
        this.f23085A = j;
        this.f23101g = str4;
        this.f23102k = j2;
        this.f23103r = j3;
        this.f23104s = str5;
        this.f23105x = z;
        this.f23106y = z2;
        this.f23086B = str6;
        this.f23087C = j4;
        this.f23088H = j5;
        this.f23089I = i;
        this.f23090L = z3;
        this.f23091M = z4;
        this.f23092P = str7;
        this.f23093Q = bool;
        this.f23094U = j6;
        this.f23095X = list;
        this.f23096Y = str8;
        this.f23097Z = str9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 2, this.f23098a, false);
        rk5.m51143s(parcel, 3, this.f23099d, false);
        rk5.m51143s(parcel, 4, this.f23100e, false);
        rk5.m51143s(parcel, 5, this.f23101g, false);
        rk5.m51139o(parcel, 6, this.f23102k);
        rk5.m51139o(parcel, 7, this.f23103r);
        rk5.m51143s(parcel, 8, this.f23104s, false);
        rk5.m51127c(parcel, 9, this.f23105x);
        rk5.m51127c(parcel, 10, this.f23106y);
        rk5.m51139o(parcel, 11, this.f23085A);
        rk5.m51143s(parcel, 12, this.f23086B, false);
        rk5.m51139o(parcel, 13, this.f23087C);
        rk5.m51139o(parcel, 14, this.f23088H);
        rk5.m51137m(parcel, 15, this.f23089I);
        rk5.m51127c(parcel, 16, this.f23090L);
        rk5.m51127c(parcel, 18, this.f23091M);
        rk5.m51143s(parcel, 19, this.f23092P, false);
        rk5.m51128d(parcel, 21, this.f23093Q, false);
        rk5.m51139o(parcel, 22, this.f23094U);
        rk5.m51145u(parcel, 23, this.f23095X, false);
        rk5.m51143s(parcel, 24, this.f23096Y, false);
        rk5.m51143s(parcel, 25, this.f23097Z, false);
        rk5.m51126b(parcel, a);
    }

    public zzp(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        this.f23098a = str;
        this.f23099d = str2;
        this.f23100e = str3;
        this.f23085A = j3;
        this.f23101g = str4;
        this.f23102k = j;
        this.f23103r = j2;
        this.f23104s = str5;
        this.f23105x = z;
        this.f23106y = z2;
        this.f23086B = str6;
        this.f23087C = j4;
        this.f23088H = j5;
        this.f23089I = i;
        this.f23090L = z3;
        this.f23091M = z4;
        this.f23092P = str7;
        this.f23093Q = bool;
        this.f23094U = j6;
        this.f23095X = list;
        this.f23096Y = str8;
        this.f23097Z = str9;
    }
}
