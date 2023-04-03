package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new xx7();

    /* renamed from: a */
    public final int f22313a;

    /* renamed from: d */
    public List f22314d;

    public TelemetryData(int i, List list) {
        this.f22313a = i;
        this.f22314d = list;
    }

    /* renamed from: r1 */
    public final int mo30657r1() {
        return this.f22313a;
    }

    /* renamed from: s1 */
    public final List mo30658s1() {
        return this.f22314d;
    }

    /* renamed from: t1 */
    public final void mo30659t1(MethodInvocation methodInvocation) {
        if (this.f22314d == null) {
            this.f22314d = new ArrayList();
        }
        this.f22314d.add(methodInvocation);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22313a);
        rk5.m51147w(parcel, 2, this.f22314d, false);
        rk5.m51126b(parcel, a);
    }
}
