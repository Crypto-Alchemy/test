package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new g08();

    /* renamed from: k */
    public static final Comparator f22346k = az7.f21101a;

    /* renamed from: a */
    public final List f22347a;

    /* renamed from: d */
    public final boolean f22348d;

    /* renamed from: e */
    public final String f22349e;

    /* renamed from: g */
    public final String f22350g;

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        cu4.m43221k(list);
        this.f22347a = list;
        this.f22348d = z;
        this.f22349e = str;
        this.f22350g = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f22348d != apiFeatureRequest.f22348d || !if4.m45709a(this.f22347a, apiFeatureRequest.f22347a) || !if4.m45709a(this.f22349e, apiFeatureRequest.f22349e) || !if4.m45709a(this.f22350g, apiFeatureRequest.f22350g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return if4.m45710b(Boolean.valueOf(this.f22348d), this.f22347a, this.f22349e, this.f22350g);
    }

    /* renamed from: r1 */
    public List<Feature> mo30687r1() {
        return this.f22347a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51147w(parcel, 1, mo30687r1(), false);
        rk5.m51127c(parcel, 2, this.f22348d);
        rk5.m51143s(parcel, 3, this.f22349e, false);
        rk5.m51143s(parcel, 4, this.f22350g, false);
        rk5.m51126b(parcel, a);
    }
}
