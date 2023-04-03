package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new rx7();

    /* renamed from: a */
    public final boolean f22333a;

    /* renamed from: d */
    public final int f22334d;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.f22333a = z;
        this.f22334d = i;
    }

    /* renamed from: r1 */
    public boolean mo30674r1() {
        return this.f22333a;
    }

    /* renamed from: s1 */
    public int mo30675s1() {
        return this.f22334d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51127c(parcel, 1, mo30674r1());
        rk5.m51137m(parcel, 2, mo30675s1());
        rk5.m51126b(parcel, a);
    }
}
