package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new lj9();

    /* renamed from: a */
    public int f23049a;

    /* renamed from: d */
    public int f23050d;

    /* renamed from: e */
    public int f23051e;

    /* renamed from: g */
    public long f23052g;

    /* renamed from: k */
    public int f23053k;

    public zzs() {
    }

    /* renamed from: r1 */
    public static zzs m34483r1(tb2 tb2) {
        zzs zzs = new zzs();
        zzs.f23049a = tb2.mo48046c().mo48059f();
        zzs.f23050d = tb2.mo48046c().mo48055b();
        zzs.f23053k = tb2.mo48046c().mo48057d();
        zzs.f23051e = tb2.mo48046c().mo48056c();
        zzs.f23052g = tb2.mo48046c().mo48058e();
        return zzs;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f23049a);
        rk5.m51137m(parcel, 3, this.f23050d);
        rk5.m51137m(parcel, 4, this.f23051e);
        rk5.m51139o(parcel, 5, this.f23052g);
        rk5.m51137m(parcel, 6, this.f23053k);
        rk5.m51126b(parcel, a);
    }

    public zzs(int i, int i2, int i3, long j, int i4) {
        this.f23049a = i;
        this.f23050d = i2;
        this.f23051e = i3;
        this.f23052g = j;
        this.f23053k = i4;
    }
}
