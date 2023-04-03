package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new w48();

    /* renamed from: a */
    public final int f22184a;

    /* renamed from: d */
    public final String f22185d;

    public Scope(int i, String str) {
        cu4.m43218h(str, "scopeUri must not be null or empty");
        this.f22184a = i;
        this.f22185d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f22185d.equals(((Scope) obj).f22185d);
    }

    public int hashCode() {
        return this.f22185d.hashCode();
    }

    /* renamed from: r1 */
    public String mo30516r1() {
        return this.f22185d;
    }

    public String toString() {
        return this.f22185d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22184a);
        rk5.m51143s(parcel, 2, mo30516r1(), false);
        rk5.m51126b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
