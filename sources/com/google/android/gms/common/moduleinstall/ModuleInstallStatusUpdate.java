package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new o18();

    /* renamed from: a */
    public final int f22338a;

    /* renamed from: d */
    public final int f22339d;

    /* renamed from: e */
    public final Long f22340e;

    /* renamed from: g */
    public final Long f22341g;

    /* renamed from: k */
    public final int f22342k;

    /* renamed from: r */
    public final C4036a f22343r;

    /* renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C4036a {

        /* renamed from: a */
        public final long f22344a;

        /* renamed from: b */
        public final long f22345b;

        public C4036a(long j, long j2) {
            cu4.m43224n(j2);
            this.f22344a = j;
            this.f22345b = j2;
        }
    }

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        C4036a aVar;
        this.f22338a = i;
        this.f22339d = i2;
        this.f22340e = l;
        this.f22341g = l2;
        this.f22342k = i3;
        if (l == null || l2 == null || l2.longValue() == 0) {
            aVar = null;
        } else {
            aVar = new C4036a(l.longValue(), l2.longValue());
        }
        this.f22343r = aVar;
    }

    /* renamed from: r1 */
    public int mo30681r1() {
        return this.f22342k;
    }

    /* renamed from: s1 */
    public int mo30682s1() {
        return this.f22339d;
    }

    /* renamed from: t1 */
    public int mo30683t1() {
        return this.f22338a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, mo30683t1());
        rk5.m51137m(parcel, 2, mo30682s1());
        rk5.m51140p(parcel, 3, this.f22340e, false);
        rk5.m51140p(parcel, 4, this.f22341g, false);
        rk5.m51137m(parcel, 5, mo30681r1());
        rk5.m51126b(parcel, a);
    }
}
