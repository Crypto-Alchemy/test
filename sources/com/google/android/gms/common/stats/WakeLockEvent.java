package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new b58();

    /* renamed from: A */
    public final long f22389A;

    /* renamed from: B */
    public int f22390B;

    /* renamed from: C */
    public final String f22391C;

    /* renamed from: H */
    public final float f22392H;

    /* renamed from: I */
    public final long f22393I;

    /* renamed from: L */
    public final boolean f22394L;

    /* renamed from: M */
    public long f22395M = -1;

    /* renamed from: a */
    public final int f22396a;

    /* renamed from: d */
    public final long f22397d;

    /* renamed from: e */
    public int f22398e;

    /* renamed from: g */
    public final String f22399g;

    /* renamed from: k */
    public final String f22400k;

    /* renamed from: r */
    public final String f22401r;

    /* renamed from: s */
    public final int f22402s;

    /* renamed from: x */
    public final List f22403x;

    /* renamed from: y */
    public final String f22404y;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f22396a = i;
        this.f22397d = j;
        this.f22398e = i2;
        this.f22399g = str;
        this.f22400k = str3;
        this.f22401r = str5;
        this.f22402s = i3;
        this.f22403x = list;
        this.f22404y = str2;
        this.f22389A = j2;
        this.f22390B = i4;
        this.f22391C = str4;
        this.f22392H = f;
        this.f22393I = j3;
        this.f22394L = z;
    }

    /* renamed from: r1 */
    public final long mo30728r1() {
        return this.f22395M;
    }

    /* renamed from: s1 */
    public final long mo30729s1() {
        return this.f22397d;
    }

    /* renamed from: t1 */
    public final String mo30730t1() {
        String str;
        List list = this.f22403x;
        String str2 = this.f22399g;
        int i = this.f22402s;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f22390B;
        String str4 = this.f22400k;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f22391C;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f22392H;
        String str6 = this.f22401r;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f22394L;
        return "\t" + str2 + "\t" + i + "\t" + str + "\t" + i2 + "\t" + str4 + "\t" + str5 + "\t" + f + "\t" + str3 + "\t" + z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22396a);
        rk5.m51139o(parcel, 2, this.f22397d);
        rk5.m51143s(parcel, 4, this.f22399g, false);
        rk5.m51137m(parcel, 5, this.f22402s);
        rk5.m51145u(parcel, 6, this.f22403x, false);
        rk5.m51139o(parcel, 8, this.f22389A);
        rk5.m51143s(parcel, 10, this.f22400k, false);
        rk5.m51137m(parcel, 11, this.f22398e);
        rk5.m51143s(parcel, 12, this.f22404y, false);
        rk5.m51143s(parcel, 13, this.f22391C, false);
        rk5.m51137m(parcel, 14, this.f22390B);
        rk5.m51134j(parcel, 15, this.f22392H);
        rk5.m51139o(parcel, 16, this.f22393I);
        rk5.m51143s(parcel, 17, this.f22401r, false);
        rk5.m51127c(parcel, 18, this.f22394L);
        rk5.m51126b(parcel, a);
    }

    public final int zza() {
        return this.f22398e;
    }
}
