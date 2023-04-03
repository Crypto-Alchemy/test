package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.if4;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new oe8();

    /* renamed from: a */
    public final String f22157a;
    @Deprecated

    /* renamed from: d */
    public final int f22158d;

    /* renamed from: e */
    public final long f22159e;

    public Feature(String str, int i, long j) {
        this.f22157a = str;
        this.f22158d = i;
        this.f22159e = j;
    }

    public Feature(String str, long j) {
        this.f22157a = str;
        this.f22159e = j;
        this.f22158d = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo30469r1() == null || !mo30469r1().equals(feature.mo30469r1())) && (mo30469r1() != null || feature.mo30469r1() != null)) || mo30470s1() != feature.mo30470s1()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return if4.m45710b(mo30469r1(), Long.valueOf(mo30470s1()));
    }

    /* renamed from: r1 */
    public String mo30469r1() {
        return this.f22157a;
    }

    /* renamed from: s1 */
    public long mo30470s1() {
        long j = this.f22159e;
        return j == -1 ? (long) this.f22158d : j;
    }

    public final String toString() {
        if4.C5959a c = if4.m45711c(this);
        c.mo43587a(PublicResolver.FUNC_NAME, mo30469r1());
        c.mo43587a("version", Long.valueOf(mo30470s1()));
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51143s(parcel, 1, mo30469r1(), false);
        rk5.m51137m(parcel, 2, this.f22158d);
        rk5.m51139o(parcel, 3, mo30470s1());
        rk5.m51126b(parcel, a);
    }
}
