package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new d18();

    /* renamed from: a */
    public final int f22336a;

    /* renamed from: d */
    public final boolean f22337d;

    public ModuleInstallResponse(int i, boolean z) {
        this.f22336a = i;
        this.f22337d = z;
    }

    /* renamed from: r1 */
    public int mo30679r1() {
        return this.f22336a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, mo30679r1());
        rk5.m51127c(parcel, 2, this.f22337d);
        rk5.m51126b(parcel, a);
    }
}
