package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.ro2;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new af9();

    /* renamed from: a */
    public final String f22405a;

    /* renamed from: d */
    public final boolean f22406d;

    /* renamed from: e */
    public final boolean f22407e;

    /* renamed from: g */
    public final Context f22408g;

    /* renamed from: k */
    public final boolean f22409k;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f22405a = str;
        this.f22406d = z;
        this.f22407e = z2;
        this.f22408g = (Context) gf4.m44715r1(ro2.C6440a.m51194q1(iBinder));
        this.f22409k = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [ro2, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, this.f22405a, false);
        rk5.m51127c(parcel, 2, this.f22406d);
        rk5.m51127c(parcel, 3, this.f22407e);
        rk5.m51136l(parcel, 4, gf4.m44716s1(this.f22408g), false);
        rk5.m51127c(parcel, 5, this.f22409k);
        rk5.m51126b(parcel, a);
    }
}
