package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zzaq extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzaq> CREATOR = new x88();

    /* renamed from: a */
    public final Bundle f23073a;

    public zzaq(Bundle bundle) {
        this.f23073a = bundle;
    }

    public final Iterator<String> iterator() {
        return new q88(this);
    }

    /* renamed from: r1 */
    public final Object mo31413r1(String str) {
        return this.f23073a.get(str);
    }

    /* renamed from: s1 */
    public final Long mo31414s1(String str) {
        return Long.valueOf(this.f23073a.getLong("value"));
    }

    /* renamed from: t1 */
    public final Double mo31415t1(String str) {
        return Double.valueOf(this.f23073a.getDouble("value"));
    }

    public final String toString() {
        return this.f23073a.toString();
    }

    /* renamed from: u1 */
    public final String mo31417u1(String str) {
        return this.f23073a.getString(str);
    }

    /* renamed from: v1 */
    public final int mo31418v1() {
        return this.f23073a.size();
    }

    /* renamed from: w1 */
    public final Bundle mo31419w1() {
        return new Bundle(this.f23073a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51129e(parcel, 2, mo31419w1(), false);
        rk5.m51126b(parcel, a);
    }
}
