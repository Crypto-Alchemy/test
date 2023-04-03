package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new vh9();

    /* renamed from: a */
    public final boolean f22410a;

    /* renamed from: d */
    public final String f22411d;

    /* renamed from: e */
    public final int f22412e;

    /* renamed from: g */
    public final int f22413g;

    public zzq(boolean z, String str, int i, int i2) {
        this.f22410a = z;
        this.f22411d = str;
        this.f22412e = ek9.m43985a(i) - 1;
        this.f22413g = wh8.m53895a(i2) - 1;
    }

    /* renamed from: r1 */
    public final String mo30735r1() {
        return this.f22411d;
    }

    /* renamed from: s1 */
    public final boolean mo30736s1() {
        return this.f22410a;
    }

    /* renamed from: t1 */
    public final int mo30737t1() {
        return ek9.m43985a(this.f22412e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51127c(parcel, 1, this.f22410a);
        rk5.m51143s(parcel, 2, this.f22411d, false);
        rk5.m51137m(parcel, 3, this.f22412e);
        rk5.m51137m(parcel, 4, this.f22413g);
        rk5.m51126b(parcel, a);
    }

    public final int zzc() {
        return wh8.m53895a(this.f22413g);
    }
}
