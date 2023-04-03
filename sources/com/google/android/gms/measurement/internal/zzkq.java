package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new x59();

    /* renamed from: a */
    public final int f23078a;

    /* renamed from: d */
    public final String f23079d;

    /* renamed from: e */
    public final long f23080e;

    /* renamed from: g */
    public final Long f23081g;

    /* renamed from: k */
    public final String f23082k;

    /* renamed from: r */
    public final String f23083r;

    /* renamed from: s */
    public final Double f23084s;

    public zzkq(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f23078a = i;
        this.f23079d = str;
        this.f23080e = j;
        this.f23081g = l;
        if (i == 1) {
            this.f23084s = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f23084s = d;
        }
        this.f23082k = str2;
        this.f23083r = str3;
    }

    /* renamed from: r1 */
    public final Object mo31423r1() {
        Long l = this.f23081g;
        if (l != null) {
            return l;
        }
        Double d = this.f23084s;
        if (d != null) {
            return d;
        }
        String str = this.f23082k;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        x59.m54232a(this, parcel, i);
    }

    public zzkq(a69 a69) {
        this(a69.f20823c, a69.f20824d, a69.f20825e, a69.f20822b);
    }

    public zzkq(String str, long j, Object obj, String str2) {
        cu4.m43217g(str);
        this.f23078a = 2;
        this.f23079d = str;
        this.f23080e = j;
        this.f23083r = str2;
        if (obj == null) {
            this.f23081g = null;
            this.f23084s = null;
            this.f23082k = null;
        } else if (obj instanceof Long) {
            this.f23081g = (Long) obj;
            this.f23084s = null;
            this.f23082k = null;
        } else if (obj instanceof String) {
            this.f23081g = null;
            this.f23084s = null;
            this.f23082k = (String) obj;
        } else if (obj instanceof Double) {
            this.f23081g = null;
            this.f23084s = (Double) obj;
            this.f23082k = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
